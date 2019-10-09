package com.commercetools.models.payment;

import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.payment.PaymentUpdateAction;
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
public final class PaymentSetCustomerActionImpl implements PaymentSetCustomerAction {

   private String action;
   
   private com.commercetools.models.customer.CustomerResourceIdentifier customer;

   @JsonCreator
   PaymentSetCustomerActionImpl(@JsonProperty("customer") final com.commercetools.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      this.action = "setCustomer";
   }
   public PaymentSetCustomerActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public void setCustomer(final com.commercetools.models.customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }

}