
package com.commercetools.importapi.models.order_patches;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ParcelMeasurementDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelMeasurementDraftBuilder builder) {
        ParcelMeasurementDraft parcelMeasurementDraft = builder.buildUnchecked();
        Assertions.assertThat(parcelMeasurementDraft).isInstanceOf(ParcelMeasurementDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelMeasurementDraft.builder().parcelId("parcelId") },
                new Object[] { ParcelMeasurementDraft.builder()
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
