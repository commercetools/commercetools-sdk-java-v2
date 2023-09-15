
package com.commercetools.api.models.order_edit;

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
public class StagedOrderAddShoppingListActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedOrderAddShoppingListActionBuilder builder) {
        StagedOrderAddShoppingListAction stagedOrderAddShoppingListAction = builder.buildUnchecked();
        Assertions.assertThat(stagedOrderAddShoppingListAction).isInstanceOf(StagedOrderAddShoppingListAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StagedOrderAddShoppingListAction.builder()
                .shoppingList(new com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierImpl()) },
                new Object[] { StagedOrderAddShoppingListAction.builder()
                        .distributionChannel(
                            new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { StagedOrderAddShoppingListAction.builder()
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
