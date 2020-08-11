package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CustomLineItemDraft;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.TaxedPriceDraft;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.order.LineItemImportDraft;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.ShippingInfoImportDraft;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImportDraftImpl implements OrderImportDraft {

   private com.commercetools.api.models.order.ShipmentState shipmentState;

   private String country;

   private java.time.ZonedDateTime completedAt;

   private String orderNumber;

   private com.commercetools.api.models.common.Money totalPrice;

   private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

   private com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice;

   private com.commercetools.api.models.cart.CartOrigin origin;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo;

   private com.commercetools.api.models.store.StoreResourceIdentifier store;

   private com.commercetools.api.models.cart.InventoryMode inventoryMode;

   private com.commercetools.api.models.order.OrderState orderState;

   private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

   private java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems;

   private java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems;

   private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

   private String customerEmail;

   private String customerId;

   private com.commercetools.api.models.common.Address shippingAddress;

   private com.commercetools.api.models.common.Address billingAddress;

   private com.commercetools.api.models.order.PaymentState paymentState;

   @JsonCreator
   OrderImportDraftImpl(@JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState, @JsonProperty("country") final String country, @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt, @JsonProperty("orderNumber") final String orderNumber, @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice, @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("shippingInfo") final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo, @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store, @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode, @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState, @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("customerId") final String customerId, @JsonProperty("shippingAddress") final com.commercetools.api.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.api.models.common.Address billingAddress, @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState) {
      this.shipmentState = shipmentState;
      this.country = country;
      this.completedAt = completedAt;
      this.orderNumber = orderNumber;
      this.totalPrice = totalPrice;
      this.customerGroup = customerGroup;
      this.taxedPrice = taxedPrice;
      this.origin = origin;
      this.custom = custom;
      this.shippingInfo = shippingInfo;
      this.store = store;
      this.inventoryMode = inventoryMode;
      this.orderState = orderState;
      this.taxRoundingMode = taxRoundingMode;
      this.lineItems = lineItems;
      this.customLineItems = customLineItems;
      this.itemShippingAddresses = itemShippingAddresses;
      this.customerEmail = customerEmail;
      this.customerId = customerId;
      this.shippingAddress = shippingAddress;
      this.billingAddress = billingAddress;
      this.paymentState = paymentState;
   }
   public OrderImportDraftImpl() {

   }


   public com.commercetools.api.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }

   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
   *  Used for product variant price selection.</p>
   */
   public String getCountry(){
      return this.country;
   }


   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }

   /**
   *  <p>String that unique identifies an order.
   *  It can be used to create more human-readable (in contrast to ID) identifier for the order.
   *  It should be unique within a project.</p>
   */
   public String getOrderNumber(){
      return this.orderNumber;
   }


   public com.commercetools.api.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }

   /**
   *  <p>Set when the customer is set and the customer is a member of a customer group.
   *  Used for product variant price selection.</p>
   */
   public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   /**
   *  <p>Order Import does not support calculation of taxes.
   *  When setting the draft the taxedPrice is to be provided.</p>
   */
   public com.commercetools.api.models.cart.TaxedPriceDraft getTaxedPrice(){
      return this.taxedPrice;
   }

   /**
   *  <p>The default origin is <code>Customer</code>.</p>
   */
   public com.commercetools.api.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }

   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }

   /**
   *  <p>Set if the ShippingMethod is set.</p>
   */
   public com.commercetools.api.models.order.ShippingInfoImportDraft getShippingInfo(){
      return this.shippingInfo;
   }


   public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
      return this.store;
   }

   /**
   *  <p>If not given the mode <code>None</code> will be assigned by default.</p>
   */
   public com.commercetools.api.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }

   /**
   *  <p>If not given the <code>Open</code> state will be assigned by default.</p>
   */
   public com.commercetools.api.models.order.OrderState getOrderState(){
      return this.orderState;
   }

   /**
   *  <p>If not given the tax rounding mode <code>HalfEven</code> will be assigned by default.</p>
   */
   public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }

   /**
   *  <p>If not given <code>customLineItems</code> must not be empty.</p>
   */
   public java.util.List<com.commercetools.api.models.order.LineItemImportDraft> getLineItems(){
      return this.lineItems;
   }

   /**
   *  <p>If not given <code>lineItems</code> must not be empty.</p>
   */
   public java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }

   /**
   *  <p>Contains addresses for orders with multiple shipping addresses.</p>
   */
   public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }

   /**
   *  <p>The customer email can be used when no check against existing Customers is desired during order import.</p>
   */
   public String getCustomerEmail(){
      return this.customerEmail;
   }

   /**
   *  <p>If given the customer with that ID must exist in the project.</p>
   */
   public String getCustomerId(){
      return this.customerId;
   }


   public com.commercetools.api.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }


   public com.commercetools.api.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }


   public com.commercetools.api.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }

   public void setCountry(final String country){
      this.country = country;
   }

   public void setCompletedAt(final java.time.ZonedDateTime completedAt){
      this.completedAt = completedAt;
   }

   public void setOrderNumber(final String orderNumber){
      this.orderNumber = orderNumber;
   }

   public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice){
      this.totalPrice = totalPrice;
   }

   public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }

   public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice){
      this.taxedPrice = taxedPrice;
   }

   public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin){
      this.origin = origin;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setShippingInfo(final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo){
      this.shippingInfo = shippingInfo;
   }

   public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store){
      this.store = store;
   }

   public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }

   public void setOrderState(final com.commercetools.api.models.order.OrderState orderState){
      this.orderState = orderState;
   }

   public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }

   public void setLineItems(final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems){
      this.lineItems = lineItems;
   }

   public void setCustomLineItems(final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems){
      this.customLineItems = customLineItems;
   }

   public void setItemShippingAddresses(final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }

   public void setCustomerEmail(final String customerEmail){
      this.customerEmail = customerEmail;
   }

   public void setCustomerId(final String customerId){
      this.customerId = customerId;
   }

   public void setShippingAddress(final com.commercetools.api.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }

   public void setBillingAddress(final com.commercetools.api.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }

   public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }

}
