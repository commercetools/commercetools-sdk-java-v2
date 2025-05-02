
package com.commercetools.importapi.models.order_patches;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelMeasurementDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelMeasurementDraftBuilder builder) {
        ParcelMeasurementDraft parcelMeasurementDraft = builder.buildUnchecked();
        Assertions.assertThat(parcelMeasurementDraft).isInstanceOf(ParcelMeasurementDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parcelId", ParcelMeasurementDraft.builder().parcelId("parcelId") },
                new Object[] { "measurements", ParcelMeasurementDraft.builder()
                        .measurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl()) } };
    }

    @Test
    public void parcelId() {
        ParcelMeasurementDraft value = ParcelMeasurementDraft.of();
        value.setParcelId("parcelId");
        Assertions.assertThat(value.getParcelId()).isEqualTo("parcelId");
    }

    @Test
    public void measurements() {
        ParcelMeasurementDraft value = ParcelMeasurementDraft.of();
        value.setMeasurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
        Assertions.assertThat(value.getMeasurements())
                .isEqualTo(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl());
    }
}
