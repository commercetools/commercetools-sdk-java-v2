package com.commercetools.models.Message;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Message.MessagePayload;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerAddressRemovedMessagePayloadImpl implements CustomerAddressRemovedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Common.Address address;

   @JsonCreator
   CustomerAddressRemovedMessagePayloadImpl(@JsonProperty("address") final com.commercetools.models.Common.Address address) {
      this.address = address;
      this.type = "CustomerAddressRemoved";
   }
   public CustomerAddressRemovedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public void setAddress(final com.commercetools.models.Common.Address address){
      this.address = address;
   }

}