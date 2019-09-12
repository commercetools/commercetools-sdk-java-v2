package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.SubscriptionUpdateAction;
import java.lang.String;
import com.commercetools.models.Subscription.SubscriptionSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public SubscriptionSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public SubscriptionSetKeyAction build() {
       return new SubscriptionSetKeyActionImpl(key);
   }
   
   public static SubscriptionSetKeyActionBuilder of() {
      return new SubscriptionSetKeyActionBuilder();
   }
   
   public static SubscriptionSetKeyActionBuilder of(final SubscriptionSetKeyAction template) {
      SubscriptionSetKeyActionBuilder builder = new SubscriptionSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}