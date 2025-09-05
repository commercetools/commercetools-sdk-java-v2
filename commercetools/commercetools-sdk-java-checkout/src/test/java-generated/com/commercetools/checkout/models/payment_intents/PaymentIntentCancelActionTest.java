
package com.commercetools.checkout.models.payment_intents;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntentCancelActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntentCancelActionBuilder builder) {
        PaymentIntentCancelAction paymentIntentCancelAction = builder.buildUnchecked();
        Assertions.assertThat(paymentIntentCancelAction).isInstanceOf(PaymentIntentCancelAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "merchantReference",
                PaymentIntentCancelAction.builder().merchantReference("merchantReference") } };
    }

    @Test
    public void merchantReference() {
        PaymentIntentCancelAction value = PaymentIntentCancelAction.of();
        value.setMerchantReference("merchantReference");
        Assertions.assertThat(value.getMerchantReference()).isEqualTo("merchantReference");
    }
}
