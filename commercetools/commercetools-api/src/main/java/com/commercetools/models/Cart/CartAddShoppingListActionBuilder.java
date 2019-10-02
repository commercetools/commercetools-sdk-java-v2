package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.channel.ChannelResourceIdentifier;
import com.commercetools.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.models.cart.CartAddShoppingListAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddShoppingListActionBuilder {
   
   
   private com.commercetools.models.shopping_list.ShoppingListResourceIdentifier shoppingList;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel;
   
   public CartAddShoppingListActionBuilder shoppingList( final com.commercetools.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
      this.shoppingList = shoppingList;
      return this;
   }
   
   public CartAddShoppingListActionBuilder supplyChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public CartAddShoppingListActionBuilder distributionChannel(@Nullable final com.commercetools.models.channel.ChannelResourceIdentifier distributionChannel) {
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

   public CartAddShoppingListAction build() {
       return new CartAddShoppingListActionImpl(shoppingList, supplyChannel, distributionChannel);
   }
   
   public static CartAddShoppingListActionBuilder of() {
      return new CartAddShoppingListActionBuilder();
   }
   
   public static CartAddShoppingListActionBuilder of(final CartAddShoppingListAction template) {
      CartAddShoppingListActionBuilder builder = new CartAddShoppingListActionBuilder();
      builder.shoppingList = template.getShoppingList();
      builder.supplyChannel = template.getSupplyChannel();
      builder.distributionChannel = template.getDistributionChannel();
      return builder;
   }
   
}