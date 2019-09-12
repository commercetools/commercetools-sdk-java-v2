package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.ChangeSubscription;
import com.commercetools.models.Subscription.SubscriptionUpdateAction;
import java.lang.String;
import com.commercetools.models.Subscription.SubscriptionSetChangesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionSetChangesActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes;
   
   public SubscriptionSetChangesActionBuilder changes(@Nullable final java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes) {
      this.changes = changes;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }

   public SubscriptionSetChangesAction build() {
       return new SubscriptionSetChangesActionImpl(changes);
   }
   
   public static SubscriptionSetChangesActionBuilder of() {
      return new SubscriptionSetChangesActionBuilder();
   }
   
   public static SubscriptionSetChangesActionBuilder of(final SubscriptionSetChangesAction template) {
      SubscriptionSetChangesActionBuilder builder = new SubscriptionSetChangesActionBuilder();
      builder.changes = template.getChanges();
      return builder;
   }
   
}