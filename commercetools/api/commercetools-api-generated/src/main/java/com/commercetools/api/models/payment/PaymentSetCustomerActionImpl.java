package com.commercetools.api.models.payment;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.payment.PaymentUpdateAction;
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
public final class PaymentSetCustomerActionImpl implements PaymentSetCustomerAction {

   private String action;
   
   private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

   @JsonCreator
   PaymentSetCustomerActionImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      this.action = "setCustomer";
   }
   public PaymentSetCustomerActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>A reference to the customer this payment belongs to.</p>
   */
   public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }

}
