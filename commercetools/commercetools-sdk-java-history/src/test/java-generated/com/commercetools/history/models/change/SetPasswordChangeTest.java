
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPasswordChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPasswordChangeBuilder builder) {
        SetPasswordChange setPasswordChange = builder.buildUnchecked();
        Assertions.assertThat(setPasswordChange).isInstanceOf(SetPasswordChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetPasswordChange.builder().change("change") } };
    }

    @Test
    public void change() {
        SetPasswordChange value = SetPasswordChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }
}
