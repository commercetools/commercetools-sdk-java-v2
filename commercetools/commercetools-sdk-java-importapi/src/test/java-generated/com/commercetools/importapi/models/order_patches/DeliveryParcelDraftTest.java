
package com.commercetools.importapi.models.order_patches;

import java.util.Collections;

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
public class DeliveryParcelDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryParcelDraftBuilder builder) {
        DeliveryParcelDraft deliveryParcelDraft = builder.buildUnchecked();
        Assertions.assertThat(deliveryParcelDraft).isInstanceOf(DeliveryParcelDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryParcelDraft.builder()
                        .measurements(new com.commercetools.importapi.models.orders.ParcelMeasurementsImpl()) },
                new Object[] { DeliveryParcelDraft.builder()
                        .trackingData(new com.commercetools.importapi.models.orders.TrackingDataImpl()) },
                new Object[] { DeliveryParcelDraft.builder()
                        .items(Collections
                                .singletonList(new com.commercetools.importapi.models.orders.DeliveryItemImpl())) } };
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
