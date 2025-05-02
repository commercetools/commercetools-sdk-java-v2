
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomTypeSetMessageBuilder builder) {
        DeliveryCustomTypeSetMessage deliveryCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomTypeSetMessage).isInstanceOf(DeliveryCustomTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        DeliveryCustomTypeSetMessage.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "previousTypeId",
                        DeliveryCustomTypeSetMessage.builder().previousTypeId("previousTypeId") },
                new Object[] { "deliveryId", DeliveryCustomTypeSetMessage.builder().deliveryId("deliveryId") } };
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
