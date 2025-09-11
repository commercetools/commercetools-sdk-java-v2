
package com.commercetools.checkout.models.responses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MultipleVendorButtonContainersTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MultipleVendorButtonContainersBuilder builder) {
        MultipleVendorButtonContainers multipleVendorButtonContainers = builder.buildUnchecked();
        Assertions.assertThat(multipleVendorButtonContainers).isInstanceOf(MultipleVendorButtonContainers.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "severity", MultipleVendorButtonContainers.builder().severity("severity") },
                new Object[] { "message", MultipleVendorButtonContainers.builder().message("message") }, new Object[] {
                        "correlationId", MultipleVendorButtonContainers.builder().correlationId("correlationId") } };
    }

    @Test
    public void severity() {
        MultipleVendorButtonContainers value = MultipleVendorButtonContainers.of();
        value.setSeverity("severity");
        Assertions.assertThat(value.getSeverity()).isEqualTo("severity");
    }

    @Test
    public void message() {
        MultipleVendorButtonContainers value = MultipleVendorButtonContainers.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void correlationId() {
        MultipleVendorButtonContainers value = MultipleVendorButtonContainers.of();
        value.setCorrelationId("correlationId");
        Assertions.assertThat(value.getCorrelationId()).isEqualTo("correlationId");
    }
}
