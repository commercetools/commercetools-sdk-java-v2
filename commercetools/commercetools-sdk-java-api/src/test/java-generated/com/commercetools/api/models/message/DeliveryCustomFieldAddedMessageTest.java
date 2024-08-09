
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
public class DeliveryCustomFieldAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryCustomFieldAddedMessageBuilder builder) {
        DeliveryCustomFieldAddedMessage deliveryCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldAddedMessage).isInstanceOf(DeliveryCustomFieldAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryCustomFieldAddedMessage.builder().name("name") },
                new Object[] { DeliveryCustomFieldAddedMessage.builder().value("value") },
                new Object[] { DeliveryCustomFieldAddedMessage.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void name() {
        DeliveryCustomFieldAddedMessage value = DeliveryCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        DeliveryCustomFieldAddedMessage value = DeliveryCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomFieldAddedMessage value = DeliveryCustomFieldAddedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
