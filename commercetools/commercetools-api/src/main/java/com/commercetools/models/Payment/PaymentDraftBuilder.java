package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.PaymentStatusDraft;
import com.commercetools.models.Payment.TransactionDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import com.commercetools.models.Payment.PaymentDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentDraftBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Money amountAuthorized;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   @Nullable
   private java.lang.String authorizedUntil;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private java.util.List<com.commercetools.models.Payment.TransactionDraft> transactions;
   
   @Nullable
   private com.commercetools.models.Common.Money amountPaid;
   
   @Nullable
   private com.commercetools.models.Common.Money amountRefunded;
   
   
   private com.commercetools.models.Common.Money amountPlanned;
   
   @Nullable
   private java.util.List<com.commercetools.models.Type.CustomFieldsDraft> interfaceInteractions;
   
   @Nullable
   private java.lang.String interfaceId;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.Payment.PaymentStatusDraft paymentStatus;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerResourceIdentifier customer;
   
   public PaymentDraftBuilder amountAuthorized(@Nullable final com.commercetools.models.Common.Money amountAuthorized) {
      this.amountAuthorized = amountAuthorized;
      return this;
   }
   
   public PaymentDraftBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public PaymentDraftBuilder paymentMethodInfo(@Nullable final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public PaymentDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public PaymentDraftBuilder authorizedUntil(@Nullable final java.lang.String authorizedUntil) {
      this.authorizedUntil = authorizedUntil;
      return this;
   }
   
   public PaymentDraftBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public PaymentDraftBuilder transactions(@Nullable final java.util.List<com.commercetools.models.Payment.TransactionDraft> transactions) {
      this.transactions = transactions;
      return this;
   }
   
   public PaymentDraftBuilder amountPaid(@Nullable final com.commercetools.models.Common.Money amountPaid) {
      this.amountPaid = amountPaid;
      return this;
   }
   
   public PaymentDraftBuilder amountRefunded(@Nullable final com.commercetools.models.Common.Money amountRefunded) {
      this.amountRefunded = amountRefunded;
      return this;
   }
   
   public PaymentDraftBuilder amountPlanned( final com.commercetools.models.Common.Money amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public PaymentDraftBuilder interfaceInteractions(@Nullable final java.util.List<com.commercetools.models.Type.CustomFieldsDraft> interfaceInteractions) {
      this.interfaceInteractions = interfaceInteractions;
      return this;
   }
   
   public PaymentDraftBuilder interfaceId(@Nullable final java.lang.String interfaceId) {
      this.interfaceId = interfaceId;
      return this;
   }
   
   public PaymentDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public PaymentDraftBuilder paymentStatus(@Nullable final com.commercetools.models.Payment.PaymentStatusDraft paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
   }
   
   public PaymentDraftBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getAmountAuthorized(){
      return this.amountAuthorized;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public com.commercetools.models.Payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.lang.String getAuthorizedUntil(){
      return this.authorizedUntil;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Payment.TransactionDraft> getTransactions(){
      return this.transactions;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getAmountPaid(){
      return this.amountPaid;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getAmountRefunded(){
      return this.amountRefunded;
   }
   
   
   public com.commercetools.models.Common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Type.CustomFieldsDraft> getInterfaceInteractions(){
      return this.interfaceInteractions;
   }
   
   @Nullable
   public java.lang.String getInterfaceId(){
      return this.interfaceId;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.Payment.PaymentStatusDraft getPaymentStatus(){
      return this.paymentStatus;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public PaymentDraft build() {
       return new PaymentDraftImpl(amountAuthorized, anonymousId, paymentMethodInfo, custom, authorizedUntil, externalId, transactions, amountPaid, amountRefunded, amountPlanned, interfaceInteractions, interfaceId, key, paymentStatus, customer);
   }
   
   public static PaymentDraftBuilder of() {
      return new PaymentDraftBuilder();
   }
   
   public static PaymentDraftBuilder of(final PaymentDraft template) {
      PaymentDraftBuilder builder = new PaymentDraftBuilder();
      builder.amountAuthorized = template.getAmountAuthorized();
      builder.anonymousId = template.getAnonymousId();
      builder.paymentMethodInfo = template.getPaymentMethodInfo();
      builder.custom = template.getCustom();
      builder.authorizedUntil = template.getAuthorizedUntil();
      builder.externalId = template.getExternalId();
      builder.transactions = template.getTransactions();
      builder.amountPaid = template.getAmountPaid();
      builder.amountRefunded = template.getAmountRefunded();
      builder.amountPlanned = template.getAmountPlanned();
      builder.interfaceInteractions = template.getInterfaceInteractions();
      builder.interfaceId = template.getInterfaceId();
      builder.key = template.getKey();
      builder.paymentStatus = template.getPaymentStatus();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}