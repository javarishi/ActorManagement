package com.h2kinfosys.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.h2kinfosys.learn.bo.ActorBO;
import com.h2kinfosys.learn.dto.Actor;

@Controller
public class ActorController {
	
	@Autowired
	ActorBO actorBo;
	
	@RequestMapping("getActor")
	public String getActorPage() {
		return "actor";
	}
	
	@RequestMapping("saveActor")
	public ModelAndView saveActor(Actor actor) {
		ModelAndView mv = new ModelAndView();
		System.out.println(actor);
		Actor savedActor = actorBo.saveActor(actor);
		mv.addObject("actor", savedActor);
		mv.setViewName("showActor");
		return mv;
	}

}
