package com.app.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;

import com.app.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RailResponseDto {
	
	private Integer Id;
	private String rname;
	
	private LocalDateTime start_time;
	
	private LocalDateTime end_time;
	
	
	private String source;
	
	
	private String destination;
	
	private double distance;
	
	private double frequency;
	
	private Category category;

}
