
package com.commercetools.api.models.customer;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerTokenTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerTokenBuilder builder) {
        CustomerToken customerToken = builder.buildUnchecked();
        Assertions.assertThat(customerToken).isInstanceOf(CustomerToken.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomerToken.builder().id("id") },
                new Object[] { "customerId", CustomerToken.builder().customerId("customerId") },
                new Object[] { "value", CustomerToken.builder().value("value") },
                new Object[] { "expiresAt",
                        CustomerToken.builder().expiresAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "createdAt",
                        CustomerToken.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        CustomerToken.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        CustomerToken value = CustomerToken.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void customerId() {
        CustomerToken value = CustomerToken.of();
        value.setCustomerId("customerId");
        Assertions.assertThat(value.getCustomerId()).isEqualTo("customerId");
    }

    @Test
    public void value() {
        CustomerToken value = CustomerToken.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void expiresAt() {
        CustomerToken value = CustomerToken.of();
        value.setExpiresAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpiresAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdAt() {
        CustomerToken value = CustomerToken.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        CustomerToken value = CustomerToken.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
