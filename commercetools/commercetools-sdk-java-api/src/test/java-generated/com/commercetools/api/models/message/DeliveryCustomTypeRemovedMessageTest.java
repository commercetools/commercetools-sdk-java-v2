
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
public class DeliveryCustomTypeRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryCustomTypeRemovedMessageBuilder builder) {
        DeliveryCustomTypeRemovedMessage deliveryCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomTypeRemovedMessage).isInstanceOf(DeliveryCustomTypeRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") },
                new Object[] { DeliveryCustomTypeRemovedMessage.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void previousTypeId() {
        DeliveryCustomTypeRemovedMessage value = DeliveryCustomTypeRemovedMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomTypeRemovedMessage value = DeliveryCustomTypeRemovedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
