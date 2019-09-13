package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.message.ProductPriceDiscountsSetUpdatedPrice;
import com.commercetools.models.message.ProductPriceDiscountsSetMessageImpl;

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
@JsonDeserialize(as = ProductPriceDiscountsSetMessageImpl.class)
public interface ProductPriceDiscountsSetMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("updatedPrices")
   public List<ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices();

   public void setUpdatedPrices(final List<ProductPriceDiscountsSetUpdatedPrice> updatedPrices);
   
   public static ProductPriceDiscountsSetMessageImpl of(){
      return new ProductPriceDiscountsSetMessageImpl();
   }
   

   public static ProductPriceDiscountsSetMessageImpl of(final ProductPriceDiscountsSetMessage template) {
      ProductPriceDiscountsSetMessageImpl instance = new ProductPriceDiscountsSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setUpdatedPrices(template.getUpdatedPrices());
      return instance;
   }

}