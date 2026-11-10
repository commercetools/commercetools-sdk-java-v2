
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartSetLineItemPriceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartSetLineItemPriceActionBuilder builder) {
        CartSetLineItemPriceAction cartSetLineItemPriceAction = builder.buildUnchecked();
        Assertions.assertThat(cartSetLineItemPriceAction).isInstanceOf(CartSetLineItemPriceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartSetLineItemPriceAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartSetLineItemPriceAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "externalPrice", CartSetLineItemPriceAction.builder()
                        .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartSetLineItemPriceAction value = CartSetLineItemPriceAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartSetLineItemPriceAction value = CartSetLineItemPriceAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void externalPrice() {
        CartSetLineItemPriceAction value = CartSetLineItemPriceAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }
}
