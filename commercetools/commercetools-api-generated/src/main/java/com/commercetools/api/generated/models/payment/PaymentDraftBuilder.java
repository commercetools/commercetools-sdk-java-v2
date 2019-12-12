package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.payment.PaymentStatusDraft;
import com.commercetools.api.generated.models.payment.TransactionDraft;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.payment.PaymentDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentDraftBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money amountAuthorized;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private String authorizedUntil;
   
   @Nullable
   private String externalId;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.payment.TransactionDraft> transactions;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money amountPaid;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money amountRefunded;
   
   
   private com.commercetools.api.generated.models.common.Money amountPlanned;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.type.CustomFieldsDraft> interfaceInteractions;
   
   @Nullable
   private String interfaceId;
   
   @Nullable
   private String key;
   
   @Nullable
   private com.commercetools.api.generated.models.payment.PaymentStatusDraft paymentStatus;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer;
   
   public PaymentDraftBuilder amountAuthorized(@Nullable final com.commercetools.api.generated.models.common.Money amountAuthorized) {
      this.amountAuthorized = amountAuthorized;
      return this;
   }
   
   public PaymentDraftBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public PaymentDraftBuilder paymentMethodInfo(@Nullable final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public PaymentDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public PaymentDraftBuilder authorizedUntil(@Nullable final String authorizedUntil) {
      this.authorizedUntil = authorizedUntil;
      return this;
   }
   
   public PaymentDraftBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public PaymentDraftBuilder transactions(@Nullable final java.util.List<com.commercetools.api.generated.models.payment.TransactionDraft> transactions) {
      this.transactions = transactions;
      return this;
   }
   
   public PaymentDraftBuilder amountPaid(@Nullable final com.commercetools.api.generated.models.common.Money amountPaid) {
      this.amountPaid = amountPaid;
      return this;
   }
   
   public PaymentDraftBuilder amountRefunded(@Nullable final com.commercetools.api.generated.models.common.Money amountRefunded) {
      this.amountRefunded = amountRefunded;
      return this;
   }
   
   public PaymentDraftBuilder amountPlanned( final com.commercetools.api.generated.models.common.Money amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public PaymentDraftBuilder interfaceInteractions(@Nullable final java.util.List<com.commercetools.api.generated.models.type.CustomFieldsDraft> interfaceInteractions) {
      this.interfaceInteractions = interfaceInteractions;
      return this;
   }
   
   public PaymentDraftBuilder interfaceId(@Nullable final String interfaceId) {
      this.interfaceId = interfaceId;
      return this;
   }
   
   public PaymentDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public PaymentDraftBuilder paymentStatus(@Nullable final com.commercetools.api.generated.models.payment.PaymentStatusDraft paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
   }
   
   public PaymentDraftBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getAmountAuthorized(){
      return this.amountAuthorized;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public String getAuthorizedUntil(){
      return this.authorizedUntil;
   }
   
   @Nullable
   public String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.payment.TransactionDraft> getTransactions(){
      return this.transactions;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getAmountPaid(){
      return this.amountPaid;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getAmountRefunded(){
      return this.amountRefunded;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getAmountPlanned(){
      return this.amountPlanned;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.type.CustomFieldsDraft> getInterfaceInteractions(){
      return this.interfaceInteractions;
   }
   
   @Nullable
   public String getInterfaceId(){
      return this.interfaceId;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.payment.PaymentStatusDraft getPaymentStatus(){
      return this.paymentStatus;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerResourceIdentifier getCustomer(){
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