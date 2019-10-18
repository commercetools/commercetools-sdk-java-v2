package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction> actions;
   
   
   private Long version;
   
   public ShoppingListUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ShoppingListUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
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