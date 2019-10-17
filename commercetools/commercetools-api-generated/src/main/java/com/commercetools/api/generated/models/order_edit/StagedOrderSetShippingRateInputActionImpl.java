package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ShippingRateInputDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderSetShippingRateInputActionImpl implements StagedOrderSetShippingRateInputAction {

   private String action;
   
   private com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput;

   @JsonCreator
   StagedOrderSetShippingRateInputActionImpl(@JsonProperty("shippingRateInput") final com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      this.action = "setShippingRateInput";
   }
   public StagedOrderSetShippingRateInputActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }

   public void setShippingRateInput(final com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }

}