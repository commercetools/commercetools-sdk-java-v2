package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.Asset;
import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.common.Price;
import com.commercetools.api.generated.models.common.ScopedPrice;
import com.commercetools.api.generated.models.product.Attribute;
import com.commercetools.api.generated.models.product.ProductVariantAvailability;
import com.commercetools.api.generated.models.product.ProductVariant;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.ScopedPrice scopedPrice;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Asset> assets;
   
   @Nullable
   private Boolean isMatchingVariant;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Price price;
   
   @Nullable
   private Boolean scopedPriceDiscounted;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes;
   
   @Nullable
   private com.commercetools.api.generated.models.product.ProductVariantAvailability availability;
   
   
   private Long id;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Price> prices;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String key;
   
   public ProductVariantBuilder scopedPrice(@Nullable final com.commercetools.api.generated.models.common.ScopedPrice scopedPrice) {
      this.scopedPrice = scopedPrice;
      return this;
   }
   
   public ProductVariantBuilder images(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductVariantBuilder assets(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Asset> assets) {
      this.assets = assets;
      return this;
   }
   
   public ProductVariantBuilder isMatchingVariant(@Nullable final Boolean isMatchingVariant) {
      this.isMatchingVariant = isMatchingVariant;
      return this;
   }
   
   public ProductVariantBuilder price(@Nullable final com.commercetools.api.generated.models.common.Price price) {
      this.price = price;
      return this;
   }
   
   public ProductVariantBuilder scopedPriceDiscounted(@Nullable final Boolean scopedPriceDiscounted) {
      this.scopedPriceDiscounted = scopedPriceDiscounted;
      return this;
   }
   
   public ProductVariantBuilder attributes(@Nullable final java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductVariantBuilder availability(@Nullable final com.commercetools.api.generated.models.product.ProductVariantAvailability availability) {
      this.availability = availability;
      return this;
   }
   
   public ProductVariantBuilder id( final Long id) {
      this.id = id;
      return this;
   }
   
   public ProductVariantBuilder prices(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Price> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductVariantBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductVariantBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.ScopedPrice getScopedPrice(){
      return this.scopedPrice;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.Image> getImages(){
      return this.images;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   @Nullable
   public Boolean getIsMatchingVariant(){
      return this.isMatchingVariant;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Price getPrice(){
      return this.price;
   }
   
   @Nullable
   public Boolean getScopedPriceDiscounted(){
      return this.scopedPriceDiscounted;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.product.ProductVariantAvailability getAvailability(){
      return this.availability;
   }
   
   
   public Long getId(){
      return this.id;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.Price> getPrices(){
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