
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemDiscountedPricePerQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemDiscountedPricePerQuantityChangeBuilder builder) {
        SetCustomLineItemDiscountedPricePerQuantityChange setCustomLineItemDiscountedPricePerQuantityChange = builder
                .buildUnchecked();
        Assertions.assertThat(setCustomLineItemDiscountedPricePerQuantityChange)
                .isInstanceOf(SetCustomLineItemDiscountedPricePerQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetCustomLineItemDiscountedPricePerQuantityChange.builder().change("change") },
                new Object[] { "customLineItem",
                        SetCustomLineItemDiscountedPricePerQuantityChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemDiscountedPricePerQuantityChange.builder()
                                .customLineItemId("customLineItemId") },
                new Object[] { "previousValue", SetCustomLineItemDiscountedPricePerQuantityChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl()) },
                new Object[] { "nextValue", SetCustomLineItemDiscountedPricePerQuantityChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl()) } };
    }

    @Test
    public void change() {
        SetCustomLineItemDiscountedPricePerQuantityChange value = SetCustomLineItemDiscountedPricePerQuantityChange
                .of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemDiscountedPricePerQuantityChange value = SetCustomLineItemDiscountedPricePerQuantityChange
                .of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemDiscountedPricePerQuantityChange value = SetCustomLineItemDiscountedPricePerQuantityChange
                .of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemDiscountedPricePerQuantityChange value = SetCustomLineItemDiscountedPricePerQuantityChange
                .of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemDiscountedPricePerQuantityChange value = SetCustomLineItemDiscountedPricePerQuantityChange
                .of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
    }
}
