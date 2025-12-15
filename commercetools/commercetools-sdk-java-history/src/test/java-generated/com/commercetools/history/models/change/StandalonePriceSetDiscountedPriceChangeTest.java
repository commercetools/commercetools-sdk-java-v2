
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetDiscountedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetDiscountedPriceChangeBuilder builder) {
        StandalonePriceSetDiscountedPriceChange standalonePriceSetDiscountedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetDiscountedPriceChange)
                .isInstanceOf(StandalonePriceSetDiscountedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", StandalonePriceSetDiscountedPriceChange.builder().change("change") },
                new Object[] { "staged", StandalonePriceSetDiscountedPriceChange.builder().staged(true) },
                new Object[] { "previousValue",
                        StandalonePriceSetDiscountedPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.DiscountedPriceImpl()) },
                new Object[] { "nextValue", StandalonePriceSetDiscountedPriceChange.builder()
                        .nextValue(new com.commercetools.history.models.common.DiscountedPriceImpl()) } };
    }

    @Test
    public void change() {
        StandalonePriceSetDiscountedPriceChange value = StandalonePriceSetDiscountedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void staged() {
        StandalonePriceSetDiscountedPriceChange value = StandalonePriceSetDiscountedPriceChange.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void previousValue() {
        StandalonePriceSetDiscountedPriceChange value = StandalonePriceSetDiscountedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedPriceImpl());
    }

    @Test
    public void nextValue() {
        StandalonePriceSetDiscountedPriceChange value = StandalonePriceSetDiscountedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedPriceImpl());
    }
}
