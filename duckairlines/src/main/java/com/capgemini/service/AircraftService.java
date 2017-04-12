package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.model.Aircraft;
@Service
public interface AircraftService {
	List<Aircraft> findAll();
	Aircraft findByAircraft_id(Integer aircraft_id);
	void delete(Aircraft aircraft);
	Aircraft create(Aircraft aircraft);
	Aircraft update(Aircraft aircraft);
}
