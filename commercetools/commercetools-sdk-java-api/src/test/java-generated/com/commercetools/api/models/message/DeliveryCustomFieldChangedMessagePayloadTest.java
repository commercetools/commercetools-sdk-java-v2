
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DeliveryCustomFieldChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DeliveryCustomFieldChangedMessagePayloadBuilder builder) {
        DeliveryCustomFieldChangedMessagePayload deliveryCustomFieldChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(deliveryCustomFieldChangedMessagePayload)
                .isInstanceOf(DeliveryCustomFieldChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "name", DeliveryCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { "value", DeliveryCustomFieldChangedMessagePayload.builder().value("value") },
                new Object[] { "previousValue",
                        DeliveryCustomFieldChangedMessagePayload.builder().previousValue("previousValue") },
                new Object[] { "deliveryId",
                        DeliveryCustomFieldChangedMessagePayload.builder().deliveryId("deliveryId") } };
    }

    @Test
    public void name() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void previousValue() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void deliveryId() {
        DeliveryCustomFieldChangedMessagePayload value = DeliveryCustomFieldChangedMessagePayload.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }
}
