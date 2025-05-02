
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetDeliveryAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetDeliveryAddressActionBuilder builder) {
        OrderSetDeliveryAddressAction orderSetDeliveryAddressAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetDeliveryAddressAction).isInstanceOf(OrderSetDeliveryAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "deliveryId", OrderSetDeliveryAddressAction.builder().deliveryId("deliveryId") },
                new Object[] { "deliveryKey", OrderSetDeliveryAddressAction.builder().deliveryKey("deliveryKey") },
                new Object[] { "address", OrderSetDeliveryAddressAction.builder()
                        .address(new com.commercetools.api.models.common.BaseAddressImpl()) } };
    }

    @Test
    public void deliveryId() {
        OrderSetDeliveryAddressAction value = OrderSetDeliveryAddressAction.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void deliveryKey() {
        OrderSetDeliveryAddressAction value = OrderSetDeliveryAddressAction.of();
        value.setDeliveryKey("deliveryKey");
        Assertions.assertThat(value.getDeliveryKey()).isEqualTo("deliveryKey");
    }

    @Test
    public void address() {
        OrderSetDeliveryAddressAction value = OrderSetDeliveryAddressAction.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }
}
