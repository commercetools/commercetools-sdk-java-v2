package com.commercetools.models.Message;

import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Message.ProductPriceExternalDiscountSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPriceExternalDiscountSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.models.Common.DiscountedPrice discounted;
   
   
   private java.lang.Boolean staged;
   
   
   private java.lang.Integer variantId;
   
   
   private java.lang.String priceId;
   
   @Nullable
   private java.lang.String sku;
   
   @Nullable
   private java.lang.String variantKey;
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder discounted(@Nullable final com.commercetools.models.Common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder staged( final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder variantId( final java.lang.Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder priceId( final java.lang.String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder variantKey(@Nullable final java.lang.String variantKey) {
      this.variantKey = variantKey;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.DiscountedPrice getDiscounted(){
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

   public ProductPriceExternalDiscountSetMessagePayload build() {
       return new ProductPriceExternalDiscountSetMessagePayloadImpl(discounted, staged, variantId, priceId, sku, variantKey);
   }
   
   public static ProductPriceExternalDiscountSetMessagePayloadBuilder of() {
      return new ProductPriceExternalDiscountSetMessagePayloadBuilder();
   }
   
   public static ProductPriceExternalDiscountSetMessagePayloadBuilder of(final ProductPriceExternalDiscountSetMessagePayload template) {
      ProductPriceExternalDiscountSetMessagePayloadBuilder builder = new ProductPriceExternalDiscountSetMessagePayloadBuilder();
      builder.discounted = template.getDiscounted();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      builder.priceId = template.getPriceId();
      builder.sku = template.getSku();
      builder.variantKey = template.getVariantKey();
      return builder;
   }
   
}