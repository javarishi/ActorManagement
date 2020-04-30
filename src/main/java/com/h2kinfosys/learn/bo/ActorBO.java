package com.h2kinfosys.learn.bo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.h2kinfosys.learn.dao.ActorDAO;
import com.h2kinfosys.learn.dto.Actor;

@Component
public class ActorBO {
	
	@Autowired
	ActorDAO actorDao;
	
	public Actor saveActor(Actor tobeSaved) {
		Actor savedActor = null;
		if(actorDao != null) {
			tobeSaved.setLastUpdate(new Date());
			savedActor = actorDao.save(tobeSaved);
		}
		return savedActor;
	}
}
