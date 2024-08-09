
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
public class DeliveryCustomTypeRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryCustomTypeRemovedMessagePayloadBuilder builder) {
        DeliveryCustomTypeRemovedMessagePayload deliveryCustomTypeRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomTypeRemovedMessagePayload)
                .isInstanceOf(DeliveryCustomTypeRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryCustomTypeRemovedMessagePayload.builder().previousTypeId("previousTypeId") },
                new Object[] { DeliveryCustomTypeRemovedMessagePayload.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void previousTypeId() {
        DeliveryCustomTypeRemovedMessagePayload value = DeliveryCustomTypeRemovedMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomTypeRemovedMessagePayload value = DeliveryCustomTypeRemovedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
