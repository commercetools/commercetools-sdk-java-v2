
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerLastNameSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerLastNameSetMessagePayloadBuilder builder) {
        CustomerLastNameSetMessagePayload customerLastNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerLastNameSetMessagePayload).isInstanceOf(CustomerLastNameSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lastName", CustomerLastNameSetMessagePayload.builder().lastName("lastName") } };
    }

    @Test
    public void lastName() {
        CustomerLastNameSetMessagePayload value = CustomerLastNameSetMessagePayload.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }
}
