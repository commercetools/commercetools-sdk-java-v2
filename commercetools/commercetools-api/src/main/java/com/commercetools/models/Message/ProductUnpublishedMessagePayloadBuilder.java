package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import com.commercetools.models.Message.ProductUnpublishedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductUnpublishedMessagePayloadBuilder {
   
   
   

   public ProductUnpublishedMessagePayload build() {
       return new ProductUnpublishedMessagePayloadImpl();
   }
   
   public static ProductUnpublishedMessagePayloadBuilder of() {
      return new ProductUnpublishedMessagePayloadBuilder();
   }
   
   public static ProductUnpublishedMessagePayloadBuilder of(final ProductUnpublishedMessagePayload template) {
      ProductUnpublishedMessagePayloadBuilder builder = new ProductUnpublishedMessagePayloadBuilder();
      return builder;
   }
   
}