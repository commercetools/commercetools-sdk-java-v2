package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import com.commercetools.models.subscription.SubscriptionUpdateAction;
import java.lang.String;
import com.commercetools.models.subscription.SubscriptionChangeDestinationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionChangeDestinationActionBuilder {
   
   
   private com.commercetools.models.subscription.Destination destination;
   
   public SubscriptionChangeDestinationActionBuilder destination( final com.commercetools.models.subscription.Destination destination) {
      this.destination = destination;
      return this;
   }
   
   
   public com.commercetools.models.subscription.Destination getDestination(){
      return this.destination;
   }

   public SubscriptionChangeDestinationAction build() {
       return new SubscriptionChangeDestinationActionImpl(destination);
   }
   
   public static SubscriptionChangeDestinationActionBuilder of() {
      return new SubscriptionChangeDestinationActionBuilder();
   }
   
   public static SubscriptionChangeDestinationActionBuilder of(final SubscriptionChangeDestinationAction template) {
      SubscriptionChangeDestinationActionBuilder builder = new SubscriptionChangeDestinationActionBuilder();
      builder.destination = template.getDestination();
      return builder;
   }
   
}