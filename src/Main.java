import com.selimhocaoglu.payment.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> supportedMethods = List.of(
                new CreditCardPayment(),
                new PayPalPayment(),
                new ApplePayment()
        );

        new PaymentMenu(supportedMethods).start();
    }
}