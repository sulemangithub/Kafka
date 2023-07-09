package org.example.SampleApplication.controllers;

import java.util.List;

import org.example.SampleApplication.pojos.CreditCard;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class CreditCardController {

	@PostMapping("/fetch-expired-cards")
	public ResponseEntity<List<CreditCard>> getCreditCards(@Param("type") String type){
		return null;
		
	}	
}
