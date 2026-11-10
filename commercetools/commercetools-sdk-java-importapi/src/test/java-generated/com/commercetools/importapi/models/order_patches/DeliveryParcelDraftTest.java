
package com.commercetools.importapi.models.order_patches;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryParcelDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryParcelDraftBuilder builder) {
        DeliveryParcelDraft deliveryParcelDraft = builder.buildUnchecked();
        Assertions.assertThat(deliveryParcelDraft).isInstanceOf(DeliveryParcelDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "measurements",
                        DeliveryParcelDraft.builder()
                                .measurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl()) },
                new Object[] { "trackingData",
                        DeliveryParcelDraft.builder()
                                .trackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl()) },
                new Object[] { "items",
                        DeliveryParcelDraft.builder()
                                .items(Collections.singletonList(
                                    new com.commercetools.importapi.models.orders.DeliveryItemImpl())) } };
    }

    @Test
    public void measurements() {
        DeliveryParcelDraft value = DeliveryParcelDraft.of();
        value.setMeasurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
    }

    @Test
    public void trackingData() {
        DeliveryParcelDraft value = DeliveryParcelDraft.of();
        value.setTrackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl());
        Assertions.assertThat(value.getTrackingData())
                .isEqualTo(new com.commercetools.importapi.models.orders.TrackingDataImpl());
    }

    @Test
    public void items() {
        DeliveryParcelDraft value = DeliveryParcelDraft.of();
        value.setItems(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl()));
    }
}
