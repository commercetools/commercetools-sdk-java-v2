
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomTypeSetMessagePayloadBuilder builder) {
        DeliveryCustomTypeSetMessagePayload deliveryCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomTypeSetMessagePayload)
                .isInstanceOf(DeliveryCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        DeliveryCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "previousTypeId",
                        DeliveryCustomTypeSetMessagePayload.builder().previousTypeId("previousTypeId") },
                new Object[] { "deliveryId", DeliveryCustomTypeSetMessagePayload.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void customFields() {
        DeliveryCustomTypeSetMessagePayload value = DeliveryCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        DeliveryCustomTypeSetMessagePayload value = DeliveryCustomTypeSetMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomTypeSetMessagePayload value = DeliveryCustomTypeSetMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
