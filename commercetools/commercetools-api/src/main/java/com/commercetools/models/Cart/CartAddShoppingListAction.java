package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.models.cart.CartAddShoppingListActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartAddShoppingListActionImpl.class)
public interface CartAddShoppingListAction extends CartUpdateAction {

   
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
   
   public static CartAddShoppingListActionImpl of(){
      return new CartAddShoppingListActionImpl();
   }
   

   public static CartAddShoppingListActionImpl of(final CartAddShoppingListAction template) {
      CartAddShoppingListActionImpl instance = new CartAddShoppingListActionImpl();
      instance.setShoppingList(template.getShoppingList());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setDistributionChannel(template.getDistributionChannel());
      return instance;
   }

}