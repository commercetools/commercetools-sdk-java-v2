package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductRevertedStagedChangesMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRevertedStagedChangesMessagePayloadBuilder {
   
   
   private java.util.List<Object> removedImageUrls;
   
   public ProductRevertedStagedChangesMessagePayloadBuilder removedImageUrls( final java.util.List<Object> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   
   public java.util.List<Object> getRemovedImageUrls(){
      return this.removedImageUrls;
   }

   public ProductRevertedStagedChangesMessagePayload build() {
       return new ProductRevertedStagedChangesMessagePayloadImpl(removedImageUrls);
   }
   
   public static ProductRevertedStagedChangesMessagePayloadBuilder of() {
      return new ProductRevertedStagedChangesMessagePayloadBuilder();
   }
   
   public static ProductRevertedStagedChangesMessagePayloadBuilder of(final ProductRevertedStagedChangesMessagePayload template) {
      ProductRevertedStagedChangesMessagePayloadBuilder builder = new ProductRevertedStagedChangesMessagePayloadBuilder();
      builder.removedImageUrls = template.getRemovedImageUrls();
      return builder;
   }
   
}