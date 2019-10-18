package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.PayloadNotIncluded;
import com.commercetools.api.generated.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.subscription.MessageDelivery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MessageDeliveryBuilder {
   
   
   private String projectKey;
   
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long sequenceNumber;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private Long resourceVersion;
   
   
   private com.commercetools.api.generated.models.subscription.PayloadNotIncluded payloadNotIncluded;
   
   
   private String id;
   
   
   private Long version;
   
   public MessageDeliveryBuilder projectKey( final String projectKey) {
      this.projectKey = projectKey;
      return this;
   }
   
   public MessageDeliveryBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public MessageDeliveryBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public MessageDeliveryBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public MessageDeliveryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MessageDeliveryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MessageDeliveryBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public MessageDeliveryBuilder payloadNotIncluded( final com.commercetools.api.generated.models.subscription.PayloadNotIncluded payloadNotIncluded) {
      this.payloadNotIncluded = payloadNotIncluded;
      return this;
   }
   
   public MessageDeliveryBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public MessageDeliveryBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public com.commercetools.api.generated.models.subscription.PayloadNotIncluded getPayloadNotIncluded(){
      return this.payloadNotIncluded;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public MessageDelivery build() {
       return new MessageDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, sequenceNumber, createdAt, lastModifiedAt, resourceVersion, payloadNotIncluded, id, version);
   }
   
   public static MessageDeliveryBuilder of() {
      return new MessageDeliveryBuilder();
   }
   
   public static MessageDeliveryBuilder of(final MessageDelivery template) {
      MessageDeliveryBuilder builder = new MessageDeliveryBuilder();
      builder.projectKey = template.getProjectKey();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.resourceVersion = template.getResourceVersion();
      builder.payloadNotIncluded = template.getPayloadNotIncluded();
      builder.id = template.getId();
      builder.version = template.getVersion();
      return builder;
   }
   
}