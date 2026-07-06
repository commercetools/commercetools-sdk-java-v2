
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceChangeValueChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceChangeValueChangeBuilder builder) {
        StandalonePriceChangeValueChange standalonePriceChangeValueChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceChangeValueChange).isInstanceOf(StandalonePriceChangeValueChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", StandalonePriceChangeValueChange.builder().change("change") },
                new Object[] { "staged", StandalonePriceChangeValueChange.builder().staged(true) },
                new Object[] { "previousValue",
                        StandalonePriceChangeValueChange.builder()
                                .previousValue(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "nextValue", StandalonePriceChangeValueChange.builder()
                        .nextValue(new com.commercetools.history.models.common.MoneyImpl()) } };
    }

    @Test
    public void change() {
        StandalonePriceChangeValueChange value = StandalonePriceChangeValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void staged() {
        StandalonePriceChangeValueChange value = StandalonePriceChangeValueChange.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void previousValue() {
        StandalonePriceChangeValueChange value = StandalonePriceChangeValueChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void nextValue() {
        StandalonePriceChangeValueChange value = StandalonePriceChangeValueChange.of();
        value.setNextValue(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }
}
