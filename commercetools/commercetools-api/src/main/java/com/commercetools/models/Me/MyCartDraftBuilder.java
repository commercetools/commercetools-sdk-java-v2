package com.commercetools.models.me;

import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.common.Address;
import com.commercetools.models.me.MyLineItemDraft;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.me.MyCartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartDraftBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.me.MyLineItemDraft> lineItems;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   @Nullable
   private com.commercetools.models.cart.TaxMode taxMode;
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   @Nullable
   private java.lang.String customerEmail;
   
   @Nullable
   private com.commercetools.models.common.Address shippingAddress;
   
   
   private java.lang.String currency;
   
   @Nullable
   private com.commercetools.models.common.Address billingAddress;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private com.commercetools.models.cart.InventoryMode inventoryMode;
   
   public MyCartDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.me.MyLineItemDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public MyCartDraftBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public MyCartDraftBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public MyCartDraftBuilder taxMode(@Nullable final com.commercetools.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public MyCartDraftBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public MyCartDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public MyCartDraftBuilder shippingMethod(@Nullable final com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   public MyCartDraftBuilder customerEmail(@Nullable final java.lang.String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public MyCartDraftBuilder shippingAddress(@Nullable final com.commercetools.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public MyCartDraftBuilder currency( final java.lang.String currency) {
      this.currency = currency;
      return this;
   }
   
   public MyCartDraftBuilder billingAddress(@Nullable final com.commercetools.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public MyCartDraftBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public MyCartDraftBuilder inventoryMode(@Nullable final com.commercetools.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.me.MyLineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   @Nullable
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public java.lang.String getCurrency(){
      return this.currency;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }

   public MyCartDraft build() {
       return new MyCartDraftImpl(lineItems, country, itemShippingAddresses, taxMode, deleteDaysAfterLastModification, custom, shippingMethod, customerEmail, shippingAddress, currency, billingAddress, locale, inventoryMode);
   }
   
   public static MyCartDraftBuilder of() {
      return new MyCartDraftBuilder();
   }
   
   public static MyCartDraftBuilder of(final MyCartDraft template) {
      MyCartDraftBuilder builder = new MyCartDraftBuilder();
      builder.lineItems = template.getLineItems();
      builder.country = template.getCountry();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.taxMode = template.getTaxMode();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      builder.custom = template.getCustom();
      builder.shippingMethod = template.getShippingMethod();
      builder.customerEmail = template.getCustomerEmail();
      builder.shippingAddress = template.getShippingAddress();
      builder.currency = template.getCurrency();
      builder.billingAddress = template.getBillingAddress();
      builder.locale = template.getLocale();
      builder.inventoryMode = template.getInventoryMode();
      return builder;
   }
   
}