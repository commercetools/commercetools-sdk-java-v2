package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.me.MyTransactionDraft;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
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
public final class MyPaymentDraftImpl implements MyPaymentDraft {

   private com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.common.Money amountPlanned;
   
   private com.commercetools.api.generated.models.me.MyTransactionDraft transaction;

   @JsonCreator
   MyPaymentDraftImpl(@JsonProperty("paymentMethodInfo") final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("amountPlanned") final com.commercetools.api.generated.models.common.Money amountPlanned, @JsonProperty("transaction") final com.commercetools.api.generated.models.me.MyTransactionDraft transaction) {
      this.paymentMethodInfo = paymentMethodInfo;
      this.custom = custom;
      this.amountPlanned = amountPlanned;
      this.transaction = transaction;
   }
   public MyPaymentDraftImpl() {
      
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   /**
   	<p>How much money this payment intends to receive from the customer.
   	The value usually matches the cart or order gross total.</p>
   */
   public com.commercetools.api.generated.models.common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   /**
   	<p>A list of financial transactions of the <code>Authorization</code> or <code>Charge</code>
   	<a href="http-api-projects-payments.html#transactiontype">TransactionTypes</a>.</p>
   */
   public com.commercetools.api.generated.models.me.MyTransactionDraft getTransaction(){
      return this.transaction;
   }

   public void setPaymentMethodInfo(final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setAmountPlanned(final com.commercetools.api.generated.models.common.Money amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setTransaction(final com.commercetools.api.generated.models.me.MyTransactionDraft transaction){
      this.transaction = transaction;
   }

}