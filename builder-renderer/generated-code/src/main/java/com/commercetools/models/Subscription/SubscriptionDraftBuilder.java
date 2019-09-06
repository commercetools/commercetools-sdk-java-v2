package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.ChangeSubscription;
import com.commercetools.models.Subscription.DeliveryFormat;
import com.commercetools.models.Subscription.Destination;
import com.commercetools.models.Subscription.MessageSubscription;
import java.lang.String;
import com.commercetools.models.Subscription.SubscriptionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionDraftBuilder {
   
   @Nullable
   private com.commercetools.models.Subscription.DeliveryFormat format;
   
   
   private com.commercetools.models.Subscription.Destination destination;
   
   @Nullable
   private java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes;
   
   @Nullable
   private java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages;
   
   @Nullable
   private java.lang.String key;
   
   public SubscriptionDraftBuilder format(@Nullable final com.commercetools.models.Subscription.DeliveryFormat format) {
      this.format = format;
      return this;
   }
   
   public SubscriptionDraftBuilder destination( final com.commercetools.models.Subscription.Destination destination) {
      this.destination = destination;
      return this;
   }
   
   public SubscriptionDraftBuilder changes(@Nullable final java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes) {
      this.changes = changes;
      return this;
   }
   
   public SubscriptionDraftBuilder messages(@Nullable final java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages) {
      this.messages = messages;
      return this;
   }
   
   public SubscriptionDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   
   public com.commercetools.models.Subscription.Destination getDestination(){
      return this.destination;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public SubscriptionDraft build() {
       return new SubscriptionDraftImpl(format, destination, changes, messages, key);
   }
   
   public static SubscriptionDraftBuilder of() {
      return new SubscriptionDraftBuilder();
   }
   
   public static SubscriptionDraftBuilder of(final SubscriptionDraft template) {
      SubscriptionDraftBuilder builder = new SubscriptionDraftBuilder();
      builder.format = template.getFormat();
      builder.destination = template.getDestination();
      builder.changes = template.getChanges();
      builder.messages = template.getMessages();
      builder.key = template.getKey();
      return builder;
   }
   
}