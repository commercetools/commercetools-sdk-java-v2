
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetValueChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetValueChangeBuilder builder) {
        SetValueChange setValueChange = builder.buildUnchecked();
        Assertions.assertThat(setValueChange).isInstanceOf(SetValueChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetValueChange.builder().change("change") },
                new Object[] { "previousValue", SetValueChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetValueChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetValueChange value = SetValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetValueChange value = SetValueChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetValueChange value = SetValueChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
