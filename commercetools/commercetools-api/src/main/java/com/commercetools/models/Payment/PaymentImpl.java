package com.commercetools.models.Payment;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.PaymentStatus;
import com.commercetools.models.Payment.Transaction;
import com.commercetools.models.Type.CustomFields;
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
public final class PaymentImpl implements Payment {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.Common.TypedMoney amountAuthorized;
   
   private java.lang.String anonymousId;
   
   private com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.lang.String authorizedUntil;
   
   private java.lang.String externalId;
   
   private java.util.List<com.commercetools.models.Payment.Transaction> transactions;
   
   private com.commercetools.models.Common.TypedMoney amountPaid;
   
   private com.commercetools.models.Common.TypedMoney amountRefunded;
   
   private com.commercetools.models.Common.TypedMoney amountPlanned;
   
   private java.util.List<com.commercetools.models.Type.CustomFields> interfaceInteractions;
   
   private java.lang.String interfaceId;
   
   private java.lang.String key;
   
   private com.commercetools.models.Payment.PaymentStatus paymentStatus;
   
   private com.commercetools.models.Customer.CustomerReference customer;

   @JsonCreator
   PaymentImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("amountAuthorized") final com.commercetools.models.Common.TypedMoney amountAuthorized, @JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("paymentMethodInfo") final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("authorizedUntil") final java.lang.String authorizedUntil, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("transactions") final java.util.List<com.commercetools.models.Payment.Transaction> transactions, @JsonProperty("amountPaid") final com.commercetools.models.Common.TypedMoney amountPaid, @JsonProperty("amountRefunded") final com.commercetools.models.Common.TypedMoney amountRefunded, @JsonProperty("amountPlanned") final com.commercetools.models.Common.TypedMoney amountPlanned, @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.models.Type.CustomFields> interfaceInteractions, @JsonProperty("interfaceId") final java.lang.String interfaceId, @JsonProperty("key") final java.lang.String key, @JsonProperty("paymentStatus") final com.commercetools.models.Payment.PaymentStatus paymentStatus, @JsonProperty("customer") final com.commercetools.models.Customer.CustomerReference customer) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
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
   public PaymentImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmountAuthorized(){
      return this.amountAuthorized;
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
   
   
   public java.lang.String getAuthorizedUntil(){
      return this.authorizedUntil;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.util.List<com.commercetools.models.Payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmountPaid(){
      return this.amountPaid;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmountRefunded(){
      return this.amountRefunded;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public java.util.List<com.commercetools.models.Type.CustomFields> getInterfaceInteractions(){
      return this.interfaceInteractions;
   }
   
   
   public java.lang.String getInterfaceId(){
      return this.interfaceId;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Payment.PaymentStatus getPaymentStatus(){
      return this.paymentStatus;
   }
   
   
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setAmountAuthorized(final com.commercetools.models.Common.TypedMoney amountAuthorized){
      this.amountAuthorized = amountAuthorized;
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
   
   public void setAuthorizedUntil(final java.lang.String authorizedUntil){
      this.authorizedUntil = authorizedUntil;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setTransactions(final java.util.List<com.commercetools.models.Payment.Transaction> transactions){
      this.transactions = transactions;
   }
   
   public void setAmountPaid(final com.commercetools.models.Common.TypedMoney amountPaid){
      this.amountPaid = amountPaid;
   }
   
   public void setAmountRefunded(final com.commercetools.models.Common.TypedMoney amountRefunded){
      this.amountRefunded = amountRefunded;
   }
   
   public void setAmountPlanned(final com.commercetools.models.Common.TypedMoney amountPlanned){
      this.amountPlanned = amountPlanned;
   }
   
   public void setInterfaceInteractions(final java.util.List<com.commercetools.models.Type.CustomFields> interfaceInteractions){
      this.interfaceInteractions = interfaceInteractions;
   }
   
   public void setInterfaceId(final java.lang.String interfaceId){
      this.interfaceId = interfaceId;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setPaymentStatus(final com.commercetools.models.Payment.PaymentStatus paymentStatus){
      this.paymentStatus = paymentStatus;
   }
   
   public void setCustomer(final com.commercetools.models.Customer.CustomerReference customer){
      this.customer = customer;
   }

}