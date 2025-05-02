
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTitleChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTitleChangeBuilder builder) {
        SetTitleChange setTitleChange = builder.buildUnchecked();
        Assertions.assertThat(setTitleChange).isInstanceOf(SetTitleChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTitleChange.builder().change("change") },
                new Object[] { "previousValue", SetTitleChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetTitleChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetTitleChange value = SetTitleChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTitleChange value = SetTitleChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetTitleChange value = SetTitleChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
