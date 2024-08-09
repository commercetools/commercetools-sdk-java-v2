
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
public class DeliveryCustomFieldRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryCustomFieldRemovedMessageBuilder builder) {
        DeliveryCustomFieldRemovedMessage deliveryCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldRemovedMessage).isInstanceOf(DeliveryCustomFieldRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DeliveryCustomFieldRemovedMessage.builder().name("name") },
                new Object[] { DeliveryCustomFieldRemovedMessage.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void name() {
        DeliveryCustomFieldRemovedMessage value = DeliveryCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomFieldRemovedMessage value = DeliveryCustomFieldRemovedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
