
package com.commercetools.api.models.payment;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PaymentChangeAmountPlannedActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, PaymentChangeAmountPlannedActionBuilder builder) {
        PaymentChangeAmountPlannedAction paymentChangeAmountPlannedAction = builder.buildUnchecked();
        Assertions.assertThat(paymentChangeAmountPlannedAction).isInstanceOf(PaymentChangeAmountPlannedAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "amount", PaymentChangeAmountPlannedAction.builder()
                .amount(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void amount() {
        PaymentChangeAmountPlannedAction value = PaymentChangeAmountPlannedAction.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
