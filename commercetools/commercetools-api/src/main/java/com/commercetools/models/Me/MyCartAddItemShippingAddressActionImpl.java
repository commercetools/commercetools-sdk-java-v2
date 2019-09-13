package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyCartUpdateAction;
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
public final class MyCartAddItemShippingAddressActionImpl implements MyCartAddItemShippingAddressAction {

   private java.lang.String action;
   
   private com.commercetools.models.common.Address address;

   @JsonCreator
   MyCartAddItemShippingAddressActionImpl(@JsonProperty("address") final com.commercetools.models.common.Address address) {
      this.address = address;
      this.action = "addItemShippingAddress";
   }
   public MyCartAddItemShippingAddressActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public void setAddress(final com.commercetools.models.common.Address address){
      this.address = address;
   }

}