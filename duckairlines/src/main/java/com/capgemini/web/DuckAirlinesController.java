package com.capgemini.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Aircraft;
import com.capgemini.service.AircraftService;

@RestController
@ComponentScan("com.capgemini")
@CrossOrigin
@EnableAutoConfiguration
@RequestMapping("/api/v1")
public class DuckAirlinesController {
	
	@Autowired
	private AircraftService aircraftService;

	@RequestMapping(value="/aircrafts",method=RequestMethod.GET)
	public List<Aircraft> getAllAircrafts(){
		return aircraftService.findAll();
	}
	
	@RequestMapping(value="/aircrafts",method=RequestMethod.POST)
	public Aircraft createAircrafts(@RequestBody Aircraft aircrafts){
		return aircraftService.create(aircrafts);
	}
	
	
	@RequestMapping(value="/aircrafts/{aircraftId}",method=RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody Aircraft getAircraftById(@PathVariable("aircraftId") int aircraft_id){
		return aircraftService.findByAircraft_id(aircraft_id);
	}
	
	
	@RequestMapping(value="/aircrafts/{id}",method=RequestMethod.DELETE)
	public Aircraft deleteAircraftById(@PathVariable("id") Integer aircraft_id){
		Aircraft aircraft= aircraftService.findByAircraft_id(aircraft_id);
		 aircraftService.delete(aircraft);
		 return aircraft;
	}
	
	
	@RequestMapping(value = "/aircrafts/{id}", method = RequestMethod.PUT)
	public Aircraft updateAircraft(@PathVariable Integer id, @RequestBody Aircraft aircraft) {
		Aircraft aircraft2=aircraftService.findByAircraft_id(id);
		BeanUtils.copyProperties(aircraft, aircraft2);
		return aircraftService.update(aircraft2);
	}
	
	
}
