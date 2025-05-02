
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemDiscountedPricePerQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemDiscountedPricePerQuantityChangeBuilder builder) {
        SetLineItemDiscountedPricePerQuantityChange setLineItemDiscountedPricePerQuantityChange = builder
                .buildUnchecked();
        Assertions.assertThat(setLineItemDiscountedPricePerQuantityChange)
                .isInstanceOf(SetLineItemDiscountedPricePerQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetLineItemDiscountedPricePerQuantityChange.builder().change("change") },
                new Object[] { "previousValue", SetLineItemDiscountedPricePerQuantityChange.builder()
                        .previousValue(
                            new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl()) },
                new Object[] { "nextValue", SetLineItemDiscountedPricePerQuantityChange.builder()
                        .nextValue(
                            new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl()) },
                new Object[] { "lineItem",
                        SetLineItemDiscountedPricePerQuantityChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetLineItemDiscountedPricePerQuantityChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemDiscountedPricePerQuantityChange value = SetLineItemDiscountedPricePerQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemDiscountedPricePerQuantityChange value = SetLineItemDiscountedPricePerQuantityChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemDiscountedPricePerQuantityChange value = SetLineItemDiscountedPricePerQuantityChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemDiscountedPricePerQuantityChange value = SetLineItemDiscountedPricePerQuantityChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemDiscountedPricePerQuantityChange value = SetLineItemDiscountedPricePerQuantityChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
