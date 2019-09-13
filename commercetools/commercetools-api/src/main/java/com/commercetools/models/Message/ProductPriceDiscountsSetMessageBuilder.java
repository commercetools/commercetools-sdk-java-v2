package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice;
import com.commercetools.models.message.ProductPriceDiscountsSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPriceDiscountsSetMessageBuilder {
   
   
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
   
   
   private java.util.List<com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;
   
   public ProductPriceDiscountsSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ProductPriceDiscountsSetMessageBuilder updatedPrices( final java.util.List<com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
      this.updatedPrices = updatedPrices;
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
   
   
   public java.util.List<com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
      return this.updatedPrices;
   }

   public ProductPriceDiscountsSetMessage build() {
       return new ProductPriceDiscountsSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, updatedPrices);
   }
   
   public static ProductPriceDiscountsSetMessageBuilder of() {
      return new ProductPriceDiscountsSetMessageBuilder();
   }
   
   public static ProductPriceDiscountsSetMessageBuilder of(final ProductPriceDiscountsSetMessage template) {
      ProductPriceDiscountsSetMessageBuilder builder = new ProductPriceDiscountsSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.updatedPrices = template.getUpdatedPrices();
      return builder;
   }
   
}