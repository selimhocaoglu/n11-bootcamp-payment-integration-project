package com.selimhocaoglu.payment;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(Double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public String getMethodName() {
        return "Credit Card";
    }
}
