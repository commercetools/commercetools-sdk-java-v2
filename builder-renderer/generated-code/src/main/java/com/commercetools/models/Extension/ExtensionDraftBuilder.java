package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionTrigger;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionDraftBuilder {
   
   @Nullable
   private java.lang.Integer timeoutInMs;
   
   
   private com.commercetools.models.Extension.ExtensionDestination destination;
   
   
   private java.util.List<com.commercetools.models.Extension.ExtensionTrigger> triggers;
   
   @Nullable
   private java.lang.String key;
   
   public ExtensionDraftBuilder timeoutInMs(@Nullable final java.lang.Integer timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      return this;
   }
   
   public ExtensionDraftBuilder destination( final com.commercetools.models.Extension.ExtensionDestination destination) {
      this.destination = destination;
      return this;
   }
   
   public ExtensionDraftBuilder triggers( final java.util.List<com.commercetools.models.Extension.ExtensionTrigger> triggers) {
      this.triggers = triggers;
      return this;
   }
   
   public ExtensionDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }
   
   
   public com.commercetools.models.Extension.ExtensionDestination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.models.Extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ExtensionDraft build() {
       return new ExtensionDraftImpl(timeoutInMs, destination, triggers, key);
   }
   
   public static ExtensionDraftBuilder of() {
      return new ExtensionDraftBuilder();
   }
   
   public static ExtensionDraftBuilder of(final ExtensionDraft template) {
      ExtensionDraftBuilder builder = new ExtensionDraftBuilder();
      builder.timeoutInMs = template.getTimeoutInMs();
      builder.destination = template.getDestination();
      builder.triggers = template.getTriggers();
      builder.key = template.getKey();
      return builder;
   }
   
}