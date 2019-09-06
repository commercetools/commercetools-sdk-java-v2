package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartOrigin;
import com.commercetools.models.Cart.CartState;
import com.commercetools.models.Cart.CustomLineItem;
import com.commercetools.models.Cart.DiscountCodeInfo;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.LineItem;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.ShippingInfo;
import com.commercetools.models.Cart.ShippingRateInput;
import com.commercetools.models.Cart.TaxCalculationMode;
import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.CartDiscount.CartDiscountReference;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Order.PaymentInfo;
import com.commercetools.models.Store.StoreKeyReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Cart.Cart;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private java.lang.String country;
   
   
   private com.commercetools.models.Common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.Cart.TaxedPrice taxedPrice;
   
   
   private com.commercetools.models.Cart.CartOrigin origin;
   
   @Nullable
   private java.lang.Integer deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingInfo shippingInfo;
   
   
   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> refusedGifts;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private com.commercetools.models.Cart.InventoryMode inventoryMode;
   
   
   private java.util.List<com.commercetools.models.Cart.LineItem> lineItems;
   
   
   private java.util.List<com.commercetools.models.Cart.CustomLineItem> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses;
   
   @Nullable
   private java.lang.String customerEmail;
   
   
   private com.commercetools.models.Cart.CartState cartState;
   
   @Nullable
   private java.lang.String customerId;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> discountCodes;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   
   private com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.models.Store.StoreKeyReference store;
   
   
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   
   private com.commercetools.models.Cart.TaxMode taxMode;
   
   @Nullable
   private com.commercetools.models.Common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.models.Common.Address billingAddress;
   
   @Nullable
   private com.commercetools.models.Order.PaymentInfo paymentInfo;
   
   public CartBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CartBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CartBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CartBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CartBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CartBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CartBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public CartBuilder totalPrice( final com.commercetools.models.Common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public CartBuilder shippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public CartBuilder taxedPrice(@Nullable final com.commercetools.models.Cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public CartBuilder origin( final com.commercetools.models.Cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public CartBuilder deleteDaysAfterLastModification(@Nullable final java.lang.Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public CartBuilder shippingInfo(@Nullable final com.commercetools.models.Cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public CartBuilder refusedGifts( final java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> refusedGifts) {
      this.refusedGifts = refusedGifts;
      return this;
   }
   
   public CartBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public CartBuilder inventoryMode(@Nullable final com.commercetools.models.Cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public CartBuilder lineItems( final java.util.List<com.commercetools.models.Cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public CartBuilder customLineItems( final java.util.List<com.commercetools.models.Cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public CartBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public CartBuilder customerEmail(@Nullable final java.lang.String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public CartBuilder cartState( final com.commercetools.models.Cart.CartState cartState) {
      this.cartState = cartState;
      return this;
   }
   
   public CartBuilder customerId(@Nullable final java.lang.String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public CartBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CartBuilder discountCodes(@Nullable final java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public CartBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public CartBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CartBuilder taxCalculationMode( final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public CartBuilder store(@Nullable final com.commercetools.models.Store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public CartBuilder taxRoundingMode( final com.commercetools.models.Cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public CartBuilder taxMode( final com.commercetools.models.Cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public CartBuilder shippingAddress(@Nullable final com.commercetools.models.Common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public CartBuilder billingAddress(@Nullable final com.commercetools.models.Common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public CartBuilder paymentInfo(@Nullable final com.commercetools.models.Order.PaymentInfo paymentInfo) {
      this.paymentInfo = paymentInfo;
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
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.Cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public java.lang.Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.models.Cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public com.commercetools.models.Cart.CartState getCartState(){
      return this.cartState;
   }
   
   @Nullable
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.models.Store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public com.commercetools.models.Cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public com.commercetools.models.Order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public Cart build() {
       return new CartImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, country, totalPrice, shippingRateInput, taxedPrice, origin, deleteDaysAfterLastModification, shippingInfo, refusedGifts, locale, inventoryMode, lineItems, customLineItems, itemShippingAddresses, customerEmail, cartState, customerId, anonymousId, discountCodes, customerGroup, custom, taxCalculationMode, store, taxRoundingMode, taxMode, shippingAddress, billingAddress, paymentInfo);
   }
   
   public static CartBuilder of() {
      return new CartBuilder();
   }
   
   public static CartBuilder of(final Cart template) {
      CartBuilder builder = new CartBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.country = template.getCountry();
      builder.totalPrice = template.getTotalPrice();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.taxedPrice = template.getTaxedPrice();
      builder.origin = template.getOrigin();
      builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
      builder.shippingInfo = template.getShippingInfo();
      builder.refusedGifts = template.getRefusedGifts();
      builder.locale = template.getLocale();
      builder.inventoryMode = template.getInventoryMode();
      builder.lineItems = template.getLineItems();
      builder.customLineItems = template.getCustomLineItems();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.customerEmail = template.getCustomerEmail();
      builder.cartState = template.getCartState();
      builder.customerId = template.getCustomerId();
      builder.anonymousId = template.getAnonymousId();
      builder.discountCodes = template.getDiscountCodes();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      builder.store = template.getStore();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      builder.taxMode = template.getTaxMode();
      builder.shippingAddress = template.getShippingAddress();
      builder.billingAddress = template.getBillingAddress();
      builder.paymentInfo = template.getPaymentInfo();
      return builder;
   }
   
}