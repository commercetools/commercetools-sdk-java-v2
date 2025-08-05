
package com.commercetools.checkout.models.payment_intents;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntentReverseActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntentReverseActionBuilder builder) {
        PaymentIntentReverseAction paymentIntentReverseAction = builder.buildUnchecked();
        Assertions.assertThat(paymentIntentReverseAction).isInstanceOf(PaymentIntentReverseAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "merchantReference",
                PaymentIntentReverseAction.builder().merchantReference("merchantReference") } };
    }

    @Test
    public void merchantReference() {
        PaymentIntentReverseAction value = PaymentIntentReverseAction.of();
        value.setMerchantReference("merchantReference");
        Assertions.assertThat(value.getMerchantReference()).isEqualTo("merchantReference");
    }
}
