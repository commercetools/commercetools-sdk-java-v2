
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ConnectorTimeoutErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ConnectorTimeoutErrorBuilder builder) {
        ConnectorTimeoutError connectorTimeoutError = builder.buildUnchecked();
        Assertions.assertThat(connectorTimeoutError).isInstanceOf(ConnectorTimeoutError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ConnectorTimeoutError.builder().message("message") } };
    }

    @Test
    public void message() {
        ConnectorTimeoutError value = ConnectorTimeoutError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
