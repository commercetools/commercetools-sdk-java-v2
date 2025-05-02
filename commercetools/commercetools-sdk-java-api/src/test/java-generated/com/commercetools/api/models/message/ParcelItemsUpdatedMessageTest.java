
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelItemsUpdatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelItemsUpdatedMessageBuilder builder) {
        ParcelItemsUpdatedMessage parcelItemsUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelItemsUpdatedMessage).isInstanceOf(ParcelItemsUpdatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parcelId", ParcelItemsUpdatedMessage.builder().parcelId("parcelId") },
                new Object[] { "deliveryId", ParcelItemsUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { "items",
                        ParcelItemsUpdatedMessage.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "oldItems",
                        ParcelItemsUpdatedMessage.builder()
                                .oldItems(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "shippingKey", ParcelItemsUpdatedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void parcelId() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void deliveryId() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void items() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void oldItems() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setOldItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getOldItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void shippingKey() {
        ParcelItemsUpdatedMessage value = ParcelItemsUpdatedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
