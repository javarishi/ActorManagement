package com.h2kinfosys.learn.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.h2kinfosys.learn.dao.ActorDAO;
import com.h2kinfosys.learn.dto.Actor;



@RestController
public class ActorRestController {

	static final Logger LOG = LoggerFactory.getLogger(ActorRestController.class);
	
	@Autowired
	ActorDAO actorDao;
	
	@GetMapping(path="actors")
	public List<Actor> getActors() {
		LOG.trace("trace : Hello World!");
		LOG.debug("debug : Accessing getActors");
		LOG.info("info: I am fine.");
		LOG.warn("warn: I love programming.");
		LOG.error("error: I am programming.");
		List<Actor> actors = actorDao.findAll();
		return actors;
	}
	
	@GetMapping(path="/actors/{id}")
	public Optional<Actor> getActorById(@PathVariable("id") String actorId) {
		Optional<Actor> actor = actorDao.findById(Integer.parseInt(actorId));
		return actor;
	}
	
	
	@PostMapping("/actors")
	public Actor saveActor(@RequestBody Actor actor) {
		actor.setLastUpdate(new Date());
		Actor savedActor = actorDao.save(actor);
		return savedActor;
	}
	
	@DeleteMapping(path="/actors/{id}")
	public String deleteActor(@PathVariable("id") String actorId) {
		actorDao.deleteById(Integer.parseInt(actorId));
		return "Actor :: " + actorId + " Deleted!!";
	}
	
}
