import com.selimhocaoglu.payment.PaymentFactory;
import com.selimhocaoglu.payment.PaymentMenu;
import com.selimhocaoglu.payment.PaymentMethod;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        PaymentFactory paymentFactory = new PaymentFactory();
        List<PaymentMethod> methods = paymentFactory.discoverMethods();
        new PaymentMenu(methods).start();
    }
}