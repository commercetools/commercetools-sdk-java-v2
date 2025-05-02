
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetItemShippingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetItemShippingAddressCustomFieldActionBuilder builder) {
        OrderSetItemShippingAddressCustomFieldAction orderSetItemShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(orderSetItemShippingAddressCustomFieldAction)
                .isInstanceOf(OrderSetItemShippingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressKey",
                        OrderSetItemShippingAddressCustomFieldAction.builder().addressKey("addressKey") },
                new Object[] { "name", OrderSetItemShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", OrderSetItemShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressKey() {
        OrderSetItemShippingAddressCustomFieldAction value = OrderSetItemShippingAddressCustomFieldAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void name() {
        OrderSetItemShippingAddressCustomFieldAction value = OrderSetItemShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        OrderSetItemShippingAddressCustomFieldAction value = OrderSetItemShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
