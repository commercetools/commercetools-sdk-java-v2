
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
public class DeliveryAddressSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryAddressSetMessageBuilder builder) {
        DeliveryAddressSetMessage deliveryAddressSetMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddressSetMessage).isInstanceOf(DeliveryAddressSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryAddressSetMessage.builder().deliveryId("deliveryId") },
                new Object[] { DeliveryAddressSetMessage.builder()
                        .address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { DeliveryAddressSetMessage.builder()
                        .oldAddress(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { DeliveryAddressSetMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void deliveryId() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void address() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void oldAddress() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setOldAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getOldAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryAddressSetMessage value = DeliveryAddressSetMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
