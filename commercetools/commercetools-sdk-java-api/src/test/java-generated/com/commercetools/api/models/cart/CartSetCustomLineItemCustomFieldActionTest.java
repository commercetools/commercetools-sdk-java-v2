
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomLineItemCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomLineItemCustomFieldActionBuilder builder) {
        CartSetCustomLineItemCustomFieldAction cartSetCustomLineItemCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemCustomFieldAction)
                .isInstanceOf(CartSetCustomLineItemCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartSetCustomLineItemCustomFieldAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartSetCustomLineItemCustomFieldAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "name", CartSetCustomLineItemCustomFieldAction.builder().name("name") },
                new Object[] { "value", CartSetCustomLineItemCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void name() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CartSetCustomLineItemCustomFieldAction value = CartSetCustomLineItemCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
