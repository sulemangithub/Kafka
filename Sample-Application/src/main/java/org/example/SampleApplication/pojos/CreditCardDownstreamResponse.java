package org.example.SampleApplication.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreditCardDownstreamResponse {

	private String status;
	private int code;
	private int total;
	private List<CreditCard> data;
	
}
