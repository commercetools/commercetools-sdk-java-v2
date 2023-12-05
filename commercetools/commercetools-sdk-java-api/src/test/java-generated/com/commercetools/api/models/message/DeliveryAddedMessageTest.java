
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
public class DeliveryAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryAddedMessageBuilder builder) {
        DeliveryAddedMessage deliveryAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryAddedMessage).isInstanceOf(DeliveryAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryAddedMessage.builder()
                        .delivery(new com.commercetools.api.models.order.DeliveryImpl()) },
                new Object[] { DeliveryAddedMessage.builder().shippingKey("shippingKey") } };
    }

    @Test
    public void delivery() {
        DeliveryAddedMessage value = DeliveryAddedMessage.of();
        value.setDelivery(new com.commercetools.api.models.order.DeliveryImpl());
        Assertions.assertThat(value.getDelivery()).isEqualTo(new com.commercetools.api.models.order.DeliveryImpl());
    }

    @Test
    public void shippingKey() {
        DeliveryAddedMessage value = DeliveryAddedMessage.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }
}
