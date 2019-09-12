package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
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
public final class MyCartRemoveItemShippingAddressActionImpl implements MyCartRemoveItemShippingAddressAction {

   private java.lang.String action;
   
   private java.lang.String addressKey;

   @JsonCreator
   MyCartRemoveItemShippingAddressActionImpl(@JsonProperty("addressKey") final java.lang.String addressKey) {
      this.addressKey = addressKey;
      this.action = "removeItemShippingAddress";
   }
   public MyCartRemoveItemShippingAddressActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAddressKey(){
      return this.addressKey;
   }

   public void setAddressKey(final java.lang.String addressKey){
      this.addressKey = addressKey;
   }

}