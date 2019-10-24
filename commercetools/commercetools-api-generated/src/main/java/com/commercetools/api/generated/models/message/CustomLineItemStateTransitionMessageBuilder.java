package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.message.CustomLineItemStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemStateTransitionMessageBuilder {
   
   
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
   
   
   private com.commercetools.api.generated.models.state.StateReference toState;
   
   
   private com.commercetools.api.generated.models.state.StateReference fromState;
   
   
   private String customLineItemId;
   
   
   private Long quantity;
   
   
   private java.time.ZonedDateTime transitionDate;
   
   public CustomLineItemStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder toState( final com.commercetools.api.generated.models.state.StateReference toState) {
      this.toState = toState;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder fromState( final com.commercetools.api.generated.models.state.StateReference fromState) {
      this.fromState = fromState;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder quantity( final Long quantity) {
      this.quantity = quantity;
      return this;
   }
   
   public CustomLineItemStateTransitionMessageBuilder transitionDate( final java.time.ZonedDateTime transitionDate) {
      this.transitionDate = transitionDate;
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
   
   
   public com.commercetools.api.generated.models.state.StateReference getToState(){
      return this.toState;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getFromState(){
      return this.fromState;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public Long getQuantity(){
      return this.quantity;
   }
   
   
   public java.time.ZonedDateTime getTransitionDate(){
      return this.transitionDate;
   }

   public CustomLineItemStateTransitionMessage build() {
       return new CustomLineItemStateTransitionMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, toState, fromState, customLineItemId, quantity, transitionDate);
   }
   
   public static CustomLineItemStateTransitionMessageBuilder of() {
      return new CustomLineItemStateTransitionMessageBuilder();
   }
   
   public static CustomLineItemStateTransitionMessageBuilder of(final CustomLineItemStateTransitionMessage template) {
      CustomLineItemStateTransitionMessageBuilder builder = new CustomLineItemStateTransitionMessageBuilder();
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
      builder.toState = template.getToState();
      builder.fromState = template.getFromState();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.quantity = template.getQuantity();
      builder.transitionDate = template.getTransitionDate();
      return builder;
   }
   
}