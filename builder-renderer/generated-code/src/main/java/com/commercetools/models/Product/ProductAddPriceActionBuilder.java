package com.commercetools.models.Product;

import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductAddPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductAddPriceActionBuilder {
   
   
   private com.commercetools.models.Common.PriceDraft price;
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductAddPriceActionBuilder price( final com.commercetools.models.Common.PriceDraft price) {
      this.price = price;
      return this;
   }
   
   public ProductAddPriceActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddPriceActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductAddPriceActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public com.commercetools.models.Common.PriceDraft getPrice(){
      return this.price;
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
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductAddPriceAction build() {
       return new ProductAddPriceActionImpl(price, staged, variantId, sku);
   }
   
   public static ProductAddPriceActionBuilder of() {
      return new ProductAddPriceActionBuilder();
   }
   
   public static ProductAddPriceActionBuilder of(final ProductAddPriceAction template) {
      ProductAddPriceActionBuilder builder = new ProductAddPriceActionBuilder();
      builder.price = template.getPrice();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.sku = template.getSku();
      return builder;
   }
   
}