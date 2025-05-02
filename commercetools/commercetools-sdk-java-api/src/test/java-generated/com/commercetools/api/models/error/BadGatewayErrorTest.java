
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BadGatewayErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BadGatewayErrorBuilder builder) {
        BadGatewayError badGatewayError = builder.buildUnchecked();
        Assertions.assertThat(badGatewayError).isInstanceOf(BadGatewayError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", BadGatewayError.builder().message("message") } };
    }

    @Test
    public void message() {
        BadGatewayError value = BadGatewayError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
