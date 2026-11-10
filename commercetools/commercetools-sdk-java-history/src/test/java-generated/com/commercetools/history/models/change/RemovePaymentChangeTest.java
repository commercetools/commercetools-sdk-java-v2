
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemovePaymentChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemovePaymentChangeBuilder builder) {
        RemovePaymentChange removePaymentChange = builder.buildUnchecked();
        Assertions.assertThat(removePaymentChange).isInstanceOf(RemovePaymentChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemovePaymentChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemovePaymentChange.builder()
                                .previousValue(new com.commercetools.history.models.common.PaymentInfoImpl()) },
                new Object[] { "nextValue", RemovePaymentChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PaymentInfoImpl()) } };
    }

    @Test
    public void change() {
        RemovePaymentChange value = RemovePaymentChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemovePaymentChange value = RemovePaymentChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }

    @Test
    public void nextValue() {
        RemovePaymentChange value = RemovePaymentChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }
}
