package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.message.ProductRevertedStagedChangesMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRevertedStagedChangesMessagePayloadBuilder {
   
   
   private java.util.List<java.lang.Object> removedImageUrls;
   
   public ProductRevertedStagedChangesMessagePayloadBuilder removedImageUrls( final java.util.List<java.lang.Object> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      return this;
   }
   
   
   public java.util.List<java.lang.Object> getRemovedImageUrls(){
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