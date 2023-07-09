package com.app.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
//@Getter
//@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@JsonIgnoreType
public class MyRailway extends BaseEntity{
	
	@Column(length=20,nullable=false)
	private String rname;
	
	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public LocalDateTime getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalDateTime start_time) {
		this.start_time = start_time;
	}

	public LocalDateTime getEnd_time() {
		return end_time;
	}

	public void setEnd_time(LocalDateTime end_time) {
		this.end_time = end_time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	private LocalDateTime start_time;
	
	private LocalDateTime end_time;
	
	@Column(length=20,nullable=false)
	private String source;
	
	@Column(length=20,nullable=false)
	private String destination;
	
	private double distance;
	
	private double frequency;
	
	@Enumerated(EnumType.STRING)
	private Category category;

	public MyRailway(String rname, LocalDateTime start_time, LocalDateTime end_time, String source, String destination,
			double distance, double frequency, Category category) {
		super();
		this.rname = rname;
		this.start_time = start_time;
		this.end_time = end_time;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.frequency = frequency;
		this.category = category;
	}

}
