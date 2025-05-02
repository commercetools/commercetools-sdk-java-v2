
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetDeliveryAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetDeliveryAddressCustomFieldActionBuilder builder) {
        OrderSetDeliveryAddressCustomFieldAction orderSetDeliveryAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryAddressCustomFieldAction)
                .isInstanceOf(OrderSetDeliveryAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId",
                        OrderSetDeliveryAddressCustomFieldAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey",
                        OrderSetDeliveryAddressCustomFieldAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "name", OrderSetDeliveryAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetDeliveryAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void name() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetDeliveryAddressCustomFieldAction value = OrderSetDeliveryAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
