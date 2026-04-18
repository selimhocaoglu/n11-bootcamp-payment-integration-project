package com.selimhocaoglu.payment;

public class Payment {

    public void paymentProcess(PaymentMethod paymentMethod, Double amount) {

        System.out.println("Initiating payment of $" + amount + " using " + paymentMethod.getMethodName());
        paymentMethod.pay(amount);
        System.out.println("Payment of $" + amount + " completed using " + paymentMethod.getMethodName());
    }
}
