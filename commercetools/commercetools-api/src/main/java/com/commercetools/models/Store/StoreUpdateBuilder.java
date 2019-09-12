package com.commercetools.models.Store;

import com.commercetools.models.Store.StoreUpdateAction;
import java.lang.Long;
import com.commercetools.models.Store.StoreUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StoreUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.Store.StoreUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public StoreUpdateBuilder actions( final java.util.List<com.commercetools.models.Store.StoreUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public StoreUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Store.StoreUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public StoreUpdate build() {
       return new StoreUpdateImpl(actions, version);
   }
   
   public static StoreUpdateBuilder of() {
      return new StoreUpdateBuilder();
   }
   
   public static StoreUpdateBuilder of(final StoreUpdate template) {
      StoreUpdateBuilder builder = new StoreUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}