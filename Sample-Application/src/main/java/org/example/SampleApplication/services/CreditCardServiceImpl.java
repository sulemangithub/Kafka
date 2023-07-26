package org.example.SampleApplication.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.example.SampleApplication.pojos.CreditCard;
import org.example.SampleApplication.pojos.CreditCardDownstreamResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CreditCardServiceImpl implements CreditCardService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/yy");
	private static final String DATE_TO_BE_COMPARED = "01/23";
	private static final String ENDPOINT_URL = "https://fakerapi.it/api/v1/credit_cards?_quantity=20";
	
	@Override
	public List<CreditCard> fetchAllCreditCards() {

		CreditCardDownstreamResponse downstreamResponse = restTemplate.getForObject(ENDPOINT_URL, CreditCardDownstreamResponse.class);
		
		return downstreamResponse.getData().stream().filter(creditcard->{
			try {
				return getDate(creditcard.getExpiration()).after(sdf.parse(DATE_TO_BE_COMPARED));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}).collect(Collectors.toList());
	
	}
	
	private Date getDate(String dateToConvert) throws ParseException {
		System.out.println(dateToConvert);
		return sdf.parse(dateToConvert);
	}
}
