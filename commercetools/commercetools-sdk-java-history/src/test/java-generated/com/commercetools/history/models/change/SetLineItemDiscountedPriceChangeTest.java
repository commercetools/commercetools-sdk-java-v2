
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemDiscountedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemDiscountedPriceChangeBuilder builder) {
        SetLineItemDiscountedPriceChange setLineItemDiscountedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemDiscountedPriceChange).isInstanceOf(SetLineItemDiscountedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemDiscountedPriceChange.builder().change("change") },
                new Object[] { "previousValue", SetLineItemDiscountedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) },
                new Object[] { "nextValue",
                        SetLineItemDiscountedPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) },
                new Object[] { "lineItem",
                        SetLineItemDiscountedPriceChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetLineItemDiscountedPriceChange.builder().variant("variant") },
                new Object[] { "lineItemId", SetLineItemDiscountedPriceChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void lineItemId() {
        SetLineItemDiscountedPriceChange value = SetLineItemDiscountedPriceChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
