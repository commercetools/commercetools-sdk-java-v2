package com.commercetools.models.me;

import com.commercetools.models.cart.CartOrigin;
import com.commercetools.models.cart.CartState;
import com.commercetools.models.cart.CustomLineItem;
import com.commercetools.models.cart.DiscountCodeInfo;
import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.LineItem;
import com.commercetools.models.cart.RoundingMode;
import com.commercetools.models.cart.ShippingInfo;
import com.commercetools.models.cart.ShippingRateInput;
import com.commercetools.models.cart.TaxCalculationMode;
import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.cart.TaxedPrice;
import com.commercetools.models.cart_discount.CartDiscountReference;
import com.commercetools.models.common.Address;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.order.PaymentInfo;
import com.commercetools.models.store.StoreKeyReference;
import com.commercetools.models.type.CustomFields;
import com.commercetools.models.me.MyCart;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private String country;
   
   
   private com.commercetools.models.common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.cart.TaxedPrice taxedPrice;
   
   
   private com.commercetools.models.cart.CartOrigin origin;
   
   @Nullable
   private Integer deleteDaysAfterLastModification;
   
   @Nullable
   private com.commercetools.models.cart.ShippingInfo shippingInfo;
   
   
   private java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> refusedGifts;
   
   @Nullable
   private String locale;
   
   @Nullable
   private com.commercetools.models.cart.InventoryMode inventoryMode;
   
   
   private java.util.List<com.commercetools.models.cart.LineItem> lineItems;
   
   
   private java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   @Nullable
   private String customerEmail;
   
   
   private com.commercetools.models.cart.CartState cartState;
   
   @Nullable
   private String customerId;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private com.commercetools.models.cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.models.store.StoreKeyReference store;
   
   
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   
   private com.commercetools.models.cart.TaxMode taxMode;
   
   @Nullable
   private com.commercetools.models.common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.models.common.Address billingAddress;
   
   @Nullable
   private com.commercetools.models.order.PaymentInfo paymentInfo;
   
   public MyCartBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MyCartBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MyCartBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public MyCartBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public MyCartBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public MyCartBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public MyCartBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public MyCartBuilder totalPrice( final com.commercetools.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public MyCartBuilder shippingRateInput(@Nullable final com.commercetools.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public MyCartBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public MyCartBuilder origin( final com.commercetools.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public MyCartBuilder deleteDaysAfterLastModification(@Nullable final Integer deleteDaysAfterLastModification) {
      this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
      return this;
   }
   
   public MyCartBuilder shippingInfo(@Nullable final com.commercetools.models.cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public MyCartBuilder refusedGifts( final java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> refusedGifts) {
      this.refusedGifts = refusedGifts;
      return this;
   }
   
   public MyCartBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public MyCartBuilder inventoryMode(@Nullable final com.commercetools.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public MyCartBuilder lineItems( final java.util.List<com.commercetools.models.cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public MyCartBuilder customLineItems( final java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public MyCartBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public MyCartBuilder customerEmail(@Nullable final String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public MyCartBuilder cartState( final com.commercetools.models.cart.CartState cartState) {
      this.cartState = cartState;
      return this;
   }
   
   public MyCartBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public MyCartBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public MyCartBuilder discountCodes(@Nullable final java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public MyCartBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public MyCartBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyCartBuilder taxCalculationMode( final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public MyCartBuilder store(@Nullable final com.commercetools.models.store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public MyCartBuilder taxRoundingMode( final com.commercetools.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public MyCartBuilder taxMode( final com.commercetools.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public MyCartBuilder shippingAddress(@Nullable final com.commercetools.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public MyCartBuilder billingAddress(@Nullable final com.commercetools.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public MyCartBuilder paymentInfo(@Nullable final com.commercetools.models.order.PaymentInfo paymentInfo) {
      this.paymentInfo = paymentInfo;
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
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public Integer getDeleteDaysAfterLastModification(){
      return this.deleteDaysAfterLastModification;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.util.List<com.commercetools.models.cart_discount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public java.util.List<com.commercetools.models.cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.models.cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public com.commercetools.models.cart.CartState getCartState(){
      return this.cartState;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public com.commercetools.models.order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public MyCart build() {
       return new MyCartImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, country, totalPrice, shippingRateInput, taxedPrice, origin, deleteDaysAfterLastModification, shippingInfo, refusedGifts, locale, inventoryMode, lineItems, customLineItems, itemShippingAddresses, customerEmail, cartState, customerId, anonymousId, discountCodes, customerGroup, custom, taxCalculationMode, store, taxRoundingMode, taxMode, shippingAddress, billingAddress, paymentInfo);
   }
   
   public static MyCartBuilder of() {
      return new MyCartBuilder();
   }
   
   public static MyCartBuilder of(final MyCart template) {
      MyCartBuilder builder = new MyCartBuilder();
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