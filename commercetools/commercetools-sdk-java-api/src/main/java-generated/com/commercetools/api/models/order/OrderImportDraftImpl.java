
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>A snapshot of an Order at the time it was imported.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderImportDraftImpl implements OrderImportDraft, ModelBase {

    private String orderNumber;

    private String purchaseOrderNumber;

    private String customerId;

    private String customerEmail;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    private java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems;

    private java.util.List<com.commercetools.api.models.order.CustomLineItemImportDraft> customLineItems;

    private com.commercetools.api.models.common.Money totalPrice;

    private com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.common.BaseAddress billingAddress;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    private com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo;

    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.state.StateReference state;

    private String country;

    private com.commercetools.api.models.cart.CartOrigin origin;

    private java.time.ZonedDateTime completedAt;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderImportDraftImpl(@JsonProperty("orderNumber") final String orderNumber,
            @JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber,
            @JsonProperty("customerId") final String customerId,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.order.CustomLineItemImportDraft> customLineItems,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.BaseAddress billingAddress,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses,
            @JsonProperty("shippingInfo") final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo,
            @JsonProperty("paymentInfo") final com.commercetools.api.models.order.PaymentInfo paymentInfo,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("country") final String country,
            @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin,
            @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.orderNumber = orderNumber;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.customerGroup = customerGroup;
        this.businessUnit = businessUnit;
        this.store = store;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.inventoryMode = inventoryMode;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.itemShippingAddresses = itemShippingAddresses;
        this.shippingInfo = shippingInfo;
        this.paymentInfo = paymentInfo;
        this.paymentState = paymentState;
        this.shipmentState = shipmentState;
        this.orderState = orderState;
        this.state = state;
        this.country = country;
        this.origin = origin;
        this.completedAt = completedAt;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public OrderImportDraftImpl() {
    }

    /**
     *  <p>User-defined identifier of the Order. Must be unique across a Project. Once set, the value cannot be changed.</p>
     */

    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     */

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>The <code>id</code> of the Customer the Order belongs to.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>The Email address of the Customer the Order belongs to. Can be used instead of <code>customerId</code> when no check against existing Customers is required.</p>
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>The Customer Group of the Customer the Order belongs to.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Order should belong to. When the <code>customerId</code> of the Order is also set, the Customer must be an Associate of the Business Unit.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>The Store the Order belongs to. Used for filtering.</p>
     *  <p>If a LineItemImportDraft or a CustomLineItemImportDraft specifies a <code>distributionChannel</code> or a <code>supplyChannel</code> that is not defined for the referenced Store, the Order Import gets rejected. The same applies when the provided <code>country</code> is not defined for the referenced Store.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p>Line Items to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     */

    public java.util.List<com.commercetools.api.models.order.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     */

    public java.util.List<com.commercetools.api.models.order.CustomLineItemImportDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>The total Price of the Order. The amount can be negative.</p>
     */

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Include TaxedPrice information for the Order. If not included, and if you have Tax Rates set for Line Items and Custom Line Items, the Order total will not be recalculated.</p>
     */

    public com.commercetools.api.models.cart.TaxedPriceDraft getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address associated with the Order.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Shipping-related information of the Order.</p>
     */

    public com.commercetools.api.models.order.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Payment information associated with the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Payment status of the Order.</p>
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment status of the Order.</p>
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Current status of the Order.</p>
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Include a value to associate a country with the Order.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Indicates the origin of the Order.</p>
     */

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>User-defined date and time for the Order. This value does not influence the <code>createdAt</code> or <code>lastModifiedAt</code> values of the Order created by the Order Import.</p>
     */

    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     *  <p>Custom Fields for the Order.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setOrderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setPurchaseOrderNumber(final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    public void setLineItems(final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setCustomLineItems(
            final com.commercetools.api.models.order.CustomLineItemImportDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
    }

    public void setCustomLineItems(
            final java.util.List<com.commercetools.api.models.order.CustomLineItemImportDraft> customLineItems) {
        this.customLineItems = customLineItems;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setBillingAddress(final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setItemShippingAddresses(
            final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }

    public void setItemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    public void setShippingInfo(final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setPaymentInfo(final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
    }

    public void setCompletedAt(final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderImportDraftImpl that = (OrderImportDraftImpl) o;

        return new EqualsBuilder().append(orderNumber, that.orderNumber)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(billingAddress, that.billingAddress)
                .append(shippingAddress, that.shippingAddress)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(shippingInfo, that.shippingInfo)
                .append(paymentInfo, that.paymentInfo)
                .append(paymentState, that.paymentState)
                .append(shipmentState, that.shipmentState)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .append(country, that.country)
                .append(origin, that.origin)
                .append(completedAt, that.completedAt)
                .append(custom, that.custom)
                .append(orderNumber, that.orderNumber)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(billingAddress, that.billingAddress)
                .append(shippingAddress, that.shippingAddress)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(shippingInfo, that.shippingInfo)
                .append(paymentInfo, that.paymentInfo)
                .append(paymentState, that.paymentState)
                .append(shipmentState, that.shipmentState)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .append(country, that.country)
                .append(origin, that.origin)
                .append(completedAt, that.completedAt)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(orderNumber)
                .append(purchaseOrderNumber)
                .append(customerId)
                .append(customerEmail)
                .append(customerGroup)
                .append(businessUnit)
                .append(store)
                .append(lineItems)
                .append(customLineItems)
                .append(totalPrice)
                .append(taxedPrice)
                .append(taxRoundingMode)
                .append(taxCalculationMode)
                .append(inventoryMode)
                .append(billingAddress)
                .append(shippingAddress)
                .append(itemShippingAddresses)
                .append(shippingInfo)
                .append(paymentInfo)
                .append(paymentState)
                .append(shipmentState)
                .append(orderState)
                .append(state)
                .append(country)
                .append(origin)
                .append(completedAt)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("orderNumber", orderNumber)
                .append("purchaseOrderNumber", purchaseOrderNumber)
                .append("customerId", customerId)
                .append("customerEmail", customerEmail)
                .append("customerGroup", customerGroup)
                .append("businessUnit", businessUnit)
                .append("store", store)
                .append("lineItems", lineItems)
                .append("customLineItems", customLineItems)
                .append("totalPrice", totalPrice)
                .append("taxedPrice", taxedPrice)
                .append("taxRoundingMode", taxRoundingMode)
                .append("taxCalculationMode", taxCalculationMode)
                .append("inventoryMode", inventoryMode)
                .append("billingAddress", billingAddress)
                .append("shippingAddress", shippingAddress)
                .append("itemShippingAddresses", itemShippingAddresses)
                .append("shippingInfo", shippingInfo)
                .append("paymentInfo", paymentInfo)
                .append("paymentState", paymentState)
                .append("shipmentState", shipmentState)
                .append("orderState", orderState)
                .append("state", state)
                .append("country", country)
                .append("origin", origin)
                .append("completedAt", completedAt)
                .append("custom", custom)
                .build();
    }

}
