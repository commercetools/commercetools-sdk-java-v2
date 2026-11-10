
package com.commercetools.checkout.models.payment_intents;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntentResponseTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntentResponseBuilder builder) {
        PaymentIntentResponse paymentIntentResponse = builder.buildUnchecked();
        Assertions.assertThat(paymentIntentResponse).isInstanceOf(PaymentIntentResponse.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "outcome", PaymentIntentResponse.builder()
                .outcome(
                    com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome.findEnum("approved")) } };
    }

    @Test
    public void outcome() {
        PaymentIntentResponse value = PaymentIntentResponse.of();
        value.setOutcome(com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome.findEnum("approved"));
        Assertions.assertThat(value.getOutcome())
                .isEqualTo(com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome.findEnum("approved"));
    }
}
