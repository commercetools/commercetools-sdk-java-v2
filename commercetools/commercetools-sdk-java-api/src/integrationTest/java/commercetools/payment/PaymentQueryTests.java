
package commercetools.payment;

import static commercetools.payment.PaymentFixtures.withPayment;

import java.util.List;

import com.commercetools.api.models.payment.Payment;
import commercetools.utils.CommercetoolsTestUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentQueryTests {

    @Test
    public void getById() {
        withPayment(payment -> {
            Payment fetchedPayment = CommercetoolsTestUtils.getProjectApiRoot()
                    .payments()
                    .withId(payment.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(fetchedPayment).isEqualTo(payment);
        });
    }

    @Test
    public void getByKey() {
        withPayment(payment -> {
            Payment queriedPayment = CommercetoolsTestUtils.getProjectApiRoot()
                    .payments()
                    .withKey(payment.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertThat(queriedPayment).isEqualTo(payment);
        });
    }

    @Test
    public void queryByInterfaceIdAndPaymentMethod() {
        withPayment(payment -> {
            final List<Payment> queriedPayments = CommercetoolsTestUtils.getProjectApiRoot()
                    .payments()
                    .get()
                    .withWhere("interfaceId=:interfaceId", "interfaceId", payment.getInterfaceId())
                    .addWhere("paymentMethodInfo(method=:paymentMethod)", "paymentMethod",
                        payment.getPaymentMethodInfo().getMethod())
                    .executeBlocking()
                    .getBody()
                    .getResults();

            Assertions.assertThat(queriedPayments).hasSize(1);
            Assertions.assertThat(queriedPayments.get(0)).isEqualTo(payment);
        });
    }

    @Test
    public void queryByInterfaceIdAndPaymentMethodWithQueryModel() {
        withPayment(payment -> {
            final List<Payment> queriedPayments = CommercetoolsTestUtils.getProjectApiRoot()
                    .payments()
                    .get()
                    .withQuery(p -> p.interfaceId().isVar("interfaceId"), "interfaceId", payment.getInterfaceId())
                    .addQuery(p -> p.paymentMethodInfo(m -> m.method().isVar("paymentMethod")), "paymentMethod",
                        payment.getPaymentMethodInfo().getMethod())
                    .executeBlocking()
                    .getBody()
                    .getResults();

            Assertions.assertThat(queriedPayments).hasSize(1);
            Assertions.assertThat(queriedPayments.get(0)).isEqualTo(payment);
        });
    }
}
