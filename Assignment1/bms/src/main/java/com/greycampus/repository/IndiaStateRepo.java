package com.greycampus.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.greycampus.entity.IndiaState;

public interface IndiaStateRepo extends CrudRepository<IndiaState, Integer>{
	public ArrayList<IndiaState> findAll();

}
