
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerFirstNameSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerFirstNameSetMessagePayloadBuilder builder) {
        CustomerFirstNameSetMessagePayload customerFirstNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerFirstNameSetMessagePayload)
                .isInstanceOf(CustomerFirstNameSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "firstName", CustomerFirstNameSetMessagePayload.builder().firstName("firstName") } };
    }

    @Test
    public void firstName() {
        CustomerFirstNameSetMessagePayload value = CustomerFirstNameSetMessagePayload.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }
}
