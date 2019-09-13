package com.commercetools.models.me;

import com.commercetools.models.common.Money;
import com.commercetools.models.me.MyTransactionDraft;
import com.commercetools.models.payment.PaymentMethodInfo;
import com.commercetools.models.type.CustomFieldsDraft;
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
public final class MyPaymentDraftImpl implements MyPaymentDraft {

   private com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.common.Money amountPlanned;
   
   private com.commercetools.models.me.MyTransactionDraft transaction;

   @JsonCreator
   MyPaymentDraftImpl(@JsonProperty("paymentMethodInfo") final com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("amountPlanned") final com.commercetools.models.common.Money amountPlanned, @JsonProperty("transaction") final com.commercetools.models.me.MyTransactionDraft transaction) {
      this.paymentMethodInfo = paymentMethodInfo;
      this.custom = custom;
      this.amountPlanned = amountPlanned;
      this.transaction = transaction;
   }
   public MyPaymentDraftImpl() {
      
   }
   
   
   public com.commercetools.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public com.commercetools.models.me.MyTransactionDraft getTransaction(){
      return this.transaction;
   }

   public void setPaymentMethodInfo(final com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setAmountPlanned(final com.commercetools.models.common.Money amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setTransaction(final com.commercetools.models.me.MyTransactionDraft transaction){
      this.transaction = transaction;
   }

}