
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetCustomLineItemShippingDetailsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetCustomLineItemShippingDetailsActionBuilder builder) {
        CartSetCustomLineItemShippingDetailsAction cartSetCustomLineItemShippingDetailsAction = builder
                .buildUnchecked();
        Assertions.assertThat(cartSetCustomLineItemShippingDetailsAction)
                .isInstanceOf(CartSetCustomLineItemShippingDetailsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customLineItemId",
                        CartSetCustomLineItemShippingDetailsAction.builder().customLineItemId("customLineItemId") },
                new Object[] { "customLineItemKey",
                        CartSetCustomLineItemShippingDetailsAction.builder().customLineItemKey("customLineItemKey") },
                new Object[] { "shippingDetails", CartSetCustomLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void customLineItemId() {
        CartSetCustomLineItemShippingDetailsAction value = CartSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void customLineItemKey() {
        CartSetCustomLineItemShippingDetailsAction value = CartSetCustomLineItemShippingDetailsAction.of();
        value.setCustomLineItemKey("customLineItemKey");
        Assertions.assertThat(value.getCustomLineItemKey()).isEqualTo("customLineItemKey");
    }

    @Test
    public void shippingDetails() {
        CartSetCustomLineItemShippingDetailsAction value = CartSetCustomLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
