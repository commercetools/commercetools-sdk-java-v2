package com.commercetools.models.order;

import com.commercetools.models.common.Image;
import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.product.Attribute;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.order.ProductVariantImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantImportDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.models.product.Attribute> attributes;
   
   @Nullable
   private java.lang.Long id;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.PriceDraft> prices;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductVariantImportDraftBuilder images(@Nullable final java.util.List<com.commercetools.models.common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductVariantImportDraftBuilder attributes(@Nullable final java.util.List<com.commercetools.models.product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductVariantImportDraftBuilder id(@Nullable final java.lang.Long id) {
      this.id = id;
      return this;
   }
   
   public ProductVariantImportDraftBuilder prices(@Nullable final java.util.List<com.commercetools.models.common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductVariantImportDraftBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.Image> getImages(){
      return this.images;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public java.lang.Long getId(){
      return this.id;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductVariantImportDraft build() {
       return new ProductVariantImportDraftImpl(images, attributes, id, prices, sku);
   }
   
   public static ProductVariantImportDraftBuilder of() {
      return new ProductVariantImportDraftBuilder();
   }
   
   public static ProductVariantImportDraftBuilder of(final ProductVariantImportDraft template) {
      ProductVariantImportDraftBuilder builder = new ProductVariantImportDraftBuilder();
      builder.images = template.getImages();
      builder.attributes = template.getAttributes();
      builder.id = template.getId();
      builder.prices = template.getPrices();
      builder.sku = template.getSku();
      return builder;
   }
   
}