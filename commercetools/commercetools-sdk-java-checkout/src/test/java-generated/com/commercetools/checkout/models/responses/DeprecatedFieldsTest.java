
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeprecatedFieldsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeprecatedFieldsBuilder builder) {
        DeprecatedFields deprecatedFields = builder.buildUnchecked();
        Assertions.assertThat(deprecatedFields).isInstanceOf(DeprecatedFields.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", DeprecatedFields.builder().severity("severity") },
                new Object[] { "message", DeprecatedFields.builder().message("message") },
                new Object[] { "correlationId", DeprecatedFields.builder().correlationId("correlationId") },
                new Object[] { "payload", DeprecatedFields.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        DeprecatedFields value = DeprecatedFields.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        DeprecatedFields value = DeprecatedFields.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        DeprecatedFields value = DeprecatedFields.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        DeprecatedFields value = DeprecatedFields.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
