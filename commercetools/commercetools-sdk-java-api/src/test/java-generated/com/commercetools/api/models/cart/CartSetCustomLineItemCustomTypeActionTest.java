
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomLineItemCustomTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomLineItemCustomTypeActionBuilder builder) {
        CartSetCustomLineItemCustomTypeAction cartSetCustomLineItemCustomTypeAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemCustomTypeAction)
                .isInstanceOf(CartSetCustomLineItemCustomTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartSetCustomLineItemCustomTypeAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartSetCustomLineItemCustomTypeAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "type",
                        CartSetCustomLineItemCustomTypeAction.builder()
                                .type(new com.commercetools.api.models.type.TypeResourceIdentifierImpl()) },
                new Object[] { "fields", CartSetCustomLineItemCustomTypeAction.builder()
                        .fields(new com.commercetools.api.models.type.FieldContainerImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemCustomTypeAction value = CartSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemCustomTypeAction value = CartSetCustomLineItemCustomTypeAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void type() {
        CartSetCustomLineItemCustomTypeAction value = CartSetCustomLineItemCustomTypeAction.of();
        value.setType(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
        Assertions.assertThat(value.getType())
                .isEqualTo(new com.commercetools.api.models.type.TypeResourceIdentifierImpl());
    }

    @Test
    public void fields() {
        CartSetCustomLineItemCustomTypeAction value = CartSetCustomLineItemCustomTypeAction.of();
        value.setFields(new com.commercetools.api.models.type.FieldContainerImpl());
        Assertions.assertThat(value.getFields()).isEqualTo(new com.commercetools.api.models.type.FieldContainerImpl());
    }
}
