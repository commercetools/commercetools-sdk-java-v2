
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class UpdatedFieldsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, UpdatedFieldsBuilder builder) {
        UpdatedFields updatedFields = builder.buildUnchecked();
        Assertions.assertThat(updatedFields).isInstanceOf(UpdatedFields.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", UpdatedFields.builder().severity("severity") },
                new Object[] { "message", UpdatedFields.builder().message("message") },
                new Object[] { "correlationId", UpdatedFields.builder().correlationId("correlationId") },
                new Object[] { "payload", UpdatedFields.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        UpdatedFields value = UpdatedFields.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        UpdatedFields value = UpdatedFields.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        UpdatedFields value = UpdatedFields.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        UpdatedFields value = UpdatedFields.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
