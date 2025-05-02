
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemCustomFieldActionBuilder builder) {
        CartSetLineItemCustomFieldAction cartSetLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemCustomFieldAction).isInstanceOf(CartSetLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemCustomFieldAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemCustomFieldAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "name", CartSetLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartSetLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemCustomFieldAction value = CartSetLineItemCustomFieldAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemCustomFieldAction value = CartSetLineItemCustomFieldAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void name() {
        CartSetLineItemCustomFieldAction value = CartSetLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetLineItemCustomFieldAction value = CartSetLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
