package com.homeloan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeloan.entities.EMI;

public interface IEmiRepository extends JpaRepository<EMI, Integer>{

}