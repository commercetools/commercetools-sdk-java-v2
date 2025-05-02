
package com.commercetools.api.models.order_edit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedOrderAddShoppingListActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedOrderAddShoppingListActionBuilder builder) {
        StagedOrderAddShoppingListAction stagedOrderAddShoppingListAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddShoppingListAction).isInstanceOf(StagedOrderAddShoppingListAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shoppingList", StagedOrderAddShoppingListAction.builder()
                .shoppingList(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl()) },
                new Object[] { "distributionChannel",
                        StagedOrderAddShoppingListAction.builder()
                                .distributionChannel(
                                    new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "supplyChannel", StagedOrderAddShoppingListAction.builder()
                        .supplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) } };
    }

    @Test
    public void shoppingList() {
        StagedOrderAddShoppingListAction value = StagedOrderAddShoppingListAction.of();
        value.setShoppingList(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl());
        Assertions.assertThat(value.getShoppingList())
                .isEqualTo(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl());
    }

    @Test
    public void distributionChannel() {
        StagedOrderAddShoppingListAction value = StagedOrderAddShoppingListAction.of();
        value.setDistributionChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getDistributionChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void supplyChannel() {
        StagedOrderAddShoppingListAction value = StagedOrderAddShoppingListAction.of();
        value.setSupplyChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getSupplyChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }
}
