
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetOrderNumberChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetOrderNumberChangeBuilder builder) {
        SetOrderNumberChange setOrderNumberChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderNumberChange).isInstanceOf(SetOrderNumberChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetOrderNumberChange.builder().change("change") },
                new Object[] { "previousValue", SetOrderNumberChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetOrderNumberChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetOrderNumberChange value = SetOrderNumberChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderNumberChange value = SetOrderNumberChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetOrderNumberChange value = SetOrderNumberChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
