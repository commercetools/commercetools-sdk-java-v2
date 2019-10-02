package com.commercetools.models.product;

import com.commercetools.models.common.AssetDraft;
import com.commercetools.models.common.Image;
import com.commercetools.models.common.PriceDraft;
import com.commercetools.models.product.Attribute;
import com.commercetools.models.product.ProductVariantDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.AssetDraft> assets;
   
   @Nullable
   private java.util.List<com.commercetools.models.product.Attribute> attributes;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.PriceDraft> prices;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String key;
   
   public ProductVariantDraftBuilder images(@Nullable final java.util.List<com.commercetools.models.common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductVariantDraftBuilder assets(@Nullable final java.util.List<com.commercetools.models.common.AssetDraft> assets) {
      this.assets = assets;
      return this;
   }
   
   public ProductVariantDraftBuilder attributes(@Nullable final java.util.List<com.commercetools.models.product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductVariantDraftBuilder prices(@Nullable final java.util.List<com.commercetools.models.common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductVariantDraftBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductVariantDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.Image> getImages(){
      return this.images;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.AssetDraft> getAssets(){
      return this.assets;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public ProductVariantDraft build() {
       return new ProductVariantDraftImpl(images, assets, attributes, prices, sku, key);
   }
   
   public static ProductVariantDraftBuilder of() {
      return new ProductVariantDraftBuilder();
   }
   
   public static ProductVariantDraftBuilder of(final ProductVariantDraft template) {
      ProductVariantDraftBuilder builder = new ProductVariantDraftBuilder();
      builder.images = template.getImages();
      builder.assets = template.getAssets();
      builder.attributes = template.getAttributes();
      builder.prices = template.getPrices();
      builder.sku = template.getSku();
      builder.key = template.getKey();
      return builder;
   }
   
}