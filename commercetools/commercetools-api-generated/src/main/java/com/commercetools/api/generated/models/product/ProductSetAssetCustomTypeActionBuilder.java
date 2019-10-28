package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductSetAssetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetAssetCustomTypeActionBuilder {
   
   @Nullable
   private String assetId;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private Object fields;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String assetKey;
   
   public ProductSetAssetCustomTypeActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder fields(@Nullable final Object fields) {
      this.fields = fields;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductSetAssetCustomTypeActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
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
   public Object getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getAssetKey(){
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