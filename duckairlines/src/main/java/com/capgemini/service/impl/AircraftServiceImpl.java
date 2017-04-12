package com.capgemini.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.AircraftDao;
import com.capgemini.model.Aircraft;
import com.capgemini.service.AircraftService;

@Service
public class AircraftServiceImpl implements AircraftService {
	
	static Logger logger = Logger.getLogger(AircraftServiceImpl.class);
	@Autowired
	private AircraftDao aircraftDao;

	@Override
	public List<Aircraft> findAll() {
		return aircraftDao.findAll();
	}

	@Override
	public Aircraft findByAircraft_id(Integer aircraft_id) {
		//System.out.println(aircraftDao.getOne(aircraft_id));
		return aircraftDao.getOne(aircraft_id);
	}

	@Override
	public void delete(Aircraft aircraft) {
		
	//	Aircraft aircraft=aircraftDao.getOne(aircraft_id);
		aircraftDao.delete(aircraft);
	}

	@Override
	public Aircraft create(Aircraft aircraft) {
		
		return aircraftDao.save(aircraft);
	}

	@Override
	public Aircraft update(Aircraft aircraft) {
		return aircraftDao.saveAndFlush(aircraft);
	}
	

}
