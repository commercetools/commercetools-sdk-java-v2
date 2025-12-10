
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerDeletedMessagePayloadBuilder builder) {
        CustomerDeletedMessagePayload customerDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerDeletedMessagePayload).isInstanceOf(CustomerDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", CustomerDeletedMessagePayload.builder().email("email") } };
    }

    @Test
    public void email() {
        CustomerDeletedMessagePayload value = CustomerDeletedMessagePayload.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }
}
