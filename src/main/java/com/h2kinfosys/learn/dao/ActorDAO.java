package com.h2kinfosys.learn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.h2kinfosys.learn.dto.Actor;


public interface ActorDAO extends JpaRepository<Actor, Integer>{

	List<Actor> findByFirstName(String firstName);
	
	@Query("from Actor where firstName = ?1 order by actorId desc")
	List<Actor> findByFirstNameOrderByID(String firstName);
}
