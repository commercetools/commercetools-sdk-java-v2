package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.product.ProductProjection;
import com.commercetools.api.generated.models.message.ProductCreatedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductCreatedMessagePayloadImpl.class)
public interface ProductCreatedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("productProjection")
   public ProductProjection getProductProjection();

   public void setProductProjection(final ProductProjection productProjection);
   
   public static ProductCreatedMessagePayloadImpl of(){
      return new ProductCreatedMessagePayloadImpl();
   }
   

   public static ProductCreatedMessagePayloadImpl of(final ProductCreatedMessagePayload template) {
      ProductCreatedMessagePayloadImpl instance = new ProductCreatedMessagePayloadImpl();
      instance.setProductProjection(template.getProductProjection());
      return instance;
   }

}