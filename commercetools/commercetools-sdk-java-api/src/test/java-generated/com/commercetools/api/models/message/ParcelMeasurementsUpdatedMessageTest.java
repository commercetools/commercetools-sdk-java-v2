
package com.commercetools.api.models.message;

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
public class ParcelMeasurementsUpdatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelMeasurementsUpdatedMessageBuilder builder) {
        ParcelMeasurementsUpdatedMessage parcelMeasurementsUpdatedMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelMeasurementsUpdatedMessage).isInstanceOf(ParcelMeasurementsUpdatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelMeasurementsUpdatedMessage.builder().deliveryId("deliveryId") },
                new Object[] { ParcelMeasurementsUpdatedMessage.builder().parcelId("parcelId") },
                new Object[] { ParcelMeasurementsUpdatedMessage.builder()
                        .measurements(new com.commercetools.api.models.order.ParcelMeasurementsImpl()) },
                new Object[] { ParcelMeasurementsUpdatedMessage.builder().shippingKey("shippingKey") } };
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
