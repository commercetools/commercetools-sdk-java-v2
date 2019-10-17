package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
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
public final class CustomerSetCustomerNumberActionImpl implements CustomerSetCustomerNumberAction {

   private String action;
   
   private String customerNumber;

   @JsonCreator
   CustomerSetCustomerNumberActionImpl(@JsonProperty("customerNumber") final String customerNumber) {
      this.customerNumber = customerNumber;
      this.action = "setCustomerNumber";
   }
   public CustomerSetCustomerNumberActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getCustomerNumber(){
      return this.customerNumber;
   }

   public void setCustomerNumber(final String customerNumber){
      this.customerNumber = customerNumber;
   }

}