
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetShippingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetShippingAddressCustomFieldActionBuilder builder) {
        CartSetShippingAddressCustomFieldAction cartSetShippingAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingAddressCustomFieldAction)
                .isInstanceOf(CartSetShippingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CartSetShippingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartSetShippingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CartSetShippingAddressCustomFieldAction value = CartSetShippingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetShippingAddressCustomFieldAction value = CartSetShippingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
