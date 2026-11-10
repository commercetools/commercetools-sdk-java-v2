
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomTypeRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomTypeRemovedMessagePayloadBuilder builder) {
        DeliveryCustomTypeRemovedMessagePayload deliveryCustomTypeRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomTypeRemovedMessagePayload)
                .isInstanceOf(DeliveryCustomTypeRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "previousTypeId",
                        DeliveryCustomTypeRemovedMessagePayload.builder().previousTypeId("previousTypeId") },
                new Object[] { "deliveryId",
                        DeliveryCustomTypeRemovedMessagePayload.builder().deliveryId("deliveryId") } };
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
