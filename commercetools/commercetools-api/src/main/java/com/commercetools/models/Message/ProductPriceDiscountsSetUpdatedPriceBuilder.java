package com.commercetools.models.message;

import com.commercetools.models.common.DiscountedPrice;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPriceDiscountsSetUpdatedPriceBuilder {
   
   @Nullable
   private com.commercetools.models.common.DiscountedPrice discounted;
   
   
   private java.lang.Boolean staged;
   
   
   private java.lang.Integer variantId;
   
   
   private java.lang.String priceId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String variantKey;
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(@Nullable final com.commercetools.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder staged( final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder variantId( final java.lang.Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder variantKey(@Nullable final java.lang.String variantKey) {
      this.variantKey = variantKey;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }
   
   
   public java.lang.String getPriceId(){
      return this.priceId;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }
   
   @Nullable
   public java.lang.String getVariantKey(){
      return this.variantKey;
   }

   public ProductPriceDiscountsSetUpdatedPrice build() {
       return new ProductPriceDiscountsSetUpdatedPriceImpl(discounted, staged, variantId, priceId, sku, variantKey);
   }
   
   public static ProductPriceDiscountsSetUpdatedPriceBuilder of() {
      return new ProductPriceDiscountsSetUpdatedPriceBuilder();
   }
   
   public static ProductPriceDiscountsSetUpdatedPriceBuilder of(final ProductPriceDiscountsSetUpdatedPrice template) {
      ProductPriceDiscountsSetUpdatedPriceBuilder builder = new ProductPriceDiscountsSetUpdatedPriceBuilder();
      builder.discounted = template.getDiscounted();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.priceId = template.getPriceId();
      builder.sku = template.getSku();
      builder.variantKey = template.getVariantKey();
      return builder;
   }
   
}