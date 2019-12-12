package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderAddShoppingListActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = StagedOrderAddShoppingListActionImpl.class)
public interface StagedOrderAddShoppingListAction extends StagedOrderUpdateAction {

   
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
   
   public static StagedOrderAddShoppingListActionImpl of(){
      return new StagedOrderAddShoppingListActionImpl();
   }
   

   public static StagedOrderAddShoppingListActionImpl of(final StagedOrderAddShoppingListAction template) {
      StagedOrderAddShoppingListActionImpl instance = new StagedOrderAddShoppingListActionImpl();
      instance.setShoppingList(template.getShoppingList());
      instance.setSupplyChannel(template.getSupplyChannel());
      instance.setDistributionChannel(template.getDistributionChannel());
      return instance;
   }

}