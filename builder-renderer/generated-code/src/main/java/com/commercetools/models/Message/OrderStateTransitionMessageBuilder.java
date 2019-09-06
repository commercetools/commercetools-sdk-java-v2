package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import com.commercetools.models.Message.OrderStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderStateTransitionMessageBuilder {
   
   
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
   
   
   private java.lang.Boolean force;
   
   
   private com.commercetools.models.State.StateReference state;
   
   public OrderStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder force( final java.lang.Boolean force) {
      this.force = force;
      return this;
   }
   
   public OrderStateTransitionMessageBuilder state( final com.commercetools.models.State.StateReference state) {
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
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }

   public OrderStateTransitionMessage build() {
       return new OrderStateTransitionMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, force, state);
   }
   
   public static OrderStateTransitionMessageBuilder of() {
      return new OrderStateTransitionMessageBuilder();
   }
   
   public static OrderStateTransitionMessageBuilder of(final OrderStateTransitionMessage template) {
      OrderStateTransitionMessageBuilder builder = new OrderStateTransitionMessageBuilder();
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