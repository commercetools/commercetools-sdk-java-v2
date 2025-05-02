
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReturnPaymentStateChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReturnPaymentStateChangeBuilder builder) {
        SetReturnPaymentStateChange setReturnPaymentStateChange = builder.buildUnchecked();
        Assertions.assertThat(setReturnPaymentStateChange).isInstanceOf(SetReturnPaymentStateChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetReturnPaymentStateChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetReturnPaymentStateChange.builder()
                                .previousValue(com.commercetools.history.models.common.ReturnPaymentState
                                        .findEnum("NonRefundable")) },
                new Object[] { "nextValue", SetReturnPaymentStateChange.builder()
                        .nextValue(
                            com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable")) } };
    }

    @Test
    public void change() {
        SetReturnPaymentStateChange value = SetReturnPaymentStateChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetReturnPaymentStateChange value = SetReturnPaymentStateChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
    }

    @Test
    public void nextValue() {
        SetReturnPaymentStateChange value = SetReturnPaymentStateChange.of();
        value.setNextValue(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.ReturnPaymentState.findEnum("NonRefundable"));
    }
}
