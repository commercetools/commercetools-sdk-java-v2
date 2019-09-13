package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
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
public final class StagedOrderRemovePaymentActionImpl implements StagedOrderRemovePaymentAction {

   private java.lang.String action;
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;

   @JsonCreator
   StagedOrderRemovePaymentActionImpl(@JsonProperty("payment") final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      this.action = "removePayment";
   }
   public StagedOrderRemovePaymentActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public void setPayment(final com.commercetools.models.payment.PaymentResourceIdentifier payment){
      this.payment = payment;
   }

}