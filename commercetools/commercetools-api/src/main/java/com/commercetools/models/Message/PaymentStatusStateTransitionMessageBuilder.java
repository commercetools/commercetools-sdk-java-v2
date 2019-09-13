package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.state.StateReference;
import java.lang.Boolean;
import com.commercetools.models.message.PaymentStatusStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentStatusStateTransitionMessageBuilder {
   
   
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
   
   
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.state.StateReference state;
   
   public PaymentStatusStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public PaymentStatusStateTransitionMessageBuilder state( final com.commercetools.models.state.StateReference state) {
      this.state = state;
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
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }

   public PaymentStatusStateTransitionMessage build() {
       return new PaymentStatusStateTransitionMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, force, state);
   }
   
   public static PaymentStatusStateTransitionMessageBuilder of() {
      return new PaymentStatusStateTransitionMessageBuilder();
   }
   
   public static PaymentStatusStateTransitionMessageBuilder of(final PaymentStatusStateTransitionMessage template) {
      PaymentStatusStateTransitionMessageBuilder builder = new PaymentStatusStateTransitionMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }
   
}