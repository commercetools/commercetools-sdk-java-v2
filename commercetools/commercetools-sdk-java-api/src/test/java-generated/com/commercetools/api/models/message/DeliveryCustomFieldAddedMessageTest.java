
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomFieldAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomFieldAddedMessageBuilder builder) {
        DeliveryCustomFieldAddedMessage deliveryCustomFieldAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldAddedMessage).isInstanceOf(DeliveryCustomFieldAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", DeliveryCustomFieldAddedMessage.builder().name("name") },
                new Object[] { "value", DeliveryCustomFieldAddedMessage.builder().value("value") },
                new Object[] { "deliveryId", DeliveryCustomFieldAddedMessage.builder().deliveryId("deliveryId") } };
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
