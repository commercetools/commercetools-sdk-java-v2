
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemShippingDetailsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemShippingDetailsChangeBuilder builder) {
        SetLineItemShippingDetailsChange setLineItemShippingDetailsChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemShippingDetailsChange).isInstanceOf(SetLineItemShippingDetailsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemShippingDetailsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemShippingDetailsChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { "nextValue",
                        SetLineItemShippingDetailsChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { "lineItemId", SetLineItemShippingDetailsChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void lineItemId() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
