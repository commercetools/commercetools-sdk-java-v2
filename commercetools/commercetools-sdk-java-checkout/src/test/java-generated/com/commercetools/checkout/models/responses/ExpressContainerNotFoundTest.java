
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ExpressContainerNotFoundTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ExpressContainerNotFoundBuilder builder) {
        ExpressContainerNotFound expressContainerNotFound = builder.buildUnchecked();
        Assertions.assertThat(expressContainerNotFound).isInstanceOf(ExpressContainerNotFound.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "severity", ExpressContainerNotFound.builder().severity("severity") },
                new Object[] { "message", ExpressContainerNotFound.builder().message("message") },
                new Object[] { "payload", ExpressContainerNotFound.builder().payload("payload") },
                new Object[] { "correlationId", ExpressContainerNotFound.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        ExpressContainerNotFound value = ExpressContainerNotFound.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        ExpressContainerNotFound value = ExpressContainerNotFound.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void payload() {
        ExpressContainerNotFound value = ExpressContainerNotFound.of();
        value.setPayload("payload");
        Assertions.assertThat(value.getPayload()).isEqualTo("payload");
    }

    @Test
    public void correlationId() {
        ExpressContainerNotFound value = ExpressContainerNotFound.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
