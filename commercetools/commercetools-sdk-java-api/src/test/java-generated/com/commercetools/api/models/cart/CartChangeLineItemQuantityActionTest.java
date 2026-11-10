
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartChangeLineItemQuantityActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartChangeLineItemQuantityActionBuilder builder) {
        CartChangeLineItemQuantityAction cartChangeLineItemQuantityAction = builder.buildUnchecked();
        Assertions.assertThat(cartChangeLineItemQuantityAction).isInstanceOf(CartChangeLineItemQuantityAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartChangeLineItemQuantityAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartChangeLineItemQuantityAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", CartChangeLineItemQuantityAction.builder().quantity(8L) },
                new Object[] { "externalPrice",
                        CartChangeLineItemQuantityAction.builder()
                                .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTotalPrice", CartChangeLineItemQuantityAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void externalPrice() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        CartChangeLineItemQuantityAction value = CartChangeLineItemQuantityAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }
}
