
package com.commercetools.api.models.order;

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
public class OrderAddParcelToDeliveryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderAddParcelToDeliveryActionBuilder builder) {
        OrderAddParcelToDeliveryAction orderAddParcelToDeliveryAction = builder.buildUnchecked();
        Assertions.assertThat(orderAddParcelToDeliveryAction).isInstanceOf(OrderAddParcelToDeliveryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OrderAddParcelToDeliveryAction.builder().deliveryId("deliveryId") },
                new Object[] { OrderAddParcelToDeliveryAction.builder().deliveryKey("deliveryKey") },
                new Object[] { OrderAddParcelToDeliveryAction.builder().parcelKey("parcelKey") },
                new Object[] { OrderAddParcelToDeliveryAction.builder()
                        .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] { OrderAddParcelToDeliveryAction.builder()
                        .trackingData(new com.commercetools.api.models.order.TrackingDataImpl()) },
                new Object[] { OrderAddParcelToDeliveryAction.builder()
                        .items(
                            Collections.singletonList(new com.commercetools.api.models.order.DeliveryItemImpl())) } };
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
}
