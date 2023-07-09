package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class RailIdDto {
	
	public RailIdDto(Integer id) {
		super();
		Id = id;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	private Integer Id;

}
