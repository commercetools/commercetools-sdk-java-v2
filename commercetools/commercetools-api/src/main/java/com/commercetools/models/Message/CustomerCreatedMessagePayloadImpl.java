package com.commercetools.models.message;

import com.commercetools.models.customer.Customer;
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
public final class CustomerCreatedMessagePayloadImpl implements CustomerCreatedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.customer.Customer customer;

   @JsonCreator
   CustomerCreatedMessagePayloadImpl(@JsonProperty("customer") final com.commercetools.models.customer.Customer customer) {
      this.customer = customer;
      this.type = "CustomerCreated";
   }
   public CustomerCreatedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public void setCustomer(final com.commercetools.models.customer.Customer customer){
      this.customer = customer;
   }

}