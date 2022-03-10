package com.basicprograms.java;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {

		System.out.println("Enter one number from 1 to 100");

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		boolean flag = false;

		for (int i = 2; i <= x / 2; i++) {

			if (x % i == 0) {
				flag = true;
				break;

			}
		}

		if (flag == false) {
			System.out.println(x + " is a prime number");
		} else {
			System.out.println(x + " is not a prime number");
		}

	}

}
