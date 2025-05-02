
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetDeliveryCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetDeliveryCustomFieldActionBuilder builder) {
        OrderSetDeliveryCustomFieldAction orderSetDeliveryCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryCustomFieldAction).isInstanceOf(OrderSetDeliveryCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", OrderSetDeliveryCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", OrderSetDeliveryCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "name", OrderSetDeliveryCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetDeliveryCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetDeliveryCustomFieldAction value = OrderSetDeliveryCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
