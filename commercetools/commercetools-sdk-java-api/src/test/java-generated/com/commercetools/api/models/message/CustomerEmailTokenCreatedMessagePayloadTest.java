
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerEmailTokenCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerEmailTokenCreatedMessagePayloadBuilder builder) {
        CustomerEmailTokenCreatedMessagePayload customerEmailTokenCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerEmailTokenCreatedMessagePayload)
                .isInstanceOf(CustomerEmailTokenCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerId",
                        CustomerEmailTokenCreatedMessagePayload.builder().customerId("customerId") },
                new Object[] { "expiresAt", CustomerEmailTokenCreatedMessagePayload.builder()
                        .expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customerId() {
        CustomerEmailTokenCreatedMessagePayload value = CustomerEmailTokenCreatedMessagePayload.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void expiresAt() {
        CustomerEmailTokenCreatedMessagePayload value = CustomerEmailTokenCreatedMessagePayload.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
