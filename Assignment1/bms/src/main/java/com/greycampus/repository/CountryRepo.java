package com.greycampus.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.greycampus.entity.Country;

@Repository("CountryRepo")
public interface CountryRepo extends CrudRepository<Country, Integer>	{
	public ArrayList<Country> findAll();

}
