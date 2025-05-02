
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetIsValidChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetIsValidChangeBuilder builder) {
        SetIsValidChange setIsValidChange = builder.buildUnchecked();
        Assertions.assertThat(setIsValidChange).isInstanceOf(SetIsValidChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetIsValidChange.builder().change("change") },
                new Object[] { "previousValue", SetIsValidChange.builder().previousValue(true) },
                new Object[] { "nextValue", SetIsValidChange.builder().nextValue(true) } };
    }

    @Test
    public void change() {
        SetIsValidChange value = SetIsValidChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetIsValidChange value = SetIsValidChange.of();
        value.setPreviousValue(true);
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(true);
    }

    @Test
    public void nextValue() {
        SetIsValidChange value = SetIsValidChange.of();
        value.setNextValue(true);
        Assertions.assertThat(value.getNextValue()).isEqualTo(true);
    }
}
