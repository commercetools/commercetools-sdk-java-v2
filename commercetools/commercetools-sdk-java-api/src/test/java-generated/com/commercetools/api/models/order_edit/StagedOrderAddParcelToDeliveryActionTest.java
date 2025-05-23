
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderAddParcelToDeliveryActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderAddParcelToDeliveryActionBuilder builder) {
        StagedOrderAddParcelToDeliveryAction stagedOrderAddParcelToDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddParcelToDeliveryAction)
                .isInstanceOf(StagedOrderAddParcelToDeliveryAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", StagedOrderAddParcelToDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        StagedOrderAddParcelToDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "parcelKey", StagedOrderAddParcelToDeliveryAction.builder().parcelKey("parcelKey") },
                new Object[] { "measurements",
                        StagedOrderAddParcelToDeliveryAction.builder()
                                .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] { "trackingData",
                        StagedOrderAddParcelToDeliveryAction.builder()
                                .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { "items",
                        StagedOrderAddParcelToDeliveryAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) },
                new Object[] { "custom", StagedOrderAddParcelToDeliveryAction.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void deliveryId() {
        StagedOrderAddParcelToDeliveryAction value = StagedOrderAddParcelToDeliveryAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        StagedOrderAddParcelToDeliveryAction value = StagedOrderAddParcelToDeliveryAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void parcelKey() {
        StagedOrderAddParcelToDeliveryAction value = StagedOrderAddParcelToDeliveryAction.of();
        value.setParcelKey("parcelKey");
        Assertions.assertThat(value.getParcelKey()).isEqualTo("parcelKey");
    }

    @Test
    public void measurements() {
        StagedOrderAddParcelToDeliveryAction value = StagedOrderAddParcelToDeliveryAction.of();
        value.setMeasurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
    }

    @Test
    public void trackingData() {
        StagedOrderAddParcelToDeliveryAction value = StagedOrderAddParcelToDeliveryAction.of();
        value.setTrackingData(new com.commercetools.api.models.order.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.api.models.order.TrackingDataImpl());
    }

    @Test
    public void items() {
        StagedOrderAddParcelToDeliveryAction value = StagedOrderAddParcelToDeliveryAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl()));
    }

    @Test
    public void custom() {
        StagedOrderAddParcelToDeliveryAction value = StagedOrderAddParcelToDeliveryAction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
