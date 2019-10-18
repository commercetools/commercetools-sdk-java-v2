package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
import com.commercetools.api.generated.models.extension.ExtensionUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionUpdateAction> actions;
   
   
   private Long version;
   
   public ExtensionUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.extension.ExtensionUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ExtensionUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
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