package com.commercetools.models.subscription;

import com.commercetools.models.subscription.SubscriptionUpdateAction;
import java.lang.Long;
import com.commercetools.models.subscription.SubscriptionUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.subscription.SubscriptionUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public SubscriptionUpdateBuilder actions( final java.util.List<com.commercetools.models.subscription.SubscriptionUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public SubscriptionUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.subscription.SubscriptionUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
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