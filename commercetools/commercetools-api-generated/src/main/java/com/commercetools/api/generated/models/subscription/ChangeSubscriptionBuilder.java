package com.commercetools.api.generated.models.subscription;


import com.commercetools.api.generated.models.subscription.ChangeSubscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChangeSubscriptionBuilder {
   
   
   private String resourceTypeId;
   
   public ChangeSubscriptionBuilder resourceTypeId( final String resourceTypeId) {
      this.resourceTypeId = resourceTypeId;
      return this;
   }
   
   
   public String getResourceTypeId(){
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