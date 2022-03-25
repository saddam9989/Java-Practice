package com.homeloan.jwt;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.homeloan.entities.User;
import com.homeloan.exceptions.InvalidTokenException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

@Service
public class JwtTokenUtil implements Serializable{
	
	private static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
	
	@Value("${jwt.secret}")
	private String secretKey;
	
  //generate token for user
	public String generateToken(User user) {
		Claims claims=Jwts.claims();
		claims.setSubject(user.getUsername());
		claims.put("role", user.getRole());
		claims.put("user", user.getUsername());
		claims.put("userId", user.getUserId());
		
		return Jwts.builder()
				.setClaims(claims)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+JWT_TOKEN_VALIDITY*1000))
				.signWith(SignatureAlgorithm.HS512,secretKey)
				.compact();
	}
	
	// validate and extract User details from header
		public User validateTokenAndGetUserDetails(HttpServletRequest request) {
			
			final String tokenHeader = request.getHeader("Authorization");

			String token = null;

			if (tokenHeader == null)
				throw new InvalidTokenException("User Not Logged In or token not included");
			
			// JWT Token is in the form "Bearer token". Remove Bearer word
			if (!tokenHeader.startsWith("Bearer "))
				throw new InvalidTokenException("Invalid Token");

			token = tokenHeader.substring(7);
			
			try {
				Claims claims =Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
				User user = new User();
				user.setUsername(claims.getSubject());
				user.setRole((String) claims.get("role"));
				return user;
			} catch (SignatureException ex) {
				throw new InvalidTokenException("Token Signature not valid");
				
			} catch (ExpiredJwtException ex) {
				throw new InvalidTokenException("Token expired. Login again");
			}
			catch (IllegalArgumentException | MalformedJwtException ex) {
				throw new InvalidTokenException("Token is invalid");
			}
		
		}

}