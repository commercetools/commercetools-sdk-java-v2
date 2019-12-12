package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.product.ProductProjection;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductCreatedMessagePayloadImpl implements ProductCreatedMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.product.ProductProjection productProjection;

   @JsonCreator
   ProductCreatedMessagePayloadImpl(@JsonProperty("productProjection") final com.commercetools.api.generated.models.product.ProductProjection productProjection) {
      this.productProjection = productProjection;
      this.type = "ProductCreated";
   }
   public ProductCreatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.product.ProductProjection getProductProjection(){
      return this.productProjection;
   }

   public void setProductProjection(final com.commercetools.api.generated.models.product.ProductProjection productProjection){
      this.productProjection = productProjection;
   }

}