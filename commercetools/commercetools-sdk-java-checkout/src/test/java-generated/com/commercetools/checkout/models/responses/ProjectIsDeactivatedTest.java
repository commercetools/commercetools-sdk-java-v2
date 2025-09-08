
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectIsDeactivatedTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectIsDeactivatedBuilder builder) {
        ProjectIsDeactivated projectIsDeactivated = builder.buildUnchecked();
        Assertions.assertThat(projectIsDeactivated).isInstanceOf(ProjectIsDeactivated.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ProjectIsDeactivated.builder().severity("severity") },
                new Object[] { "message", ProjectIsDeactivated.builder().message("message") },
                new Object[] { "correlationId", ProjectIsDeactivated.builder().correlationId("correlationId") },
                new Object[] { "payload", ProjectIsDeactivated.builder().payload("payload") } };
    }

    @Test
    public void severity() {
        ProjectIsDeactivated value = ProjectIsDeactivated.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ProjectIsDeactivated value = ProjectIsDeactivated.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ProjectIsDeactivated value = ProjectIsDeactivated.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }

    @Test
    public void payload() {
        ProjectIsDeactivated value = ProjectIsDeactivated.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }
}
