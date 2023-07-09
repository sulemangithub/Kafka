package org.example.SampleApplication.pojos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CreditCard {
	
	private String type;
	private String number;
	private LocalDate expiration;
	private String owner;
}
