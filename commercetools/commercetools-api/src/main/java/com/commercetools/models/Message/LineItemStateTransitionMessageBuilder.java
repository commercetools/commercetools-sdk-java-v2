package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.state.StateReference;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.message.LineItemStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class LineItemStateTransitionMessageBuilder {
   
   
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
   
   
   private com.commercetools.models.state.StateReference toState;
   
   
   private com.commercetools.models.state.StateReference fromState;
   
   
   private java.lang.Long quantity;
   
   
   private java.lang.String lineItemId;
   
   
   private java.time.ZonedDateTime transitionDate;
   
   public LineItemStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder toState( final com.commercetools.models.state.StateReference toState) {
      this.toState = toState;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder fromState( final com.commercetools.models.state.StateReference fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder quantity( final java.lang.Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   public LineItemStateTransitionMessageBuilder transitionDate( final java.time.ZonedDateTime transitionDate) {
      this.transitionDate = transitionDate;
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
   
   
   public com.commercetools.models.state.StateReference getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.models.state.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public java.lang.Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.time.ZonedDateTime getTransitionDate(){
      return this.transitionDate;
   }

   public LineItemStateTransitionMessage build() {
       return new LineItemStateTransitionMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, toState, fromState, quantity, lineItemId, transitionDate);
   }
   
   public static LineItemStateTransitionMessageBuilder of() {
      return new LineItemStateTransitionMessageBuilder();
   }
   
   public static LineItemStateTransitionMessageBuilder of(final LineItemStateTransitionMessage template) {
      LineItemStateTransitionMessageBuilder builder = new LineItemStateTransitionMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.quantity = template.getQuantity();
      builder.lineItemId = template.getLineItemId();
      builder.transitionDate = template.getTransitionDate();
      return builder;
   }
   
}