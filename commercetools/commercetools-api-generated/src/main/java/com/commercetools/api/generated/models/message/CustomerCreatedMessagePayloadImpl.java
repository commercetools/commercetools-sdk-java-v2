package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.customer.Customer;
import com.commercetools.api.generated.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerCreatedMessagePayloadImpl implements CustomerCreatedMessagePayload {

   private String type;
   
   private com.commercetools.api.generated.models.customer.Customer customer;

   @JsonCreator
   CustomerCreatedMessagePayloadImpl(@JsonProperty("customer") final com.commercetools.api.generated.models.customer.Customer customer) {
      this.customer = customer;
      this.type = "CustomerCreated";
   }
   public CustomerCreatedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public void setCustomer(final com.commercetools.api.generated.models.customer.Customer customer){
      this.customer = customer;
   }

}