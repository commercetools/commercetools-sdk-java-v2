
package com.commercetools.checkout.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ConnectorFailedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ConnectorFailedErrorBuilder builder) {
        ConnectorFailedError connectorFailedError = builder.buildUnchecked();
        Assertions.assertThat(connectorFailedError).isInstanceOf(ConnectorFailedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", ConnectorFailedError.builder().message("message") } };
    }

    @Test
    public void message() {
        ConnectorFailedError value = ConnectorFailedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }
}
