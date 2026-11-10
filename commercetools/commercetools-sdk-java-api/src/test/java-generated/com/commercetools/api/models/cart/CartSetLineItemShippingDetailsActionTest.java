
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemShippingDetailsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemShippingDetailsActionBuilder builder) {
        CartSetLineItemShippingDetailsAction cartSetLineItemShippingDetailsAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemShippingDetailsAction)
                .isInstanceOf(CartSetLineItemShippingDetailsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemShippingDetailsAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey",
                        CartSetLineItemShippingDetailsAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "shippingDetails", CartSetLineItemShippingDetailsAction.builder()
                        .shippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemShippingDetailsAction value = CartSetLineItemShippingDetailsAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemShippingDetailsAction value = CartSetLineItemShippingDetailsAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void shippingDetails() {
        CartSetLineItemShippingDetailsAction value = CartSetLineItemShippingDetailsAction.of();
        value.setShippingDetails(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
