package com.commercetools.models.order;

import com.commercetools.models.cart.CustomLineItemDraft;
import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.RoundingMode;
import com.commercetools.models.cart.TaxedPrice;
import com.commercetools.models.common.Address;
import com.commercetools.models.common.Money;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.models.order.LineItemImportDraft;
import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.PaymentState;
import com.commercetools.models.order.ShipmentState;
import com.commercetools.models.order.ShippingInfoImportDraft;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.String;
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

   private com.commercetools.models.order.ShipmentState shipmentState;
   
   private java.lang.String country;
   
   private java.time.ZonedDateTime completedAt;
   
   private java.lang.String orderNumber;
   
   private com.commercetools.models.common.Money totalPrice;
   
   private com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.models.cart.TaxedPrice taxedPrice;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.order.ShippingInfoImportDraft shippingInfo;
   
   private com.commercetools.models.cart.InventoryMode inventoryMode;
   
   private com.commercetools.models.order.OrderState orderState;
   
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   private java.util.List<com.commercetools.models.order.LineItemImportDraft> lineItems;
   
   private java.util.List<com.commercetools.models.cart.CustomLineItemDraft> customLineItems;
   
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   private java.lang.String customerEmail;
   
   private java.lang.String customerId;
   
   private com.commercetools.models.common.Address shippingAddress;
   
   private com.commercetools.models.common.Address billingAddress;
   
   private com.commercetools.models.order.PaymentState paymentState;

   @JsonCreator
   OrderImportDraftImpl(@JsonProperty("shipmentState") final com.commercetools.models.order.ShipmentState shipmentState, @JsonProperty("country") final java.lang.String country, @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt, @JsonProperty("orderNumber") final java.lang.String orderNumber, @JsonProperty("totalPrice") final com.commercetools.models.common.Money totalPrice, @JsonProperty("customerGroup") final com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("taxedPrice") final com.commercetools.models.cart.TaxedPrice taxedPrice, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("shippingInfo") final com.commercetools.models.order.ShippingInfoImportDraft shippingInfo, @JsonProperty("inventoryMode") final com.commercetools.models.cart.InventoryMode inventoryMode, @JsonProperty("orderState") final com.commercetools.models.order.OrderState orderState, @JsonProperty("taxRoundingMode") final com.commercetools.models.cart.RoundingMode taxRoundingMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.models.order.LineItemImportDraft> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.models.cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final java.lang.String customerEmail, @JsonProperty("customerId") final java.lang.String customerId, @JsonProperty("shippingAddress") final com.commercetools.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.models.common.Address billingAddress, @JsonProperty("paymentState") final com.commercetools.models.order.PaymentState paymentState) {
      this.shipmentState = shipmentState;
      this.country = country;
      this.completedAt = completedAt;
      this.orderNumber = orderNumber;
      this.totalPrice = totalPrice;
      this.customerGroup = customerGroup;
      this.taxedPrice = taxedPrice;
      this.custom = custom;
      this.shippingInfo = shippingInfo;
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
   
   
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.order.ShippingInfoImportDraft getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public java.util.List<com.commercetools.models.order.LineItemImportDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.models.cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public com.commercetools.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public com.commercetools.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   
   public com.commercetools.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setShipmentState(final com.commercetools.models.order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setCompletedAt(final java.time.ZonedDateTime completedAt){
      this.completedAt = completedAt;
   }
   
   public void setOrderNumber(final java.lang.String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setTotalPrice(final com.commercetools.models.common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setTaxedPrice(final com.commercetools.models.cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setShippingInfo(final com.commercetools.models.order.ShippingInfoImportDraft shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setInventoryMode(final com.commercetools.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setOrderState(final com.commercetools.models.order.OrderState orderState){
      this.orderState = orderState;
   }
   
   public void setTaxRoundingMode(final com.commercetools.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.models.order.LineItemImportDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.models.cart.CustomLineItemDraft> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setCustomerEmail(final java.lang.String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }
   
   public void setShippingAddress(final com.commercetools.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setBillingAddress(final com.commercetools.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setPaymentState(final com.commercetools.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }

}