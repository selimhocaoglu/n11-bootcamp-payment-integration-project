package com.selimhocaoglu.payment;

public class ApplePayment implements PaymentMethod {

    @Override
    public void pay(Double amount) {
        System.out.println("Processing Apple Pay payment of $" + amount);
    }

    @Override
    public String getMethodName() {
        return "Apple Pay";
    }
}
