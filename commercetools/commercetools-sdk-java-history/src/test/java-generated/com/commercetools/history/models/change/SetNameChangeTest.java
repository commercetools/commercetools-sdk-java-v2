
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetNameChangeBuilder builder) {
        SetNameChange setNameChange = builder.buildUnchecked();
        Assertions.assertThat(setNameChange).isInstanceOf(SetNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetNameChange.builder().change("change") },
                new Object[] { "previousValue", SetNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetNameChange value = SetNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetNameChange value = SetNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetNameChange value = SetNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
