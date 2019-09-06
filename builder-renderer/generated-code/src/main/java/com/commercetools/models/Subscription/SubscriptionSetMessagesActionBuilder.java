package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.MessageSubscription;
import com.commercetools.models.Subscription.SubscriptionUpdateAction;
import java.lang.String;
import com.commercetools.models.Subscription.SubscriptionSetMessagesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionSetMessagesActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages;
   
   public SubscriptionSetMessagesActionBuilder messages(@Nullable final java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages) {
      this.messages = messages;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Subscription.MessageSubscription> getMessages(){
      return this.messages;
   }

   public SubscriptionSetMessagesAction build() {
       return new SubscriptionSetMessagesActionImpl(messages);
   }
   
   public static SubscriptionSetMessagesActionBuilder of() {
      return new SubscriptionSetMessagesActionBuilder();
   }
   
   public static SubscriptionSetMessagesActionBuilder of(final SubscriptionSetMessagesAction template) {
      SubscriptionSetMessagesActionBuilder builder = new SubscriptionSetMessagesActionBuilder();
      builder.messages = template.getMessages();
      return builder;
   }
   
}