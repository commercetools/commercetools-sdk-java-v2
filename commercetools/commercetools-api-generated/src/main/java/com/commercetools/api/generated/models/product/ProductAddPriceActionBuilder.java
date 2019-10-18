package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductAddPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductAddPriceActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.PriceDraft price;
   
   @Nullable
   private Boolean staged;
   
   @Nullable
   private Long variantId;
   
   @Nullable
   private String sku;
   
   public ProductAddPriceActionBuilder price( final com.commercetools.api.generated.models.common.PriceDraft price) {
      this.price = price;
      return this;
   }
   
   public ProductAddPriceActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddPriceActionBuilder variantId(@Nullable final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductAddPriceActionBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.PriceDraft getPrice(){
      return this.price;
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