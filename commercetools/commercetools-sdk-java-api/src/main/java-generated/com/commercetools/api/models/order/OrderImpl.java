
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
public final class OrderImpl implements Order {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private java.time.ZonedDateTime completedAt;

    private String orderNumber;

    private String customerId;

    private String customerEmail;

    private String anonymousId;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    private com.commercetools.api.models.common.Address shippingAddress;

    private com.commercetools.api.models.common.Address billingAddress;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private String country;

    private com.commercetools.api.models.order.OrderState orderState;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.PaymentState paymentState;

    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo;

    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    private Long lastMessageSequenceNumber;

    private com.commercetools.api.models.cart.CartReference cart;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    private String locale;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.CartOrigin origin;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts;

    @JsonCreator
    OrderImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt,
            @JsonProperty("orderNumber") final String orderNumber, @JsonProperty("customerId") final String customerId,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.TypedMoney totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPrice taxedPrice,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.Address shippingAddress,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.Address billingAddress,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("country") final String country,
            @JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.PaymentState paymentState,
            @JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo,
            @JsonProperty("syncInfo") final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo,
            @JsonProperty("returnInfo") final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo,
            @JsonProperty("discountCodes") final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes,
            @JsonProperty("lastMessageSequenceNumber") final Long lastMessageSequenceNumber,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartReference cart,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("paymentInfo") final com.commercetools.api.models.order.PaymentInfo paymentInfo,
            @JsonProperty("locale") final String locale,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin,
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses,
            @JsonProperty("refusedGifts") final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.completedAt = completedAt;
        this.orderNumber = orderNumber;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.anonymousId = anonymousId;
        this.store = store;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.taxMode = taxMode;
        this.taxRoundingMode = taxRoundingMode;
        this.customerGroup = customerGroup;
        this.country = country;
        this.orderState = orderState;
        this.state = state;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.shippingInfo = shippingInfo;
        this.syncInfo = syncInfo;
        this.returnInfo = returnInfo;
        this.discountCodes = discountCodes;
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
        this.cart = cart;
        this.custom = custom;
        this.paymentInfo = paymentInfo;
        this.locale = locale;
        this.inventoryMode = inventoryMode;
        this.origin = origin;
        this.taxCalculationMode = taxCalculationMode;
        this.shippingRateInput = shippingRateInput;
        this.itemShippingAddresses = itemShippingAddresses;
        this.refusedGifts = refusedGifts;
    }

    public OrderImpl() {
    }

    /**
    *  <p>The unique ID of the order.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>The current version of the order.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
    *  <p>This field will only be present if it was set for Order Import</p>
    */
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
    *  <p>String that uniquely identifies an order.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the order.
    *  It should be unique across a project.
    *  Once it's set it cannot be changed.</p>
    */
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
    *  <p>Identifies carts and orders belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
    *  <p>The taxes are calculated based on the shipping address.</p>
    */
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
    *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rouding.</p>
    */
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
    *  <p>Set when the customer is set and the customer is a member of a customer group.
    *  Used for product variant price selection.</p>
    */
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
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
    *  <p>One of the four predefined OrderStates.</p>
    */
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
    *  <p>This reference can point to a state in a custom workflow.</p>
    */
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
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
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    public java.util.List<com.commercetools.api.models.order.SyncInfo> getSyncInfo() {
        return this.syncInfo;
    }

    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
    *  <p>The sequence number of the last order message produced by changes to this order.
    *  <code>0</code> means, that no messages were created yet.</p>
    */
    public Long getLastMessageSequenceNumber() {
        return this.lastMessageSequenceNumber;
    }

    /**
    *  <p>Set when this order was created from a cart.
    *  The cart will have the state <code>Ordered</code>.</p>
    */
    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public String getLocale() {
        return this.locale;
    }

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
    *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with LineItemLevel (horizontally) or UnitPriceLevel (vertically) calculation mode.</p>
    */
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
    *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier.</p>
    */
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
    *  <p>Contains addresses for orders with multiple shipping addresses.</p>
    */
    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
    *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
    */
    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts() {
        return this.refusedGifts;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setCompletedAt(final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
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

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    public void setLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
    }

    public void setCustomLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setShippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setSyncInfo(final com.commercetools.api.models.order.SyncInfo... syncInfo) {
        this.syncInfo = new ArrayList<>(Arrays.asList(syncInfo));
    }

    public void setSyncInfo(final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo) {
        this.syncInfo = syncInfo;
    }

    public void setReturnInfo(final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
    }

    public void setReturnInfo(final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
    }

    public void setDiscountCodes(final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
    }

    public void setDiscountCodes(
            final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public void setLastMessageSequenceNumber(final Long lastMessageSequenceNumber) {
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
    }

    public void setCart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setPaymentInfo(final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
    }

    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    public void setItemShippingAddresses(final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }

    public void setItemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    public void setRefusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
    }

    public void setRefusedGifts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.refusedGifts = refusedGifts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderImpl that = (OrderImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(completedAt, that.completedAt)
                .append(orderNumber, that.orderNumber)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(anonymousId, that.anonymousId)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(shippingAddress, that.shippingAddress)
                .append(billingAddress, that.billingAddress)
                .append(taxMode, that.taxMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(customerGroup, that.customerGroup)
                .append(country, that.country)
                .append(orderState, that.orderState)
                .append(state, that.state)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(shippingInfo, that.shippingInfo)
                .append(syncInfo, that.syncInfo)
                .append(returnInfo, that.returnInfo)
                .append(discountCodes, that.discountCodes)
                .append(lastMessageSequenceNumber, that.lastMessageSequenceNumber)
                .append(cart, that.cart)
                .append(custom, that.custom)
                .append(paymentInfo, that.paymentInfo)
                .append(locale, that.locale)
                .append(inventoryMode, that.inventoryMode)
                .append(origin, that.origin)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(shippingRateInput, that.shippingRateInput)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(refusedGifts, that.refusedGifts)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(completedAt)
                .append(orderNumber)
                .append(customerId)
                .append(customerEmail)
                .append(anonymousId)
                .append(store)
                .append(lineItems)
                .append(customLineItems)
                .append(totalPrice)
                .append(taxedPrice)
                .append(shippingAddress)
                .append(billingAddress)
                .append(taxMode)
                .append(taxRoundingMode)
                .append(customerGroup)
                .append(country)
                .append(orderState)
                .append(state)
                .append(shipmentState)
                .append(paymentState)
                .append(shippingInfo)
                .append(syncInfo)
                .append(returnInfo)
                .append(discountCodes)
                .append(lastMessageSequenceNumber)
                .append(cart)
                .append(custom)
                .append(paymentInfo)
                .append(locale)
                .append(inventoryMode)
                .append(origin)
                .append(taxCalculationMode)
                .append(shippingRateInput)
                .append(itemShippingAddresses)
                .append(refusedGifts)
                .toHashCode();
    }

}
