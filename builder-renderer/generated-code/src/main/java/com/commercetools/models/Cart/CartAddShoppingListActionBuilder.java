package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Channel.ChannelResourceIdentifier;
import com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartAddShoppingListAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddShoppingListActionBuilder {
   
   
   private com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier shoppingList;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel;
   
   @Nullable
   private com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel;
   
   public CartAddShoppingListActionBuilder shoppingList( final com.commercetools.models.ShoppingList.ShoppingListResourceIdentifier shoppingList) {
      this.shoppingList = shoppingList;
      return this;
   }
   
   public CartAddShoppingListActionBuilder supplyChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier supplyChannel) {
      this.supplyChannel = supplyChannel;
      return this;
   }
   
   public CartAddShoppingListActionBuilder distributionChannel(@Nullable final com.commercetools.models.Channel.ChannelResourceIdentifier distributionChannel) {
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