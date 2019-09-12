package com.commercetools.models.Product;

import com.commercetools.models.Common.Asset;
import com.commercetools.models.Common.Image;
import com.commercetools.models.Common.Price;
import com.commercetools.models.Common.ScopedPrice;
import com.commercetools.models.Product.Attribute;
import com.commercetools.models.Product.ProductVariantAvailability;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductVariant;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantBuilder {
   
   @Nullable
   private com.commercetools.models.Common.ScopedPrice scopedPrice;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Asset> assets;
   
   @Nullable
   private java.lang.Boolean isMatchingVariant;
   
   @Nullable
   private com.commercetools.models.Common.Price price;
   
   @Nullable
   private java.lang.Boolean scopedPriceDiscounted;
   
   @Nullable
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   @Nullable
   private com.commercetools.models.Product.ProductVariantAvailability availability;
   
   
   private java.lang.Long id;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Price> prices;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String key;
   
   public ProductVariantBuilder scopedPrice(@Nullable final com.commercetools.models.Common.ScopedPrice scopedPrice) {
      this.scopedPrice = scopedPrice;
      return this;
   }
   
   public ProductVariantBuilder images(@Nullable final java.util.List<com.commercetools.models.Common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductVariantBuilder assets(@Nullable final java.util.List<com.commercetools.models.Common.Asset> assets) {
      this.assets = assets;
      return this;
   }
   
   public ProductVariantBuilder isMatchingVariant(@Nullable final java.lang.Boolean isMatchingVariant) {
      this.isMatchingVariant = isMatchingVariant;
      return this;
   }
   
   public ProductVariantBuilder price(@Nullable final com.commercetools.models.Common.Price price) {
      this.price = price;
      return this;
   }
   
   public ProductVariantBuilder scopedPriceDiscounted(@Nullable final java.lang.Boolean scopedPriceDiscounted) {
      this.scopedPriceDiscounted = scopedPriceDiscounted;
      return this;
   }
   
   public ProductVariantBuilder attributes(@Nullable final java.util.List<com.commercetools.models.Product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductVariantBuilder availability(@Nullable final com.commercetools.models.Product.ProductVariantAvailability availability) {
      this.availability = availability;
      return this;
   }
   
   public ProductVariantBuilder id( final java.lang.Long id) {
      this.id = id;
      return this;
   }
   
   public ProductVariantBuilder prices(@Nullable final java.util.List<com.commercetools.models.Common.Price> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductVariantBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductVariantBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.ScopedPrice getScopedPrice(){
      return this.scopedPrice;
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
   public java.lang.Boolean getIsMatchingVariant(){
      return this.isMatchingVariant;
   }
   
   @Nullable
   public com.commercetools.models.Common.Price getPrice(){
      return this.price;
   }
   
   @Nullable
   public java.lang.Boolean getScopedPriceDiscounted(){
      return this.scopedPriceDiscounted;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public com.commercetools.models.Product.ProductVariantAvailability getAvailability(){
      return this.availability;
   }
   
   
   public java.lang.Long getId(){
      return this.id;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Price> getPrices(){
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

   public ProductVariant build() {
       return new ProductVariantImpl(scopedPrice, images, assets, isMatchingVariant, price, scopedPriceDiscounted, attributes, availability, id, prices, sku, key);
   }
   
   public static ProductVariantBuilder of() {
      return new ProductVariantBuilder();
   }
   
   public static ProductVariantBuilder of(final ProductVariant template) {
      ProductVariantBuilder builder = new ProductVariantBuilder();
      builder.scopedPrice = template.getScopedPrice();
      builder.images = template.getImages();
      builder.assets = template.getAssets();
      builder.isMatchingVariant = template.getIsMatchingVariant();
      builder.price = template.getPrice();
      builder.scopedPriceDiscounted = template.getScopedPriceDiscounted();
      builder.attributes = template.getAttributes();
      builder.availability = template.getAvailability();
      builder.id = template.getId();
      builder.prices = template.getPrices();
      builder.sku = template.getSku();
      builder.key = template.getKey();
      return builder;
   }
   
}