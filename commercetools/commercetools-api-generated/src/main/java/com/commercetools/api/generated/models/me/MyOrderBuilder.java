package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CartReference;
import com.commercetools.api.generated.models.cart.CustomLineItem;
import com.commercetools.api.generated.models.cart.DiscountCodeInfo;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.LineItem;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.ShippingInfo;
import com.commercetools.api.generated.models.cart.ShippingRateInput;
import com.commercetools.api.generated.models.cart.TaxCalculationMode;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.cart.TaxedPrice;
import com.commercetools.api.generated.models.cart_discount.CartDiscountReference;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.PaymentInfo;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.ReturnInfo;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.SyncInfo;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.store.StoreKeyReference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.me.MyOrder;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyOrderBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.api.generated.models.order.ShipmentState shipmentState;
   
   @Nullable
   private String country;
   
   @Nullable
   private String orderNumber;
   
   
   private com.commercetools.api.generated.models.common.TypedMoney totalPrice;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice;
   
   
   private com.commercetools.api.generated.models.cart.CartOrigin origin;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ShippingInfo shippingInfo;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> refusedGifts;
   
   @Nullable
   private String locale;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.CartReference cart;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.InventoryMode inventoryMode;
   
   
   private com.commercetools.api.generated.models.order.OrderState orderState;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> returnInfo;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.LineItem> lineItems;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses;
   
   @Nullable
   private String customerEmail;
   
   @Nullable
   private String customerId;
   
   @Nullable
   private com.commercetools.api.generated.models.state.StateReference state;
   
   @Nullable
   private com.commercetools.api.generated.models.order.PaymentState paymentState;
   
   @Nullable
   private String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> discountCodes;
   
   @Nullable
   private java.time.ZonedDateTime completedAt;
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.api.generated.models.store.StoreKeyReference store;
   
   
   private Long lastMessageSequenceNumber;
   
   
   private java.util.List<com.commercetools.api.generated.models.order.SyncInfo> syncInfo;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.TaxMode taxMode;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address billingAddress;
   
   @Nullable
   private com.commercetools.api.generated.models.order.PaymentInfo paymentInfo;
   
   public MyOrderBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public MyOrderBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public MyOrderBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public MyOrderBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public MyOrderBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public MyOrderBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public MyOrderBuilder shipmentState(@Nullable final com.commercetools.api.generated.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public MyOrderBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public MyOrderBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public MyOrderBuilder totalPrice( final com.commercetools.api.generated.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public MyOrderBuilder shippingRateInput(@Nullable final com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public MyOrderBuilder taxedPrice(@Nullable final com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public MyOrderBuilder origin( final com.commercetools.api.generated.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public MyOrderBuilder shippingInfo(@Nullable final com.commercetools.api.generated.models.cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public MyOrderBuilder refusedGifts( final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> refusedGifts) {
      this.refusedGifts = refusedGifts;
      return this;
   }
   
   public MyOrderBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public MyOrderBuilder cart(@Nullable final com.commercetools.api.generated.models.cart.CartReference cart) {
      this.cart = cart;
      return this;
   }
   
   public MyOrderBuilder inventoryMode(@Nullable final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public MyOrderBuilder orderState( final com.commercetools.api.generated.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   public MyOrderBuilder returnInfo(@Nullable final java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   public MyOrderBuilder lineItems( final java.util.List<com.commercetools.api.generated.models.cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public MyOrderBuilder customLineItems( final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public MyOrderBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public MyOrderBuilder customerEmail(@Nullable final String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public MyOrderBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public MyOrderBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   public MyOrderBuilder paymentState(@Nullable final com.commercetools.api.generated.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public MyOrderBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public MyOrderBuilder discountCodes(@Nullable final java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public MyOrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
   }
   
   public MyOrderBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public MyOrderBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyOrderBuilder taxCalculationMode(@Nullable final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public MyOrderBuilder store(@Nullable final com.commercetools.api.generated.models.store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public MyOrderBuilder lastMessageSequenceNumber( final Long lastMessageSequenceNumber) {
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
      return this;
   }
   
   public MyOrderBuilder syncInfo( final java.util.List<com.commercetools.api.generated.models.order.SyncInfo> syncInfo) {
      this.syncInfo = syncInfo;
      return this;
   }
   
   public MyOrderBuilder taxRoundingMode(@Nullable final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public MyOrderBuilder taxMode(@Nullable final com.commercetools.api.generated.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public MyOrderBuilder shippingAddress(@Nullable final com.commercetools.api.generated.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public MyOrderBuilder billingAddress(@Nullable final com.commercetools.api.generated.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public MyOrderBuilder paymentInfo(@Nullable final com.commercetools.api.generated.models.order.PaymentInfo paymentInfo) {
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
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.api.generated.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.CartReference getCart(){
      return this.cart;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> getReturnInfo(){
      return this.returnInfo;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   @Nullable
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   @Nullable
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public Long getLastMessageSequenceNumber(){
      return this.lastMessageSequenceNumber;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.SyncInfo> getSyncInfo(){
      return this.syncInfo;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public MyOrder build() {
       return new MyOrderImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, shipmentState, country, orderNumber, totalPrice, shippingRateInput, taxedPrice, origin, shippingInfo, refusedGifts, locale, cart, inventoryMode, orderState, returnInfo, lineItems, customLineItems, itemShippingAddresses, customerEmail, customerId, state, paymentState, anonymousId, discountCodes, completedAt, customerGroup, custom, taxCalculationMode, store, lastMessageSequenceNumber, syncInfo, taxRoundingMode, taxMode, shippingAddress, billingAddress, paymentInfo);
   }
   
   public static MyOrderBuilder of() {
      return new MyOrderBuilder();
   }
   
   public static MyOrderBuilder of(final MyOrder template) {
      MyOrderBuilder builder = new MyOrderBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.shipmentState = template.getShipmentState();
      builder.country = template.getCountry();
      builder.orderNumber = template.getOrderNumber();
      builder.totalPrice = template.getTotalPrice();
      builder.shippingRateInput = template.getShippingRateInput();
      builder.taxedPrice = template.getTaxedPrice();
      builder.origin = template.getOrigin();
      builder.shippingInfo = template.getShippingInfo();
      builder.refusedGifts = template.getRefusedGifts();
      builder.locale = template.getLocale();
      builder.cart = template.getCart();
      builder.inventoryMode = template.getInventoryMode();
      builder.orderState = template.getOrderState();
      builder.returnInfo = template.getReturnInfo();
      builder.lineItems = template.getLineItems();
      builder.customLineItems = template.getCustomLineItems();
      builder.itemShippingAddresses = template.getItemShippingAddresses();
      builder.customerEmail = template.getCustomerEmail();
      builder.customerId = template.getCustomerId();
      builder.state = template.getState();
      builder.paymentState = template.getPaymentState();
      builder.anonymousId = template.getAnonymousId();
      builder.discountCodes = template.getDiscountCodes();
      builder.completedAt = template.getCompletedAt();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      builder.store = template.getStore();
      builder.lastMessageSequenceNumber = template.getLastMessageSequenceNumber();
      builder.syncInfo = template.getSyncInfo();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      builder.taxMode = template.getTaxMode();
      builder.shippingAddress = template.getShippingAddress();
      builder.billingAddress = template.getBillingAddress();
      builder.paymentInfo = template.getPaymentInfo();
      return builder;
   }
   
}