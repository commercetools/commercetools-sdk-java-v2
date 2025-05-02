
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomerEmailSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomerEmailSetMessagePayloadBuilder builder) {
        OrderCustomerEmailSetMessagePayload orderCustomerEmailSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCustomerEmailSetMessagePayload)
                .isInstanceOf(OrderCustomerEmailSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "email", OrderCustomerEmailSetMessagePayload.builder().email("email") },
                new Object[] { "oldEmail", OrderCustomerEmailSetMessagePayload.builder().oldEmail("oldEmail") } };
    }

    @Test
    public void email() {
        OrderCustomerEmailSetMessagePayload value = OrderCustomerEmailSetMessagePayload.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void oldEmail() {
        OrderCustomerEmailSetMessagePayload value = OrderCustomerEmailSetMessagePayload.of();
        value.setOldEmail("oldEmail");
        Assertions.assertThat(value.getOldEmail()).isEqualTo("oldEmail");
    }
}
