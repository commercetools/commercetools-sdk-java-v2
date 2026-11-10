
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCreatedMessagePayloadBuilder builder) {
        OrderCreatedMessagePayload orderCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderCreatedMessagePayload).isInstanceOf(OrderCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "order",
                OrderCreatedMessagePayload.builder().order(new com.commercetools.api.models.order.OrderImpl()) } };
    }

    @Test
    public void order() {
        OrderCreatedMessagePayload value = OrderCreatedMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }
}
