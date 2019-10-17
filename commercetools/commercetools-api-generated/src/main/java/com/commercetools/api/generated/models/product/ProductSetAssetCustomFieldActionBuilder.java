package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetAssetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAssetCustomFieldActionBuilder {
   
   @Nullable
   private String assetId;
   
   
   private String name;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private Object value;
   
   @Nullable
   private String assetKey;
   
   public ProductSetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public ProductSetAssetCustomFieldActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetCustomFieldActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetCustomFieldActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   public ProductSetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }
   
   @Nullable
   public String getAssetKey(){
      return this.assetKey;
   }

   public ProductSetAssetCustomFieldAction build() {
       return new ProductSetAssetCustomFieldActionImpl(assetId, name, staged, variantId, sku, value, assetKey);
   }
   
   public static ProductSetAssetCustomFieldActionBuilder of() {
      return new ProductSetAssetCustomFieldActionBuilder();
   }
   
   public static ProductSetAssetCustomFieldActionBuilder of(final ProductSetAssetCustomFieldAction template) {
      ProductSetAssetCustomFieldActionBuilder builder = new ProductSetAssetCustomFieldActionBuilder();
      builder.assetId = template.getAssetId();
      builder.name = template.getName();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      builder.value = template.getValue();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}