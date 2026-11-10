
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomFieldRemovedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomFieldRemovedMessagePayloadBuilder builder) {
        DeliveryCustomFieldRemovedMessagePayload deliveryCustomFieldRemovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldRemovedMessagePayload)
                .isInstanceOf(DeliveryCustomFieldRemovedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", DeliveryCustomFieldRemovedMessagePayload.builder().name("name") }, new Object[] {
                        "deliveryId", DeliveryCustomFieldRemovedMessagePayload.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void name() {
        DeliveryCustomFieldRemovedMessagePayload value = DeliveryCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomFieldRemovedMessagePayload value = DeliveryCustomFieldRemovedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
