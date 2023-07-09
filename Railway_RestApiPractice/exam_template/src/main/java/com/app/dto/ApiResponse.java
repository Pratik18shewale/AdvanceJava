package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class ApiResponse {

	public ApiResponse(String msg) {
		super();
		this.msg = msg;
	}

	private String msg;
	
}
