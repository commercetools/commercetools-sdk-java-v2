package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderRemoveItemShippingAddressActionImpl implements StagedOrderRemoveItemShippingAddressAction {

   private String action;
   
   private String addressKey;

   @JsonCreator
   StagedOrderRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final String addressKey) {
      this.addressKey = addressKey;
      this.action = "removeItemShippingAddress";
   }
   public StagedOrderRemoveItemShippingAddressActionImpl() {
      
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