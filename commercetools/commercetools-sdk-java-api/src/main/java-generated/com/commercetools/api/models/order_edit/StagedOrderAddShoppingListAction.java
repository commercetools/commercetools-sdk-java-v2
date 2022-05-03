
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddShoppingListActionImpl.class)
public interface StagedOrderAddShoppingListAction extends StagedOrderUpdateAction {

    String ADD_SHOPPING_LIST = "addShoppingList";

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:ShoppingList">ShoppingList</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("shoppingList")
    public ShoppingListResourceIdentifier getShoppingList();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setShoppingList(final ShoppingListResourceIdentifier shoppingList);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StagedOrderAddShoppingListAction of() {
        return new StagedOrderAddShoppingListActionImpl();
    }

    public static StagedOrderAddShoppingListAction of(final StagedOrderAddShoppingListAction template) {
        StagedOrderAddShoppingListActionImpl instance = new StagedOrderAddShoppingListActionImpl();
        instance.setShoppingList(template.getShoppingList());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StagedOrderAddShoppingListActionBuilder builder() {
        return StagedOrderAddShoppingListActionBuilder.of();
    }

    public static StagedOrderAddShoppingListActionBuilder builder(final StagedOrderAddShoppingListAction template) {
        return StagedOrderAddShoppingListActionBuilder.of(template);
    }

    default <T> T withStagedOrderAddShoppingListAction(Function<StagedOrderAddShoppingListAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddShoppingListAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddShoppingListAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddShoppingListAction>";
            }
        };
    }
}
