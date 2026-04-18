package com.selimhocaoglu.payment;

public interface PaymentMethod {

    void pay(Double amount);

    String getMethodName();
}
