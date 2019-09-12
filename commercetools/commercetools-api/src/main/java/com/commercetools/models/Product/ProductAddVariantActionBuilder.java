package com.commercetools.models.Product;

import com.commercetools.models.Common.Asset;
import com.commercetools.models.Common.Image;
import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.Attribute;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductAddVariantAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductAddVariantActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Asset> assets;
   
   @Nullable
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.PriceDraft> prices;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String key;
   
   public ProductAddVariantActionBuilder images(@Nullable final java.util.List<com.commercetools.models.Common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductAddVariantActionBuilder assets(@Nullable final java.util.List<com.commercetools.models.Common.Asset> assets) {
      this.assets = assets;
      return this;
   }
   
   public ProductAddVariantActionBuilder attributes(@Nullable final java.util.List<com.commercetools.models.Product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductAddVariantActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddVariantActionBuilder prices(@Nullable final java.util.List<com.commercetools.models.Common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductAddVariantActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductAddVariantActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Image> getImages(){
      return this.images;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Asset> getAssets(){
      return this.assets;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
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

   public ProductAddVariantAction build() {
       return new ProductAddVariantActionImpl(images, assets, attributes, staged, prices, sku, key);
   }
   
   public static ProductAddVariantActionBuilder of() {
      return new ProductAddVariantActionBuilder();
   }
   
   public static ProductAddVariantActionBuilder of(final ProductAddVariantAction template) {
      ProductAddVariantActionBuilder builder = new ProductAddVariantActionBuilder();
      builder.images = template.getImages();
      builder.assets = template.getAssets();
      builder.attributes = template.getAttributes();
      builder.staged = template.getStaged();
      builder.prices = template.getPrices();
      builder.sku = template.getSku();
      builder.key = template.getKey();
      return builder;
   }
   
}