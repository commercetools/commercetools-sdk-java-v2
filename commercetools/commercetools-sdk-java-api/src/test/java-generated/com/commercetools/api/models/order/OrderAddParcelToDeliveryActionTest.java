
package com.commercetools.api.models.order;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderAddParcelToDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderAddParcelToDeliveryActionBuilder builder) {
        OrderAddParcelToDeliveryAction orderAddParcelToDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderAddParcelToDeliveryAction).isInstanceOf(OrderAddParcelToDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", OrderAddParcelToDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", OrderAddParcelToDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "parcelKey", OrderAddParcelToDeliveryAction.builder().parcelKey("parcelKey") },
                new Object[] { "measurements",
                        OrderAddParcelToDeliveryAction.builder()
                                .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] { "trackingData",
                        OrderAddParcelToDeliveryAction.builder()
                                .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { "items",
                        OrderAddParcelToDeliveryAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "custom", OrderAddParcelToDeliveryAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void deliveryId() {
        OrderAddParcelToDeliveryAction value = OrderAddParcelToDeliveryAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderAddParcelToDeliveryAction value = OrderAddParcelToDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void parcelKey() {
        OrderAddParcelToDeliveryAction value = OrderAddParcelToDeliveryAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void measurements() {
        OrderAddParcelToDeliveryAction value = OrderAddParcelToDeliveryAction.of();
        value.setMeasurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
    }

    @Test
    public void trackingData() {
        OrderAddParcelToDeliveryAction value = OrderAddParcelToDeliveryAction.of();
        value.setTrackingData(new com.commercetools.api.models.order.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.api.models.order.TrackingDataImpl());
    }

    @Test
    public void items() {
        OrderAddParcelToDeliveryAction value = OrderAddParcelToDeliveryAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void custom() {
        OrderAddParcelToDeliveryAction value = OrderAddParcelToDeliveryAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
