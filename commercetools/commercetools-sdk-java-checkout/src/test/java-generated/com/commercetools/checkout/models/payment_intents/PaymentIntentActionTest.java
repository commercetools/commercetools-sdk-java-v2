
package com.commercetools.checkout.models.payment_intents;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentIntentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentIntentActionBuilder builder) {
        PaymentIntentAction paymentIntentAction = builder.buildUnchecked();
        Assertions.assertThat(paymentIntentAction).isInstanceOf(PaymentIntentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "action",
                        PaymentIntentAction.builder()
                                .action(com.commercetools.checkout.models.payment_intents.PaymentIntentOperation
                                        .findEnum("capturePayment")) },
                new Object[] { "amount",
                        PaymentIntentAction.builder()
                                .amount(new com.commercetools.checkout.models.common.AmountImpl()) },
                new Object[] { "merchantReference",
                        PaymentIntentAction.builder().merchantReference("merchantReference") } };
    }

    @Test
    public void action() {
        PaymentIntentAction value = PaymentIntentAction.of();
        value.setAction(
            com.commercetools.checkout.models.payment_intents.PaymentIntentOperation.findEnum("capturePayment"));
        Assertions.assertThat(value.getAction())
                .isEqualTo(com.commercetools.checkout.models.payment_intents.PaymentIntentOperation
                        .findEnum("capturePayment"));
    }

    @Test
    public void amount() {
        PaymentIntentAction value = PaymentIntentAction.of();
        value.setAmount(new com.commercetools.checkout.models.common.AmountImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.checkout.models.common.AmountImpl());
    }

    @Test
    public void merchantReference() {
        PaymentIntentAction value = PaymentIntentAction.of();
        value.setMerchantReference("merchantReference");
        Assertions.assertThat(value.getMerchantReference()).isEqualTo("merchantReference");
    }
}
