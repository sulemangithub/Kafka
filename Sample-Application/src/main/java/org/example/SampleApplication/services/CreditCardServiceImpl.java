package org.example.SampleApplication.services;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.example.SampleApplication.pojos.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CreditCardServiceImpl implements CreditCardService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String ENDPOINT_URL = "https://fakerapi.it/api/v1/credit_cards?_quantity=20";
	
	@Override
	public List<CreditCard> fetchAllCreditCards() {

		List<CreditCard> creditCardList = restTemplate.getForObject(ENDPOINT_URL, List.class);
		
		return creditCardList.stream().filter(creditcard->creditcard.getExpiration().isAfter(LocalDate.parse("2023-06-31"))).collect(Collectors.toList());
	
	}	
}
