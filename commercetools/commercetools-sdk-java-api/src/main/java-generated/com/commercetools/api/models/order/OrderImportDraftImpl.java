
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderImportDraftImpl implements OrderImportDraft {

    private String orderNumber;

    private String customerId;

    private String customerEmail;

    private java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> customLineItems;

    private com.commercetools.api.models.common.Money totalPrice;

    private com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.common.BaseAddress billingAddress;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private String country;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo;

    private java.time.ZonedDateTime completedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    private com.commercetools.api.models.cart.CartOrigin origin;

    @JsonCreator
    OrderImportDraftImpl(@JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("customerId") final String customerId,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> customLineItems,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.BaseAddress billingAddress,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("country") final String country,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("shippingInfo") final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo,
            @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store,
            @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin) {
        this.orderNumber = orderNumber;
        this.customerId = customerId;
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
        this.itemShippingAddresses = itemShippingAddresses;
        this.store = store;
        this.origin = origin;
    }

    public OrderImportDraftImpl() {
    }

    /**
    *  <p>String that unique identifies an order.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the order.
    *  It should be unique within a project.</p>
    */
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
    *  <p>If given the customer with that ID must exist in the project.</p>
    */
    public String getCustomerId() {
        return this.customerId;
    }

    /**
    *  <p>The customer email can be used when no check against existing Customers is desired during order import.</p>
    */
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
    *  <p>If not given <code>customLineItems</code> must not be empty.</p>
    */
    public java.util.List<com.commercetools.api.models.order.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    /**
    *  <p>If not given <code>lineItems</code> must not be empty.</p>
    */
    public java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
    *  <p>Order Import does not support calculation of taxes.
    *  When setting the draft the taxedPrice is to be provided.</p>
    */
    public com.commercetools.api.models.cart.TaxedPriceDraft getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
    *  <p>Set when the customer is set and the customer is a member of a customer group.
    *  Used for product variant price selection.</p>
    */
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
    *  Used for product variant price selection.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>If not given the <code>Open</code> state will be assigned by default.</p>
    */
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
    *  <p>Set if the ShippingMethod is set.</p>
    */
    public com.commercetools.api.models.order.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
    *  <p>If not given the mode <code>None</code> will be assigned by default.</p>
    */
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
    *  <p>If not given the tax rounding mode <code>HalfEven</code> will be assigned by default.</p>
    */
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
    *  <p>Contains addresses for orders with multiple shipping addresses.</p>
    */
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
    *  <p>The default origin is <code>Customer</code>.</p>
    */
    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setLineItems(final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setCustomLineItems(
            final com.commercetools.api.models.cart.CustomLineItemImportDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
    }

    public void setCustomLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItemImportDraft> customLineItems) {
        this.customLineItems = customLineItems;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShippingInfo(final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setCompletedAt(final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public void setItemShippingAddresses(
            final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }

    public void setItemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderImportDraftImpl that = (OrderImportDraftImpl) o;

        return new EqualsBuilder().append(orderNumber, that.orderNumber)
                .append(customerId, that.customerId)
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
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(store, that.store)
                .append(origin, that.origin)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(orderNumber)
                .append(customerId)
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
                .append(itemShippingAddresses)
                .append(store)
                .append(origin)
                .toHashCode();
    }

}
