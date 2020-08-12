package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddShoppingListActionImpl implements StagedOrderAddShoppingListAction {

   private String action;
   
   private com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList;
   
   private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

   @JsonCreator
   StagedOrderAddShoppingListActionImpl(@JsonProperty("shoppingList") final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList, @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.shoppingList = shoppingList;
      this.supplyChannel = supplyChannel;
      this.distributionChannel = distributionChannel;
      this.action = "addShoppingList";
   }
   public StagedOrderAddShoppingListActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier getShoppingList(){
      return this.shoppingList;
   }
   
   
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public void setShoppingList(final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList){
      this.shoppingList = shoppingList;
   }
   
   public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }

}
