
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
public class DeliveryCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryCustomFieldChangedMessagePayloadBuilder builder) {
        DeliveryCustomFieldChangedMessagePayload deliveryCustomFieldChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldChangedMessagePayload)
                .isInstanceOf(DeliveryCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { DeliveryCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { DeliveryCustomFieldChangedMessagePayload.builder().previousValue("previousValue") },
                new Object[] { DeliveryCustomFieldChangedMessagePayload.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void name() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
