package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.ChangeSubscription;
import com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.generated.models.subscription.SubscriptionSetChangesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionSetChangesActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes;
   
   public SubscriptionSetChangesActionBuilder changes(@Nullable final java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes) {
      this.changes = changes;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> getChanges(){
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