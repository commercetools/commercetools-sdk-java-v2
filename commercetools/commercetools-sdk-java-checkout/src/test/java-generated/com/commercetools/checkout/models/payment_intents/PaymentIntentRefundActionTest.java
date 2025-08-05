
package com.commercetools.checkout.models.payment_intents;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntentRefundActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntentRefundActionBuilder builder) {
        PaymentIntentRefundAction paymentIntentRefundAction = builder.buildUnchecked();
        Assertions.assertThat(paymentIntentRefundAction).isInstanceOf(PaymentIntentRefundAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "amount",
                        PaymentIntentRefundAction.builder()
                                .amount(new com.commercetools.checkout.models.common.AmountImpl()) },
                new Object[] { "merchantReference",
                        PaymentIntentRefundAction.builder().merchantReference("merchantReference") } };
    }

    @Test
    public void amount() {
        PaymentIntentRefundAction value = PaymentIntentRefundAction.of();
        value.setAmount(new com.commercetools.checkout.models.common.AmountImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.checkout.models.common.AmountImpl());
    }

    @Test
    public void merchantReference() {
        PaymentIntentRefundAction value = PaymentIntentRefundAction.of();
        value.setMerchantReference("merchantReference");
        Assertions.assertThat(value.getMerchantReference()).isEqualTo("merchantReference");
    }
}
