
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMethodInfoMethodChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMethodInfoMethodChangeBuilder builder) {
        SetMethodInfoMethodChange setMethodInfoMethodChange = builder.buildUnchecked();
        Assertions.assertThat(setMethodInfoMethodChange).isInstanceOf(SetMethodInfoMethodChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMethodInfoMethodChange.builder().change("change") },
                new Object[] { "previousValue", SetMethodInfoMethodChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetMethodInfoMethodChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMethodInfoMethodChange value = SetMethodInfoMethodChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMethodInfoMethodChange value = SetMethodInfoMethodChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMethodInfoMethodChange value = SetMethodInfoMethodChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
