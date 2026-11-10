
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCountryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCountryChangeBuilder builder) {
        SetCountryChange setCountryChange = builder.buildUnchecked();
        Assertions.assertThat(setCountryChange).isInstanceOf(SetCountryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCountryChange.builder().change("change") },
                new Object[] { "previousValue", SetCountryChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCountryChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetCountryChange value = SetCountryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCountryChange value = SetCountryChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCountryChange value = SetCountryChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
