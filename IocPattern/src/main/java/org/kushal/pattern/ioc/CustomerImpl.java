package org.kushal.pattern.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

	// This is called Field Level Injection
	@Autowired
	private CreditCard creditCard;

	public void pay() {
		creditCard.makePayment();
	}

}
