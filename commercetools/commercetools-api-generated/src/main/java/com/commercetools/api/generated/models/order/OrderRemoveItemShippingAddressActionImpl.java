package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
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
public final class OrderRemoveItemShippingAddressActionImpl implements OrderRemoveItemShippingAddressAction {

   private String action;
   
   private String addressKey;

   @JsonCreator
   OrderRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final String addressKey) {
      this.addressKey = addressKey;
      this.action = "removeItemShippingAddress";
   }
   public OrderRemoveItemShippingAddressActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAddressKey(){
      return this.addressKey;
   }

   public void setAddressKey(final String addressKey){
      this.addressKey = addressKey;
   }

}