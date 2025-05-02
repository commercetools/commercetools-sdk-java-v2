
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMiddleNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMiddleNameChangeBuilder builder) {
        SetMiddleNameChange setMiddleNameChange = builder.buildUnchecked();
        Assertions.assertThat(setMiddleNameChange).isInstanceOf(SetMiddleNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMiddleNameChange.builder().change("change") },
                new Object[] { "previousValue", SetMiddleNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetMiddleNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMiddleNameChange value = SetMiddleNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMiddleNameChange value = SetMiddleNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMiddleNameChange value = SetMiddleNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
