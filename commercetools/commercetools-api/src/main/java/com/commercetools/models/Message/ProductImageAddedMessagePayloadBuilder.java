package com.commercetools.models.Message;

import com.commercetools.models.Common.Image;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Message.ProductImageAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductImageAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Common.Image image;
   
   
   private java.lang.Boolean staged;
   
   
   private java.lang.Long variantId;
   
   public ProductImageAddedMessagePayloadBuilder image( final com.commercetools.models.Common.Image image) {
      this.image = image;
      return this;
   }
   
   public ProductImageAddedMessagePayloadBuilder staged( final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductImageAddedMessagePayloadBuilder variantId( final java.lang.Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public com.commercetools.models.Common.Image getImage(){
      return this.image;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Long getVariantId(){
      return this.variantId;
   }

   public ProductImageAddedMessagePayload build() {
       return new ProductImageAddedMessagePayloadImpl(image, staged, variantId);
   }
   
   public static ProductImageAddedMessagePayloadBuilder of() {
      return new ProductImageAddedMessagePayloadBuilder();
   }
   
   public static ProductImageAddedMessagePayloadBuilder of(final ProductImageAddedMessagePayload template) {
      ProductImageAddedMessagePayloadBuilder builder = new ProductImageAddedMessagePayloadBuilder();
      builder.image = template.getImage();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      return builder;
   }
   
}