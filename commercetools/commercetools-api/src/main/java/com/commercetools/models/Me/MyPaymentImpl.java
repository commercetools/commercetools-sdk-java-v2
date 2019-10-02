package com.commercetools.models.me;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.customer.CustomerReference;
import com.commercetools.models.payment.PaymentMethodInfo;
import com.commercetools.models.payment.Transaction;
import com.commercetools.models.type.CustomFields;
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
public final class MyPaymentImpl implements MyPayment {

   private String anonymousId;
   
   private com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.common.TypedMoney amountPlanned;
   
   private String id;
   
   private java.util.List<com.commercetools.models.payment.Transaction> transactions;
   
   private Long version;
   
   private com.commercetools.models.customer.CustomerReference customer;

   @JsonCreator
   MyPaymentImpl(@JsonProperty("anonymousId") final String anonymousId, @JsonProperty("paymentMethodInfo") final com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("amountPlanned") final com.commercetools.models.common.TypedMoney amountPlanned, @JsonProperty("id") final String id, @JsonProperty("transactions") final java.util.List<com.commercetools.models.payment.Transaction> transactions, @JsonProperty("version") final Long version, @JsonProperty("customer") final com.commercetools.models.customer.CustomerReference customer) {
      this.anonymousId = anonymousId;
      this.paymentMethodInfo = paymentMethodInfo;
      this.custom = custom;
      this.amountPlanned = amountPlanned;
      this.id = id;
      this.transactions = transactions;
      this.version = version;
      this.customer = customer;
   }
   public MyPaymentImpl() {
      
   }
   
   
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setPaymentMethodInfo(final com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setAmountPlanned(final com.commercetools.models.common.TypedMoney amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setTransactions(final java.util.List<com.commercetools.models.payment.Transaction> transactions){
      this.transactions = transactions;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCustomer(final com.commercetools.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}