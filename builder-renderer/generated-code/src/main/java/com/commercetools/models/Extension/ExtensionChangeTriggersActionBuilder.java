package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionTrigger;
import com.commercetools.models.Extension.ExtensionUpdateAction;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionChangeTriggersAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionChangeTriggersActionBuilder {
   
   
   private java.util.List<com.commercetools.models.Extension.ExtensionTrigger> triggers;
   
   public ExtensionChangeTriggersActionBuilder triggers( final java.util.List<com.commercetools.models.Extension.ExtensionTrigger> triggers) {
      this.triggers = triggers;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }

   public ExtensionChangeTriggersAction build() {
       return new ExtensionChangeTriggersActionImpl(triggers);
   }
   
   public static ExtensionChangeTriggersActionBuilder of() {
      return new ExtensionChangeTriggersActionBuilder();
   }
   
   public static ExtensionChangeTriggersActionBuilder of(final ExtensionChangeTriggersAction template) {
      ExtensionChangeTriggersActionBuilder builder = new ExtensionChangeTriggersActionBuilder();
      builder.triggers = template.getTriggers();
      return builder;
   }
   
}