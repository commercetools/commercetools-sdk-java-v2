package com.commercetools.models.order_edit;

import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.models.order_edit.StagedOrderAddShoppingListAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddShoppingListActionBuilder {
   
   
   private com.commercetools.models.shopping_list.ShoppingListResourceIdentifier shoppingList;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;
   
   public StagedOrderAddShoppingListActionBuilder shoppingList( final com.commercetools.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
      this.shoppingList = shoppingList;
      return this;
   }
   
   public StagedOrderAddShoppingListActionBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public StagedOrderAddShoppingListActionBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.distributionChannel = distributionChannel;
      return this;
   }
   
   
   public com.commercetools.models.shopping_list.ShoppingListResourceIdentifier getShoppingList(){
      return this.shoppingList;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   @Nullable
   public com.commercetools.models.channel.ChannelResourceIdentifier getDistributionChannel(){
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