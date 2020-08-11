package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.ReviewStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewStateTransitionMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   
   private Long sequenceNumber;
   
   
   private com.commercetools.api.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private Long resourceVersion;
   
   
   private Boolean newIncludedInStatistics;
   
   
   private com.commercetools.api.models.state.StateReference oldState;
   
   
   private Boolean force;
   
   
   private Boolean oldIncludedInStatistics;
   
   
   private com.commercetools.api.models.state.StateReference newState;
   
   
   private com.commercetools.api.models.common.Reference target;
   
   public ReviewStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder newIncludedInStatistics( final Boolean newIncludedInStatistics) {
      this.newIncludedInStatistics = newIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder oldState( final com.commercetools.api.models.state.StateReference oldState) {
      this.oldState = oldState;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder force( final Boolean force) {
      this.force = force;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder oldIncludedInStatistics( final Boolean oldIncludedInStatistics) {
      this.oldIncludedInStatistics = oldIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder newState( final com.commercetools.api.models.state.StateReference newState) {
      this.newState = newState;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder target( final com.commercetools.api.models.common.Reference target) {
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
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public com.commercetools.api.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.api.models.state.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public com.commercetools.api.models.state.StateReference getNewState(){
      return this.newState;
   }
   
   
   public com.commercetools.api.models.common.Reference getTarget(){
      return this.target;
   }

   public ReviewStateTransitionMessage build() {
       return new ReviewStateTransitionMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, newIncludedInStatistics, oldState, force, oldIncludedInStatistics, newState, target);
   }
   
   public static ReviewStateTransitionMessageBuilder of() {
      return new ReviewStateTransitionMessageBuilder();
   }
   
   public static ReviewStateTransitionMessageBuilder of(final ReviewStateTransitionMessage template) {
      ReviewStateTransitionMessageBuilder builder = new ReviewStateTransitionMessageBuilder();
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
      builder.newIncludedInStatistics = template.getNewIncludedInStatistics();
      builder.oldState = template.getOldState();
      builder.force = template.getForce();
      builder.oldIncludedInStatistics = template.getOldIncludedInStatistics();
      builder.newState = template.getNewState();
      builder.target = template.getTarget();
      return builder;
   }
   
}
