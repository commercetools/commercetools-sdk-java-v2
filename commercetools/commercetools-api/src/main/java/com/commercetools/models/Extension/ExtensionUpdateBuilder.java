package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionUpdateAction;
import java.lang.Long;
import com.commercetools.models.extension.ExtensionUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.extension.ExtensionUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ExtensionUpdateBuilder actions( final java.util.List<com.commercetools.models.extension.ExtensionUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ExtensionUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.extension.ExtensionUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ExtensionUpdate build() {
       return new ExtensionUpdateImpl(actions, version);
   }
   
   public static ExtensionUpdateBuilder of() {
      return new ExtensionUpdateBuilder();
   }
   
   public static ExtensionUpdateBuilder of(final ExtensionUpdate template) {
      ExtensionUpdateBuilder builder = new ExtensionUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}