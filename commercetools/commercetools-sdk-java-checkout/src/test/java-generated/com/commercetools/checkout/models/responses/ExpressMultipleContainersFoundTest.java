
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressMultipleContainersFoundTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressMultipleContainersFoundBuilder builder) {
        ExpressMultipleContainersFound expressMultipleContainersFound = builder.buildUnchecked();
        Assertions.assertThat(expressMultipleContainersFound).isInstanceOf(ExpressMultipleContainersFound.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", ExpressMultipleContainersFound.builder().severity("severity") },
                new Object[] { "message", ExpressMultipleContainersFound.builder().message("message") },
                new Object[] { "payload", ExpressMultipleContainersFound.builder().payload("payload") }, new Object[] {
                        "correlationId", ExpressMultipleContainersFound.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressMultipleContainersFound value = ExpressMultipleContainersFound.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressMultipleContainersFound value = ExpressMultipleContainersFound.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        ExpressMultipleContainersFound value = ExpressMultipleContainersFound.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        ExpressMultipleContainersFound value = ExpressMultipleContainersFound.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
