
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MultipleActionsNotAllowedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MultipleActionsNotAllowedErrorBuilder builder) {
        MultipleActionsNotAllowedError multipleActionsNotAllowedError = builder.buildUnchecked();
        Assertions.assertThat(multipleActionsNotAllowedError).isInstanceOf(MultipleActionsNotAllowedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", MultipleActionsNotAllowedError.builder().message("message") } };
    }

    @Test
    public void message() {
        MultipleActionsNotAllowedError value = MultipleActionsNotAllowedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
