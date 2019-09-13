package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.product.ProductProjection;
import java.lang.String;
import com.commercetools.models.message.ProductCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.models.product.ProductProjection productProjection;
   
   public ProductCreatedMessagePayloadBuilder productProjection( final com.commercetools.models.product.ProductProjection productProjection) {
      this.productProjection = productProjection;
      return this;
   }
   
   
   public com.commercetools.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }

   public ProductCreatedMessagePayload build() {
       return new ProductCreatedMessagePayloadImpl(productProjection);
   }
   
   public static ProductCreatedMessagePayloadBuilder of() {
      return new ProductCreatedMessagePayloadBuilder();
   }
   
   public static ProductCreatedMessagePayloadBuilder of(final ProductCreatedMessagePayload template) {
      ProductCreatedMessagePayloadBuilder builder = new ProductCreatedMessagePayloadBuilder();
      builder.productProjection = template.getProductProjection();
      return builder;
   }
   
}