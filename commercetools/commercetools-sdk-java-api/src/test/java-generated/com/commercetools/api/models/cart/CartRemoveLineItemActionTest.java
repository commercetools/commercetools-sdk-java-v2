
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartRemoveLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartRemoveLineItemActionBuilder builder) {
        CartRemoveLineItemAction cartRemoveLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(cartRemoveLineItemAction).isInstanceOf(CartRemoveLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "lineItemId", CartRemoveLineItemAction.builder().lineItemId("lineItemId") },
                new Object[] { "lineItemKey", CartRemoveLineItemAction.builder().lineItemKey("lineItemKey") },
                new Object[] { "quantity", CartRemoveLineItemAction.builder().quantity(8L) },
                new Object[] { "externalPrice",
                        CartRemoveLineItemAction.builder()
                                .externalPrice(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "externalTotalPrice", CartRemoveLineItemAction.builder()
                        .externalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl()) },
                new Object[] { "shippingDetailsToRemove",
                        CartRemoveLineItemAction.builder()
                                .shippingDetailsToRemove(
                                    new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl()) } };
    }

    @Test
    public void lineItemId() {
        CartRemoveLineItemAction value = CartRemoveLineItemAction.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void lineItemKey() {
        CartRemoveLineItemAction value = CartRemoveLineItemAction.of();
        value.setLineItemKey("lineItemKey");
        Assertions.assertThat(value.getLineItemKey()).isEqualTo("lineItemKey");
    }

    @Test
    public void quantity() {
        CartRemoveLineItemAction value = CartRemoveLineItemAction.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void externalPrice() {
        CartRemoveLineItemAction value = CartRemoveLineItemAction.of();
        value.setExternalPrice(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getExternalPrice()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void externalTotalPrice() {
        CartRemoveLineItemAction value = CartRemoveLineItemAction.of();
        value.setExternalTotalPrice(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
        Assertions.assertThat(value.getExternalTotalPrice())
                .isEqualTo(new com.commercetools.api.models.cart.ExternalLineItemTotalPriceImpl());
    }

    @Test
    public void shippingDetailsToRemove() {
        CartRemoveLineItemAction value = CartRemoveLineItemAction.of();
        value.setShippingDetailsToRemove(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
        Assertions.assertThat(value.getShippingDetailsToRemove())
                .isEqualTo(new com.commercetools.api.models.cart.ItemShippingDetailsDraftImpl());
    }
}
