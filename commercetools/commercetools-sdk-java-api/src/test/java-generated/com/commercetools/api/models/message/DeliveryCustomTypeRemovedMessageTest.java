
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomTypeRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomTypeRemovedMessageBuilder builder) {
        DeliveryCustomTypeRemovedMessage deliveryCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomTypeRemovedMessage).isInstanceOf(DeliveryCustomTypeRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "previousTypeId",
                        DeliveryCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") },
                new Object[] { "deliveryId", DeliveryCustomTypeRemovedMessage.builder().deliveryId("deliveryId") } };
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
