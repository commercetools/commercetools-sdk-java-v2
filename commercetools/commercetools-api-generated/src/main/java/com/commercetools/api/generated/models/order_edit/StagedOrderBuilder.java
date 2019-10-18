package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.Order;
import com.commercetools.api.generated.models.order_edit.StagedOrder;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderBuilder {
   
   
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
   
   public StagedOrderBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public StagedOrderBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public StagedOrderBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public StagedOrderBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public StagedOrderBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public StagedOrderBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public StagedOrderBuilder shipmentState(@Nullable final com.commercetools.api.generated.models.order.ShipmentState shipmentState) {
      this.shipmentState = shipmentState;
      return this;
   }
   
   public StagedOrderBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public StagedOrderBuilder orderNumber(@Nullable final String orderNumber) {
      this.orderNumber = orderNumber;
      return this;
   }
   
   public StagedOrderBuilder totalPrice( final com.commercetools.api.generated.models.common.TypedMoney totalPrice) {
      this.totalPrice = totalPrice;
      return this;
   }
   
   public StagedOrderBuilder shippingRateInput(@Nullable final com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   public StagedOrderBuilder taxedPrice(@Nullable final com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public StagedOrderBuilder origin( final com.commercetools.api.generated.models.cart.CartOrigin origin) {
      this.origin = origin;
      return this;
   }
   
   public StagedOrderBuilder shippingInfo(@Nullable final com.commercetools.api.generated.models.cart.ShippingInfo shippingInfo) {
      this.shippingInfo = shippingInfo;
      return this;
   }
   
   public StagedOrderBuilder refusedGifts( final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> refusedGifts) {
      this.refusedGifts = refusedGifts;
      return this;
   }
   
   public StagedOrderBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public StagedOrderBuilder cart(@Nullable final com.commercetools.api.generated.models.cart.CartReference cart) {
      this.cart = cart;
      return this;
   }
   
   public StagedOrderBuilder inventoryMode(@Nullable final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode) {
      this.inventoryMode = inventoryMode;
      return this;
   }
   
   public StagedOrderBuilder orderState( final com.commercetools.api.generated.models.order.OrderState orderState) {
      this.orderState = orderState;
      return this;
   }
   
   public StagedOrderBuilder returnInfo(@Nullable final java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   public StagedOrderBuilder lineItems( final java.util.List<com.commercetools.api.generated.models.cart.LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
   }
   
   public StagedOrderBuilder customLineItems( final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> customLineItems) {
      this.customLineItems = customLineItems;
      return this;
   }
   
   public StagedOrderBuilder itemShippingAddresses(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses) {
      this.itemShippingAddresses = itemShippingAddresses;
      return this;
   }
   
   public StagedOrderBuilder customerEmail(@Nullable final String customerEmail) {
      this.customerEmail = customerEmail;
      return this;
   }
   
   public StagedOrderBuilder customerId(@Nullable final String customerId) {
      this.customerId = customerId;
      return this;
   }
   
   public StagedOrderBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateReference state) {
      this.state = state;
      return this;
   }
   
   public StagedOrderBuilder paymentState(@Nullable final com.commercetools.api.generated.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   public StagedOrderBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public StagedOrderBuilder discountCodes(@Nullable final java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
   }
   
   public StagedOrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
   }
   
   public StagedOrderBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public StagedOrderBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public StagedOrderBuilder taxCalculationMode(@Nullable final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   public StagedOrderBuilder store(@Nullable final com.commercetools.api.generated.models.store.StoreKeyReference store) {
      this.store = store;
      return this;
   }
   
   public StagedOrderBuilder lastMessageSequenceNumber( final Long lastMessageSequenceNumber) {
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
      return this;
   }
   
   public StagedOrderBuilder syncInfo( final java.util.List<com.commercetools.api.generated.models.order.SyncInfo> syncInfo) {
      this.syncInfo = syncInfo;
      return this;
   }
   
   public StagedOrderBuilder taxRoundingMode(@Nullable final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   public StagedOrderBuilder taxMode(@Nullable final com.commercetools.api.generated.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   public StagedOrderBuilder shippingAddress(@Nullable final com.commercetools.api.generated.models.common.Address shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
   }
   
   public StagedOrderBuilder billingAddress(@Nullable final com.commercetools.api.generated.models.common.Address billingAddress) {
      this.billingAddress = billingAddress;
      return this;
   }
   
   public StagedOrderBuilder paymentInfo(@Nullable final com.commercetools.api.generated.models.order.PaymentInfo paymentInfo) {
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

   public StagedOrder build() {
       return new StagedOrderImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, shipmentState, country, orderNumber, totalPrice, shippingRateInput, taxedPrice, origin, shippingInfo, refusedGifts, locale, cart, inventoryMode, orderState, returnInfo, lineItems, customLineItems, itemShippingAddresses, customerEmail, customerId, state, paymentState, anonymousId, discountCodes, completedAt, customerGroup, custom, taxCalculationMode, store, lastMessageSequenceNumber, syncInfo, taxRoundingMode, taxMode, shippingAddress, billingAddress, paymentInfo);
   }
   
   public static StagedOrderBuilder of() {
      return new StagedOrderBuilder();
   }
   
   public static StagedOrderBuilder of(final StagedOrder template) {
      StagedOrderBuilder builder = new StagedOrderBuilder();
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