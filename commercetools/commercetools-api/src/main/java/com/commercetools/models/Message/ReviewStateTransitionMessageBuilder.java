package com.commercetools.models.message;

import com.commercetools.models.common.Reference;
import com.commercetools.models.message.Message;
import com.commercetools.models.state.StateReference;
import java.lang.Boolean;
import com.commercetools.models.message.ReviewStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewStateTransitionMessageBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.Long sequenceNumber;
   
   
   private com.commercetools.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.lang.Long resourceVersion;
   
   
   private java.lang.String type;
   
   
   private java.lang.Boolean newIncludedInStatistics;
   
   
   private com.commercetools.models.state.StateReference oldState;
   
   
   private java.lang.Boolean force;
   
   
   private java.lang.Boolean oldIncludedInStatistics;
   
   
   private com.commercetools.models.state.StateReference newState;
   
   
   private com.commercetools.models.common.Reference target;
   
   public ReviewStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder newIncludedInStatistics( final java.lang.Boolean newIncludedInStatistics) {
      this.newIncludedInStatistics = newIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder oldState( final com.commercetools.models.state.StateReference oldState) {
      this.oldState = oldState;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder oldIncludedInStatistics( final java.lang.Boolean oldIncludedInStatistics) {
      this.oldIncludedInStatistics = oldIncludedInStatistics;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder newState( final com.commercetools.models.state.StateReference newState) {
      this.newState = newState;
      return this;
   }
   
   public ReviewStateTransitionMessageBuilder target( final com.commercetools.models.common.Reference target) {
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
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.models.state.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public java.lang.Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public com.commercetools.models.state.StateReference getNewState(){
      return this.newState;
   }
   
   
   public com.commercetools.models.common.Reference getTarget(){
      return this.target;
   }

   public ReviewStateTransitionMessage build() {
       return new ReviewStateTransitionMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, newIncludedInStatistics, oldState, force, oldIncludedInStatistics, newState, target);
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
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.newIncludedInStatistics = template.getNewIncludedInStatistics();
      builder.oldState = template.getOldState();
      builder.force = template.getForce();
      builder.oldIncludedInStatistics = template.getOldIncludedInStatistics();
      builder.newState = template.getNewState();
      builder.target = template.getTarget();
      return builder;
   }
   
}