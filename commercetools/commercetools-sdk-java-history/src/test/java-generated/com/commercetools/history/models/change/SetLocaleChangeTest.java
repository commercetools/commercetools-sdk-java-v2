
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLocaleChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLocaleChangeBuilder builder) {
        SetLocaleChange setLocaleChange = builder.buildUnchecked();
        Assertions.assertThat(setLocaleChange).isInstanceOf(SetLocaleChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLocaleChange.builder().change("change") },
                new Object[] { "previousValue", SetLocaleChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetLocaleChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetLocaleChange value = SetLocaleChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLocaleChange value = SetLocaleChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetLocaleChange value = SetLocaleChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
