
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalOAuthFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExternalOAuthFailedErrorBuilder builder) {
        ExternalOAuthFailedError externalOAuthFailedError = builder.buildUnchecked();
        Assertions.assertThat(externalOAuthFailedError).isInstanceOf(ExternalOAuthFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ExternalOAuthFailedError.builder().message("message") } };
    }

    @Test
    public void message() {
        ExternalOAuthFailedError value = ExternalOAuthFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
