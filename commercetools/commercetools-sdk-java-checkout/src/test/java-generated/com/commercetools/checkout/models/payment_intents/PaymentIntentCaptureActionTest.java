
package com.commercetools.checkout.models.payment_intents;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntentCaptureActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntentCaptureActionBuilder builder) {
        PaymentIntentCaptureAction paymentIntentCaptureAction = builder.buildUnchecked();
        Assertions.assertThat(paymentIntentCaptureAction).isInstanceOf(PaymentIntentCaptureAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "amount",
                        PaymentIntentCaptureAction.builder()
                                .amount(new com.commercetools.checkout.models.common.AmountImpl()) },
                new Object[] { "merchantReference",
                        PaymentIntentCaptureAction.builder().merchantReference("merchantReference") } };
    }

    @Test
    public void amount() {
        PaymentIntentCaptureAction value = PaymentIntentCaptureAction.of();
        value.setAmount(new com.commercetools.checkout.models.common.AmountImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.checkout.models.common.AmountImpl());
    }

    @Test
    public void merchantReference() {
        PaymentIntentCaptureAction value = PaymentIntentCaptureAction.of();
        value.setMerchantReference("merchantReference");
        Assertions.assertThat(value.getMerchantReference()).isEqualTo("merchantReference");
    }
}
