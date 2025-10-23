
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMaxCartQuantityChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMaxCartQuantityChangeBuilder builder) {
        SetMaxCartQuantityChange setMaxCartQuantityChange = builder.buildUnchecked();
        Assertions.assertThat(setMaxCartQuantityChange).isInstanceOf(SetMaxCartQuantityChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMaxCartQuantityChange.builder().change("change") },
                new Object[] { "previousValue", SetMaxCartQuantityChange.builder().previousValue(8) },
                new Object[] { "nextValue", SetMaxCartQuantityChange.builder().nextValue(7) } };
    }

    @Test
    public void change() {
        SetMaxCartQuantityChange value = SetMaxCartQuantityChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMaxCartQuantityChange value = SetMaxCartQuantityChange.of();
        value.setPreviousValue(8);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(8);
    }

    @Test
    public void nextValue() {
        SetMaxCartQuantityChange value = SetMaxCartQuantityChange.of();
        value.setNextValue(7);
        Assertions.assertThat(value.getNextValue()).isEqualTo(7);
    }
}
