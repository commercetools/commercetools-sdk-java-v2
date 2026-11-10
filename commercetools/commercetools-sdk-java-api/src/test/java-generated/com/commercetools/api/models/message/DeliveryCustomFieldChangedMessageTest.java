
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomFieldChangedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomFieldChangedMessageBuilder builder) {
        DeliveryCustomFieldChangedMessage deliveryCustomFieldChangedMessage = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldChangedMessage).isInstanceOf(DeliveryCustomFieldChangedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", DeliveryCustomFieldChangedMessage.builder().name("name") },
                new Object[] { "value", DeliveryCustomFieldChangedMessage.builder().value("value") },
                new Object[] { "previousValue",
                        DeliveryCustomFieldChangedMessage.builder().previousValue("previousValue") },
                new Object[] { "deliveryId", DeliveryCustomFieldChangedMessage.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void name() {
        DeliveryCustomFieldChangedMessage value = DeliveryCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        DeliveryCustomFieldChangedMessage value = DeliveryCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        DeliveryCustomFieldChangedMessage value = DeliveryCustomFieldChangedMessage.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomFieldChangedMessage value = DeliveryCustomFieldChangedMessage.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
