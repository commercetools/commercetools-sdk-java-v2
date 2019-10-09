package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice;
import com.commercetools.models.message.ProductPriceDiscountsSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPriceDiscountsSetMessagePayloadBuilder {
   
   
   private java.util.List<com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;
   
   public ProductPriceDiscountsSetMessagePayloadBuilder updatedPrices( final java.util.List<com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
      this.updatedPrices = updatedPrices;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
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