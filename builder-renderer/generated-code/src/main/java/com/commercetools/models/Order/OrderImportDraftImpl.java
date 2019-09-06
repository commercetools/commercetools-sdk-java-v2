package com.commercetools.models.Order;

import com.commercetools.models.Cart.CustomLineItemDraft;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.Money;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.Order.LineItemImportDraft;
import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.PaymentState;
import com.commercetools.models.Order.ShipmentState;
import com.commercetools.models.Order.ShippingInfoImportDraft;
import com.commercetools.models.Type.CustomFieldsDraft;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImportDraftImpl implements OrderImportDraft {

   private com.commercetools.models.Order.ShipmentState shipmentState;
   
   private java.lang.String country;
   
   private java.time.ZonedDateTime completedAt;
   
   private java.lang.String orderNumber;
   
   private com.commercetools.models.Common.Money totalPrice;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.models.Cart.TaxedPrice taxedPrice;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Order.ShippingInfoImportDraft shippingInfo;
   
   private com.commercetools.models.Cart.InventoryMode inventoryMode;
   
   private com.commercetools.models.Order.OrderState orderState;
   
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   private java.util.List<com.commercetools.models.Order.LineItemImportDraft> lineItems;
   
   private java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems;
   
   private java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses;
   
   private java.lang.String customerEmail;
   
   private java.lang.String customerId;
   
   private com.commercetools.models.Common.Address shippingAddress;
   
   private com.commercetools.models.Common.Address billingAddress;
   
   private com.commercetools.models.Order.PaymentState paymentState;

   @JsonCreator
   OrderImportDraftImpl(@JsonProperty("shipmentState") final com.commercetools.models.Order.ShipmentState shipmentState, @JsonProperty("country") final java.lang.String country, @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt, @JsonProperty("orderNumber") final java.lang.String orderNumber, @JsonProperty("totalPrice") final com.commercetools.models.Common.Money totalPrice, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("taxedPrice") final com.commercetools.models.Cart.TaxedPrice taxedPrice, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("shippingInfo") final com.commercetools.models.Order.ShippingInfoImportDraft shippingInfo, @JsonProperty("inventoryMode") final com.commercetools.models.Cart.InventoryMode inventoryMode, @JsonProperty("orderState") final com.commercetools.models.Order.OrderState orderState, @JsonProperty("taxRoundingMode") final com.commercetools.models.Cart.RoundingMode taxRoundingMode, @JsonProperty("lineItems") final java.util.List<com.commercetools.models.Order.LineItemImportDraft> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final java.lang.String customerEmail, @JsonProperty("customerId") final java.lang.String customerId, @JsonProperty("shippingAddress") final com.commercetools.models.Common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.models.Common.Address billingAddress, @JsonProperty("paymentState") final com.commercetools.models.Order.PaymentState paymentState) {
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
   
   
   public com.commercetools.models.Order.ShipmentState getShipmentState(){
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
   
   
   public com.commercetools.models.Common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Order.ShippingInfoImportDraft getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public com.commercetools.models.Cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.models.Order.OrderState getOrderState(){
      return this.orderState;
   }
   
   
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public java.util.List<com.commercetools.models.Order.LineItemImportDraft> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public com.commercetools.models.Common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public com.commercetools.models.Common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   
   public com.commercetools.models.Order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setShipmentState(final com.commercetools.models.Order.ShipmentState shipmentState){
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
   
   public void setTotalPrice(final com.commercetools.models.Common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setTaxedPrice(final com.commercetools.models.Cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setShippingInfo(final com.commercetools.models.Order.ShippingInfoImportDraft shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setInventoryMode(final com.commercetools.models.Cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setOrderState(final com.commercetools.models.Order.OrderState orderState){
      this.orderState = orderState;
   }
   
   public void setTaxRoundingMode(final com.commercetools.models.Cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.models.Order.LineItemImportDraft> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.models.Cart.CustomLineItemDraft> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.Common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setCustomerEmail(final java.lang.String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }
   
   public void setShippingAddress(final com.commercetools.models.Common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setBillingAddress(final com.commercetools.models.Common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setPaymentState(final com.commercetools.models.Order.PaymentState paymentState){
      this.paymentState = paymentState;
   }

}