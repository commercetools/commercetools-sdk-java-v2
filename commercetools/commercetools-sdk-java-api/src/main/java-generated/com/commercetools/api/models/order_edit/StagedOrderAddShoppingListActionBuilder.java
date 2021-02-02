
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddShoppingListActionBuilder {

    private com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    public StagedOrderAddShoppingListActionBuilder shoppingList(
            final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
        this.shoppingList = shoppingList;
        return this;
    }

    public StagedOrderAddShoppingListActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public StagedOrderAddShoppingListActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier getShoppingList() {
        return this.shoppingList;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public StagedOrderAddShoppingListAction build() {
        return new StagedOrderAddShoppingListActionImpl(shoppingList, supplyChannel, distributionChannel);
    }

    public static StagedOrderAddShoppingListActionBuilder of() {
        return new StagedOrderAddShoppingListActionBuilder();
    }

    public static StagedOrderAddShoppingListActionBuilder of(final StagedOrderAddShoppingListAction template) {
        StagedOrderAddShoppingListActionBuilder builder = new StagedOrderAddShoppingListActionBuilder();
        builder.shoppingList = template.getShoppingList();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
