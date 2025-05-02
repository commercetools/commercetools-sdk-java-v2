
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetFirstNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetFirstNameChangeBuilder builder) {
        SetFirstNameChange setFirstNameChange = builder.buildUnchecked();
        Assertions.assertThat(setFirstNameChange).isInstanceOf(SetFirstNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetFirstNameChange.builder().change("change") },
                new Object[] { "previousValue", SetFirstNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetFirstNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetFirstNameChange value = SetFirstNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetFirstNameChange value = SetFirstNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetFirstNameChange value = SetFirstNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
