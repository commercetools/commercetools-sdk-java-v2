
package com.commercetools.api.models.cart;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CartAddShoppingListActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartAddShoppingListActionBuilder builder) {
        CartAddShoppingListAction cartAddShoppingListAction = builder.buildUnchecked();
        Assertions.assertThat(cartAddShoppingListAction).isInstanceOf(CartAddShoppingListAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartAddShoppingListAction.builder()
                .shoppingList(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl()) },
                new Object[] { CartAddShoppingListAction.builder()
                        .distributionChannel(
                            new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { CartAddShoppingListAction.builder()
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
