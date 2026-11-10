
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAuthorNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAuthorNameChangeBuilder builder) {
        SetAuthorNameChange setAuthorNameChange = builder.buildUnchecked();
        Assertions.assertThat(setAuthorNameChange).isInstanceOf(SetAuthorNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAuthorNameChange.builder().change("change") },
                new Object[] { "previousValue", SetAuthorNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetAuthorNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetAuthorNameChange value = SetAuthorNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAuthorNameChange value = SetAuthorNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetAuthorNameChange value = SetAuthorNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
