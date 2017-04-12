package com.capgemini.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Configuration
@Component
@Entity
@Table(name = "aircrafts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aircraft{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue
		private Integer aircraft_id;
		private String aircraft_abbr;
		
	
		private String aircraft_name;
		private Integer landing_roll_out;
		
	
		private String manufacturer;
		private Integer max_cruise_speed;
		private Integer max_range_speed;
		private Integer norm_cruise_speed;
		
		@NotNull
		private Integer aircraft_range;
		private Integer rate_of_climb;
		private Integer service_ceiling;
		private Integer stall_speed;
		private Integer takeoff_roll;
		
		
		public Aircraft(){
			
		}


		public Integer getAircraft_id() {
			return aircraft_id;
		}


		public void setAircraft_id(Integer aircraft_id) {
			this.aircraft_id = aircraft_id;
		}


		public String getAircraft_abbr() {
			return aircraft_abbr;
		}


		public void setAircraft_abbr(String aircraft_abbr) {
			this.aircraft_abbr = aircraft_abbr;
		}


		public String getAircraft_name() {
			return aircraft_name;
		}


		public void setAircraft_name(String aircraft_name) {
			this.aircraft_name = aircraft_name;
		}


		public Integer getLanding_roll_out() {
			return landing_roll_out;
		}


		public void setLanding_roll_out(Integer landing_roll_out) {
			this.landing_roll_out = landing_roll_out;
		}


		public String getManufacturer() {
			return manufacturer;
		}


		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}


		public Integer getMax_cruise_speed() {
			return max_cruise_speed;
		}


		public void setMax_cruise_speed(Integer max_cruise_speed) {
			this.max_cruise_speed = max_cruise_speed;
		}


		public Integer getMax_range_speed() {
			return max_range_speed;
		}


		public void setMax_range_speed(Integer max_range_speed) {
			this.max_range_speed = max_range_speed;
		}


		public Integer getNorm_cruise_speed() {
			return norm_cruise_speed;
		}


		public void setNorm_cruise_speed(Integer norm_cruise_speed) {
			this.norm_cruise_speed = norm_cruise_speed;
		}


		public Integer getAircraft_range() {
			return aircraft_range;
		}


		public void setAircraft_range(Integer aircraft_range) {
			this.aircraft_range = aircraft_range;
		}


		public Integer getRate_of_climb() {
			return rate_of_climb;
		}


		public void setRate_of_climb(Integer rate_of_climb) {
			this.rate_of_climb = rate_of_climb;
		}


		public Integer getService_ceiling() {
			return service_ceiling;
		}


		public void setService_ceiling(Integer service_ceiling) {
			this.service_ceiling = service_ceiling;
		}


		public Integer getStall_speed() {
			return stall_speed;
		}


		public void setStall_speed(Integer stall_speed) {
			this.stall_speed = stall_speed;
		}


		public Integer getTakeoff_roll() {
			return takeoff_roll;
		}


		public void setTakeoff_roll(Integer takeoff_roll) {
			this.takeoff_roll = takeoff_roll;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public String toString() {
			return "Aircraft [aircraft_id=" + aircraft_id + ", aircraft_abbr=" + aircraft_abbr + ", aircraft_name="
					+ aircraft_name + ", landing_roll_out=" + landing_roll_out + ", manufacturer=" + manufacturer
					+ ", max_cruise_speed=" + max_cruise_speed + ", max_range_speed=" + max_range_speed
					+ ", norm_cruise_speed=" + norm_cruise_speed + ", aircraft_range=" + aircraft_range
					+ ", rate_of_climb=" + rate_of_climb + ", service_ceiling=" + service_ceiling + ", stall_speed="
					+ stall_speed + ", takeoff_roll=" + takeoff_roll + "]";
		}


		
		
}
