
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDiscountOnTotalPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDiscountOnTotalPriceChangeBuilder builder) {
        SetDiscountOnTotalPriceChange setDiscountOnTotalPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setDiscountOnTotalPriceChange).isInstanceOf(SetDiscountOnTotalPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDiscountOnTotalPriceChange.builder().change("change") },
                new Object[] { "previousValue", SetDiscountOnTotalPriceChange.builder()
                        .previousValue(new com.commercetools.history.models.common.DiscountOnTotalPriceImpl()) },
                new Object[] { "nextValue", SetDiscountOnTotalPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountOnTotalPriceImpl()) } };
    }

    @Test
    public void change() {
        SetDiscountOnTotalPriceChange value = SetDiscountOnTotalPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDiscountOnTotalPriceChange value = SetDiscountOnTotalPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountOnTotalPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountOnTotalPriceImpl());
    }

    @Test
    public void nextValue() {
        SetDiscountOnTotalPriceChange value = SetDiscountOnTotalPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountOnTotalPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountOnTotalPriceImpl());
    }
}
