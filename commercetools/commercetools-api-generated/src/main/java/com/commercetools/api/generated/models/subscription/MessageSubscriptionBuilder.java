package com.commercetools.api.generated.models.subscription;


import com.commercetools.api.generated.models.subscription.MessageSubscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MessageSubscriptionBuilder {
   
   @Nullable
   private java.util.List<String> types;
   
   
   private String resourceTypeId;
   
   public MessageSubscriptionBuilder types(@Nullable final java.util.List<String> types) {
      this.types = types;
      return this;
   }
   
   public MessageSubscriptionBuilder resourceTypeId( final String resourceTypeId) {
      this.resourceTypeId = resourceTypeId;
      return this;
   }
   
   @Nullable
   public java.util.List<String> getTypes(){
      return this.types;
   }
   
   
   public String getResourceTypeId(){
      return this.resourceTypeId;
   }

   public MessageSubscription build() {
       return new MessageSubscriptionImpl(types, resourceTypeId);
   }
   
   public static MessageSubscriptionBuilder of() {
      return new MessageSubscriptionBuilder();
   }
   
   public static MessageSubscriptionBuilder of(final MessageSubscription template) {
      MessageSubscriptionBuilder builder = new MessageSubscriptionBuilder();
      builder.types = template.getTypes();
      builder.resourceTypeId = template.getResourceTypeId();
      return builder;
   }
   
}