
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelMeasurementsUpdatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelMeasurementsUpdatedMessagePayloadBuilder builder) {
        ParcelMeasurementsUpdatedMessagePayload parcelMeasurementsUpdatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(parcelMeasurementsUpdatedMessagePayload)
                .isInstanceOf(ParcelMeasurementsUpdatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        ParcelMeasurementsUpdatedMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { "parcelId", ParcelMeasurementsUpdatedMessagePayload.builder().parcelId("parcelId") },
                new Object[] { "measurements",
                        ParcelMeasurementsUpdatedMessagePayload.builder()
                                .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] { "shippingKey",
                        ParcelMeasurementsUpdatedMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        ParcelMeasurementsUpdatedMessagePayload value = ParcelMeasurementsUpdatedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void parcelId() {
        ParcelMeasurementsUpdatedMessagePayload value = ParcelMeasurementsUpdatedMessagePayload.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void measurements() {
        ParcelMeasurementsUpdatedMessagePayload value = ParcelMeasurementsUpdatedMessagePayload.of();
        value.setMeasurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
    }

    @Test
    public void shippingKey() {
        ParcelMeasurementsUpdatedMessagePayload value = ParcelMeasurementsUpdatedMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
