
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTextChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTextChangeBuilder builder) {
        SetTextChange setTextChange = builder.buildUnchecked();
        Assertions.assertThat(setTextChange).isInstanceOf(SetTextChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTextChange.builder().change("change") },
                new Object[] { "previousValue", SetTextChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetTextChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetTextChange value = SetTextChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTextChange value = SetTextChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetTextChange value = SetTextChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
