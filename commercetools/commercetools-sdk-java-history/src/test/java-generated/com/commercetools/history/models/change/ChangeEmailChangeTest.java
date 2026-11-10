
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeEmailChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeEmailChangeBuilder builder) {
        ChangeEmailChange changeEmailChange = builder.buildUnchecked();
        Assertions.assertThat(changeEmailChange).isInstanceOf(ChangeEmailChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeEmailChange.builder().change("change") },
                new Object[] { "previousValue", ChangeEmailChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", ChangeEmailChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        ChangeEmailChange value = ChangeEmailChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeEmailChange value = ChangeEmailChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        ChangeEmailChange value = ChangeEmailChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
