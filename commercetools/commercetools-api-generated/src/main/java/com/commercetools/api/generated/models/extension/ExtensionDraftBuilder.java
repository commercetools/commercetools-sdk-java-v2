package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionDestination;
import com.commercetools.api.generated.models.extension.ExtensionTrigger;
import com.commercetools.api.generated.models.extension.ExtensionDraft;
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
public final class ExtensionDraftBuilder {
   
   @Nullable
   private Integer timeoutInMs;
   
   
   private com.commercetools.api.generated.models.extension.ExtensionDestination destination;
   
   
   private java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers;
   
   @Nullable
   private String key;
   
   public ExtensionDraftBuilder timeoutInMs(@Nullable final Integer timeoutInMs) {
      this.timeoutInMs = timeoutInMs;
      return this;
   }
   
   public ExtensionDraftBuilder destination( final com.commercetools.api.generated.models.extension.ExtensionDestination destination) {
      this.destination = destination;
      return this;
   }
   
   public ExtensionDraftBuilder triggers( final java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> triggers) {
      this.triggers = triggers;
      return this;
   }
   
   public ExtensionDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public Integer getTimeoutInMs(){
      return this.timeoutInMs;
   }
   
   
   public com.commercetools.api.generated.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.extension.ExtensionTrigger> getTriggers(){
      return this.triggers;
   }
   
   @Nullable
   public String getKey(){
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