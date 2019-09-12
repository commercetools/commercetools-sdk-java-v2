package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartOrigin;
import com.commercetools.models.Cart.CustomLineItemDraft;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.LineItemDraft;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.ShippingRateInputDraft;
import com.commercetools.models.Cart.TaxCalculationMode;
import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Common.Address;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import com.commercetools.models.Store.StoreResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Cart.CartDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDraftBuilder {
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   @Nullable
   private com.commercetools.models.Cart.CartOrigin origin;
   
   @Nullable
   private java.lang.Long deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;
   
   @Nullable
   private com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.models.Store.StoreResourceIdentifier store;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;
   
   @Nullable
   private com.commercetools.models.Cart.InventoryMode inventoryMode;
   
   @Nullable
   private java.util.List<com.commercetools.models.Cart.LineItemDraft> lineItems;
   
   @Nullable
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses;
   
   @Nullable
   private com.commercetools.models.Cart.TaxMode taxMode;
   
   @Nullable
   private java.lang.String customerEmail;
   
   @Nullable
   private java.lang.String customerId;
   
   @Nullable
   private com.commercetools.models.Common.Address shippingAddress;
   
   
   private java.lang.String currency;
   
   @Nullable
   private com.commercetools.models.Common.Address billingAddress;
   
   public CartDraftBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public CartDraftBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CartDraftBuilder shippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public CartDraftBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public CartDraftBuilder origin(@Nullable final com.commercetools.models.Cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public CartDraftBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Long deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public CartDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CartDraftBuilder shippingMethod(@Nullable final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   public CartDraftBuilder taxCalculationMode(@Nullable final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public CartDraftBuilder store(@Nullable final com.commercetools.models.Store.StoreResourceIdentifier store) {
      this.store = store;
      return this;
   }
   
   public CartDraftBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public CartDraftBuilder externalTaxRateForShippingMethod(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRateForShippingMethod) {
      this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
      return this;
   }
   
   public CartDraftBuilder inventoryMode(@Nullable final com.commercetools.models.Cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public CartDraftBuilder lineItems(@Nullable final java.util.List<com.commercetools.models.Cart.LineItemDraft> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public CartDraftBuilder taxRoundingMode(@Nullable final com.commercetools.models.Cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public CartDraftBuilder customLineItems(@Nullable final java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public CartDraftBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public CartDraftBuilder taxMode(@Nullable final com.commercetools.models.Cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public CartDraftBuilder customerEmail(@Nullable final java.lang.String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public CartDraftBuilder customerId(@Nullable final java.lang.String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public CartDraftBuilder shippingAddress(@Nullable final com.commercetools.models.Common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public CartDraftBuilder currency( final java.lang.String currency) {
      this.currency = currency;
      return this;
   }
   
   public CartDraftBuilder billingAddress(@Nullable final com.commercetools.models.Common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public java.lang.Long getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.models.Store.StoreResourceIdentifier getStore(){
      return this.store;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod(){
      return this.externalTaxRateForShippingMethod;
   }
   
   @Nullable
   public com.commercetools.models.Cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Cart.LineItemDraft> getLineItems(){
      return this.lineItems;
   }
   
   @Nullable
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public java.lang.String getCurrency(){
      return this.currency;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getBillingAddress(){
      return this.billingAddress;
   }

   public CartDraft build() {
       return new CartDraftImpl(country, anonymousId, shippingRateInput, customerGroup, origin, deleteDaysAfterLastModification, custom, shippingMethod, taxCalculationMode, store, locale, externalTaxRateForShippingMethod, inventoryMode, lineItems, taxRoundingMode, customLineItems, itemShippingAddresses, taxMode, customerEmail, customerId, shippingAddress, currency, billingAddress);
   }
   
   public static CartDraftBuilder of() {
      return new CartDraftBuilder();
   }
   
   public static CartDraftBuilder of(final CartDraft template) {
      CartDraftBuilder builder = new CartDraftBuilder();
      builder.country = template.getCountry();
      builder.anonymousId = template.getAnonymousId();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.customerGroup = template.getCustomerGroup();
      builder.origin = template.getOrigin();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      builder.custom = template.getCustom();
      builder.shippingMethod = template.getShippingMethod();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      builder.store = template.getStore();
      builder.locale = template.getLocale();
      builder.externalTaxRateForShippingMethod = template.getExternalTaxRateForShippingMethod();
      builder.inventoryMode = template.getInventoryMode();
      builder.lineItems = template.getLineItems();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      builder.customLineItems = template.getCustomLineItems();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.taxMode = template.getTaxMode();
      builder.customerEmail = template.getCustomerEmail();
      builder.customerId = template.getCustomerId();
      builder.shippingAddress = template.getShippingAddress();
      builder.currency = template.getCurrency();
      builder.billingAddress = template.getBillingAddress();
      return builder;
   }
   
}