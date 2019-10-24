package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.ReviewRatingSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewRatingSetMessageBuilder {
   
   
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
   
   @Nullable
   private Integer oldRating;
   
   
   private Boolean includedInStatistics;
   
   @Nullable
   private Integer newRating;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Reference target;
   
   public ReviewRatingSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder oldRating(@Nullable final Integer oldRating) {
      this.oldRating = oldRating;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder includedInStatistics( final Boolean includedInStatistics) {
      this.includedInStatistics = includedInStatistics;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder newRating(@Nullable final Integer newRating) {
      this.newRating = newRating;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder target(@Nullable final com.commercetools.api.generated.models.common.Reference target) {
      this.target = target;
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
   
   @Nullable
   public Integer getOldRating(){
      return this.oldRating;
   }
   
   
   public Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   @Nullable
   public Integer getNewRating(){
      return this.newRating;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Reference getTarget(){
      return this.target;
   }

   public ReviewRatingSetMessage build() {
       return new ReviewRatingSetMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, oldRating, includedInStatistics, newRating, target);
   }
   
   public static ReviewRatingSetMessageBuilder of() {
      return new ReviewRatingSetMessageBuilder();
   }
   
   public static ReviewRatingSetMessageBuilder of(final ReviewRatingSetMessage template) {
      ReviewRatingSetMessageBuilder builder = new ReviewRatingSetMessageBuilder();
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
      builder.oldRating = template.getOldRating();
      builder.includedInStatistics = template.getIncludedInStatistics();
      builder.newRating = template.getNewRating();
      builder.target = template.getTarget();
      return builder;
   }
   
}