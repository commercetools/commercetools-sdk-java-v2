
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
public class ParcelAddedToDeliveryMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelAddedToDeliveryMessageBuilder builder) {
        ParcelAddedToDeliveryMessage parcelAddedToDeliveryMessage = builder.buildUnchecked();
        Assertions.assertThat(parcelAddedToDeliveryMessage).isInstanceOf(ParcelAddedToDeliveryMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ParcelAddedToDeliveryMessage.builder()
                        .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { ParcelAddedToDeliveryMessage.builder()
                        .parcel(new com.commercetools.api.models.order.ParcelImpl()) },
                new Object[] { ParcelAddedToDeliveryMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        ParcelAddedToDeliveryMessage value = ParcelAddedToDeliveryMessage.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void parcel() {
        ParcelAddedToDeliveryMessage value = ParcelAddedToDeliveryMessage.of();
        value.setParcel(new com.commercetools.api.models.order.ParcelImpl());
        Assertions.assertThat(value.getParcel()).isEqualTo(new com.commercetools.api.models.order.ParcelImpl());
    }

    @Test
    public void shippingKey() {
        ParcelAddedToDeliveryMessage value = ParcelAddedToDeliveryMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
