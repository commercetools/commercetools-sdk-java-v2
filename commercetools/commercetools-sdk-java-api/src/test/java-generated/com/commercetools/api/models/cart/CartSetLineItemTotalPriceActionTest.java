
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemTotalPriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemTotalPriceActionBuilder builder) {
        CartSetLineItemTotalPriceAction cartSetLineItemTotalPriceAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemTotalPriceAction).isInstanceOf(CartSetLineItemTotalPriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemTotalPriceAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemTotalPriceAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalTotalPrice", CartSetLineItemTotalPriceAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemTotalPriceAction value = CartSetLineItemTotalPriceAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemTotalPriceAction value = CartSetLineItemTotalPriceAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalTotalPrice() {
        CartSetLineItemTotalPriceAction value = CartSetLineItemTotalPriceAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }
}
