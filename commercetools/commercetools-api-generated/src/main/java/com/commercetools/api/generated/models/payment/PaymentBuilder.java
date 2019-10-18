package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.payment.PaymentMethodInfo;
import com.commercetools.api.generated.models.payment.PaymentStatus;
import com.commercetools.api.generated.models.payment.Transaction;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.payment.Payment;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.TypedMoney amountAuthorized;
   
   @Nullable
   private String anonymousId;
   
   
   private com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   @Nullable
   private String authorizedUntil;
   
   @Nullable
   private String externalId;
   
   
   private java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions;
   
   @Nullable
   private com.commercetools.api.generated.models.common.TypedMoney amountPaid;
   
   @Nullable
   private com.commercetools.api.generated.models.common.TypedMoney amountRefunded;
   
   
   private com.commercetools.api.generated.models.common.TypedMoney amountPlanned;
   
   
   private java.util.List<com.commercetools.api.generated.models.type.CustomFields> interfaceInteractions;
   
   @Nullable
   private String interfaceId;
   
   @Nullable
   private String key;
   
   
   private com.commercetools.api.generated.models.payment.PaymentStatus paymentStatus;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerReference customer;
   
   public PaymentBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public PaymentBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public PaymentBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public PaymentBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public PaymentBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public PaymentBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public PaymentBuilder amountAuthorized(@Nullable final com.commercetools.api.generated.models.common.TypedMoney amountAuthorized) {
      this.amountAuthorized = amountAuthorized;
      return this;
   }
   
   public PaymentBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public PaymentBuilder paymentMethodInfo( final com.commercetools.api.generated.models.payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public PaymentBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public PaymentBuilder authorizedUntil(@Nullable final String authorizedUntil) {
      this.authorizedUntil = authorizedUntil;
      return this;
   }
   
   public PaymentBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public PaymentBuilder transactions( final java.util.List<com.commercetools.api.generated.models.payment.Transaction> transactions) {
      this.transactions = transactions;
      return this;
   }
   
   public PaymentBuilder amountPaid(@Nullable final com.commercetools.api.generated.models.common.TypedMoney amountPaid) {
      this.amountPaid = amountPaid;
      return this;
   }
   
   public PaymentBuilder amountRefunded(@Nullable final com.commercetools.api.generated.models.common.TypedMoney amountRefunded) {
      this.amountRefunded = amountRefunded;
      return this;
   }
   
   public PaymentBuilder amountPlanned( final com.commercetools.api.generated.models.common.TypedMoney amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public PaymentBuilder interfaceInteractions( final java.util.List<com.commercetools.api.generated.models.type.CustomFields> interfaceInteractions) {
      this.interfaceInteractions = interfaceInteractions;
      return this;
   }
   
   public PaymentBuilder interfaceId(@Nullable final String interfaceId) {
      this.interfaceId = interfaceId;
      return this;
   }
   
   public PaymentBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public PaymentBuilder paymentStatus( final com.commercetools.api.generated.models.payment.PaymentStatus paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
   }
   
   public PaymentBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.TypedMoney getAmountAuthorized(){
      return this.amountAuthorized;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
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
   
   
   public java.util.List<com.commercetools.api.generated.models.payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.TypedMoney getAmountPaid(){
      return this.amountPaid;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.TypedMoney getAmountRefunded(){
      return this.amountRefunded;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.type.CustomFields> getInterfaceInteractions(){
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
   
   
   public com.commercetools.api.generated.models.payment.PaymentStatus getPaymentStatus(){
      return this.paymentStatus;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerReference getCustomer(){
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