package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.Asset;
import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.Attribute;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductAddVariantAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductAddVariantActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Asset> assets;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String key;
   
   public ProductAddVariantActionBuilder images(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductAddVariantActionBuilder assets(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Asset> assets) {
      this.assets = assets;
      return this;
   }
   
   public ProductAddVariantActionBuilder attributes(@Nullable final java.util.List<com.commercetools.api.generated.models.product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductAddVariantActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddVariantActionBuilder prices(@Nullable final java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductAddVariantActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductAddVariantActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
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
   public java.util.List<com.commercetools.api.generated.models.product.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.PriceDraft> getPrices(){
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