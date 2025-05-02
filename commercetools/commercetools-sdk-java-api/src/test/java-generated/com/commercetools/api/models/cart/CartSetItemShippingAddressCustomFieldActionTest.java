
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetItemShippingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetItemShippingAddressCustomFieldActionBuilder builder) {
        CartSetItemShippingAddressCustomFieldAction cartSetItemShippingAddressCustomFieldAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetItemShippingAddressCustomFieldAction)
                .isInstanceOf(CartSetItemShippingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressKey",
                        CartSetItemShippingAddressCustomFieldAction.builder().addressKey("addressKey") },
                new Object[] { "name", CartSetItemShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartSetItemShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void addressKey() {
        CartSetItemShippingAddressCustomFieldAction value = CartSetItemShippingAddressCustomFieldAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void name() {
        CartSetItemShippingAddressCustomFieldAction value = CartSetItemShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetItemShippingAddressCustomFieldAction value = CartSetItemShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
