
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentCreatedMessageBuilder builder) {
        PaymentCreatedMessage paymentCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(paymentCreatedMessage).isInstanceOf(PaymentCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payment",
                PaymentCreatedMessage.builder().payment(new com.commercetools.api.models.payment.PaymentImpl()) } };
    }

    @Test
    public void payment() {
        PaymentCreatedMessage value = PaymentCreatedMessage.of();
        value.setPayment(new com.commercetools.api.models.payment.PaymentImpl());
        Assertions.assertThat(value.getPayment()).isEqualTo(new com.commercetools.api.models.payment.PaymentImpl());
    }
}
