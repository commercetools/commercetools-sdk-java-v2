
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetContactEmailChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetContactEmailChangeBuilder builder) {
        SetContactEmailChange setContactEmailChange = builder.buildUnchecked();
        Assertions.assertThat(setContactEmailChange).isInstanceOf(SetContactEmailChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetContactEmailChange.builder().change("change") },
                new Object[] { "previousValue", SetContactEmailChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetContactEmailChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetContactEmailChange value = SetContactEmailChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetContactEmailChange value = SetContactEmailChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetContactEmailChange value = SetContactEmailChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
