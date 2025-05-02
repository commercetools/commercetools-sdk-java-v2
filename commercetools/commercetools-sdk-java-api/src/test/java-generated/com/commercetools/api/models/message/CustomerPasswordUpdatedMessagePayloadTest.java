
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerPasswordUpdatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerPasswordUpdatedMessagePayloadBuilder builder) {
        CustomerPasswordUpdatedMessagePayload customerPasswordUpdatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerPasswordUpdatedMessagePayload)
                .isInstanceOf(CustomerPasswordUpdatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reset", CustomerPasswordUpdatedMessagePayload.builder().reset(true) } };
    }

    @Test
    public void reset() {
        CustomerPasswordUpdatedMessagePayload value = CustomerPasswordUpdatedMessagePayload.of();
        value.setReset(true);
        Assertions.assertThat(value.getReset()).isEqualTo(true);
    }
}
