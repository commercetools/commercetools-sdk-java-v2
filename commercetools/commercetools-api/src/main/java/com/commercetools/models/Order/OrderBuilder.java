package com.commercetools.models.Order;

import com.commercetools.models.Cart.CartOrigin;
import com.commercetools.models.Cart.CartReference;
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
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.Money;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.PaymentInfo;
import com.commercetools.models.Order.PaymentState;
import com.commercetools.models.Order.ReturnInfo;
import com.commercetools.models.Order.ShipmentState;
import com.commercetools.models.Order.SyncInfo;
import com.commercetools.models.OrderEdit.StagedOrder;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.Store.StoreKeyReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.Order;
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
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   @Nullable
   private java.lang.String country;
   
   @Nullable
   private java.lang.String orderNumber;
   
   
   private com.commercetools.models.Common.Money totalPrice;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInput shippingRateInput;
   
   @Nullable
   private com.commercetools.models.Cart.TaxedPrice taxedPrice;
   
   
   private com.commercetools.models.Cart.CartOrigin origin;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingInfo shippingInfo;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private com.commercetools.models.Cart.CartReference cart;
   
   @Nullable
   private com.commercetools.models.Cart.InventoryMode inventoryMode;
   
   
   private com.commercetools.models.Order.OrderState orderState;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.ReturnInfo> returnInfo;
   
   
   private java.util.List<com.commercetools.models.Cart.LineItem> lineItems;
   
   
   private java.util.List<com.commercetools.models.Cart.CustomLineItem> customLineItems;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses;
   
   @Nullable
   private java.lang.String customerEmail;
   
   @Nullable
   private java.lang.String customerId;
   
   @Nullable
   private com.commercetools.models.State.StateReference state;
   
   @Nullable
   private com.commercetools.models.Order.PaymentState paymentState;
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> discountCodes;
   
   @Nullable
   private java.time.ZonedDateTime completedAt;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode;
   
   @Nullable
   private com.commercetools.models.Store.StoreKeyReference store;
   
   
   private java.lang.Long lastMessageSequenceNumber;
   
   
   private java.util.List<com.commercetools.models.Order.SyncInfo> syncInfo;
   
   @Nullable
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   @Nullable
   private com.commercetools.models.Cart.TaxMode taxMode;
   
   @Nullable
   private com.commercetools.models.Common.Address shippingAddress;
   
   @Nullable
   private com.commercetools.models.Common.Address billingAddress;
   
   @Nullable
   private com.commercetools.models.Order.PaymentInfo paymentInfo;
   
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
   
   public OrderBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public OrderBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public OrderBuilder shipmentState(@Nullable final com.commercetools.models.Order.ShipmentState shipmentState) {
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
   
   public OrderBuilder totalPrice( final com.commercetools.models.Common.Money totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public OrderBuilder shippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public OrderBuilder taxedPrice(@Nullable final com.commercetools.models.Cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public OrderBuilder origin( final com.commercetools.models.Cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public OrderBuilder shippingInfo(@Nullable final com.commercetools.models.Cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public OrderBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public OrderBuilder cart(@Nullable final com.commercetools.models.Cart.CartReference cart) {
      this.cart = cart;
      return this;
   }
   
   public OrderBuilder inventoryMode(@Nullable final com.commercetools.models.Cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public OrderBuilder orderState( final com.commercetools.models.Order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   public OrderBuilder returnInfo(@Nullable final java.util.List<com.commercetools.models.Order.ReturnInfo> returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   public OrderBuilder lineItems( final java.util.List<com.commercetools.models.Cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public OrderBuilder customLineItems( final java.util.List<com.commercetools.models.Cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public OrderBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses) {
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
   
   public OrderBuilder state(@Nullable final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   public OrderBuilder paymentState(@Nullable final com.commercetools.models.Order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public OrderBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public OrderBuilder discountCodes(@Nullable final java.util.List<com.commercetools.models.Cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public OrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
   }
   
   public OrderBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public OrderBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public OrderBuilder taxCalculationMode(@Nullable final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public OrderBuilder store(@Nullable final com.commercetools.models.Store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public OrderBuilder lastMessageSequenceNumber( final java.lang.Long lastMessageSequenceNumber) {
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
      return this;
   }
   
   public OrderBuilder syncInfo( final java.util.List<com.commercetools.models.Order.SyncInfo> syncInfo) {
      this.syncInfo = syncInfo;
      return this;
   }
   
   public OrderBuilder taxRoundingMode(@Nullable final com.commercetools.models.Cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public OrderBuilder taxMode(@Nullable final com.commercetools.models.Cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public OrderBuilder shippingAddress(@Nullable final com.commercetools.models.Common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public OrderBuilder billingAddress(@Nullable final com.commercetools.models.Common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public OrderBuilder paymentInfo(@Nullable final com.commercetools.models.Order.PaymentInfo paymentInfo) {
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
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
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
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
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
   public com.commercetools.models.Cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public com.commercetools.models.Cart.CartReference getCart(){
      return this.cart;
   }
   
   @Nullable
   public com.commercetools.models.Cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.models.Order.OrderState getOrderState(){
      return this.orderState;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Order.ReturnInfo> getReturnInfo(){
      return this.returnInfo;
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
   
   @Nullable
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   @Nullable
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public com.commercetools.models.Order.PaymentState getPaymentState(){
      return this.paymentState;
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
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   @Nullable
   public com.commercetools.models.Store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public java.lang.Long getLastMessageSequenceNumber(){
      return this.lastMessageSequenceNumber;
   }
   
   
   public java.util.List<com.commercetools.models.Order.SyncInfo> getSyncInfo(){
      return this.syncInfo;
   }
   
   @Nullable
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   @Nullable
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