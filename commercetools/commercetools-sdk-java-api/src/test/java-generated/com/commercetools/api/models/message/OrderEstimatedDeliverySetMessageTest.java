
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEstimatedDeliverySetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEstimatedDeliverySetMessageBuilder builder) {
        OrderEstimatedDeliverySetMessage orderEstimatedDeliverySetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderEstimatedDeliverySetMessage).isInstanceOf(OrderEstimatedDeliverySetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "estimatedDelivery",
                        OrderEstimatedDeliverySetMessage.builder()
                                .estimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl()) },
                new Object[] { "shippingKey", OrderEstimatedDeliverySetMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void estimatedDelivery() {
        OrderEstimatedDeliverySetMessage value = OrderEstimatedDeliverySetMessage.of();
        value.setEstimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
        Assertions.assertThat(value.getEstimatedDelivery())
                .isEqualTo(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
    }

    @Test
    public void shippingKey() {
        OrderEstimatedDeliverySetMessage value = OrderEstimatedDeliverySetMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
