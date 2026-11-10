
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDateOfBirthChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDateOfBirthChangeBuilder builder) {
        SetDateOfBirthChange setDateOfBirthChange = builder.buildUnchecked();
        Assertions.assertThat(setDateOfBirthChange).isInstanceOf(SetDateOfBirthChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDateOfBirthChange.builder().change("change") },
                new Object[] { "previousValue", SetDateOfBirthChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetDateOfBirthChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetDateOfBirthChange value = SetDateOfBirthChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDateOfBirthChange value = SetDateOfBirthChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetDateOfBirthChange value = SetDateOfBirthChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
