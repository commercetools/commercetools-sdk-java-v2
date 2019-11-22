package com.commercetools.api.generated.models.order;

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
import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.PaymentInfo;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.ReturnInfo;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.SyncInfo;
import com.commercetools.api.generated.models.order_edit.StagedOrder;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.store.StoreKeyReference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImpl implements Order {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.generated.models.order.ShipmentState shipmentState;
   
   private String country;
   
   private String orderNumber;
   
   private com.commercetools.api.generated.models.common.TypedMoney totalPrice;
   
   private com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput;
   
   private com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice;
   
   private com.commercetools.api.generated.models.cart.CartOrigin origin;
   
   private com.commercetools.api.generated.models.cart.ShippingInfo shippingInfo;
   
   private java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> refusedGifts;
   
   private String locale;
   
   private com.commercetools.api.generated.models.cart.CartReference cart;
   
   private com.commercetools.api.generated.models.cart.InventoryMode inventoryMode;
   
   private com.commercetools.api.generated.models.order.OrderState orderState;
   
   private java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> returnInfo;
   
   private java.util.List<com.commercetools.api.generated.models.cart.LineItem> lineItems;
   
   private java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> customLineItems;
   
   private java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses;
   
   private String customerEmail;
   
   private String customerId;
   
   private com.commercetools.api.generated.models.state.StateReference state;
   
   private com.commercetools.api.generated.models.order.PaymentState paymentState;
   
   private String anonymousId;
   
   private java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> discountCodes;
   
   private java.time.ZonedDateTime completedAt;
   
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode;
   
   private com.commercetools.api.generated.models.store.StoreKeyReference store;
   
   private Long lastMessageSequenceNumber;
   
   private java.util.List<com.commercetools.api.generated.models.order.SyncInfo> syncInfo;
   
   private com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode;
   
   private com.commercetools.api.generated.models.cart.TaxMode taxMode;
   
   private com.commercetools.api.generated.models.common.Address shippingAddress;
   
   private com.commercetools.api.generated.models.common.Address billingAddress;
   
   private com.commercetools.api.generated.models.order.PaymentInfo paymentInfo;

   @JsonCreator
   OrderImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("shipmentState") final com.commercetools.api.generated.models.order.ShipmentState shipmentState, @JsonProperty("country") final String country, @JsonProperty("orderNumber") final String orderNumber, @JsonProperty("totalPrice") final com.commercetools.api.generated.models.common.TypedMoney totalPrice, @JsonProperty("shippingRateInput") final com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput, @JsonProperty("taxedPrice") final com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice, @JsonProperty("origin") final com.commercetools.api.generated.models.cart.CartOrigin origin, @JsonProperty("shippingInfo") final com.commercetools.api.generated.models.cart.ShippingInfo shippingInfo, @JsonProperty("refusedGifts") final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> refusedGifts, @JsonProperty("locale") final String locale, @JsonProperty("cart") final com.commercetools.api.generated.models.cart.CartReference cart, @JsonProperty("inventoryMode") final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode, @JsonProperty("orderState") final com.commercetools.api.generated.models.order.OrderState orderState, @JsonProperty("returnInfo") final java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> returnInfo, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.generated.models.cart.LineItem> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("customerId") final String customerId, @JsonProperty("state") final com.commercetools.api.generated.models.state.StateReference state, @JsonProperty("paymentState") final com.commercetools.api.generated.models.order.PaymentState paymentState, @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("discountCodes") final java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> discountCodes, @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt, @JsonProperty("customerGroup") final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("taxCalculationMode") final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.api.generated.models.store.StoreKeyReference store, @JsonProperty("lastMessageSequenceNumber") final Long lastMessageSequenceNumber, @JsonProperty("syncInfo") final java.util.List<com.commercetools.api.generated.models.order.SyncInfo> syncInfo, @JsonProperty("taxRoundingMode") final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode, @JsonProperty("taxMode") final com.commercetools.api.generated.models.cart.TaxMode taxMode, @JsonProperty("shippingAddress") final com.commercetools.api.generated.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.api.generated.models.common.Address billingAddress, @JsonProperty("paymentInfo") final com.commercetools.api.generated.models.order.PaymentInfo paymentInfo) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.shipmentState = shipmentState;
      this.country = country;
      this.orderNumber = orderNumber;
      this.totalPrice = totalPrice;
      this.shippingRateInput = shippingRateInput;
      this.taxedPrice = taxedPrice;
      this.origin = origin;
      this.shippingInfo = shippingInfo;
      this.refusedGifts = refusedGifts;
      this.locale = locale;
      this.cart = cart;
      this.inventoryMode = inventoryMode;
      this.orderState = orderState;
      this.returnInfo = returnInfo;
      this.lineItems = lineItems;
      this.customLineItems = customLineItems;
      this.itemShippingAddresses = itemShippingAddresses;
      this.customerEmail = customerEmail;
      this.customerId = customerId;
      this.state = state;
      this.paymentState = paymentState;
      this.anonymousId = anonymousId;
      this.discountCodes = discountCodes;
      this.completedAt = completedAt;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.taxCalculationMode = taxCalculationMode;
      this.store = store;
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
      this.syncInfo = syncInfo;
      this.taxRoundingMode = taxRoundingMode;
      this.taxMode = taxMode;
      this.shippingAddress = shippingAddress;
      this.billingAddress = billingAddress;
      this.paymentInfo = paymentInfo;
   }
   public OrderImpl() {
      
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   	<p>The unique ID of the order.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   	<p>The current version of the order.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   	<p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   	<p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
   	Used for product variant price selection.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   /**
   	<p>String that uniquely identifies an order.
   	It can be used to create more human-readable (in contrast to ID) identifier for the order.
   	It should be unique across a project.
   	Once it's set it cannot be changed.</p>
   */
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   /**
   	<p>The shippingRateInput is used as an input to select a ShippingRatePriceTier.</p>
   */
   public com.commercetools.api.generated.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   /**
   	<p>The taxes are calculated based on the shipping address.</p>
   */
   public com.commercetools.api.generated.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   /**
   	<p>Set if the ShippingMethod is set.</p>
   */
   public com.commercetools.api.generated.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   /**
   	<p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> getRefusedGifts(){
      return this.refusedGifts;
   }
   
   /**
   	
   */
   public String getLocale(){
      return this.locale;
   }
   
   /**
   	<p>Set when this order was created from a cart.
   	The cart will have the state <code>Ordered</code>.</p>
   */
   public com.commercetools.api.generated.models.cart.CartReference getCart(){
      return this.cart;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   /**
   	<p>One of the four predefined OrderStates.</p>
   */
   public com.commercetools.api.generated.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> getReturnInfo(){
      return this.returnInfo;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   /**
   	<p>Contains addresses for orders with multiple shipping addresses.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   /**
   	
   */
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   /**
   	
   */
   public String getCustomerId(){
      return this.customerId;
   }
   
   /**
   	<p>This reference can point to a state in a custom workflow.</p>
   */
   public com.commercetools.api.generated.models.state.StateReference getState(){
      return this.state;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   /**
   	<p>Identifies carts and orders belonging to an anonymous session (the customer has not signed up/in yet).</p>
   */
   public String getAnonymousId(){
      return this.anonymousId;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   /**
   	<p>This field will only be present if it was set for Order Import</p>
   */
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   /**
   	<p>Set when the customer is set and the customer is a member of a customer group.
   	Used for product variant price selection.</p>
   */
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   	<p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with LineItemLevel (horizontally) or UnitPriceLevel (vertically) calculation mode.</p>
   */
   public com.commercetools.api.generated.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   /**
   	<p>The sequence number of the last order message produced by changes to this order.
   	<code>0</code> means, that no messages were created yet.</p>
   */
   public Long getLastMessageSequenceNumber(){
      return this.lastMessageSequenceNumber;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.order.SyncInfo> getSyncInfo(){
      return this.syncInfo;
   }
   
   /**
   	<p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rouding.</p>
   */
   public com.commercetools.api.generated.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setShipmentState(final com.commercetools.api.generated.models.order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setOrderNumber(final String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setTotalPrice(final com.commercetools.api.generated.models.common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setShippingRateInput(final com.commercetools.api.generated.models.cart.ShippingRateInput shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setTaxedPrice(final com.commercetools.api.generated.models.cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setOrigin(final com.commercetools.api.generated.models.cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setShippingInfo(final com.commercetools.api.generated.models.cart.ShippingInfo shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setRefusedGifts(final java.util.List<com.commercetools.api.generated.models.cart_discount.CartDiscountReference> refusedGifts){
      this.refusedGifts = refusedGifts;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setCart(final com.commercetools.api.generated.models.cart.CartReference cart){
      this.cart = cart;
   }
   
   public void setInventoryMode(final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setOrderState(final com.commercetools.api.generated.models.order.OrderState orderState){
      this.orderState = orderState;
   }
   
   public void setReturnInfo(final java.util.List<com.commercetools.api.generated.models.order.ReturnInfo> returnInfo){
      this.returnInfo = returnInfo;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.api.generated.models.cart.LineItem> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItem> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setCustomerEmail(final String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }
   
   public void setState(final com.commercetools.api.generated.models.state.StateReference state){
      this.state = state;
   }
   
   public void setPaymentState(final com.commercetools.api.generated.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }
   
   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setDiscountCodes(final java.util.List<com.commercetools.api.generated.models.cart.DiscountCodeInfo> discountCodes){
      this.discountCodes = discountCodes;
   }
   
   public void setCompletedAt(final java.time.ZonedDateTime completedAt){
      this.completedAt = completedAt;
   }
   
   public void setCustomerGroup(final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setTaxCalculationMode(final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }
   
   public void setStore(final com.commercetools.api.generated.models.store.StoreKeyReference store){
      this.store = store;
   }
   
   public void setLastMessageSequenceNumber(final Long lastMessageSequenceNumber){
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
   }
   
   public void setSyncInfo(final java.util.List<com.commercetools.api.generated.models.order.SyncInfo> syncInfo){
      this.syncInfo = syncInfo;
   }
   
   public void setTaxRoundingMode(final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setTaxMode(final com.commercetools.api.generated.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setShippingAddress(final com.commercetools.api.generated.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setBillingAddress(final com.commercetools.api.generated.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setPaymentInfo(final com.commercetools.api.generated.models.order.PaymentInfo paymentInfo){
      this.paymentInfo = paymentInfo;
   }

}