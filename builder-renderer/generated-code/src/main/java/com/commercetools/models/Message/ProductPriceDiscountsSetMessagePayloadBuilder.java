package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice;
import java.lang.String;
import com.commercetools.models.Message.ProductPriceDiscountsSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPriceDiscountsSetMessagePayloadBuilder {
   
   
   private java.util.List<com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;
   
   public ProductPriceDiscountsSetMessagePayloadBuilder updatedPrices( final java.util.List<com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
      this.updatedPrices = updatedPrices;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
      return this.updatedPrices;
   }

   public ProductPriceDiscountsSetMessagePayload build() {
       return new ProductPriceDiscountsSetMessagePayloadImpl(updatedPrices);
   }
   
   public static ProductPriceDiscountsSetMessagePayloadBuilder of() {
      return new ProductPriceDiscountsSetMessagePayloadBuilder();
   }
   
   public static ProductPriceDiscountsSetMessagePayloadBuilder of(final ProductPriceDiscountsSetMessagePayload template) {
      ProductPriceDiscountsSetMessagePayloadBuilder builder = new ProductPriceDiscountsSetMessagePayloadBuilder();
      builder.updatedPrices = template.getUpdatedPrices();
      return builder;
   }
   
}