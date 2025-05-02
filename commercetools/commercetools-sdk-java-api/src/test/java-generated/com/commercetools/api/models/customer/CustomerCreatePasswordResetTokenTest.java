
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCreatePasswordResetTokenTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCreatePasswordResetTokenBuilder builder) {
        CustomerCreatePasswordResetToken customerCreatePasswordResetToken = builder.buildUnchecked();
        Assertions.assertThat(customerCreatePasswordResetToken).isInstanceOf(CustomerCreatePasswordResetToken.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CustomerCreatePasswordResetToken.builder().email("email") },
                new Object[] { "ttlMinutes", CustomerCreatePasswordResetToken.builder().ttlMinutes(1L) } };
    }

    @Test
    public void email() {
        CustomerCreatePasswordResetToken value = CustomerCreatePasswordResetToken.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void ttlMinutes() {
        CustomerCreatePasswordResetToken value = CustomerCreatePasswordResetToken.of();
        value.setTtlMinutes(1L);
        Assertions.assertThat(value.getTtlMinutes()).isEqualTo(1L);
    }
}
