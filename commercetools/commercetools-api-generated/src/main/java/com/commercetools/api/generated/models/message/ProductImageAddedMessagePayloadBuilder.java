package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductImageAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductImageAddedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.common.Image image;
   
   
   private Boolean staged;
   
   
   private Long variantId;
   
   public ProductImageAddedMessagePayloadBuilder image( final com.commercetools.api.generated.models.common.Image image) {
      this.image = image;
      return this;
   }
   
   public ProductImageAddedMessagePayloadBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductImageAddedMessagePayloadBuilder variantId( final Long variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Image getImage(){
      return this.image;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Long getVariantId(){
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