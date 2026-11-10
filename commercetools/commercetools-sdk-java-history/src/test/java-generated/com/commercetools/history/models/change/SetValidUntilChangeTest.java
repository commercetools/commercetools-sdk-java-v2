
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetValidUntilChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetValidUntilChangeBuilder builder) {
        SetValidUntilChange setValidUntilChange = builder.buildUnchecked();
        Assertions.assertThat(setValidUntilChange).isInstanceOf(SetValidUntilChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetValidUntilChange.builder().change("change") },
                new Object[] { "previousValue", SetValidUntilChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetValidUntilChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetValidUntilChange value = SetValidUntilChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetValidUntilChange value = SetValidUntilChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetValidUntilChange value = SetValidUntilChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
