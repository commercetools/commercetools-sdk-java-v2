
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExternalTermsAndConditionsPendingTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExternalTermsAndConditionsPendingBuilder builder) {
        ExternalTermsAndConditionsPending externalTermsAndConditionsPending = builder.buildUnchecked();
        Assertions.assertThat(externalTermsAndConditionsPending).isInstanceOf(ExternalTermsAndConditionsPending.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", ExternalTermsAndConditionsPending.builder().severity("severity") },
                new Object[] { "message", ExternalTermsAndConditionsPending.builder().message("message") },
                new Object[] { "correlationId",
                        ExternalTermsAndConditionsPending.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExternalTermsAndConditionsPending value = ExternalTermsAndConditionsPending.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExternalTermsAndConditionsPending value = ExternalTermsAndConditionsPending.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        ExternalTermsAndConditionsPending value = ExternalTermsAndConditionsPending.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
