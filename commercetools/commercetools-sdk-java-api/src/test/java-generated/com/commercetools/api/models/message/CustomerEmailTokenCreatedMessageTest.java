
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerEmailTokenCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerEmailTokenCreatedMessageBuilder builder) {
        CustomerEmailTokenCreatedMessage customerEmailTokenCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerEmailTokenCreatedMessage).isInstanceOf(CustomerEmailTokenCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customerId", CustomerEmailTokenCreatedMessage.builder().customerId("customerId") },
                new Object[] { "expiresAt", CustomerEmailTokenCreatedMessage.builder()
                        .expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void customerId() {
        CustomerEmailTokenCreatedMessage value = CustomerEmailTokenCreatedMessage.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void expiresAt() {
        CustomerEmailTokenCreatedMessage value = CustomerEmailTokenCreatedMessage.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
