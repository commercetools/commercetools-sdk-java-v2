
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
public class ParcelRemovedFromDeliveryMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelRemovedFromDeliveryMessageBuilder builder) {
        ParcelRemovedFromDeliveryMessage parcelRemovedFromDeliveryMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelRemovedFromDeliveryMessage).isInstanceOf(ParcelRemovedFromDeliveryMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelRemovedFromDeliveryMessage.builder().deliveryId("deliveryId") },
                new Object[] { ParcelRemovedFromDeliveryMessage.builder()
                        .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { ParcelRemovedFromDeliveryMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        ParcelRemovedFromDeliveryMessage value = ParcelRemovedFromDeliveryMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void parcel() {
        ParcelRemovedFromDeliveryMessage value = ParcelRemovedFromDeliveryMessage.of();
        value.setParcel(new com.commercetools.api.models.order.ParcelImpl());
        Assertions.assertThat(value.getParcel()).isEqualTo(new com.commercetools.api.models.order.ParcelImpl());
    }

    @Test
    public void shippingKey() {
        ParcelRemovedFromDeliveryMessage value = ParcelRemovedFromDeliveryMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
