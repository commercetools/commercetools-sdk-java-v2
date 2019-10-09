package com.commercetools.models.customer;

import com.commercetools.models.common.Address;
import com.commercetools.models.customer.CustomerUpdateAction;
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
public final class CustomerAddAddressActionImpl implements CustomerAddAddressAction {

   private String action;
   
   private com.commercetools.models.common.Address address;

   @JsonCreator
   CustomerAddAddressActionImpl(@JsonProperty("address") final com.commercetools.models.common.Address address) {
      this.address = address;
      this.action = "addAddress";
   }
   public CustomerAddAddressActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public void setAddress(final com.commercetools.models.common.Address address){
      this.address = address;
   }

}