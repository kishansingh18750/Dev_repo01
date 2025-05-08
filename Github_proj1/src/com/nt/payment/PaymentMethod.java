package com.nt.payment;

public class PaymentMethod {

	public static String makePayment(String methodName)
	{   String me01=null;
		
		if(methodName.equalsIgnoreCase("phonepay"))
		{
			me01="this method is phone pay";
		
		}
		else if(methodName.equalsIgnoreCase("googlepay"))
		{
			me01="this method is google pay";
		
		}
		
		return me01;
		
	}
}
