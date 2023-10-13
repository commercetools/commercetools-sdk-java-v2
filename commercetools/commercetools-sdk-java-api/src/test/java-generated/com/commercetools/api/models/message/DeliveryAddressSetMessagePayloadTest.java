
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
public class DeliveryAddressSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryAddressSetMessagePayloadBuilder builder) {
        DeliveryAddressSetMessagePayload deliveryAddressSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddressSetMessagePayload).isInstanceOf(DeliveryAddressSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryAddressSetMessagePayload.builder().deliveryId("deliveryId") },
                new Object[] { DeliveryAddressSetMessagePayload.builder()
                        .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { DeliveryAddressSetMessagePayload.builder()
                        .oldAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { DeliveryAddressSetMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void address() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryAddressSetMessagePayload value = DeliveryAddressSetMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
