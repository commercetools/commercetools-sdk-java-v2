package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductPriceDiscountsSetMessagePayloadImpl.class)
public interface ProductPriceDiscountsSetMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("updatedPrices")
   public List<ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices();

   public void setUpdatedPrices(final List<ProductPriceDiscountsSetUpdatedPrice> updatedPrices);
   
   public static ProductPriceDiscountsSetMessagePayloadImpl of(){
      return new ProductPriceDiscountsSetMessagePayloadImpl();
   }
   

   public static ProductPriceDiscountsSetMessagePayloadImpl of(final ProductPriceDiscountsSetMessagePayload template) {
      ProductPriceDiscountsSetMessagePayloadImpl instance = new ProductPriceDiscountsSetMessagePayloadImpl();
      instance.setUpdatedPrices(template.getUpdatedPrices());
      return instance;
   }

}