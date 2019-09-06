package com.commercetools.models.Product;

import com.commercetools.models.Common.PriceDraft;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductSetPricesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetPricesActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long variantId;
   
   
   private java.util.List<com.commercetools.models.Common.PriceDraft> prices;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductSetPricesActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetPricesActionBuilder variantId(@Nullable final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetPricesActionBuilder prices( final java.util.List<com.commercetools.models.Common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductSetPricesActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public java.lang.Long getVariantId(){
      return this.variantId;
   }
   
   
   public java.util.List<com.commercetools.models.Common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductSetPricesAction build() {
       return new ProductSetPricesActionImpl(staged, variantId, prices, sku);
   }
   
   public static ProductSetPricesActionBuilder of() {
      return new ProductSetPricesActionBuilder();
   }
   
   public static ProductSetPricesActionBuilder of(final ProductSetPricesAction template) {
      ProductSetPricesActionBuilder builder = new ProductSetPricesActionBuilder();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.prices = template.getPrices();
      builder.sku = template.getSku();
      return builder;
   }
   
}