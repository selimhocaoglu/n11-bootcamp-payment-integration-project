package com.selimhocaoglu.payment;

public class PayPalPayment implements PaymentMethod {

    @Override
    public void pay(Double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public String getMethodName() {
        return "PayPal";
    }
}
