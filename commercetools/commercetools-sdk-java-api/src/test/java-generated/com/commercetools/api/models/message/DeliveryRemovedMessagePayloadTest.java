
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
public class DeliveryRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryRemovedMessagePayloadBuilder builder) {
        DeliveryRemovedMessagePayload deliveryRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryRemovedMessagePayload).isInstanceOf(DeliveryRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryRemovedMessagePayload.builder()
                        .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { DeliveryRemovedMessagePayload.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        DeliveryRemovedMessagePayload value = DeliveryRemovedMessagePayload.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryRemovedMessagePayload value = DeliveryRemovedMessagePayload.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
