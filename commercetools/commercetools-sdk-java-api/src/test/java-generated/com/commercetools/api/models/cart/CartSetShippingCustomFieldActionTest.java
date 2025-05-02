
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetShippingCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetShippingCustomFieldActionBuilder builder) {
        CartSetShippingCustomFieldAction cartSetShippingCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingCustomFieldAction).isInstanceOf(CartSetShippingCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", CartSetShippingCustomFieldAction.builder().shippingKey("shippingKey") },
                new Object[] { "name", CartSetShippingCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartSetShippingCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void shippingKey() {
        CartSetShippingCustomFieldAction value = CartSetShippingCustomFieldAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void name() {
        CartSetShippingCustomFieldAction value = CartSetShippingCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetShippingCustomFieldAction value = CartSetShippingCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
