package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.generated.models.subscription.SubscriptionUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionUpdateBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction> actions;
   
   
   private Long version;
   
   public SubscriptionUpdateBuilder actions( final java.util.List<com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public SubscriptionUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public SubscriptionUpdate build() {
       return new SubscriptionUpdateImpl(actions, version);
   }
   
   public static SubscriptionUpdateBuilder of() {
      return new SubscriptionUpdateBuilder();
   }
   
   public static SubscriptionUpdateBuilder of(final SubscriptionUpdate template) {
      SubscriptionUpdateBuilder builder = new SubscriptionUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}