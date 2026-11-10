
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartAddShoppingListActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartAddShoppingListActionBuilder builder) {
        CartAddShoppingListAction cartAddShoppingListAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddShoppingListAction).isInstanceOf(CartAddShoppingListAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shoppingList", CartAddShoppingListAction.builder()
                .shoppingList(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl()) },
                new Object[] { "distributionChannel",
                        CartAddShoppingListAction.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "supplyChannel", CartAddShoppingListAction.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void shoppingList() {
        CartAddShoppingListAction value = CartAddShoppingListAction.of();
        value.setShoppingList(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl());
        Assertions.assertThat(value.getShoppingList())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl());
    }

    @Test
    public void distributionChannel() {
        CartAddShoppingListAction value = CartAddShoppingListAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void supplyChannel() {
        CartAddShoppingListAction value = CartAddShoppingListAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
