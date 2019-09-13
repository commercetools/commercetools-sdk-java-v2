package com.commercetools.models.order;

import com.commercetools.models.cart.CartOrigin;
import com.commercetools.models.cart.CartReference;
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
import com.commercetools.models.common.Address;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.Money;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.PaymentInfo;
import com.commercetools.models.order.PaymentState;
import com.commercetools.models.order.ReturnInfo;
import com.commercetools.models.order.ShipmentState;
import com.commercetools.models.order.SyncInfo;
import com.commercetools.models.order_edit.StagedOrder;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.store.StoreKeyReference;
import com.commercetools.models.type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.order.Order;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.models.order.ShipmentState shipmentState;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.lang.String orderNumber;
   
   
   private com.commercetools.models.common.Money totalPrice;
   
   @Nullable
   private com.commercetools.models.cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.cart.TaxedPrice taxedPrice;
   
   
   private com.commercetools.models.cart.CartOrigin origin;
   
   @Nullable
   private com.commercetools.models.cart.ShippingInfo shippingInfo;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private com.commercetools.models.cart.CartReference cart;
   
   @Nullable
   private com.commercetools.models.cart.InventoryMode inventoryMode;
   
   
   private com.commercetools.models.order.OrderState orderState;
   
   @Nullable
   private java.util.List<com.commercetools.models.order.ReturnInfo> returnInfo;
   
   
   private java.util.List<com.commercetools.models.cart.LineItem> lineItems;
   
   
   private java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   @Nullable
   private java.lang.String customerEmail;
   
   @Nullable
   private java.lang.String customerId;
   
   @Nullable
   private com.commercetools.models.state.StateReference state;
   
   @Nullable
   private com.commercetools.models.order.PaymentState paymentState;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes;
   
   @Nullable
   private java.time.ZonedDateTime completedAt;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.models.store.StoreKeyReference store;
   
   
   private java.lang.Long lastMessageSequenceNumber;
   
   
   private java.util.List<com.commercetools.models.order.SyncInfo> syncInfo;
   
   @Nullable
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private com.commercetools.models.cart.TaxMode taxMode;
   
   @Nullable
   private com.commercetools.models.common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.models.common.Address billingAddress;
   
   @Nullable
   private com.commercetools.models.order.PaymentInfo paymentInfo;
   
   public OrderBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public OrderBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public OrderBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public OrderBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public OrderBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public OrderBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public OrderBuilder shipmentState(@Nullable final com.commercetools.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public OrderBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public OrderBuilder orderNumber(@Nullable final java.lang.String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public OrderBuilder totalPrice( final com.commercetools.models.common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public OrderBuilder shippingRateInput(@Nullable final com.commercetools.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public OrderBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderBuilder origin( final com.commercetools.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public OrderBuilder shippingInfo(@Nullable final com.commercetools.models.cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public OrderBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public OrderBuilder cart(@Nullable final com.commercetools.models.cart.CartReference cart) {
      this.cart = cart;
      return this;
   }
   
   public OrderBuilder inventoryMode(@Nullable final com.commercetools.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public OrderBuilder orderState( final com.commercetools.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   public OrderBuilder returnInfo(@Nullable final java.util.List<com.commercetools.models.order.ReturnInfo> returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   public OrderBuilder lineItems( final java.util.List<com.commercetools.models.cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public OrderBuilder customLineItems( final java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public OrderBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public OrderBuilder customerEmail(@Nullable final java.lang.String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public OrderBuilder customerId(@Nullable final java.lang.String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public OrderBuilder state(@Nullable final com.commercetools.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   public OrderBuilder paymentState(@Nullable final com.commercetools.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public OrderBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public OrderBuilder discountCodes(@Nullable final java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public OrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
   }
   
   public OrderBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public OrderBuilder taxCalculationMode(@Nullable final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public OrderBuilder store(@Nullable final com.commercetools.models.store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public OrderBuilder lastMessageSequenceNumber( final java.lang.Long lastMessageSequenceNumber) {
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
      return this;
   }
   
   public OrderBuilder syncInfo( final java.util.List<com.commercetools.models.order.SyncInfo> syncInfo) {
      this.syncInfo = syncInfo;
      return this;
   }
   
   public OrderBuilder taxRoundingMode(@Nullable final com.commercetools.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public OrderBuilder taxMode(@Nullable final com.commercetools.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public OrderBuilder shippingAddress(@Nullable final com.commercetools.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public OrderBuilder billingAddress(@Nullable final com.commercetools.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public OrderBuilder paymentInfo(@Nullable final com.commercetools.models.order.PaymentInfo paymentInfo) {
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
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
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
   public com.commercetools.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.models.cart.CartReference getCart(){
      return this.cart;
   }
   
   @Nullable
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.order.ReturnInfo> getReturnInfo(){
      return this.returnInfo;
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
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   @Nullable
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   @Nullable
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public java.lang.Long getLastMessageSequenceNumber(){
      return this.lastMessageSequenceNumber;
   }
   
   
   public java.util.List<com.commercetools.models.order.SyncInfo> getSyncInfo(){
      return this.syncInfo;
   }
   
   @Nullable
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
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

   public Order build() {
       return new OrderImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, shipmentState, country, orderNumber, totalPrice, shippingRateInput, taxedPrice, origin, shippingInfo, locale, cart, inventoryMode, orderState, returnInfo, lineItems, customLineItems, itemShippingAddresses, customerEmail, customerId, state, paymentState, anonymousId, discountCodes, completedAt, customerGroup, custom, taxCalculationMode, store, lastMessageSequenceNumber, syncInfo, taxRoundingMode, taxMode, shippingAddress, billingAddress, paymentInfo);
   }
   
   public static OrderBuilder of() {
      return new OrderBuilder();
   }
   
   public static OrderBuilder of(final Order template) {
      OrderBuilder builder = new OrderBuilder();
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