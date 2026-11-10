
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelMeasurementsUpdatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelMeasurementsUpdatedMessageBuilder builder) {
        ParcelMeasurementsUpdatedMessage parcelMeasurementsUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelMeasurementsUpdatedMessage).isInstanceOf(ParcelMeasurementsUpdatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", ParcelMeasurementsUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { "parcelId", ParcelMeasurementsUpdatedMessage.builder().parcelId("parcelId") },
                new Object[] { "measurements",
                        ParcelMeasurementsUpdatedMessage.builder()
                                .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] { "shippingKey", ParcelMeasurementsUpdatedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        ParcelMeasurementsUpdatedMessage value = ParcelMeasurementsUpdatedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void parcelId() {
        ParcelMeasurementsUpdatedMessage value = ParcelMeasurementsUpdatedMessage.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void measurements() {
        ParcelMeasurementsUpdatedMessage value = ParcelMeasurementsUpdatedMessage.of();
        value.setMeasurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.api.models.order.ParcelMeasurementsImpl());
    }

    @Test
    public void shippingKey() {
        ParcelMeasurementsUpdatedMessage value = ParcelMeasurementsUpdatedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
