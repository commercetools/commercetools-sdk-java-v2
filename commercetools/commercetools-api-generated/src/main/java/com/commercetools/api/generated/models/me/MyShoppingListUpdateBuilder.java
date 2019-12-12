package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyShoppingListUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.me.MyShoppingListUpdateAction> actions;
   
   
   private Long version;
   
   public MyShoppingListUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.me.MyShoppingListUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public MyShoppingListUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.me.MyShoppingListUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public MyShoppingListUpdate build() {
       return new MyShoppingListUpdateImpl(actions, version);
   }
   
   public static MyShoppingListUpdateBuilder of() {
      return new MyShoppingListUpdateBuilder();
   }
   
   public static MyShoppingListUpdateBuilder of(final MyShoppingListUpdate template) {
      MyShoppingListUpdateBuilder builder = new MyShoppingListUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}