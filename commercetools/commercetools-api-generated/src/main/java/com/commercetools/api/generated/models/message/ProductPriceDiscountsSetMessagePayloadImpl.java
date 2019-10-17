package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductPriceDiscountsSetMessagePayloadImpl implements ProductPriceDiscountsSetMessagePayload {

   private String type;
   
   private java.util.List<com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

   @JsonCreator
   ProductPriceDiscountsSetMessagePayloadImpl(@JsonProperty("updatedPrices") final java.util.List<com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
      this.updatedPrices = updatedPrices;
      this.type = "ProductPriceDiscountsSet";
   }
   public ProductPriceDiscountsSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
      return this.updatedPrices;
   }

   public void setUpdatedPrices(final java.util.List<com.commercetools.api.generated.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices){
      this.updatedPrices = updatedPrices;
   }

}