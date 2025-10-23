
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
                new Object[] { "lineItemId", SetLineItemShippingDetailsChange.builder().lineItemId("lineItemId") },
                new Object[] { "lineItem",
                        SetLineItemShippingDetailsChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetLineItemShippingDetailsChange.builder().variant("variant") } };
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

    @Test
    public void lineItem() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemShippingDetailsChange value = SetLineItemShippingDetailsChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
