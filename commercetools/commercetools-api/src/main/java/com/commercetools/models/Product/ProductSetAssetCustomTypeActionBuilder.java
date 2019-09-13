package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.product.ProductSetAssetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetAssetCustomTypeActionBuilder {
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.Object fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String assetKey;
   
   public ProductSetAssetCustomTypeActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder fields(@Nullable final java.lang.Object fields) {
      this.fields = fields;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   @Nullable
   public java.lang.Object getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public ProductSetAssetCustomTypeAction build() {
       return new ProductSetAssetCustomTypeActionImpl(assetId, staged, variantId, fields, type, sku, assetKey);
   }
   
   public static ProductSetAssetCustomTypeActionBuilder of() {
      return new ProductSetAssetCustomTypeActionBuilder();
   }
   
   public static ProductSetAssetCustomTypeActionBuilder of(final ProductSetAssetCustomTypeAction template) {
      ProductSetAssetCustomTypeActionBuilder builder = new ProductSetAssetCustomTypeActionBuilder();
      builder.assetId = template.getAssetId();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.sku = template.getSku();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}