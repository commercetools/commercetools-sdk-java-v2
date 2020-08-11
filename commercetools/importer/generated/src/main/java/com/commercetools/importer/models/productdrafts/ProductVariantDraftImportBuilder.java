package com.commercetools.importer.models.productdrafts;

import com.commercetools.importer.models.common.Asset;
import com.commercetools.importer.models.common.Image;
import com.commercetools.importer.models.productdrafts.PriceDraftImport;
import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productdrafts.ProductVariantDraftImport;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantDraftImportBuilder {
   
   @Nullable
   private String sku;
   
   @Nullable
   private String key;
   
   @Nullable
   private java.util.List<com.commercetools.importer.models.productdrafts.PriceDraftImport> prices;
   
   @Nullable
   private java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes;
   
   @Nullable
   private java.util.List<com.commercetools.importer.models.common.Image> images;
   
   @Nullable
   private java.util.List<com.commercetools.importer.models.common.Asset> assets;
   
   public ProductVariantDraftImportBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductVariantDraftImportBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ProductVariantDraftImportBuilder prices(@Nullable final java.util.List<com.commercetools.importer.models.productdrafts.PriceDraftImport> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductVariantDraftImportBuilder attributes(@Nullable final java.util.List<com.commercetools.importer.models.productvariants.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   public ProductVariantDraftImportBuilder images(@Nullable final java.util.List<com.commercetools.importer.models.common.Image> images) {
      this.images = images;
      return this;
   }
   
   public ProductVariantDraftImportBuilder assets(@Nullable final java.util.List<com.commercetools.importer.models.common.Asset> assets) {
      this.assets = assets;
      return this;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public java.util.List<com.commercetools.importer.models.productdrafts.PriceDraftImport> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public java.util.List<com.commercetools.importer.models.productvariants.Attribute> getAttributes(){
      return this.attributes;
   }
   
   @Nullable
   public java.util.List<com.commercetools.importer.models.common.Image> getImages(){
      return this.images;
   }
   
   @Nullable
   public java.util.List<com.commercetools.importer.models.common.Asset> getAssets(){
      return this.assets;
   }

   public ProductVariantDraftImport build() {
       return new ProductVariantDraftImportImpl(sku, key, prices, attributes, images, assets);
   }
   
   public static ProductVariantDraftImportBuilder of() {
      return new ProductVariantDraftImportBuilder();
   }
   
   public static ProductVariantDraftImportBuilder of(final ProductVariantDraftImport template) {
      ProductVariantDraftImportBuilder builder = new ProductVariantDraftImportBuilder();
      builder.sku = template.getSku();
      builder.key = template.getKey();
      builder.prices = template.getPrices();
      builder.attributes = template.getAttributes();
      builder.images = template.getImages();
      builder.assets = template.getAssets();
      return builder;
   }
   
}