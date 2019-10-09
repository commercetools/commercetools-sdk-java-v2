package com.commercetools.models.me;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.customer.CustomerReference;
import com.commercetools.models.payment.PaymentMethodInfo;
import com.commercetools.models.payment.Transaction;
import com.commercetools.models.type.CustomFields;
import com.commercetools.models.me.MyPayment;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyPaymentBuilder {
   
   @Nullable
   private String anonymousId;
   
   
   private com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private com.commercetools.models.common.TypedMoney amountPlanned;
   
   
   private String id;
   
   
   private java.util.List<com.commercetools.models.payment.Transaction> transactions;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.customer.CustomerReference customer;
   
   public MyPaymentBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public MyPaymentBuilder paymentMethodInfo( final com.commercetools.models.payment.PaymentMethodInfo paymentMethodInfo) {
      this.paymentMethodInfo = paymentMethodInfo;
      return this;
   }
   
   public MyPaymentBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyPaymentBuilder amountPlanned( final com.commercetools.models.common.TypedMoney amountPlanned) {
      this.amountPlanned = amountPlanned;
      return this;
   }
   
   public MyPaymentBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public MyPaymentBuilder transactions( final java.util.List<com.commercetools.models.payment.Transaction> transactions) {
      this.transactions = transactions;
      return this;
   }
   
   public MyPaymentBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public MyPaymentBuilder customer(@Nullable final com.commercetools.models.customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public com.commercetools.models.payment.PaymentMethodInfo getPaymentMethodInfo(){
      return this.paymentMethodInfo;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.TypedMoney getAmountPlanned(){
      return this.amountPlanned;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.payment.Transaction> getTransactions(){
      return this.transactions;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.customer.CustomerReference getCustomer(){
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