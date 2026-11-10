
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderDeletedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderDeletedMessagePayloadBuilder builder) {
        OrderDeletedMessagePayload orderDeletedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderDeletedMessagePayload).isInstanceOf(OrderDeletedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "order",
                OrderDeletedMessagePayload.builder().order(new com.commercetools.api.models.order.OrderImpl()) } };
    }

    @Test
    public void order() {
        OrderDeletedMessagePayload value = OrderDeletedMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.order.OrderImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderImpl());
    }
}
