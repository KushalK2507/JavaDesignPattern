package org.kushal.pattern.ioc;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard {

	@Override
	public void makePayment() {
		
		System.out.println("Make Payment");

	}

}
