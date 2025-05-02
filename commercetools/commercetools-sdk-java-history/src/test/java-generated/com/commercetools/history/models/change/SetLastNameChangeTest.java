
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLastNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLastNameChangeBuilder builder) {
        SetLastNameChange setLastNameChange = builder.buildUnchecked();
        Assertions.assertThat(setLastNameChange).isInstanceOf(SetLastNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLastNameChange.builder().change("change") },
                new Object[] { "previousValue", SetLastNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetLastNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetLastNameChange value = SetLastNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLastNameChange value = SetLastNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetLastNameChange value = SetLastNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
