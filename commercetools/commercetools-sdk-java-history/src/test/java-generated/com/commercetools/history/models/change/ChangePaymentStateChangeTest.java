
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangePaymentStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangePaymentStateChangeBuilder builder) {
        ChangePaymentStateChange changePaymentStateChange = builder.buildUnchecked();
        Assertions.assertThat(changePaymentStateChange).isInstanceOf(ChangePaymentStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangePaymentStateChange.builder().change("change") },
                new Object[] { "previousValue", ChangePaymentStateChange.builder()
                        .previousValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue")) },
                new Object[] { "nextValue", ChangePaymentStateChange.builder()
                        .nextValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue")) } };
    }

    @Test
    public void change() {
        ChangePaymentStateChange value = ChangePaymentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePaymentStateChange value = ChangePaymentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
    }

    @Test
    public void nextValue() {
        ChangePaymentStateChange value = ChangePaymentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.PaymentState.findEnum("BalanceDue"));
    }
}
