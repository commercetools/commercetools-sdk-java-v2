package com.commercetools.models.Subscription;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Subscription.ChangeSubscription;
import com.commercetools.models.Subscription.DeliveryFormat;
import com.commercetools.models.Subscription.Destination;
import com.commercetools.models.Subscription.MessageSubscription;
import com.commercetools.models.Subscription.SubscriptionHealthStatus;
import java.lang.String;
import com.commercetools.models.Subscription.Subscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubscriptionBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private com.commercetools.models.Subscription.DeliveryFormat format;
   
   
   private com.commercetools.models.Subscription.Destination destination;
   
   
   private java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes;
   
   
   private java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.Subscription.SubscriptionHealthStatus status;
   
   public SubscriptionBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public SubscriptionBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public SubscriptionBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public SubscriptionBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public SubscriptionBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public SubscriptionBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public SubscriptionBuilder format( final com.commercetools.models.Subscription.DeliveryFormat format) {
      this.format = format;
      return this;
   }
   
   public SubscriptionBuilder destination( final com.commercetools.models.Subscription.Destination destination) {
      this.destination = destination;
      return this;
   }
   
   public SubscriptionBuilder changes( final java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes) {
      this.changes = changes;
      return this;
   }
   
   public SubscriptionBuilder messages( final java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages) {
      this.messages = messages;
      return this;
   }
   
   public SubscriptionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public SubscriptionBuilder status( final com.commercetools.models.Subscription.SubscriptionHealthStatus status) {
      this.status = status;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.Subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   
   public com.commercetools.models.Subscription.Destination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.models.Subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   
   public java.util.List<com.commercetools.models.Subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Subscription.SubscriptionHealthStatus getStatus(){
      return this.status;
   }

   public Subscription build() {
       return new SubscriptionImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, format, destination, changes, messages, key, status);
   }
   
   public static SubscriptionBuilder of() {
      return new SubscriptionBuilder();
   }
   
   public static SubscriptionBuilder of(final Subscription template) {
      SubscriptionBuilder builder = new SubscriptionBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.format = template.getFormat();
      builder.destination = template.getDestination();
      builder.changes = template.getChanges();
      builder.messages = template.getMessages();
      builder.key = template.getKey();
      builder.status = template.getStatus();
      return builder;
   }
   
}