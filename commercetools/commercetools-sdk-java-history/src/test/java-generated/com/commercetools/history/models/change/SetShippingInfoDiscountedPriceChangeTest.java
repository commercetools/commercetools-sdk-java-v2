
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingInfoDiscountedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingInfoDiscountedPriceChangeBuilder builder) {
        SetShippingInfoDiscountedPriceChange setShippingInfoDiscountedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingInfoDiscountedPriceChange)
                .isInstanceOf(SetShippingInfoDiscountedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetShippingInfoDiscountedPriceChange.builder().change("change") },
                new Object[] { "previousValue", SetShippingInfoDiscountedPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) },
                new Object[] { "nextValue", SetShippingInfoDiscountedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl()) } };
    }

    @Test
    public void change() {
        SetShippingInfoDiscountedPriceChange value = SetShippingInfoDiscountedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetShippingInfoDiscountedPriceChange value = SetShippingInfoDiscountedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }

    @Test
    public void nextValue() {
        SetShippingInfoDiscountedPriceChange value = SetShippingInfoDiscountedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedLineItemPriceImpl());
    }
}
