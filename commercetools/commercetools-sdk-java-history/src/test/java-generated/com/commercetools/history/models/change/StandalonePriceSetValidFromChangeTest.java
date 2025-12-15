
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetValidFromChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetValidFromChangeBuilder builder) {
        StandalonePriceSetValidFromChange standalonePriceSetValidFromChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidFromChange).isInstanceOf(StandalonePriceSetValidFromChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", StandalonePriceSetValidFromChange.builder().change("change") },
                new Object[] { "previousValue",
                        StandalonePriceSetValidFromChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", StandalonePriceSetValidFromChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        StandalonePriceSetValidFromChange value = StandalonePriceSetValidFromChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        StandalonePriceSetValidFromChange value = StandalonePriceSetValidFromChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        StandalonePriceSetValidFromChange value = StandalonePriceSetValidFromChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
