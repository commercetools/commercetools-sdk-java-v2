package com.commercetools.models.Me;

import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.Payment.PaymentMethodInfo;
import com.commercetools.models.Payment.Transaction;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Me.MyPayment;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   
   private com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   
   private com.commercetools.models.Common.TypedMoney amountPlanned;
   
   
   private java.lang.String id;
   
   
   private java.util.List<com.commercetools.models.Payment.Transaction> transactions;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference customer;
   
   public MyPaymentBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public MyPaymentBuilder paymentMethodInfo( final com.commercetools.models.Payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public MyPaymentBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyPaymentBuilder amountPlanned( final com.commercetools.models.Common.TypedMoney amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public MyPaymentBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public MyPaymentBuilder transactions( final java.util.List<com.commercetools.models.Payment.Transaction> transactions) {
      this.transactions = transactions;
      return this;
   }
   
   public MyPaymentBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public MyPaymentBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerReference customer) {
      this.customer = customer;
      return this;
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
   
   @Nullable
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }

   public MyPayment build() {
       return new MyPaymentImpl(anonymousId, paymentMethodInfo, custom, amountPlanned, id, transactions, version, customer);
   }
   
   public static MyPaymentBuilder of() {
      return new MyPaymentBuilder();
   }
   
   public static MyPaymentBuilder of(final MyPayment template) {
      MyPaymentBuilder builder = new MyPaymentBuilder();
      builder.anonymousId = template.getAnonymousId();
      builder.paymentMethodInfo = template.getPaymentMethodInfo();
      builder.custom = template.getCustom();
      builder.amountPlanned = template.getAmountPlanned();
      builder.id = template.getId();
      builder.transactions = template.getTransactions();
      builder.version = template.getVersion();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}