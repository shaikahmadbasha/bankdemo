package com.capgemini.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.Aircraft;

@Repository
@Transactional
public interface AircraftDao extends JpaRepository<Aircraft, Integer>{
	List<Aircraft> findAll();
	Aircraft getOne(Integer aircraft_id);
	void delete(Integer aircraft_id);
	Aircraft saveAndFlush(Aircraft aircraft);
	Aircraft save(Aircraft aircraft);
}
