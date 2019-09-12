package com.commercetools.models.Me;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.Transaction;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
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
public final class MyPaymentImpl implements MyPayment {

   private java.lang.String anonymousId;
   
   private com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private com.commercetools.models.Common.TypedMoney amountPlanned;
   
   private java.lang.String id;
   
   private java.util.List<com.commercetools.models.Payment.Transaction> transactions;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Customer.CustomerReference customer;

   @JsonCreator
   MyPaymentImpl(@JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("paymentMethodInfo") final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("amountPlanned") final com.commercetools.models.Common.TypedMoney amountPlanned, @JsonProperty("id") final java.lang.String id, @JsonProperty("transactions") final java.util.List<com.commercetools.models.Payment.Transaction> transactions, @JsonProperty("version") final java.lang.Long version, @JsonProperty("customer") final com.commercetools.models.Customer.CustomerReference customer) {
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
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.models.Payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.Payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setPaymentMethodInfo(final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setAmountPlanned(final com.commercetools.models.Common.TypedMoney amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setTransactions(final java.util.List<com.commercetools.models.Payment.Transaction> transactions){
      this.transactions = transactions;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.CustomerReference customer){
      this.customer = customer;
   }

}