
package com.commercetools.api.models.order_edit;

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
public class StagedOrderAddParcelToDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderAddParcelToDeliveryActionBuilder builder) {
        StagedOrderAddParcelToDeliveryAction stagedOrderAddParcelToDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddParcelToDeliveryAction)
                .isInstanceOf(StagedOrderAddParcelToDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedOrderAddParcelToDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { StagedOrderAddParcelToDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { StagedOrderAddParcelToDeliveryAction.builder().parcelKey("parcelKey") },
                new Object[] { StagedOrderAddParcelToDeliveryAction.builder()
                        .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] { StagedOrderAddParcelToDeliveryAction.builder()
                        .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { StagedOrderAddParcelToDeliveryAction.builder()
                        .items(
                            Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) } };
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
}
