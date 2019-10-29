package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CustomLineItemDraft;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.TaxedPriceDraft;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.order.LineItemImportDraft;
import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.ShippingInfoImportDraft;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
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
public final class OrderImportDraftImpl implements OrderImportDraft {

   private com.commercetools.api.generated.models.order.ShipmentState shipmentState;
   
   private String country;
   
   private java.time.ZonedDateTime completedAt;
   
   private String orderNumber;
   
   private com.commercetools.api.generated.models.common.Money totalPrice;
   
   private com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.api.generated.models.cart.TaxedPriceDraft taxedPrice;
   
   private com.commercetools.api.generated.models.cart.CartOrigin origin;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.order.ShippingInfoImportDraft shippingInfo;
   
   private com.commercetools.api.generated.models.store.StoreResourceIdentifier store;
   
   private com.commercetools.api.generated.models.cart.InventoryMode inventoryMode;
   
   private com.commercetools.api.generated.models.order.OrderState orderState;
   
   private com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode;
   
   private java.util.List<com.commercetools.api.generated.models.order.LineItemImportDraft> lineItems;
   
   private java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems;
   
   private java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses;
   
   private String customerEmail;
   
   private String customerId;
   
   private com.commercetools.api.generated.models.common.Address shippingAddress;
   
   private com.commercetools.api.generated.models.common.Address billingAddress;
   
   private com.commercetools.api.generated.models.order.PaymentState paymentState;

   @JsonCreator
   OrderImportDraftImpl(@JsonProperty("shipmentState") final com.commercetools.api.generated.models.order.ShipmentState shipmentState, @JsonProperty("country") final String country, @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt, @JsonProperty("orderNumber") final String orderNumber, @JsonProperty("totalPrice") final com.commercetools.api.generated.models.common.Money totalPrice, @JsonProperty("customerGroup") final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("taxedPrice") final com.commercetools.api.generated.models.cart.TaxedPriceDraft taxedPrice, @JsonProperty("origin") final com.commercetools.api.generated.models.cart.CartOrigin origin, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("shippingInfo") final com.commercetools.api.generated.models.order.ShippingInfoImportDraft shippingInfo, @JsonProperty("store") final com.commercetools.api.generated.models.store.StoreResourceIdentifier store, @JsonProperty("inventoryMode") final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode, @JsonProperty("orderState") final com.commercetools.api.generated.models.order.OrderState orderState, @JsonProperty("taxRoundingMode") final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.api.generated.models.order.LineItemImportDraft> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.generated.models.common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("customerId") final String customerId, @JsonProperty("shippingAddress") final com.commercetools.api.generated.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.api.generated.models.common.Address billingAddress, @JsonProperty("paymentState") final com.commercetools.api.generated.models.order.PaymentState paymentState) {
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
   
   
   public com.commercetools.api.generated.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   
   public String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxedPriceDraft getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.api.generated.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.order.ShippingInfoImportDraft getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public com.commercetools.api.generated.models.store.StoreResourceIdentifier getStore(){
      return this.store;
   }
   
   
   public com.commercetools.api.generated.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   
   public com.commercetools.api.generated.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.LineItemImportDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public String getCustomerId(){
      return this.customerId;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setShipmentState(final com.commercetools.api.generated.models.order.ShipmentState shipmentState){
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
   
   public void setTotalPrice(final com.commercetools.api.generated.models.common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setCustomerGroup(final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setTaxedPrice(final com.commercetools.api.generated.models.cart.TaxedPriceDraft taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setOrigin(final com.commercetools.api.generated.models.cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setShippingInfo(final com.commercetools.api.generated.models.order.ShippingInfoImportDraft shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setStore(final com.commercetools.api.generated.models.store.StoreResourceIdentifier store){
      this.store = store;
   }
   
   public void setInventoryMode(final com.commercetools.api.generated.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setOrderState(final com.commercetools.api.generated.models.order.OrderState orderState){
      this.orderState = orderState;
   }
   
   public void setTaxRoundingMode(final com.commercetools.api.generated.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.api.generated.models.order.LineItemImportDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.api.generated.models.cart.CustomLineItemDraft> customLineItems){
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
   
   public void setShippingAddress(final com.commercetools.api.generated.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setBillingAddress(final com.commercetools.api.generated.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setPaymentState(final com.commercetools.api.generated.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }

}