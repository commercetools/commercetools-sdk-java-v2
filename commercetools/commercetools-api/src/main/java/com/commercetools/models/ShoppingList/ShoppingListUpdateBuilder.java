package com.commercetools.models.ShoppingList;

import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.Long;
import com.commercetools.models.ShoppingList.ShoppingListUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.ShoppingList.ShoppingListUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ShoppingListUpdateBuilder actions( final java.util.List<com.commercetools.models.ShoppingList.ShoppingListUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ShoppingListUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ShoppingList.ShoppingListUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ShoppingListUpdate build() {
       return new ShoppingListUpdateImpl(actions, version);
   }
   
   public static ShoppingListUpdateBuilder of() {
      return new ShoppingListUpdateBuilder();
   }
   
   public static ShoppingListUpdateBuilder of(final ShoppingListUpdate template) {
      ShoppingListUpdateBuilder builder = new ShoppingListUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}