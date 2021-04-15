
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartAddShoppingListActionImpl.class)
public interface CartAddShoppingListAction extends CartUpdateAction {

    String ADD_SHOPPING_LIST = "addShoppingList";

    @NotNull
    @Valid
    @JsonProperty("shoppingList")
    public ShoppingListResourceIdentifier getShoppingList();

    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setShoppingList(final ShoppingListResourceIdentifier shoppingList);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static CartAddShoppingListAction of() {
        return new CartAddShoppingListActionImpl();
    }

    public static CartAddShoppingListAction of(final CartAddShoppingListAction template) {
        CartAddShoppingListActionImpl instance = new CartAddShoppingListActionImpl();
        instance.setShoppingList(template.getShoppingList());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static CartAddShoppingListActionBuilder builder() {
        return CartAddShoppingListActionBuilder.of();
    }

    public static CartAddShoppingListActionBuilder builder(final CartAddShoppingListAction template) {
        return CartAddShoppingListActionBuilder.of(template);
    }

    default <T> T withCartAddShoppingListAction(Function<CartAddShoppingListAction, T> helper) {
        return helper.apply(this);
    }
}
