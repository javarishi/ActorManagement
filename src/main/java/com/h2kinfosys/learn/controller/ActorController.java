package com.h2kinfosys.learn.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.h2kinfosys.learn.bo.ActorBO;
import com.h2kinfosys.learn.dao.ActorDAO;
import com.h2kinfosys.learn.dto.Actor;

@Controller
public class ActorController {
	
	@Autowired
	ActorDAO actorDao;
	
	@RequestMapping("getActor")
	public String getActorPage() {
		return "actor";
	}
	
	@RequestMapping("saveActor")
	public ModelAndView saveActor(Actor actor) {
		ModelAndView mv = new ModelAndView();
		actor.setLastUpdate(new Date());
		Actor savedActor = actorDao.save(actor);
		mv.addObject("actor", savedActor);
		mv.setViewName("actor");
		return mv;
	}
	
	@RequestMapping("getActorById")
	public ModelAndView getActorById(@RequestParam("actorId") String actorId) {
		ModelAndView mv = new ModelAndView();
		Actor selectedActor = actorDao.findById(Integer.parseInt(actorId)).orElse(new Actor());
		mv.addObject("actor", selectedActor);
		mv.setViewName("actor");
		return mv;
	}
	
	
	@RequestMapping("getActorByFirstName")
	public ModelAndView getActorByFirstName(@RequestParam("firstName") String firstName) {
		ModelAndView mv = new ModelAndView();
		//List<Actor> actors = actorDao.findByFirstName(firstName);
		List<Actor> actors = actorDao.findByFirstNameOrderByID(firstName);
		mv.addObject("actor", actors);
		mv.setViewName("showActor");
		return mv;
	}
	
	

}
