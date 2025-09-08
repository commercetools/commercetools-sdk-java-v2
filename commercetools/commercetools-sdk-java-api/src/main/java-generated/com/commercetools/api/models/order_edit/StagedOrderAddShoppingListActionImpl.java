
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Adds all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> to the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddShoppingListActionImpl implements StagedOrderAddShoppingListAction, ModelBase {

    private String action;

    private com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderAddShoppingListActionImpl(
            @JsonProperty("shoppingList") final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.shoppingList = shoppingList;
        this.distributionChannel = distributionChannel;
        this.supplyChannel = supplyChannel;
        this.action = ADD_SHOPPING_LIST;
    }

    /**
     * create empty instance
     */
    public StagedOrderAddShoppingListActionImpl() {
        this.action = ADD_SHOPPING_LIST;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     */

    public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier getShoppingList() {
        return this.shoppingList;
    }

    /**
     *  <p><code>distributionChannel</code> to set for all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> that are added to the Cart. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p><code>supplyChannel</code> to set for all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> that are added to the Cart. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public void setShoppingList(
            final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderAddShoppingListActionImpl that = (StagedOrderAddShoppingListActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shoppingList, that.shoppingList)
                .append(distributionChannel, that.distributionChannel)
                .append(supplyChannel, that.supplyChannel)
                .append(action, that.action)
                .append(shoppingList, that.shoppingList)
                .append(distributionChannel, that.distributionChannel)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(shoppingList)
                .append(distributionChannel)
                .append(supplyChannel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shoppingList", shoppingList)
                .append("distributionChannel", distributionChannel)
                .append("supplyChannel", supplyChannel)
                .build();
    }

    @Override
    public StagedOrderAddShoppingListAction copyDeep() {
        return StagedOrderAddShoppingListAction.deepCopy(this);
    }
}
