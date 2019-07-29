package com.ecw.payment

import spock.lang.Shared
import spock.lang.Specification

class PaymentServiceShould extends Specification {
	
	@Shared
	def user = new User();
	def paymentDetails = new PaymentDetails();
	
	def 'throw an exception if user is invalid'(){
		given:
			
			def error;
			
			UserValidator userValidator = Mock();
			PaymentGateway paymentGateway = Mock();
			
			def paymentService = new PaymentService(userValidator, paymentGateway);
		when:
			paymentService.processPayment(user, paymentDetails);
		
		then:
			1 * userValidator.isValid(user) >> false;
			0 * paymentGateway.proceedPayment(paymentDetails);
			error = thrown(UserInvalidException);
			error.message == "User is invalid";
	}
	
	def 'process payment is user is valid'(){
		given: 
			def user = new User();
			def paymentDetails = new PaymentDetails();

			UserValidator userValidator = Mock();
			PaymentGateway paymentGateway = Mock();
			
			def paymentService = new PaymentService(userValidator, paymentGateway);
		when: 
			paymentService.processPayment(user, paymentDetails);
		then:
			1 * userValidator.isValid(user) >> true;
			1 * paymentGateway.proceedPayment(paymentDetails);
			notThrown(UserInvalidException);
	}
	
	
}
