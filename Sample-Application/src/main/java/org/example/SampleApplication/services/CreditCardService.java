package org.example.SampleApplication.services;

import java.util.List;
import org.example.SampleApplication.pojos.CreditCard;

public interface CreditCardService {
	public List<CreditCard> fetchAllCreditCards();
}
