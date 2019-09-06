package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
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
public final class CartAddPaymentActionImpl implements CartAddPaymentAction {

   private java.lang.String action;
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;

   @JsonCreator
   CartAddPaymentActionImpl(@JsonProperty("payment") final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      this.action = "addPayment";
   }
   public CartAddPaymentActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public void setPayment(final com.commercetools.models.Payment.PaymentResourceIdentifier payment){
      this.payment = payment;
   }

}