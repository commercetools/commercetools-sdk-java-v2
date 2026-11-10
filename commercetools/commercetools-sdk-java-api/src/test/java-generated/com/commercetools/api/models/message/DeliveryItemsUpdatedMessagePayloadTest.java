
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryItemsUpdatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryItemsUpdatedMessagePayloadBuilder builder) {
        DeliveryItemsUpdatedMessagePayload deliveryItemsUpdatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryItemsUpdatedMessagePayload)
                .isInstanceOf(DeliveryItemsUpdatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", DeliveryItemsUpdatedMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { "items",
                        DeliveryItemsUpdatedMessagePayload.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "oldItems",
                        DeliveryItemsUpdatedMessagePayload.builder()
                                .oldItems(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "shippingKey",
                        DeliveryItemsUpdatedMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        DeliveryItemsUpdatedMessagePayload value = DeliveryItemsUpdatedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void items() {
        DeliveryItemsUpdatedMessagePayload value = DeliveryItemsUpdatedMessagePayload.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void oldItems() {
        DeliveryItemsUpdatedMessagePayload value = DeliveryItemsUpdatedMessagePayload.of();
        value.setOldItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getOldItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void shippingKey() {
        DeliveryItemsUpdatedMessagePayload value = DeliveryItemsUpdatedMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
