package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.message.ReviewCreatedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewCreatedMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long resourceVersion;
   
   
   private com.commercetools.api.generated.models.review.Review review;
   
   public ReviewCreatedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ReviewCreatedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ReviewCreatedMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ReviewCreatedMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ReviewCreatedMessageBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ReviewCreatedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ReviewCreatedMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ReviewCreatedMessageBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ReviewCreatedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ReviewCreatedMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ReviewCreatedMessageBuilder review( final com.commercetools.api.generated.models.review.Review review) {
      this.review = review;
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
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public com.commercetools.api.generated.models.review.Review getReview(){
      return this.review;
   }

   public ReviewCreatedMessage build() {
       return new ReviewCreatedMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, review);
   }
   
   public static ReviewCreatedMessageBuilder of() {
      return new ReviewCreatedMessageBuilder();
   }
   
   public static ReviewCreatedMessageBuilder of(final ReviewCreatedMessage template) {
      ReviewCreatedMessageBuilder builder = new ReviewCreatedMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.review = template.getReview();
      return builder;
   }
   
}