
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetValidUntilChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetValidUntilChangeBuilder builder) {
        StandalonePriceSetValidUntilChange standalonePriceSetValidUntilChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetValidUntilChange)
                .isInstanceOf(StandalonePriceSetValidUntilChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", StandalonePriceSetValidUntilChange.builder().change("change") },
                new Object[] { "previousValue",
                        StandalonePriceSetValidUntilChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", StandalonePriceSetValidUntilChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        StandalonePriceSetValidUntilChange value = StandalonePriceSetValidUntilChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        StandalonePriceSetValidUntilChange value = StandalonePriceSetValidUntilChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        StandalonePriceSetValidUntilChange value = StandalonePriceSetValidUntilChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
