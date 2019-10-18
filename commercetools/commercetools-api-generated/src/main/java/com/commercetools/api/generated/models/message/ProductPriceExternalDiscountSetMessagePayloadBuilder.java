package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceExternalDiscountSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPriceExternalDiscountSetMessagePayloadBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.DiscountedPrice discounted;
   
   
   private Boolean staged;
   
   
   private Integer variantId;
   
   
   private String priceId;
   
   @Nullable
   private String sku;
   
   @Nullable
   private String variantKey;
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder discounted(@Nullable final com.commercetools.api.generated.models.common.DiscountedPrice discounted) {
      this.discounted = discounted;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder priceId( final String priceId) {
      this.priceId = priceId;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder sku(@Nullable final String sku) {
      this.sku = sku;
      return this;
   }
   
   public ProductPriceExternalDiscountSetMessagePayloadBuilder variantKey(@Nullable final String variantKey) {
      this.variantKey = variantKey;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.DiscountedPrice getDiscounted(){
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