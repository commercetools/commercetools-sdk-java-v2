
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryItemsUpdatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryItemsUpdatedMessageBuilder builder) {
        DeliveryItemsUpdatedMessage deliveryItemsUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryItemsUpdatedMessage).isInstanceOf(DeliveryItemsUpdatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", DeliveryItemsUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { "items",
                        DeliveryItemsUpdatedMessage.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "oldItems",
                        DeliveryItemsUpdatedMessage.builder()
                                .oldItems(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "shippingKey", DeliveryItemsUpdatedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void items() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void oldItems() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setOldItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getOldItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void shippingKey() {
        DeliveryItemsUpdatedMessage value = DeliveryItemsUpdatedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
