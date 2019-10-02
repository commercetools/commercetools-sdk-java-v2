package com.commercetools.models.message;

import com.commercetools.models.common.DiscountedPrice;
import com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPriceDiscountsSetUpdatedPriceBuilder {
   
   @Nullable
   private com.commercetools.models.common.DiscountedPrice discounted;
   
   
   private Boolean staged;
   
   
   private Integer variantId;
   
   
   private String priceId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String variantKey;
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(@Nullable final com.commercetools.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductPriceDiscountsSetUpdatedPriceBuilder variantKey(@Nullable final String variantKey) {
      this.variantKey = variantKey;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.DiscountedPrice getDiscounted(){
      return this.discounted;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }
   
   
   public String getPriceId(){
      return this.priceId;
   }
   
   @Nullable
   public String getSku(){
      return this.sku;
   }
   
   @Nullable
   public String getVariantKey(){
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