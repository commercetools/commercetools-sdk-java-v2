
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomFieldRemovedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomFieldRemovedMessageBuilder builder) {
        DeliveryCustomFieldRemovedMessage deliveryCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldRemovedMessage).isInstanceOf(DeliveryCustomFieldRemovedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", DeliveryCustomFieldRemovedMessage.builder().name("name") },
                new Object[] { "deliveryId", DeliveryCustomFieldRemovedMessage.builder().deliveryId("deliveryId") } };
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
