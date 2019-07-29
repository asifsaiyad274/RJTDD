package com.ecw.payment

import spock.lang.Shared
import spock.lang.Specification

class PaymentServiceNeedTo extends Specification {
	
	def userValidator = Mock(UserValidator);
	def paymentGateway = Mock(PaymentGateway);

	@Shared	def user = new User();
	@Shared def paymentDetails = new PaymentDetails();
	@Shared def PaymentService paymentService;
	
	def setup(){
		paymentService = new PaymentService(userValidator,paymentGateway);
	}
	
	def 'throw an exception if user is invalid'(){
		given:
			def error;
			userValidator.isValid(user) >> false;
		when:
			paymentService.processPayment(user, paymentDetails);
		then:
			error = thrown(UserInvalidException);
			error.message == "User is invalid";
			0 * paymentGateway.proceedPayment(paymentDetails);
	}
	
	def 'process payment is user is valid'(){
		given: 
			userValidator.isValid(user) >> true;
		when: 
			paymentService.processPayment(user, paymentDetails);
		then:
			1 * paymentGateway.proceedPayment(paymentDetails);
			notThrown(UserInvalidException);
	}
	
	
}
