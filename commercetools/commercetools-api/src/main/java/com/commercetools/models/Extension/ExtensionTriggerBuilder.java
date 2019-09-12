package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionAction;
import com.commercetools.models.Extension.ExtensionResourceTypeId;
import com.commercetools.models.Extension.ExtensionTrigger;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionTriggerBuilder {
   
   
   private com.commercetools.models.Extension.ExtensionResourceTypeId resourceTypeId;
   
   
   private java.util.List<com.commercetools.models.Extension.ExtensionAction> actions;
   
   public ExtensionTriggerBuilder resourceTypeId( final com.commercetools.models.Extension.ExtensionResourceTypeId resourceTypeId) {
      this.resourceTypeId = resourceTypeId;
      return this;
   }
   
   public ExtensionTriggerBuilder actions( final java.util.List<com.commercetools.models.Extension.ExtensionAction> actions) {
      this.actions = actions;
      return this;
   }
   
   
   public com.commercetools.models.Extension.ExtensionResourceTypeId getResourceTypeId(){
      return this.resourceTypeId;
   }
   
   
   public java.util.List<com.commercetools.models.Extension.ExtensionAction> getActions(){
      return this.actions;
   }

   public ExtensionTrigger build() {
       return new ExtensionTriggerImpl(resourceTypeId, actions);
   }
   
   public static ExtensionTriggerBuilder of() {
      return new ExtensionTriggerBuilder();
   }
   
   public static ExtensionTriggerBuilder of(final ExtensionTrigger template) {
      ExtensionTriggerBuilder builder = new ExtensionTriggerBuilder();
      builder.resourceTypeId = template.getResourceTypeId();
      builder.actions = template.getActions();
      return builder;
   }
   
}