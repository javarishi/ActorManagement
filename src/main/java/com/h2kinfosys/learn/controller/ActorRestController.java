package com.h2kinfosys.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.h2kinfosys.learn.dao.ActorDAO;
import com.h2kinfosys.learn.dto.Actor;

@Controller
public class ActorRestController {

	@Autowired
	ActorDAO actorDao;
	
	@RequestMapping("getActors")
	@ResponseBody
	public List<Actor> getActors() {
		List<Actor> actors = actorDao.findAll();
		return actors;
	}
	
	@RequestMapping("/getActor/{id}")
	@ResponseBody
	public Optional<Actor> getActorById(@PathVariable("id") String actorId) {
		Optional<Actor> actor = actorDao.findById(Integer.parseInt(actorId));
		return actor;
	}
}
