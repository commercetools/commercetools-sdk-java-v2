
package commercetools.payment;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.common.MoneyBuilder;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.payment.PaymentDraft;
import com.commercetools.api.models.payment.PaymentDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;

public class PaymentFixtures {
    public static Payment deletePayment(final String id, final Long version) {
        final Payment payment = CommercetoolsTestUtils.getProjectApiRoot()
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

    public static void withPayment(final Consumer<Payment> consumer) {
        final Payment payment = createPayment();
        try {
            consumer.accept(payment);
        }
        finally {
            deletePayment(payment.getId(), payment.getVersion());
        }
    }

    public static void withUpdateablePayment(final UnaryOperator<Payment> operator) {
        Payment payment = createPayment();
        try {
            payment = operator.apply(payment);
        }
        finally {
            deletePayment(payment.getId(), payment.getVersion());
        }
    }

    public static Payment createPayment() {
        final PaymentDraft paymentDraft = PaymentDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .amountPlanned(MoneyBuilder.of().centAmount(1000L).currencyCode("EUR").build())
                .interfaceId(CommercetoolsTestUtils.randomString())
                .paymentMethodInfo(paymentMethodInfoBuilder -> paymentMethodInfoBuilder.method("testMethod")
                        .paymentInterface("testInterface")
                        .name(CommercetoolsTestUtils.randomLocalizedString()))
                .build();
        return CommercetoolsTestUtils.getProjectApiRoot().payments().create(paymentDraft).executeBlocking().getBody();
    }
}
