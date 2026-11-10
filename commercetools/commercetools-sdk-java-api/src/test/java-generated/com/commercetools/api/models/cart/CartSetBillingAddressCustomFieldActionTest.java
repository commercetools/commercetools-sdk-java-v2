
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetBillingAddressCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetBillingAddressCustomFieldActionBuilder builder) {
        CartSetBillingAddressCustomFieldAction cartSetBillingAddressCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetBillingAddressCustomFieldAction)
                .isInstanceOf(CartSetBillingAddressCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", CartSetBillingAddressCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartSetBillingAddressCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CartSetBillingAddressCustomFieldAction value = CartSetBillingAddressCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetBillingAddressCustomFieldAction value = CartSetBillingAddressCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
