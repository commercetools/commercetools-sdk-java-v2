
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
public class DeliveryCustomTypeSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DeliveryCustomTypeSetMessageBuilder builder) {
        DeliveryCustomTypeSetMessage deliveryCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomTypeSetMessage).isInstanceOf(DeliveryCustomTypeSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { DeliveryCustomTypeSetMessage.builder()
                        .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { DeliveryCustomTypeSetMessage.builder().previousTypeId("previousTypeId") },
                new Object[] { DeliveryCustomTypeSetMessage.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void customFields() {
        DeliveryCustomTypeSetMessage value = DeliveryCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        DeliveryCustomTypeSetMessage value = DeliveryCustomTypeSetMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomTypeSetMessage value = DeliveryCustomTypeSetMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
