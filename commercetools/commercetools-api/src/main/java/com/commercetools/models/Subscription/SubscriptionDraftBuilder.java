package com.commercetools.models.subscription;

import com.commercetools.models.subscription.ChangeSubscription;
import com.commercetools.models.subscription.DeliveryFormat;
import com.commercetools.models.subscription.Destination;
import com.commercetools.models.subscription.MessageSubscription;
import com.commercetools.models.subscription.SubscriptionDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionDraftBuilder {
   
   @Nullable
   private com.commercetools.models.subscription.DeliveryFormat format;
   
   
   private com.commercetools.models.subscription.Destination destination;
   
   @Nullable
   private java.util.List<com.commercetools.models.subscription.ChangeSubscription> changes;
   
   @Nullable
   private java.util.List<com.commercetools.models.subscription.MessageSubscription> messages;
   
   @Nullable
   private String key;
   
   public SubscriptionDraftBuilder format(@Nullable final com.commercetools.models.subscription.DeliveryFormat format) {
      this.format = format;
      return this;
   }
   
   public SubscriptionDraftBuilder destination( final com.commercetools.models.subscription.Destination destination) {
      this.destination = destination;
      return this;
   }
   
   public SubscriptionDraftBuilder changes(@Nullable final java.util.List<com.commercetools.models.subscription.ChangeSubscription> changes) {
      this.changes = changes;
      return this;
   }
   
   public SubscriptionDraftBuilder messages(@Nullable final java.util.List<com.commercetools.models.subscription.MessageSubscription> messages) {
      this.messages = messages;
      return this;
   }
   
   public SubscriptionDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   
   public com.commercetools.models.subscription.Destination getDestination(){
      return this.destination;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   @Nullable
   public String getKey(){
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