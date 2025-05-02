
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerPasswordTokenCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerPasswordTokenCreatedMessagePayloadBuilder builder) {
        CustomerPasswordTokenCreatedMessagePayload customerPasswordTokenCreatedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerPasswordTokenCreatedMessagePayload)
                .isInstanceOf(CustomerPasswordTokenCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerId",
                        CustomerPasswordTokenCreatedMessagePayload.builder().customerId("customerId") },
                new Object[] { "expiresAt", CustomerPasswordTokenCreatedMessagePayload.builder()
                        .expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customerId() {
        CustomerPasswordTokenCreatedMessagePayload value = CustomerPasswordTokenCreatedMessagePayload.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void expiresAt() {
        CustomerPasswordTokenCreatedMessagePayload value = CustomerPasswordTokenCreatedMessagePayload.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
