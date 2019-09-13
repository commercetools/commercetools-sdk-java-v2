package com.commercetools.models.subscription;

import java.lang.String;
import com.commercetools.models.subscription.MessageSubscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MessageSubscriptionBuilder {
   
   @Nullable
   private java.util.List<java.lang.String> types;
   
   
   private java.lang.String resourceTypeId;
   
   public MessageSubscriptionBuilder types(@Nullable final java.util.List<java.lang.String> types) {
      this.types = types;
      return this;
   }
   
   public MessageSubscriptionBuilder resourceTypeId( final java.lang.String resourceTypeId) {
      this.resourceTypeId = resourceTypeId;
      return this;
   }
   
   @Nullable
   public java.util.List<java.lang.String> getTypes(){
      return this.types;
   }
   
   
   public java.lang.String getResourceTypeId(){
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