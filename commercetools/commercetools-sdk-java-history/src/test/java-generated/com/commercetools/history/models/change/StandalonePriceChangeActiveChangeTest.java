
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceChangeActiveChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceChangeActiveChangeBuilder builder) {
        StandalonePriceChangeActiveChange standalonePriceChangeActiveChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceChangeActiveChange).isInstanceOf(StandalonePriceChangeActiveChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", StandalonePriceChangeActiveChange.builder().change("change") },
                new Object[] { "previousValue", StandalonePriceChangeActiveChange.builder().previousValue(true) },
                new Object[] { "nextValue", StandalonePriceChangeActiveChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        StandalonePriceChangeActiveChange value = StandalonePriceChangeActiveChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        StandalonePriceChangeActiveChange value = StandalonePriceChangeActiveChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        StandalonePriceChangeActiveChange value = StandalonePriceChangeActiveChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
