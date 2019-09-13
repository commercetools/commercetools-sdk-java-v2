package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ShippingRateInputDraft;
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
public final class CartSetShippingRateInputActionImpl implements CartSetShippingRateInputAction {

   private java.lang.String action;
   
   private com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput;

   @JsonCreator
   CartSetShippingRateInputActionImpl(@JsonProperty("shippingRateInput") final com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      this.action = "setShippingRateInput";
   }
   public CartSetShippingRateInputActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }

   public void setShippingRateInput(final com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }

}