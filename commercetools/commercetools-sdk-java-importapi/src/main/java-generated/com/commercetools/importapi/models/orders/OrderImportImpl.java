
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The data representation for an Order to be imported that is persisted as an <a href="/../api/projects/orders#top">Order</a> in the Project.</p>
*  <p>In commercetools, you can import an Order using the
*  <a href="https://docs.commercetools.com/http-api-projects-orders-import.html#create-an-order-by-import">Create Order by Import</a>
*  endpoint method instead of creating it from a Cart.</p>
*  <p>An OrderImport is a snapshot of an order at the time it was imported.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderImportImpl implements OrderImport {

    private String orderNumber;

    private com.commercetools.importapi.models.common.CustomerKeyReference customer;

    private String customerEmail;

    private java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems;

    private java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems;

    private com.commercetools.importapi.models.common.TypedMoney totalPrice;

    private com.commercetools.importapi.models.orders.TaxedPrice taxedPrice;

    private com.commercetools.importapi.models.common.Address shippingAddress;

    private com.commercetools.importapi.models.common.Address billingAddress;

    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    private String country;

    private com.commercetools.importapi.models.orders.OrderState orderState;

    private com.commercetools.importapi.models.orders.ShipmentState shipmentState;

    private com.commercetools.importapi.models.orders.PaymentState paymentState;

    private com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo;

    private java.time.ZonedDateTime completedAt;

    private com.commercetools.importapi.models.customfields.Custom custom;

    private com.commercetools.importapi.models.orders.InventoryMode inventoryMode;

    private com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode;

    private com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode;

    private com.commercetools.importapi.models.orders.CartOrigin origin;

    private java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses;

    @JsonCreator
    OrderImportImpl(@JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("customer") final com.commercetools.importapi.models.common.CustomerKeyReference customer,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems,
            @JsonProperty("totalPrice") final com.commercetools.importapi.models.common.TypedMoney totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.importapi.models.orders.TaxedPrice taxedPrice,
            @JsonProperty("shippingAddress") final com.commercetools.importapi.models.common.Address shippingAddress,
            @JsonProperty("billingAddress") final com.commercetools.importapi.models.common.Address billingAddress,
            @JsonProperty("customerGroup") final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup,
            @JsonProperty("country") final String country,
            @JsonProperty("orderState") final com.commercetools.importapi.models.orders.OrderState orderState,
            @JsonProperty("shipmentState") final com.commercetools.importapi.models.orders.ShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.importapi.models.orders.PaymentState paymentState,
            @JsonProperty("shippingInfo") final com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo,
            @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom,
            @JsonProperty("inventoryMode") final com.commercetools.importapi.models.orders.InventoryMode inventoryMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode,
            @JsonProperty("taxCalculationMode") final com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode,
            @JsonProperty("origin") final com.commercetools.importapi.models.orders.CartOrigin origin,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses) {
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

    /**
    *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order. It should be unique across a project. Once it's set it cannot be changed.</p>
    */
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public com.commercetools.importapi.models.common.CustomerKeyReference getCustomer() {
        return this.customer;
    }

    /**
    *  <p>Maps to <code>Order.customerEmail</code>.</p>
    */
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
    *  <p>Maps to <code>Order.lineItems</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    /**
    *  <p>Maps to <code>Order.customLineItems</code></p>
    */
    public java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
    *  <p>Maps to <code>Order.totalPrice</code>. TypedMoney is what is called BaseMoney in the HTTP API.</p>
    */
    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
    *  <p>Maps to <code>Order.taxedPrice</code>.</p>
    */
    public com.commercetools.importapi.models.orders.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
    *  <p>Maps to <code>Order.shippingAddress</code>.</p>
    */
    public com.commercetools.importapi.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
    *  <p>Maps to <code>Order.billingAddress</code>.</p>
    */
    public com.commercetools.importapi.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
    *  <p>Maps to <code>Order.customerGroup</code>.</p>
    */
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
    *  <p>Maps to <code>Order.country</code>.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>Maps to <code>Order.orderState</code>.</p>
    */
    public com.commercetools.importapi.models.orders.OrderState getOrderState() {
        return this.orderState;
    }

    /**
    *  <p>Maps to <code>Order.shipmentState</code>.</p>
    */
    public com.commercetools.importapi.models.orders.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
    *  <p>Maps to <code>Order.paymentState</code>.</p>
    */
    public com.commercetools.importapi.models.orders.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
    *  <p>Maps to <code>Order.shippingInfo</code>.</p>
    */
    public com.commercetools.importapi.models.orders.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    /**
    *  <p>Maps to <code>Order.completedAt</code>.</p>
    */
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
    *  <p>Maps to <code>Order.custom</code>.</p>
    */
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
    *  <p>Maps to <code>Order.inventoryMode</code>.</p>
    */
    public com.commercetools.importapi.models.orders.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
    *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
    */
    public com.commercetools.importapi.models.orders.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
    *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
    */
    public com.commercetools.importapi.models.orders.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
    *  <p>Maps to <code>Order.origin</code>.</p>
    */
    public com.commercetools.importapi.models.orders.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
    *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomer(final com.commercetools.importapi.models.common.CustomerKeyReference customer) {
        this.customer = customer;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setLineItems(final com.commercetools.importapi.models.orders.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(
            final java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setCustomLineItems(
            final com.commercetools.importapi.models.orders.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
    }

    public void setCustomLineItems(
            final java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
    }

    public void setTotalPrice(final com.commercetools.importapi.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTaxedPrice(final com.commercetools.importapi.models.orders.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setShippingAddress(final com.commercetools.importapi.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(final com.commercetools.importapi.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setCustomerGroup(
            final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setOrderState(final com.commercetools.importapi.models.orders.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setShipmentState(final com.commercetools.importapi.models.orders.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.importapi.models.orders.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShippingInfo(final com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setCompletedAt(final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
    }

    public void setInventoryMode(final com.commercetools.importapi.models.orders.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setTaxRoundingMode(final com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public void setTaxCalculationMode(
            final com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    public void setOrigin(final com.commercetools.importapi.models.orders.CartOrigin origin) {
        this.origin = origin;
    }

    public void setItemShippingAddresses(
            final com.commercetools.importapi.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }

    public void setItemShippingAddresses(
            final java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderImportImpl that = (OrderImportImpl) o;

        return new EqualsBuilder().append(orderNumber, that.orderNumber)
                .append(customer, that.customer)
                .append(customerEmail, that.customerEmail)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(shippingAddress, that.shippingAddress)
                .append(billingAddress, that.billingAddress)
                .append(customerGroup, that.customerGroup)
                .append(country, that.country)
                .append(orderState, that.orderState)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(shippingInfo, that.shippingInfo)
                .append(completedAt, that.completedAt)
                .append(custom, that.custom)
                .append(inventoryMode, that.inventoryMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(origin, that.origin)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(orderNumber)
                .append(customer)
                .append(customerEmail)
                .append(lineItems)
                .append(customLineItems)
                .append(totalPrice)
                .append(taxedPrice)
                .append(shippingAddress)
                .append(billingAddress)
                .append(customerGroup)
                .append(country)
                .append(orderState)
                .append(shipmentState)
                .append(paymentState)
                .append(shippingInfo)
                .append(completedAt)
                .append(custom)
                .append(inventoryMode)
                .append(taxRoundingMode)
                .append(taxCalculationMode)
                .append(origin)
                .append(itemShippingAddresses)
                .toHashCode();
    }

}
