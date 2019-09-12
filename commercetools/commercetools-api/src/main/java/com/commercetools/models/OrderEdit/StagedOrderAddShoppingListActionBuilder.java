package com.commercetools.models.OrderEdit;

import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddShoppingListAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddShoppingListActionBuilder {
   
   
   private com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier shoppingList;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel;
   
   public StagedOrderAddShoppingListActionBuilder shoppingList( final com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier shoppingList) {
      this.shoppingList = shoppingList;
      return this;
   }
   
   public StagedOrderAddShoppingListActionBuilder supplyChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public StagedOrderAddShoppingListActionBuilder distributionChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   
   public com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier getShoppingList(){
      return this.shoppingList;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public com.commercetools.models.Channel.ChannelResourceIdentifier getDistributionChannel(){
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