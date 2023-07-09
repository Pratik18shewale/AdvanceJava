package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RailIdDto;
import com.app.dto.RailRequestDto;
import com.app.entities.Category;
import com.app.services.RailwayServiceIF;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
//@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/rail")
public class RailController {
	
	@Autowired
	private RailwayServiceIF railwayServiceInstance;
	
	@GetMapping
	public ResponseEntity<?> getAllTrains(){
		
		
		return ResponseEntity.status(HttpStatus.OK).body(railwayServiceInstance.getAllTrains());
		
	}//getAllTrains
	
	@PostMapping("/addtrain")
	public ResponseEntity<?> addtrain(@RequestBody RailRequestDto raildto){
		return ResponseEntity.status(HttpStatus.OK).body(railwayServiceInstance.addrail(raildto));
		
	}//addtrain
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleterail(@PathVariable Integer id) {
		RailIdDto railiddto = new RailIdDto(id);
		return ResponseEntity.status(HttpStatus.OK).body(railwayServiceInstance.deleterail(railiddto));
		
		}//deleterail

	
	@GetMapping("/{category}")
	public ResponseEntity<?> getbycat(@PathVariable Category category){
		RailRequestDto railreqdto = new RailRequestDto();
		
		railreqdto.setCategory(category);
		return ResponseEntity.status(HttpStatus.OK).body(railwayServiceInstance.getTrainByCategory(railreqdto));
		
	}//getbycat
}
