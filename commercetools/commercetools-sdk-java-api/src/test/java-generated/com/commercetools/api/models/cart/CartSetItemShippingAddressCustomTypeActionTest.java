
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetItemShippingAddressCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetItemShippingAddressCustomTypeActionBuilder builder) {
        CartSetItemShippingAddressCustomTypeAction cartSetItemShippingAddressCustomTypeAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetItemShippingAddressCustomTypeAction)
                .isInstanceOf(CartSetItemShippingAddressCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addressKey",
                        CartSetItemShippingAddressCustomTypeAction.builder().addressKey("addressKey") },
                new Object[] { "type",
                        CartSetItemShippingAddressCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", CartSetItemShippingAddressCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void addressKey() {
        CartSetItemShippingAddressCustomTypeAction value = CartSetItemShippingAddressCustomTypeAction.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void type() {
        CartSetItemShippingAddressCustomTypeAction value = CartSetItemShippingAddressCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        CartSetItemShippingAddressCustomTypeAction value = CartSetItemShippingAddressCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
