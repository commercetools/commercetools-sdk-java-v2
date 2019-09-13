package com.commercetools.models.message;

import com.commercetools.models.cart.ShippingRateInput;
import com.commercetools.models.message.MessagePayload;
import java.lang.String;
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
public final class OrderShippingRateInputSetMessagePayloadImpl implements OrderShippingRateInputSetMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.cart.ShippingRateInput shippingRateInput;
   
   private com.commercetools.models.cart.ShippingRateInput oldShippingRateInput;

   @JsonCreator
   OrderShippingRateInputSetMessagePayloadImpl(@JsonProperty("shippingRateInput") final com.commercetools.models.cart.ShippingRateInput shippingRateInput, @JsonProperty("oldShippingRateInput") final com.commercetools.models.cart.ShippingRateInput oldShippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      this.oldShippingRateInput = oldShippingRateInput;
      this.type = "OrderShippingRateInputSet";
   }
   public OrderShippingRateInputSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.models.cart.ShippingRateInput getOldShippingRateInput(){
      return this.oldShippingRateInput;
   }

   public void setShippingRateInput(final com.commercetools.models.cart.ShippingRateInput shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setOldShippingRateInput(final com.commercetools.models.cart.ShippingRateInput oldShippingRateInput){
      this.oldShippingRateInput = oldShippingRateInput;
   }

}