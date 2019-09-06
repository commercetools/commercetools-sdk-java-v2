package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.PaymentStatusDraft;
import com.commercetools.models.Payment.TransactionDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
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
public final class PaymentDraftImpl implements PaymentDraft {

   private com.commercetools.models.Common.Money amountAuthorized;
   
   private java.lang.String anonymousId;
   
   private com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private java.lang.String authorizedUntil;
   
   private java.lang.String externalId;
   
   private java.util.List<com.commercetools.models.Payment.TransactionDraft> transactions;
   
   private com.commercetools.models.Common.Money amountPaid;
   
   private com.commercetools.models.Common.Money amountRefunded;
   
   private com.commercetools.models.Common.Money amountPlanned;
   
   private java.util.List<com.commercetools.models.Type.CustomFieldsDraft> interfaceInteractions;
   
   private java.lang.String interfaceId;
   
   private java.lang.String key;
   
   private com.commercetools.models.Payment.PaymentStatusDraft paymentStatus;
   
   private com.commercetools.models.Customer.CustomerResourceIdentifier customer;

   @JsonCreator
   PaymentDraftImpl(@JsonProperty("amountAuthorized") final com.commercetools.models.Common.Money amountAuthorized, @JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("paymentMethodInfo") final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("authorizedUntil") final java.lang.String authorizedUntil, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("transactions") final java.util.List<com.commercetools.models.Payment.TransactionDraft> transactions, @JsonProperty("amountPaid") final com.commercetools.models.Common.Money amountPaid, @JsonProperty("amountRefunded") final com.commercetools.models.Common.Money amountRefunded, @JsonProperty("amountPlanned") final com.commercetools.models.Common.Money amountPlanned, @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.models.Type.CustomFieldsDraft> interfaceInteractions, @JsonProperty("interfaceId") final java.lang.String interfaceId, @JsonProperty("key") final java.lang.String key, @JsonProperty("paymentStatus") final com.commercetools.models.Payment.PaymentStatusDraft paymentStatus, @JsonProperty("customer") final com.commercetools.models.Customer.CustomerResourceIdentifier customer) {
      this.amountAuthorized = amountAuthorized;
      this.anonymousId = anonymousId;
      this.paymentMethodInfo = paymentMethodInfo;
      this.custom = custom;
      this.authorizedUntil = authorizedUntil;
      this.externalId = externalId;
      this.transactions = transactions;
      this.amountPaid = amountPaid;
      this.amountRefunded = amountRefunded;
      this.amountPlanned = amountPlanned;
      this.interfaceInteractions = interfaceInteractions;
      this.interfaceId = interfaceId;
      this.key = key;
      this.paymentStatus = paymentStatus;
      this.customer = customer;
   }
   public PaymentDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Common.Money getAmountAuthorized(){
      return this.amountAuthorized;
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.models.Payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getAuthorizedUntil(){
      return this.authorizedUntil;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.util.List<com.commercetools.models.Payment.TransactionDraft> getTransactions(){
      return this.transactions;
   }
   
   
   public com.commercetools.models.Common.Money getAmountPaid(){
      return this.amountPaid;
   }
   
   
   public com.commercetools.models.Common.Money getAmountRefunded(){
      return this.amountRefunded;
   }
   
   
   public com.commercetools.models.Common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public java.util.List<com.commercetools.models.Type.CustomFieldsDraft> getInterfaceInteractions(){
      return this.interfaceInteractions;
   }
   
   
   public java.lang.String getInterfaceId(){
      return this.interfaceId;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Payment.PaymentStatusDraft getPaymentStatus(){
      return this.paymentStatus;
   }
   
   
   public com.commercetools.models.Customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public void setAmountAuthorized(final com.commercetools.models.Common.Money amountAuthorized){
      this.amountAuthorized = amountAuthorized;
   }
   
   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setPaymentMethodInfo(final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo){
      this.paymentMethodInfo = paymentMethodInfo;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setAuthorizedUntil(final java.lang.String authorizedUntil){
      this.authorizedUntil = authorizedUntil;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setTransactions(final java.util.List<com.commercetools.models.Payment.TransactionDraft> transactions){
      this.transactions = transactions;
   }
   
   public void setAmountPaid(final com.commercetools.models.Common.Money amountPaid){
      this.amountPaid = amountPaid;
   }
   
   public void setAmountRefunded(final com.commercetools.models.Common.Money amountRefunded){
      this.amountRefunded = amountRefunded;
   }
   
   public void setAmountPlanned(final com.commercetools.models.Common.Money amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setInterfaceInteractions(final java.util.List<com.commercetools.models.Type.CustomFieldsDraft> interfaceInteractions){
      this.interfaceInteractions = interfaceInteractions;
   }
   
   public void setInterfaceId(final java.lang.String interfaceId){
      this.interfaceId = interfaceId;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setPaymentStatus(final com.commercetools.models.Payment.PaymentStatusDraft paymentStatus){
      this.paymentStatus = paymentStatus;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.CustomerResourceIdentifier customer){
      this.customer = customer;
   }

}