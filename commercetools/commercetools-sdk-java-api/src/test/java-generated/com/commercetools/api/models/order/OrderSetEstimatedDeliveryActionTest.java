
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetEstimatedDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetEstimatedDeliveryActionBuilder builder) {
        OrderSetEstimatedDeliveryAction orderSetEstimatedDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetEstimatedDeliveryAction).isInstanceOf(OrderSetEstimatedDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", OrderSetEstimatedDeliveryAction.builder().shippingKey("shippingKey") },
                new Object[] { "estimatedDelivery", OrderSetEstimatedDeliveryAction.builder()
                        .estimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl()) } };
    }

    @Test
    public void shippingKey() {
        OrderSetEstimatedDeliveryAction value = OrderSetEstimatedDeliveryAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void estimatedDelivery() {
        OrderSetEstimatedDeliveryAction value = OrderSetEstimatedDeliveryAction.of();
        value.setEstimatedDelivery(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
        Assertions.assertThat(value.getEstimatedDelivery())
                .isEqualTo(new com.commercetools.api.models.cart.EstimatedDeliveryImpl());
    }
}
