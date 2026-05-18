
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ServiceUnavailableErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ServiceUnavailableErrorBuilder builder) {
        ServiceUnavailableError serviceUnavailableError = builder.buildUnchecked();
        Assertions.assertThat(serviceUnavailableError).isInstanceOf(ServiceUnavailableError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ServiceUnavailableError.builder().message("message") } };
    }

    @Test
    public void message() {
        ServiceUnavailableError value = ServiceUnavailableError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
