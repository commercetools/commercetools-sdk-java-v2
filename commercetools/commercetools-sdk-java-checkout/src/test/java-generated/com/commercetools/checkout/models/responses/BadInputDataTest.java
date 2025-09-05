
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BadInputDataTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BadInputDataBuilder builder) {
        BadInputData badInputData = builder.buildUnchecked();
        Assertions.assertThat(badInputData).isInstanceOf(BadInputData.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", BadInputData.builder().severity("severity") },
                new Object[] { "message", BadInputData.builder().message("message") },
                new Object[] { "correlationId", BadInputData.builder().correlationId("correlationId") },
                new Object[] { "payload", BadInputData.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        BadInputData value = BadInputData.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        BadInputData value = BadInputData.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        BadInputData value = BadInputData.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        BadInputData value = BadInputData.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
