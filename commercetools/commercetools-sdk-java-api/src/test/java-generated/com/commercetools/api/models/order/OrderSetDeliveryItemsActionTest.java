
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetDeliveryItemsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetDeliveryItemsActionBuilder builder) {
        OrderSetDeliveryItemsAction orderSetDeliveryItemsAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryItemsAction).isInstanceOf(OrderSetDeliveryItemsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", OrderSetDeliveryItemsAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", OrderSetDeliveryItemsAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "items", OrderSetDeliveryItemsAction.builder()
                        .items(
                            Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryItemsAction value = OrderSetDeliveryItemsAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryItemsAction value = OrderSetDeliveryItemsAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void items() {
        OrderSetDeliveryItemsAction value = OrderSetDeliveryItemsAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }
}
