
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerPasswordTokenCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerPasswordTokenCreatedMessageBuilder builder) {
        CustomerPasswordTokenCreatedMessage customerPasswordTokenCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerPasswordTokenCreatedMessage)
                .isInstanceOf(CustomerPasswordTokenCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerId", CustomerPasswordTokenCreatedMessage.builder().customerId("customerId") },
                new Object[] { "expiresAt", CustomerPasswordTokenCreatedMessage.builder()
                        .expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customerId() {
        CustomerPasswordTokenCreatedMessage value = CustomerPasswordTokenCreatedMessage.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void expiresAt() {
        CustomerPasswordTokenCreatedMessage value = CustomerPasswordTokenCreatedMessage.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
