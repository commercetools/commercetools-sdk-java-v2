package com.commercetools.models.message;

import com.commercetools.models.common.Address;
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
public final class OrderBillingAddressSetMessagePayloadImpl implements OrderBillingAddressSetMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.common.Address oldAddress;
   
   private com.commercetools.models.common.Address address;

   @JsonCreator
   OrderBillingAddressSetMessagePayloadImpl(@JsonProperty("oldAddress") final com.commercetools.models.common.Address oldAddress, @JsonProperty("address") final com.commercetools.models.common.Address address) {
      this.oldAddress = oldAddress;
      this.address = address;
      this.type = "OrderBillingAddressSet";
   }
   public OrderBillingAddressSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.common.Address getOldAddress(){
      return this.oldAddress;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }

   public void setOldAddress(final com.commercetools.models.common.Address oldAddress){
      this.oldAddress = oldAddress;
   }
   
   public void setAddress(final com.commercetools.models.common.Address address){
      this.address = address;
   }

}