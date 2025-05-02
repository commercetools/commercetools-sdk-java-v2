
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetValidToChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetValidToChangeBuilder builder) {
        SetValidToChange setValidToChange = builder.buildUnchecked();
        Assertions.assertThat(setValidToChange).isInstanceOf(SetValidToChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetValidToChange.builder().change("change") },
                new Object[] { "previousValue", SetValidToChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetValidToChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetValidToChange value = SetValidToChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetValidToChange value = SetValidToChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetValidToChange value = SetValidToChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
