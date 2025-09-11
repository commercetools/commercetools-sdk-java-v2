
package com.commercetools.checkout.models.payment_intents;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntentTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntentBuilder builder) {
        PaymentIntent paymentIntent = builder.buildUnchecked();
        Assertions.assertThat(paymentIntent).isInstanceOf(PaymentIntent.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "actions",
                PaymentIntent.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.checkout.models.payment_intents.PaymentIntentActionImpl())) } };
    }

    @Test
    public void actions() {
        PaymentIntent value = PaymentIntent.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.checkout.models.payment_intents.PaymentIntentActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.checkout.models.payment_intents.PaymentIntentActionImpl()));
    }
}
