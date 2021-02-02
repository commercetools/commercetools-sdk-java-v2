
package com.commercetools.importapi.models.orders;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderImportBuilder {

    private String key;

    @Nullable
    private String orderNumber;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerKeyReference customer;

    @Nullable
    private String customerEmail;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems;

    private com.commercetools.importapi.models.common.TypedMoney totalPrice;

    @Nullable
    private com.commercetools.importapi.models.orders.TaxedPrice taxedPrice;

    @Nullable
    private com.commercetools.importapi.models.common.Address shippingAddress;

    @Nullable
    private com.commercetools.importapi.models.common.Address billingAddress;

    @Nullable
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.importapi.models.orders.OrderState orderState;

    @Nullable
    private com.commercetools.importapi.models.orders.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.importapi.models.orders.PaymentState paymentState;

    @Nullable
    private com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo;

    @Nullable
    private java.time.ZonedDateTime completedAt;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    @Nullable
    private com.commercetools.importapi.models.orders.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode;

    @Nullable
    private com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode;

    @Nullable
    private com.commercetools.importapi.models.orders.CartOrigin origin;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses;

    public OrderImportBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public OrderImportBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public OrderImportBuilder customer(
            @Nullable final com.commercetools.importapi.models.common.CustomerKeyReference customer) {
        this.customer = customer;
        return this;
    }

    public OrderImportBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public OrderImportBuilder lineItems(
            @Nullable final com.commercetools.importapi.models.orders.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public OrderImportBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public OrderImportBuilder customLineItems(
            @Nullable final com.commercetools.importapi.models.orders.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    public OrderImportBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    public OrderImportBuilder totalPrice(final com.commercetools.importapi.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderImportBuilder taxedPrice(
            @Nullable final com.commercetools.importapi.models.orders.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public OrderImportBuilder shippingAddress(
            @Nullable final com.commercetools.importapi.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public OrderImportBuilder billingAddress(
            @Nullable final com.commercetools.importapi.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public OrderImportBuilder customerGroup(
            @Nullable final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public OrderImportBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public OrderImportBuilder orderState(
            @Nullable final com.commercetools.importapi.models.orders.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    public OrderImportBuilder shipmentState(
            @Nullable final com.commercetools.importapi.models.orders.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public OrderImportBuilder paymentState(
            @Nullable final com.commercetools.importapi.models.orders.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public OrderImportBuilder shippingInfo(
            @Nullable final com.commercetools.importapi.models.orders.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    public OrderImportBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    public OrderImportBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public OrderImportBuilder inventoryMode(
            @Nullable final com.commercetools.importapi.models.orders.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    public OrderImportBuilder taxRoundingMode(
            @Nullable final com.commercetools.importapi.models.orders.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    public OrderImportBuilder taxCalculationMode(
            @Nullable final com.commercetools.importapi.models.orders.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    public OrderImportBuilder origin(@Nullable final com.commercetools.importapi.models.orders.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    public OrderImportBuilder itemShippingAddresses(
            @Nullable final com.commercetools.importapi.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    public OrderImportBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.importapi.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    @Nullable
    public com.commercetools.importapi.models.common.CustomerKeyReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.OrderState getOrderState() {
        return this.orderState;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.CartOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    public OrderImport build() {
        return new OrderImportImpl(key, orderNumber, customer, customerEmail, lineItems, customLineItems, totalPrice,
            taxedPrice, shippingAddress, billingAddress, customerGroup, country, orderState, shipmentState,
            paymentState, shippingInfo, completedAt, custom, inventoryMode, taxRoundingMode, taxCalculationMode, origin,
            itemShippingAddresses);
    }

    public static OrderImportBuilder of() {
        return new OrderImportBuilder();
    }

    public static OrderImportBuilder of(final OrderImport template) {
        OrderImportBuilder builder = new OrderImportBuilder();
        builder.key = template.getKey();
        builder.orderNumber = template.getOrderNumber();
        builder.customer = template.getCustomer();
        builder.customerEmail = template.getCustomerEmail();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.customerGroup = template.getCustomerGroup();
        builder.country = template.getCountry();
        builder.orderState = template.getOrderState();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.shippingInfo = template.getShippingInfo();
        builder.completedAt = template.getCompletedAt();
        builder.custom = template.getCustom();
        builder.inventoryMode = template.getInventoryMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.origin = template.getOrigin();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        return builder;
    }

}
