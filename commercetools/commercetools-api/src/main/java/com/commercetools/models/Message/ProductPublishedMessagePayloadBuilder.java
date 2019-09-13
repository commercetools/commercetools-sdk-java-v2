package com.commercetools.models.message;

import com.commercetools.models.cart.ProductPublishScope;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.product.ProductProjection;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.message.ProductPublishedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPublishedMessagePayloadBuilder {
   
   
   private java.util.List<java.lang.Object> removedImageUrls;
   
   
   private com.commercetools.models.product.ProductProjection productProjection;
   
   
   private com.commercetools.models.cart.ProductPublishScope scope;
   
   public ProductPublishedMessagePayloadBuilder removedImageUrls( final java.util.List<java.lang.Object> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   public ProductPublishedMessagePayloadBuilder productProjection( final com.commercetools.models.product.ProductProjection productProjection) {
      this.productProjection = productProjection;
      return this;
   }
   
   public ProductPublishedMessagePayloadBuilder scope( final com.commercetools.models.cart.ProductPublishScope scope) {
      this.scope = scope;
      return this;
   }
   
   
   public java.util.List<java.lang.Object> getRemovedImageUrls(){
      return this.removedImageUrls;
   }
   
   
   public com.commercetools.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }
   
   
   public com.commercetools.models.cart.ProductPublishScope getScope(){
      return this.scope;
   }

   public ProductPublishedMessagePayload build() {
       return new ProductPublishedMessagePayloadImpl(removedImageUrls, productProjection, scope);
   }
   
   public static ProductPublishedMessagePayloadBuilder of() {
      return new ProductPublishedMessagePayloadBuilder();
   }
   
   public static ProductPublishedMessagePayloadBuilder of(final ProductPublishedMessagePayload template) {
      ProductPublishedMessagePayloadBuilder builder = new ProductPublishedMessagePayloadBuilder();
      builder.removedImageUrls = template.getRemovedImageUrls();
      builder.productProjection = template.getProductProjection();
      builder.scope = template.getScope();
      return builder;
   }
   
}