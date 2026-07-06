
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ConnectorErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ConnectorErrorBuilder builder) {
        ConnectorError connectorError = builder.buildUnchecked();
        Assertions.assertThat(connectorError).isInstanceOf(ConnectorError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ConnectorError.builder().severity("severity") },
                new Object[] { "message", ConnectorError.builder().message("message") },
                new Object[] { "correlationId", ConnectorError.builder().correlationId("correlationId") },
                new Object[] { "payload", ConnectorError.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        ConnectorError value = ConnectorError.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ConnectorError value = ConnectorError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ConnectorError value = ConnectorError.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        ConnectorError value = ConnectorError.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
