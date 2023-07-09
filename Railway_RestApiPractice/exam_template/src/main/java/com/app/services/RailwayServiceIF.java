package com.app.services;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.RailIdDto;
import com.app.dto.RailRequestDto;
import com.app.dto.RailResponseDto;
import com.app.entities.MyRailway;

public interface RailwayServiceIF {
	
	ApiResponse addrail(RailRequestDto raildto);
	
	List<RailResponseDto> getAllTrains();
	
	ApiResponse deleterail(RailIdDto raildto);
	
	List<RailResponseDto> getTrainByCategory(RailRequestDto raildto);

}
