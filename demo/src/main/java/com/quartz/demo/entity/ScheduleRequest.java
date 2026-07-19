package com.quartz.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ScheduleRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	
	private String cron;
	
	private String name;

	public String getId() {
		return id;
	}

	
	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ScheduleRequest() {
	
	}


	public ScheduleRequest(String id, String cron, String name) {
		
		this.id = id;
		this.cron = cron;
		this.name = name;
	}
	
	
	

}
