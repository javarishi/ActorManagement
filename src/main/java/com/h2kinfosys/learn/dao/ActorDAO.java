package com.h2kinfosys.learn.dao;

import org.springframework.data.repository.CrudRepository;

import com.h2kinfosys.learn.dto.Actor;

public interface ActorDAO extends CrudRepository<Actor, Integer>{

}
