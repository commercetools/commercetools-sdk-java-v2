package com.commercetools.models.Subscription;

import java.lang.String;
import com.commercetools.models.Subscription.ChangeSubscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChangeSubscriptionBuilder {
   
   
   private java.lang.String resourceTypeId;
   
   public ChangeSubscriptionBuilder resourceTypeId( final java.lang.String resourceTypeId) {
      this.resourceTypeId = resourceTypeId;
      return this;
   }
   
   
   public java.lang.String getResourceTypeId(){
      return this.resourceTypeId;
   }

   public ChangeSubscription build() {
       return new ChangeSubscriptionImpl(resourceTypeId);
   }
   
   public static ChangeSubscriptionBuilder of() {
      return new ChangeSubscriptionBuilder();
   }
   
   public static ChangeSubscriptionBuilder of(final ChangeSubscription template) {
      ChangeSubscriptionBuilder builder = new ChangeSubscriptionBuilder();
      builder.resourceTypeId = template.getResourceTypeId();
      return builder;
   }
   
}