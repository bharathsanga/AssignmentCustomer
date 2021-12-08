package com.greycampus.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.AustraliaState;

public interface AustraliaStateRepo extends CrudRepository<AustraliaState, Integer>{
	public ArrayList<AustraliaState> findAll();

}
