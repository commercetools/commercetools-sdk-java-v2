package com.commercetools.models.Product;

import com.commercetools.models.Common.AssetDraft;
import com.commercetools.models.Common.Image;
import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.Attribute;
import java.lang.String;
import com.commercetools.models.Product.ProductVariantDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.AssetDraft> assets;
   
   @Nullable
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.PriceDraft> prices;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String key;
   
   public ProductVariantDraftBuilder images(@Nullable final java.util.List<com.commercetools.models.Common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductVariantDraftBuilder assets(@Nullable final java.util.List<com.commercetools.models.Common.AssetDraft> assets) {
      this.assets = assets;
      return this;
   }
   
   public ProductVariantDraftBuilder attributes(@Nullable final java.util.List<com.commercetools.models.Product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductVariantDraftBuilder prices(@Nullable final java.util.List<com.commercetools.models.Common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductVariantDraftBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductVariantDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Image> getImages(){
      return this.images;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.AssetDraft> getAssets(){
      return this.assets;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public java.lang.String getKey(){
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