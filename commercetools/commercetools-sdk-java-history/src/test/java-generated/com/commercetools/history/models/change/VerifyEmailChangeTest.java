
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VerifyEmailChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VerifyEmailChangeBuilder builder) {
        VerifyEmailChange verifyEmailChange = builder.buildUnchecked();
        Assertions.assertThat(verifyEmailChange).isInstanceOf(VerifyEmailChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", VerifyEmailChange.builder().change("change") } };
    }

    @Test
    public void change() {
        VerifyEmailChange value = VerifyEmailChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }
}
