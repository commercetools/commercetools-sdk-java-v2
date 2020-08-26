package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.common.Address;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.CustomerKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.TypedMoney;
import com.commercetools.importer.models.customfields.Custom;
import com.commercetools.importer.models.orders.CartOrigin;
import com.commercetools.importer.models.orders.CustomLineItemDraft;
import com.commercetools.importer.models.orders.InventoryMode;
import com.commercetools.importer.models.orders.LineItemImportDraft;
import com.commercetools.importer.models.orders.OrderState;
import com.commercetools.importer.models.orders.PaymentState;
import com.commercetools.importer.models.orders.RoundingMode;
import com.commercetools.importer.models.orders.ShipmentState;
import com.commercetools.importer.models.orders.ShippingInfoImportDraft;
import com.commercetools.importer.models.orders.TaxCalculationMode;
import com.commercetools.importer.models.orders.TaxedPrice;
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


/**
*  <p>Import representation for an order.</p>
*  <p>In commercetools, the only way to create an order is using the
*  <a href="https://docs.commercetools.com/http-api-projects-orders#create-order-from-cart">Create Order from Cart</a> endpoint.
*  method. Unlike the Create Order from Cart endpoint, when importing an order
*  using the Import API, you must provide all non-optional fields required for creating
*  an order, rather than just a cart ID.</p>
*  <p>The OrderImport type also contains draft subtypes. These types are normally populated
*  by the Cart the order is created from, but in this case must be populated as a part of the import request.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImportImpl implements OrderImport {

    private String key;
    
    private String orderNumber;
    
    private com.commercetools.importer.models.common.CustomerKeyReference customer;
    
    private String customerEmail;
    
    private java.util.List<com.commercetools.importer.models.orders.LineItemImportDraft> lineItems;
    
    private java.util.List<com.commercetools.importer.models.orders.CustomLineItemDraft> customLineItems;
    
    private com.commercetools.importer.models.common.TypedMoney totalPrice;
    
    private com.commercetools.importer.models.orders.TaxedPrice taxedPrice;
    
    private com.commercetools.importer.models.common.Address shippingAddress;
    
    private com.commercetools.importer.models.common.Address billingAddress;
    
    private com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup;
    
    private String country;
    
    private com.commercetools.importer.models.orders.OrderState orderState;
    
    private com.commercetools.importer.models.orders.ShipmentState shipmentState;
    
    private com.commercetools.importer.models.orders.PaymentState paymentState;
    
    private com.commercetools.importer.models.orders.ShippingInfoImportDraft shippingInfo;
    
    private java.time.ZonedDateTime completedAt;
    
    private com.commercetools.importer.models.customfields.Custom custom;
    
    private com.commercetools.importer.models.orders.InventoryMode inventoryMode;
    
    private com.commercetools.importer.models.orders.RoundingMode taxRoundingMode;
    
    private com.commercetools.importer.models.orders.TaxCalculationMode taxCalculationMode;
    
    private com.commercetools.importer.models.orders.CartOrigin origin;
    
    private java.util.List<com.commercetools.importer.models.common.Address> itemShippingAddresses;

    @JsonCreator
    OrderImportImpl(@JsonProperty("key") final String key, @JsonProperty("orderNumber") final String orderNumber, @JsonProperty("customer") final com.commercetools.importer.models.common.CustomerKeyReference customer, @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("lineItems") final java.util.List<com.commercetools.importer.models.orders.LineItemImportDraft> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.importer.models.orders.CustomLineItemDraft> customLineItems, @JsonProperty("totalPrice") final com.commercetools.importer.models.common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.importer.models.orders.TaxedPrice taxedPrice, @JsonProperty("shippingAddress") final com.commercetools.importer.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.importer.models.common.Address billingAddress, @JsonProperty("customerGroup") final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup, @JsonProperty("country") final String country, @JsonProperty("orderState") final com.commercetools.importer.models.orders.OrderState orderState, @JsonProperty("shipmentState") final com.commercetools.importer.models.orders.ShipmentState shipmentState, @JsonProperty("paymentState") final com.commercetools.importer.models.orders.PaymentState paymentState, @JsonProperty("shippingInfo") final com.commercetools.importer.models.orders.ShippingInfoImportDraft shippingInfo, @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt, @JsonProperty("custom") final com.commercetools.importer.models.customfields.Custom custom, @JsonProperty("inventoryMode") final com.commercetools.importer.models.orders.InventoryMode inventoryMode, @JsonProperty("taxRoundingMode") final com.commercetools.importer.models.orders.RoundingMode taxRoundingMode, @JsonProperty("taxCalculationMode") final com.commercetools.importer.models.orders.TaxCalculationMode taxCalculationMode, @JsonProperty("origin") final com.commercetools.importer.models.orders.CartOrigin origin, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.importer.models.common.Address> itemShippingAddresses) {
        this.key = key;
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.customerEmail = customerEmail;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.customerGroup = customerGroup;
        this.country = country;
        this.orderState = orderState;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.shippingInfo = shippingInfo;
        this.completedAt = completedAt;
        this.custom = custom;
        this.inventoryMode = inventoryMode;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.origin = origin;
        this.itemShippingAddresses = itemShippingAddresses;
    }
    public OrderImportImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    /**
    *  <p>Maps to <code>Order.orderNumber</code>.</p>
    */
    public String getOrderNumber(){
        return this.orderNumber;
    }
    
    /**
    *  <p>References a customer by its key.</p>
    */
    public com.commercetools.importer.models.common.CustomerKeyReference getCustomer(){
        return this.customer;
    }
    
    /**
    *  <p>Maps to <code>Order.customerEmail</code>.</p>
    */
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    
    /**
    *  <p>Maps to <code>Order.lineItems</code>.</p>
    */
    public java.util.List<com.commercetools.importer.models.orders.LineItemImportDraft> getLineItems(){
        return this.lineItems;
    }
    
    /**
    *  <p>Maps to <code>Order.customLineItems</code></p>
    */
    public java.util.List<com.commercetools.importer.models.orders.CustomLineItemDraft> getCustomLineItems(){
        return this.customLineItems;
    }
    
    /**
    *  <p>Maps to <code>Order.totalPrice</code>.</p>
    */
    public com.commercetools.importer.models.common.TypedMoney getTotalPrice(){
        return this.totalPrice;
    }
    
    /**
    *  <p>Maps to <code>Order.taxedPrice</code>.</p>
    */
    public com.commercetools.importer.models.orders.TaxedPrice getTaxedPrice(){
        return this.taxedPrice;
    }
    
    /**
    *  <p>Maps to <code>Order.shippingAddress</code>.</p>
    */
    public com.commercetools.importer.models.common.Address getShippingAddress(){
        return this.shippingAddress;
    }
    
    /**
    *  <p>Maps to <code>Order.billingAddress</code>.</p>
    */
    public com.commercetools.importer.models.common.Address getBillingAddress(){
        return this.billingAddress;
    }
    
    /**
    *  <p>Maps to <code>Order.customerGroup</code>.</p>
    */
    public com.commercetools.importer.models.common.CustomerGroupKeyReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
    *  <p>Maps to <code>Order.country</code>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    /**
    *  <p>Maps to <code>Order.orderState</code>.</p>
    */
    public com.commercetools.importer.models.orders.OrderState getOrderState(){
        return this.orderState;
    }
    
    /**
    *  <p>Maps to <code>Order.shipmentState</code>.</p>
    */
    public com.commercetools.importer.models.orders.ShipmentState getShipmentState(){
        return this.shipmentState;
    }
    
    /**
    *  <p>Maps to <code>Order.paymentState</code>.</p>
    */
    public com.commercetools.importer.models.orders.PaymentState getPaymentState(){
        return this.paymentState;
    }
    
    /**
    *  <p>Maps to <code>Order.shippingInfo</code>.</p>
    */
    public com.commercetools.importer.models.orders.ShippingInfoImportDraft getShippingInfo(){
        return this.shippingInfo;
    }
    
    /**
    *  <p>Maps to <code>Order.completedAt</code>.</p>
    */
    public java.time.ZonedDateTime getCompletedAt(){
        return this.completedAt;
    }
    
    /**
    *  <p>Maps to <code>Order.custom</code>.</p>
    */
    public com.commercetools.importer.models.customfields.Custom getCustom(){
        return this.custom;
    }
    
    /**
    *  <p>Maps to <code>Order.inventoryMode</code>.</p>
    */
    public com.commercetools.importer.models.orders.InventoryMode getInventoryMode(){
        return this.inventoryMode;
    }
    
    /**
    *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
    */
    public com.commercetools.importer.models.orders.RoundingMode getTaxRoundingMode(){
        return this.taxRoundingMode;
    }
    
    /**
    *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
    */
    public com.commercetools.importer.models.orders.TaxCalculationMode getTaxCalculationMode(){
        return this.taxCalculationMode;
    }
    
    /**
    *  <p>Maps to <code>Order.origin</code>.</p>
    */
    public com.commercetools.importer.models.orders.CartOrigin getOrigin(){
        return this.origin;
    }
    
    /**
    *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
    */
    public java.util.List<com.commercetools.importer.models.common.Address> getItemShippingAddresses(){
        return this.itemShippingAddresses;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setOrderNumber(final String orderNumber){
        this.orderNumber = orderNumber;
    }
    
    public void setCustomer(final com.commercetools.importer.models.common.CustomerKeyReference customer){
        this.customer = customer;
    }
    
    public void setCustomerEmail(final String customerEmail){
        this.customerEmail = customerEmail;
    }
    
    public void setLineItems(final java.util.List<com.commercetools.importer.models.orders.LineItemImportDraft> lineItems){
        this.lineItems = lineItems;
    }
    
    public void setCustomLineItems(final java.util.List<com.commercetools.importer.models.orders.CustomLineItemDraft> customLineItems){
        this.customLineItems = customLineItems;
    }
    
    public void setTotalPrice(final com.commercetools.importer.models.common.TypedMoney totalPrice){
        this.totalPrice = totalPrice;
    }
    
    public void setTaxedPrice(final com.commercetools.importer.models.orders.TaxedPrice taxedPrice){
        this.taxedPrice = taxedPrice;
    }
    
    public void setShippingAddress(final com.commercetools.importer.models.common.Address shippingAddress){
        this.shippingAddress = shippingAddress;
    }
    
    public void setBillingAddress(final com.commercetools.importer.models.common.Address billingAddress){
        this.billingAddress = billingAddress;
    }
    
    public void setCustomerGroup(final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    public void setOrderState(final com.commercetools.importer.models.orders.OrderState orderState){
        this.orderState = orderState;
    }
    
    public void setShipmentState(final com.commercetools.importer.models.orders.ShipmentState shipmentState){
        this.shipmentState = shipmentState;
    }
    
    public void setPaymentState(final com.commercetools.importer.models.orders.PaymentState paymentState){
        this.paymentState = paymentState;
    }
    
    public void setShippingInfo(final com.commercetools.importer.models.orders.ShippingInfoImportDraft shippingInfo){
        this.shippingInfo = shippingInfo;
    }
    
    public void setCompletedAt(final java.time.ZonedDateTime completedAt){
        this.completedAt = completedAt;
    }
    
    public void setCustom(final com.commercetools.importer.models.customfields.Custom custom){
        this.custom = custom;
    }
    
    public void setInventoryMode(final com.commercetools.importer.models.orders.InventoryMode inventoryMode){
        this.inventoryMode = inventoryMode;
    }
    
    public void setTaxRoundingMode(final com.commercetools.importer.models.orders.RoundingMode taxRoundingMode){
        this.taxRoundingMode = taxRoundingMode;
    }
    
    public void setTaxCalculationMode(final com.commercetools.importer.models.orders.TaxCalculationMode taxCalculationMode){
        this.taxCalculationMode = taxCalculationMode;
    }
    
    public void setOrigin(final com.commercetools.importer.models.orders.CartOrigin origin){
        this.origin = origin;
    }
    
    public void setItemShippingAddresses(final java.util.List<com.commercetools.importer.models.common.Address> itemShippingAddresses){
        this.itemShippingAddresses = itemShippingAddresses;
    }

}
