
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderRemoveItemShippingAddressActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderRemoveItemShippingAddressActionBuilder builder) {
        OrderRemoveItemShippingAddressAction orderRemoveItemShippingAddressAction = builder.buildUnchecked();
        Assertions.assertThat(orderRemoveItemShippingAddressAction)
                .isInstanceOf(OrderRemoveItemShippingAddressAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "addressKey",
                OrderRemoveItemShippingAddressAction.builder().addressKey("addressKey") } };
    }

    @Test
    public void addressKey() {
        OrderRemoveItemShippingAddressAction value = OrderRemoveItemShippingAddressAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }
}
