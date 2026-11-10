
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeNameChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeNameChangeBuilder builder) {
        ChangeNameChange changeNameChange = builder.buildUnchecked();
        Assertions.assertThat(changeNameChange).isInstanceOf(ChangeNameChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeNameChange.builder().change("change") },
                new Object[] { "previousValue", ChangeNameChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeNameChange value = ChangeNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeNameChange value = ChangeNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeNameChange value = ChangeNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
