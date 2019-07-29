package com.ecw.payment;

public class PaymentService {
	
	UserValidator userValidator= null;
	PaymentGateway paymentGateway= null;
	
	PaymentService(UserValidator userValidator, PaymentGateway paymentGateway){
		this.userValidator = userValidator;
		this.paymentGateway = paymentGateway;
	}
	
	public void processPayment(User user, PaymentDetails paymentDetails) throws UserInvalidException {
		if(!userValidator.isValid(user)) {
			throw new UserInvalidException("User is invalid");
		}
		paymentGateway.proceedPayment(paymentDetails);
	}
}
