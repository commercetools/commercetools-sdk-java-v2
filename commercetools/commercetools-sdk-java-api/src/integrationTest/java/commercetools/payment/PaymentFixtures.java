
package commercetools.payment;

import com.commercetools.api.models.payment.Payment;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class PaymentFixtures {
    public static Payment deletePayment(final String id, final Long version) {
        Payment payment = CommercetoolsTestUtils.getProjectApiRoot()
                .payments()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(payment);
        Assertions.assertEquals(payment.getId(), id);

        return payment;
    }
}
