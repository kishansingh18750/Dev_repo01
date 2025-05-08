package com.nt.main;

import com.nt.payment.PaymentMethod;

public class TestDemo01 {

	public static void main(String[] args) {
	      int sum = calcuation.sum(200, 500);
	      System.out.println("sum "+sum);
	      
	      String payment = PaymentMethod.makePayment("google pay");
            System.out.println(payment);
	}

}
