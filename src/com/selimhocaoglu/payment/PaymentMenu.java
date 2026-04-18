package com.selimhocaoglu.payment;

import java.util.List;
import java.util.Scanner;

public class PaymentMenu {

    private final Scanner scanner = new Scanner(System.in);
    private final Payment payment = new Payment();
    private final List<PaymentMethod> availableMethods;

    public PaymentMenu(List<PaymentMethod> availableMethods) {
        this.availableMethods = availableMethods;
    }

    public void start() {
        System.out.println("Welcome to the Payment System");

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Make a Payment");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 2) {
                System.out.println("Exiting...");
                break;
            }

            if (choice != 1) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            PaymentMethod paymentMethod = selectPaymentMethod();
            if (paymentMethod == null) {
                continue;
            }

            Double amount = enterAmount();
            payment.paymentProcess(paymentMethod, amount);
        }

        scanner.close();
    }

    private PaymentMethod selectPaymentMethod() {

        System.out.println("Please select a payment method:");
        for (int i = 0; i < availableMethods.size(); i++) {
            System.out.println((i + 1) + ". " + availableMethods.get(i).getMethodName());
        }
        System.out.print("Enter the number corresponding to your choice: ");

        int choice = scanner.nextInt() - 1;

        if (choice >= 0 && choice < availableMethods.size()) {

            return availableMethods.get(choice);
        } else {

            System.out.println("Invalid choice. Please try again.");
            return null;
        }
    }

    private Double enterAmount() {

        System.out.print("Enter the amount to pay: ");

        return scanner.nextDouble();
    }
}
