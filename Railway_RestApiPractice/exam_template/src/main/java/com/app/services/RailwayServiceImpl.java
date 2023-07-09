package com.app.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.dto.RailIdDto;
import com.app.dto.RailRequestDto;
import com.app.dto.RailResponseDto;
import com.app.entities.MyRailway;
import com.app.exception_handler.CustomException;
import com.app.repositories.RailwayRepoIF;


@Service
@Transactional
public class RailwayServiceImpl implements RailwayServiceIF {

	@Autowired
	private RailwayRepoIF railwayRepoInstance;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<RailResponseDto> getAllTrains() {
		
		List<RailResponseDto> allTraindto= new ArrayList<>();
		
		railwayRepoInstance.findAll().forEach((rail)->{
			allTraindto.add(mapper.map(rail, RailResponseDto.class));
		});
		return allTraindto;
	}
	
	@Override
      public ApiResponse addrail(RailRequestDto raildto) {
		
		MyRailway myrail = new MyRailway(raildto.getRname(),raildto.getStart_time(),raildto.getEnd_time(),raildto.getSource(),raildto.getDestination(),raildto.getDistance(),raildto.getFrequency(),raildto.getCategory());
		
		
		if(myrail.getStart_time().isBefore(myrail.getEnd_time())) {
		
		railwayRepoInstance.save(myrail);
			
			return new ApiResponse("Train added");
		}//if
		return new ApiResponse("Train not added");
	}

	@Override
	public ApiResponse deleterail(RailIdDto raildto) {
		
		MyRailway foundrail = railwayRepoInstance.findById(raildto.getId()).orElseThrow(()-> new CustomException("Train not found"));
		
		railwayRepoInstance.delete(foundrail);
		return new ApiResponse("deleted");
	}//deleterail

	@Override
	public List<RailResponseDto> getTrainByCategory(RailRequestDto raildto) {
		
		List<MyRailway> findbycategory = railwayRepoInstance.findByCategory(raildto.getCategory());
		
		List<RailResponseDto> allTraindto= new ArrayList<>();
		
		findbycategory.forEach((rail)->{
			allTraindto.add(mapper.map(rail, RailResponseDto.class));
		});
		
		return allTraindto;
	}
	
    
}
