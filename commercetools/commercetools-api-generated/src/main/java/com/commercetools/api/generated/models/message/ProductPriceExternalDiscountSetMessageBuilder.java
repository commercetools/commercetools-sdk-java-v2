package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessage;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPriceExternalDiscountSetMessageBuilder {
   
   
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
   
   @Nullable
   private com.commercetools.api.generated.models.common.DiscountedPrice discounted;
   
   
   private Boolean staged;
   
   
   private Integer variantId;
   
   
   private String priceId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String variantKey;
   
   public ProductPriceExternalDiscountSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
      this.sequenceNumber = sequenceNumber;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder resourceVersion( final Long resourceVersion) {
      this.resourceVersion = resourceVersion;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder discounted(@Nullable final com.commercetools.api.generated.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessageBuilder variantKey(@Nullable final String variantKey) {
      this.variantKey = variantKey;
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
   
   @Nullable
   public com.commercetools.api.generated.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getVariantKey(){
      return this.variantKey;
   }

   public ProductPriceExternalDiscountSetMessage build() {
       return new ProductPriceExternalDiscountSetMessageImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, sequenceNumber, resource, resourceUserProvidedIdentifiers, resourceVersion, discounted, staged, variantId, priceId, sku, variantKey);
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
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.sequenceNumber = template.getSequenceNumber();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.resourceVersion = template.getResourceVersion();
      builder.discounted = template.getDiscounted();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.priceId = template.getPriceId();
      builder.sku = template.getSku();
      builder.variantKey = template.getVariantKey();
      return builder;
   }
   
}