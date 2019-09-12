package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Product.ProductVariant;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Message.ProductVariantDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductVariantDeletedMessagePayloadBuilder {
   
   
   private java.util.List<java.lang.Object> removedImageUrls;
   
   
   private com.commercetools.models.Product.ProductVariant variant;
   
   public ProductVariantDeletedMessagePayloadBuilder removedImageUrls( final java.util.List<java.lang.Object> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductVariantDeletedMessagePayloadBuilder variant( final com.commercetools.models.Product.ProductVariant variant) {
      this.variant = variant;
      return this;
   }
   
   
   public java.util.List<java.lang.Object> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.Product.ProductVariant getVariant(){
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