
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddPaymentChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddPaymentChangeBuilder builder) {
        AddPaymentChange addPaymentChange = builder.buildUnchecked();
        Assertions.assertThat(addPaymentChange).isInstanceOf(AddPaymentChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddPaymentChange.builder().change("change") },
                new Object[] { "previousValue",
                        AddPaymentChange.builder()
                                .previousValue(new com.commercetools.history.models.common.PaymentInfoImpl()) },
                new Object[] { "nextValue", AddPaymentChange.builder()
                        .nextValue(new com.commercetools.history.models.common.PaymentInfoImpl()) } };
    }

    @Test
    public void change() {
        AddPaymentChange value = AddPaymentChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddPaymentChange value = AddPaymentChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }

    @Test
    public void nextValue() {
        AddPaymentChange value = AddPaymentChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PaymentInfoImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.PaymentInfoImpl());
    }
}
