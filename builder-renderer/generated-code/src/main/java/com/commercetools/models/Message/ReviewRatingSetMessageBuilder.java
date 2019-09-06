package com.commercetools.models.Message;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.Message;
import java.lang.Boolean;
import java.lang.Integer;
import com.commercetools.models.Message.ReviewRatingSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewRatingSetMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.Long sequenceNumber;
   
   
   private com.commercetools.models.Common.Reference resource;
   
   @Nullable
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.lang.Long resourceVersion;
   
   
   private java.lang.String type;
   
   @Nullable
   private java.lang.Integer oldRating;
   
   
   private java.lang.Boolean includedInStatistics;
   
   @Nullable
   private java.lang.Integer newRating;
   
   @Nullable
   private com.commercetools.models.Common.Reference target;
   
   public ReviewRatingSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder oldRating(@Nullable final java.lang.Integer oldRating) {
      this.oldRating = oldRating;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder includedInStatistics( final java.lang.Boolean includedInStatistics) {
      this.includedInStatistics = includedInStatistics;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder newRating(@Nullable final java.lang.Integer newRating) {
      this.newRating = newRating;
      return this;
   }
   
   public ReviewRatingSetMessageBuilder target(@Nullable final com.commercetools.models.Common.Reference target) {
      this.target = target;
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
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   @Nullable
   public java.lang.Integer getOldRating(){
      return this.oldRating;
   }
   
   
   public java.lang.Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   @Nullable
   public java.lang.Integer getNewRating(){
      return this.newRating;
   }
   
   @Nullable
   public com.commercetools.models.Common.Reference getTarget(){
      return this.target;
   }

   public ReviewRatingSetMessage build() {
       return new ReviewRatingSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, oldRating, includedInStatistics, newRating, target);
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
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.oldRating = template.getOldRating();
      builder.includedInStatistics = template.getIncludedInStatistics();
      builder.newRating = template.getNewRating();
      builder.target = template.getTarget();
      return builder;
   }
   
}