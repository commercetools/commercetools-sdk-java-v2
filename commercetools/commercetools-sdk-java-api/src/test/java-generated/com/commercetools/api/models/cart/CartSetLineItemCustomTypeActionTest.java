
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemCustomTypeActionBuilder builder) {
        CartSetLineItemCustomTypeAction cartSetLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemCustomTypeAction).isInstanceOf(CartSetLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemCustomTypeAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemCustomTypeAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "type",
                        CartSetLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", CartSetLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemCustomTypeAction value = CartSetLineItemCustomTypeAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemCustomTypeAction value = CartSetLineItemCustomTypeAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void type() {
        CartSetLineItemCustomTypeAction value = CartSetLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        CartSetLineItemCustomTypeAction value = CartSetLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
