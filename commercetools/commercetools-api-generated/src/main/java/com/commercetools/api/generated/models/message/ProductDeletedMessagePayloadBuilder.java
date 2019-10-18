package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.product.ProductProjection;
import com.commercetools.api.generated.models.message.ProductDeletedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDeletedMessagePayloadBuilder {
   
   
   private java.util.List<String> removedImageUrls;
   
   
   private com.commercetools.api.generated.models.product.ProductProjection currentProjection;
   
   public ProductDeletedMessagePayloadBuilder removedImageUrls( final java.util.List<String> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductDeletedMessagePayloadBuilder currentProjection( final com.commercetools.api.generated.models.product.ProductProjection currentProjection) {
      this.currentProjection = currentProjection;
      return this;
   }
   
   
   public java.util.List<String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductProjection getCurrentProjection(){
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