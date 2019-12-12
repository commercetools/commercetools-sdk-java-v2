package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.ShippingRateInput;
import com.commercetools.api.generated.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderShippingRateInputSetMessagePayloadImpl implements OrderShippingRateInputSetMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput;
   
   private com.commercetools.api.generated.models.cart.ShippingRateInput oldShippingRateInput;

   @JsonCreator
   OrderShippingRateInputSetMessagePayloadImpl(@JsonProperty("shippingRateInput") final com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput, @JsonProperty("oldShippingRateInput") final com.commercetools.api.generated.models.cart.ShippingRateInput oldShippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      this.oldShippingRateInput = oldShippingRateInput;
      this.type = "OrderShippingRateInputSet";
   }
   public OrderShippingRateInputSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.api.generated.models.cart.ShippingRateInput getOldShippingRateInput(){
      return this.oldShippingRateInput;
   }

   public void setShippingRateInput(final com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setOldShippingRateInput(final com.commercetools.api.generated.models.cart.ShippingRateInput oldShippingRateInput){
      this.oldShippingRateInput = oldShippingRateInput;
   }

}