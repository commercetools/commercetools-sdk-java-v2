package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.subscription.ChangeSubscription;
import com.commercetools.api.generated.models.subscription.DeliveryFormat;
import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.MessageSubscription;
import com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus;
import com.commercetools.api.generated.models.subscription.Subscription;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private com.commercetools.api.generated.models.subscription.DeliveryFormat format;
   
   
   private com.commercetools.api.generated.models.subscription.Destination destination;
   
   
   private java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes;
   
   
   private java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> messages;
   
   @Nullable
   private String key;
   
   
   private com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus status;
   
   public SubscriptionBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public SubscriptionBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public SubscriptionBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public SubscriptionBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public SubscriptionBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public SubscriptionBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public SubscriptionBuilder format( final com.commercetools.api.generated.models.subscription.DeliveryFormat format) {
      this.format = format;
      return this;
   }
   
   public SubscriptionBuilder destination( final com.commercetools.api.generated.models.subscription.Destination destination) {
      this.destination = destination;
      return this;
   }
   
   public SubscriptionBuilder changes( final java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes) {
      this.changes = changes;
      return this;
   }
   
   public SubscriptionBuilder messages( final java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> messages) {
      this.messages = messages;
      return this;
   }
   
   public SubscriptionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public SubscriptionBuilder status( final com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus status) {
      this.status = status;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.api.generated.models.subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   
   public com.commercetools.api.generated.models.subscription.Destination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus getStatus(){
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