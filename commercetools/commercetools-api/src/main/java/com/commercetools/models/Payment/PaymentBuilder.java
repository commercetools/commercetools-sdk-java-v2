package com.commercetools.models.Payment;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.PaymentStatus;
import com.commercetools.models.Payment.Transaction;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import com.commercetools.models.Payment.Payment;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.models.Common.TypedMoney amountAuthorized;
   
   @Nullable
   private java.lang.String anonymousId;
   
   
   private com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private java.lang.String authorizedUntil;
   
   @Nullable
   private java.lang.String externalId;
   
   
   private java.util.List<com.commercetools.models.Payment.Transaction> transactions;
   
   @Nullable
   private com.commercetools.models.Common.TypedMoney amountPaid;
   
   @Nullable
   private com.commercetools.models.Common.TypedMoney amountRefunded;
   
   
   private com.commercetools.models.Common.TypedMoney amountPlanned;
   
   
   private java.util.List<com.commercetools.models.Type.CustomFields> interfaceInteractions;
   
   @Nullable
   private java.lang.String interfaceId;
   
   @Nullable
   private java.lang.String key;
   
   
   private com.commercetools.models.Payment.PaymentStatus paymentStatus;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference customer;
   
   public PaymentBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public PaymentBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public PaymentBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public PaymentBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public PaymentBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public PaymentBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public PaymentBuilder amountAuthorized(@Nullable final com.commercetools.models.Common.TypedMoney amountAuthorized) {
      this.amountAuthorized = amountAuthorized;
      return this;
   }
   
   public PaymentBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public PaymentBuilder paymentMethodInfo( final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public PaymentBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public PaymentBuilder authorizedUntil(@Nullable final java.lang.String authorizedUntil) {
      this.authorizedUntil = authorizedUntil;
      return this;
   }
   
   public PaymentBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public PaymentBuilder transactions( final java.util.List<com.commercetools.models.Payment.Transaction> transactions) {
      this.transactions = transactions;
      return this;
   }
   
   public PaymentBuilder amountPaid(@Nullable final com.commercetools.models.Common.TypedMoney amountPaid) {
      this.amountPaid = amountPaid;
      return this;
   }
   
   public PaymentBuilder amountRefunded(@Nullable final com.commercetools.models.Common.TypedMoney amountRefunded) {
      this.amountRefunded = amountRefunded;
      return this;
   }
   
   public PaymentBuilder amountPlanned( final com.commercetools.models.Common.TypedMoney amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public PaymentBuilder interfaceInteractions( final java.util.List<com.commercetools.models.Type.CustomFields> interfaceInteractions) {
      this.interfaceInteractions = interfaceInteractions;
      return this;
   }
   
   public PaymentBuilder interfaceId(@Nullable final java.lang.String interfaceId) {
      this.interfaceId = interfaceId;
      return this;
   }
   
   public PaymentBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public PaymentBuilder paymentStatus( final com.commercetools.models.Payment.PaymentStatus paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
   }
   
   public PaymentBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerReference customer) {
      this.customer = customer;
      return this;
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
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.TypedMoney getAmountAuthorized(){
      return this.amountAuthorized;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.models.Payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
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
   
   
   public java.util.List<com.commercetools.models.Payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   @Nullable
   public com.commercetools.models.Common.TypedMoney getAmountPaid(){
      return this.amountPaid;
   }
   
   @Nullable
   public com.commercetools.models.Common.TypedMoney getAmountRefunded(){
      return this.amountRefunded;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public java.util.List<com.commercetools.models.Type.CustomFields> getInterfaceInteractions(){
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
   
   
   public com.commercetools.models.Payment.PaymentStatus getPaymentStatus(){
      return this.paymentStatus;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public Payment build() {
       return new PaymentImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, amountAuthorized, anonymousId, paymentMethodInfo, custom, authorizedUntil, externalId, transactions, amountPaid, amountRefunded, amountPlanned, interfaceInteractions, interfaceId, key, paymentStatus, customer);
   }
   
   public static PaymentBuilder of() {
      return new PaymentBuilder();
   }
   
   public static PaymentBuilder of(final Payment template) {
      PaymentBuilder builder = new PaymentBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
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