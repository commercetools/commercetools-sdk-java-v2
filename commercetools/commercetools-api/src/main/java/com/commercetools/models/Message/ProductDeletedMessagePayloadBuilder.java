package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Product.ProductProjection;
import java.lang.String;
import com.commercetools.models.Message.ProductDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDeletedMessagePayloadBuilder {
   
   
   private java.util.List<java.lang.String> removedImageUrls;
   
   
   private com.commercetools.models.Product.ProductProjection currentProjection;
   
   public ProductDeletedMessagePayloadBuilder removedImageUrls( final java.util.List<java.lang.String> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductDeletedMessagePayloadBuilder currentProjection( final com.commercetools.models.Product.ProductProjection currentProjection) {
      this.currentProjection = currentProjection;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.Product.ProductProjection getCurrentProjection(){
      return this.currentProjection;
   }

   public ProductDeletedMessagePayload build() {
       return new ProductDeletedMessagePayloadImpl(removedImageUrls, currentProjection);
   }
   
   public static ProductDeletedMessagePayloadBuilder of() {
      return new ProductDeletedMessagePayloadBuilder();
   }
   
   public static ProductDeletedMessagePayloadBuilder of(final ProductDeletedMessagePayload template) {
      ProductDeletedMessagePayloadBuilder builder = new ProductDeletedMessagePayloadBuilder();
      builder.removedImageUrls = template.getRemovedImageUrls();
      builder.currentProjection = template.getCurrentProjection();
      return builder;
   }
   
}