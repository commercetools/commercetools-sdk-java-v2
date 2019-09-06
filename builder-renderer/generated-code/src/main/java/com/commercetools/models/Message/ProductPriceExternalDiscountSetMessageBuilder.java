package com.commercetools.models.Message;

import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Message.Message;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Message.ProductPriceExternalDiscountSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPriceExternalDiscountSetMessageBuilder {
   
   
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
   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   
   private java.lang.Boolean staged;
   
   
   private java.lang.Integer variantId;
   
   
   private java.lang.String priceId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String variantKey;
   
   public ProductPriceExternalDiscountSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder sequenceNumber( final java.lang.Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder resourceVersion( final java.lang.Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder type( final java.lang.String type) {
      this.type = type;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder discounted(@Nullable final com.commercetools.models.Common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder staged( final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder variantId( final java.lang.Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder variantKey(@Nullable final java.lang.String variantKey) {
      this.variantKey = variantKey;
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
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public java.lang.String getVariantKey(){
      return this.variantKey;
   }

   public ProductPriceExternalDiscountSetMessage build() {
       return new ProductPriceExternalDiscountSetMessageImpl(createdAt, lastModifiedAt, id, version, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, type, discounted, staged, variantId, priceId, sku, variantKey);
   }
   
   public static ProductPriceExternalDiscountSetMessageBuilder of() {
      return new ProductPriceExternalDiscountSetMessageBuilder();
   }
   
   public static ProductPriceExternalDiscountSetMessageBuilder of(final ProductPriceExternalDiscountSetMessage template) {
      ProductPriceExternalDiscountSetMessageBuilder builder = new ProductPriceExternalDiscountSetMessageBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.type = template.getType();
      builder.discounted = template.getDiscounted();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.priceId = template.getPriceId();
      builder.sku = template.getSku();
      builder.variantKey = template.getVariantKey();
      return builder;
   }
   
}