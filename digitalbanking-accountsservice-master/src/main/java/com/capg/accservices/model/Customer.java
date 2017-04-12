package com.capg.accservices.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component

public class Customer {
private int customerId;

public int getCustomerId() {
	System.out.println("GETTING CUSTOMER ID");
	return customerId;
}

public void setCustomerId(int customerId) {
	System.out.println("SETTING CUSTOMER ID");
	this.customerId = customerId;
}
}
