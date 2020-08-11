package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.OrderStateTransitionMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderStateTransitionMessageBuilder {


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


   private Boolean force;


   private com.commercetools.api.models.state.StateReference state;

   public OrderStateTransitionMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public OrderStateTransitionMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public OrderStateTransitionMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public OrderStateTransitionMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public OrderStateTransitionMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public OrderStateTransitionMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public OrderStateTransitionMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }

   public OrderStateTransitionMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public OrderStateTransitionMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }

   public OrderStateTransitionMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }

   public OrderStateTransitionMessageBuilder force( final Boolean force) {
      this.force = force;
      return this;
   }

   public OrderStateTransitionMessageBuilder state( final com.commercetools.api.models.state.StateReference state) {
      this.state = state;
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


   public Boolean getForce(){
      return this.force;
   }


   public com.commercetools.api.models.state.StateReference getState(){
      return this.state;
   }

   public OrderStateTransitionMessage build() {
       return new OrderStateTransitionMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, force, state);
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
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.force = template.getForce();
      builder.state = template.getState();
      return builder;
   }

}
