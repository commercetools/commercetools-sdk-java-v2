
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemDiscountedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemDiscountedPriceChangeBuilder builder) {
        SetCustomLineItemDiscountedPriceChange setCustomLineItemDiscountedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemDiscountedPriceChange)
                .isInstanceOf(SetCustomLineItemDiscountedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetCustomLineItemDiscountedPriceChange.builder().change("change") },
                new Object[] { "customLineItem",
                        SetCustomLineItemDiscountedPriceChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemDiscountedPriceChange.builder().customLineItemId("customLineItemId") },
                new Object[] { "previousValue", SetCustomLineItemDiscountedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) },
                new Object[] { "nextValue", SetCustomLineItemDiscountedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) } };
    }

    @Test
    public void change() {
        SetCustomLineItemDiscountedPriceChange value = SetCustomLineItemDiscountedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemDiscountedPriceChange value = SetCustomLineItemDiscountedPriceChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemDiscountedPriceChange value = SetCustomLineItemDiscountedPriceChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemDiscountedPriceChange value = SetCustomLineItemDiscountedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemDiscountedPriceChange value = SetCustomLineItemDiscountedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }
}
