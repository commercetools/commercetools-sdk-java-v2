package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductSetPricesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetPricesActionBuilder {
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   
   private java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices;
   
   @Nullable
   private String sku;
   
   public ProductSetPricesActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetPricesActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductSetPricesActionBuilder prices( final java.util.List<com.commercetools.api.generated.models.common.PriceDraft> prices) {
      this.prices = prices;
      return this;
   }
   
   public ProductSetPricesActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.PriceDraft> getPrices(){
      return this.prices;
   }
   
   @Nullable
   public String getSku(){
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