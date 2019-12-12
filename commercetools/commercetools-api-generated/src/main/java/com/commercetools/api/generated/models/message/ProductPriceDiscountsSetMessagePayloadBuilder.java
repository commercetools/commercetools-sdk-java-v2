package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPriceDiscountsSetMessagePayloadBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;
   
   public ProductPriceDiscountsSetMessagePayloadBuilder updatedPrices( final java.util.List<com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
      this.updatedPrices = updatedPrices;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
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