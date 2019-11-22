package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.payment.Transaction;
import com.commercetools.api.generated.models.type.CustomFields;
import io.vrap.rmf.base.client.utils.Generated;
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
   
   private com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.common.TypedMoney amountPlanned;
   
   private String id;
   
   private java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions;
   
   private Long version;
   
   private com.commercetools.api.generated.models.customer.CustomerReference customer;

   @JsonCreator
   MyPaymentImpl(@JsonProperty("anonymousId") final String anonymousId, @JsonProperty("paymentMethodInfo") final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("amountPlanned") final com.commercetools.api.generated.models.common.TypedMoney amountPlanned, @JsonProperty("id") final String id, @JsonProperty("transactions") final java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions, @JsonProperty("version") final Long version, @JsonProperty("customer") final com.commercetools.api.generated.models.customer.CustomerReference customer) {
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
   
   /**
   	<p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
   */
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   	<p>How much money this payment intends to receive from the customer.
   	The value usually matches the cart or order gross total.</p>
   */
   public com.commercetools.api.generated.models.common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   /**
   	
   */
   public String getId(){
      return this.id;
   }
   
   /**
   	<p>A list of financial transactions of different <a href="http-api-projects-payments.html#transactiontype">TransactionTypes</a>
   	with different <a href="http-api-projects-payments.html#transactionstate">TransactionStates</a>.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   /**
   	
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   	<p>A reference to the customer this payment belongs to.</p>
   */
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setPaymentMethodInfo(final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setAmountPlanned(final com.commercetools.api.generated.models.common.TypedMoney amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setTransactions(final java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions){
      this.transactions = transactions;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCustomer(final com.commercetools.api.generated.models.customer.CustomerReference customer){
      this.customer = customer;
   }

}