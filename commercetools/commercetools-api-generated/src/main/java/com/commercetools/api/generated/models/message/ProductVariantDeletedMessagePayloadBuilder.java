package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.product.ProductVariant;
import com.commercetools.api.generated.models.message.ProductVariantDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantDeletedMessagePayloadBuilder {
   
   
   private java.util.List<Object> removedImageUrls;
   
   
   private com.commercetools.api.generated.models.product.ProductVariant variant;
   
   public ProductVariantDeletedMessagePayloadBuilder removedImageUrls( final java.util.List<Object> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductVariantDeletedMessagePayloadBuilder variant( final com.commercetools.api.generated.models.product.ProductVariant variant) {
      this.variant = variant;
      return this;
   }
   
   
   public java.util.List<Object> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductVariant getVariant(){
      return this.variant;
   }

   public ProductVariantDeletedMessagePayload build() {
       return new ProductVariantDeletedMessagePayloadImpl(removedImageUrls, variant);
   }
   
   public static ProductVariantDeletedMessagePayloadBuilder of() {
      return new ProductVariantDeletedMessagePayloadBuilder();
   }
   
   public static ProductVariantDeletedMessagePayloadBuilder of(final ProductVariantDeletedMessagePayload template) {
      ProductVariantDeletedMessagePayloadBuilder builder = new ProductVariantDeletedMessagePayloadBuilder();
      builder.removedImageUrls = template.getRemovedImageUrls();
      builder.variant = template.getVariant();
      return builder;
   }
   
}