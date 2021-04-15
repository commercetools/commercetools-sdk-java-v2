
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddShoppingListActionImpl implements CartAddShoppingListAction {

    private String action;

    private com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @JsonCreator
    CartAddShoppingListActionImpl(
            @JsonProperty("shoppingList") final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.shoppingList = shoppingList;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.action = ADD_SHOPPING_LIST;
    }

    public CartAddShoppingListActionImpl() {
        this.action = ADD_SHOPPING_LIST;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier getShoppingList() {
        return this.shoppingList;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setShoppingList(
            final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartAddShoppingListActionImpl that = (CartAddShoppingListActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shoppingList, that.shoppingList)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(shoppingList)
                .append(supplyChannel)
                .append(distributionChannel)
                .toHashCode();
    }

}
