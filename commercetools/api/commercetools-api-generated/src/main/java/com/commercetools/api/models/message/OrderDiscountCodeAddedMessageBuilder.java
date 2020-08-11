package com.commercetools.api.models.message;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDiscountCodeAddedMessageBuilder {


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


   private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

   public OrderDiscountCodeAddedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }

   public OrderDiscountCodeAddedMessageBuilder discountCode( final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
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


   public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public OrderDiscountCodeAddedMessage build() {
       return new OrderDiscountCodeAddedMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, discountCode);
   }

   public static OrderDiscountCodeAddedMessageBuilder of() {
      return new OrderDiscountCodeAddedMessageBuilder();
   }

   public static OrderDiscountCodeAddedMessageBuilder of(final OrderDiscountCodeAddedMessage template) {
      OrderDiscountCodeAddedMessageBuilder builder = new OrderDiscountCodeAddedMessageBuilder();
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
      builder.discountCode = template.getDiscountCode();
      return builder;
   }

}
