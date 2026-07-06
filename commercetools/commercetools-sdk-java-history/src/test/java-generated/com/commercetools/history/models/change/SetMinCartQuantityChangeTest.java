
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMinCartQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMinCartQuantityChangeBuilder builder) {
        SetMinCartQuantityChange setMinCartQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(setMinCartQuantityChange).isInstanceOf(SetMinCartQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMinCartQuantityChange.builder().change("change") },
                new Object[] { "previousValue", SetMinCartQuantityChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetMinCartQuantityChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetMinCartQuantityChange value = SetMinCartQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMinCartQuantityChange value = SetMinCartQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetMinCartQuantityChange value = SetMinCartQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
