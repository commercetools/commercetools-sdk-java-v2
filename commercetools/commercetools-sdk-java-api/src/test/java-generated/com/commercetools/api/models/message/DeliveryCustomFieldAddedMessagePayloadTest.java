
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomFieldAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomFieldAddedMessagePayloadBuilder builder) {
        DeliveryCustomFieldAddedMessagePayload deliveryCustomFieldAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldAddedMessagePayload)
                .isInstanceOf(DeliveryCustomFieldAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", DeliveryCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { "value", DeliveryCustomFieldAddedMessagePayload.builder().value("value") },
                new Object[] { "deliveryId",
                        DeliveryCustomFieldAddedMessagePayload.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void name() {
        DeliveryCustomFieldAddedMessagePayload value = DeliveryCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        DeliveryCustomFieldAddedMessagePayload value = DeliveryCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomFieldAddedMessagePayload value = DeliveryCustomFieldAddedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
