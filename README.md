# n11-bootcamp-payment-integration

A simple terminal based payment system built during N11 Bootcamp.
The goal was to add a new payment method to an existing system
without breaking what was already there.

## My Approach

I wanted to make sure that adding a new payment method in the future
would be as simple as possible. So I focused on keeping the classes
independent from each other and making the system easy to extend.

Instead of using a switch-case or an enum to decide which payment
method to use, I designed the system so that all payment methods are
defined in one place.
This way, none of the existing classes need to be changed when a new
method is added.

## SOLID Principles Applied

**Single Responsibility Principle** — Each class has one responsibility.
`PaymentMenu` handles user input, `Payment` handles the payment flow
and each payment class handles its own logic.

**Open/Closed Principle** — To add Apple Pay for example, I only need
to create `ApplePayPayment.java` and add it to the list in `Main.java`.
No other file needs to change.

**Dependency Inversion Principle** — `PaymentMenu` depends on the
`PaymentMethod` interface, not on `CreditCardPayment` or
`PayPalPayment` directly.
