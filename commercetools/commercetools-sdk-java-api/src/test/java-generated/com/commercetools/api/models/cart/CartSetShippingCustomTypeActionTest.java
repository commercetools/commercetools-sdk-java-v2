
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetShippingCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetShippingCustomTypeActionBuilder builder) {
        CartSetShippingCustomTypeAction cartSetShippingCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetShippingCustomTypeAction).isInstanceOf(CartSetShippingCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "shippingKey", CartSetShippingCustomTypeAction.builder().shippingKey("shippingKey") },
                new Object[] { "type",
                        CartSetShippingCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", CartSetShippingCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void shippingKey() {
        CartSetShippingCustomTypeAction value = CartSetShippingCustomTypeAction.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void type() {
        CartSetShippingCustomTypeAction value = CartSetShippingCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        CartSetShippingCustomTypeAction value = CartSetShippingCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
