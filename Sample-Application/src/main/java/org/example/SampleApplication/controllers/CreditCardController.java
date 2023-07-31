package org.example.SampleApplication.controllers;

import java.util.List;

import org.example.SampleApplication.pojos.CreditCard;
import org.example.SampleApplication.services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;

	@PostMapping("/fetch-expired-cards")
	public ResponseEntity<List<CreditCard>> getCreditCards(@RequestParam("type") String type){
		
		List<CreditCard> creditCards = this.creditCardService.fetchAllCreditCards(type);
		ResponseEntity<List<CreditCard>> responseEntity = new ResponseEntity<List<CreditCard>>(creditCards, HttpStatus.OK);
		return responseEntity;
		
	}	
}
