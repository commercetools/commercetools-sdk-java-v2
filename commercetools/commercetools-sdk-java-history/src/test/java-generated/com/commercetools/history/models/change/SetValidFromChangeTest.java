
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetValidFromChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetValidFromChangeBuilder builder) {
        SetValidFromChange setValidFromChange = builder.buildUnchecked();
        Assertions.assertThat(setValidFromChange).isInstanceOf(SetValidFromChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetValidFromChange.builder().change("change") },
                new Object[] { "previousValue", SetValidFromChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetValidFromChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetValidFromChange value = SetValidFromChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetValidFromChange value = SetValidFromChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetValidFromChange value = SetValidFromChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
