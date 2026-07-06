
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetKeyChangeBuilder builder) {
        StandalonePriceSetKeyChange standalonePriceSetKeyChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetKeyChange).isInstanceOf(StandalonePriceSetKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", StandalonePriceSetKeyChange.builder().change("change") },
                new Object[] { "previousValue", StandalonePriceSetKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", StandalonePriceSetKeyChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        StandalonePriceSetKeyChange value = StandalonePriceSetKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        StandalonePriceSetKeyChange value = StandalonePriceSetKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        StandalonePriceSetKeyChange value = StandalonePriceSetKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
