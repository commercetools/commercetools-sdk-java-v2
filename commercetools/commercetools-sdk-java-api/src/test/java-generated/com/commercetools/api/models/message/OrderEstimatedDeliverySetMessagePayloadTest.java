
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEstimatedDeliverySetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEstimatedDeliverySetMessagePayloadBuilder builder) {
        OrderEstimatedDeliverySetMessagePayload orderEstimatedDeliverySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(orderEstimatedDeliverySetMessagePayload)
                .isInstanceOf(OrderEstimatedDeliverySetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "estimatedDelivery",
                        OrderEstimatedDeliverySetMessagePayload.builder()
                                .estimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl()) },
                new Object[] { "shippingKey",
                        OrderEstimatedDeliverySetMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void estimatedDelivery() {
        OrderEstimatedDeliverySetMessagePayload value = OrderEstimatedDeliverySetMessagePayload.of();
        value.setEstimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
        Assertions.assertThat(value.getEstimatedDelivery())
                .isEqualTo(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
    }

    @Test
    public void shippingKey() {
        OrderEstimatedDeliverySetMessagePayload value = OrderEstimatedDeliverySetMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
