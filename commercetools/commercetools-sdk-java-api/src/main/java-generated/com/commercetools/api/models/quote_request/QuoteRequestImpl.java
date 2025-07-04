
package com.commercetools.api.models.quote_request;

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
 * QuoteRequest
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestImpl implements QuoteRequest, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    private String comment;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    private com.commercetools.api.models.common.Address shippingAddress;

    private com.commercetools.api.models.common.Address billingAddress;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private String country;

    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    private java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.state.StateReference state;

    private String purchaseOrderNumber;

    private com.commercetools.api.models.cart.CartReference cart;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("key") final String key,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("quoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState,
            @JsonProperty("comment") final String comment,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.TypedMoney totalPrice,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedPrice taxedPrice,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.Address shippingAddress,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.Address billingAddress,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("priceRoundingMode") final com.commercetools.api.models.cart.RoundingMode priceRoundingMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode,
            @JsonProperty("country") final String country,
            @JsonProperty("shippingInfo") final com.commercetools.api.models.cart.ShippingInfo shippingInfo,
            @JsonProperty("paymentInfo") final com.commercetools.api.models.order.PaymentInfo paymentInfo,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses,
            @JsonProperty("directDiscounts") final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("purchaseOrderNumber") final String purchaseOrderNumber,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartReference cart,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.key = key;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.quoteRequestState = quoteRequestState;
        this.comment = comment;
        this.customer = customer;
        this.customerGroup = customerGroup;
        this.store = store;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.totalPrice = totalPrice;
        this.taxedPrice = taxedPrice;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.inventoryMode = inventoryMode;
        this.taxMode = taxMode;
        this.priceRoundingMode = priceRoundingMode;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.country = country;
        this.shippingInfo = shippingInfo;
        this.paymentInfo = paymentInfo;
        this.shippingRateInput = shippingRateInput;
        this.itemShippingAddresses = itemShippingAddresses;
        this.directDiscounts = directDiscounts;
        this.custom = custom;
        this.state = state;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.cart = cart;
        this.businessUnit = businessUnit;
    }

    /**
     * create empty instance
     */
    public QuoteRequestImpl() {
    }

    /**
     *  <p>Unique identifier of the QuoteRequest.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the QuoteRequest.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the QuoteRequest was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the QuoteRequest was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the QuoteRequest.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>IDs and references that last modified the QuoteRequest.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the QuoteRequest.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Indicates the current state of the Quote Request in the negotiation process.</p>
     */

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     */

    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>The Buyer who owns the request.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Set automatically when <code>customer</code> is set and the Customer is a member of a Customer Group. Not updated if Customer is changed after Quote Request creation. Used for Product Variant price selection.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>The Store to which the Buyer belongs.</p>
     */

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>The Line Items for which a Quote is requested.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>The Custom Line Items for which a Quote is requested.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Sum of all <code>totalPrice</code> fields of the <code>lineItems</code> and <code>customLineItems</code>, as well as the <code>price</code> field of <code>shippingInfo</code> (if it exists). <code>totalPrice</code> may or may not include the taxes: it depends on the taxRate.includedInPrice property of each price.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Not set until the shipping address is set. Will be set automatically in the <code>Platform</code> TaxMode. For the <code>External</code> tax mode it will be set as soon as the external tax rates for all line items, custom line items, and shipping in the cart are set.</p>
     */

    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Used to determine the eligible ShippingMethods and rates as well as the tax rate of the Line Items.</p>
     */

    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Address used for invoicing.</p>
     */

    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Inventory mode of the Cart referenced in the QuoteRequestDraft.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Tax mode of the Cart referenced in the QuoteRequestDraft.</p>
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>When calculating total prices on LineItems and CustomLineItems, the selected mode is used for rounding.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rounding.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with <code>LineItemLevel</code> (horizontally) or <code>UnitPriceLevel</code> (vertically) calculation mode.</p>
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *  <p>Used for Product Variant price selection.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Set automatically once the ShippingMethod is set.</p>
     */

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Log of payment transactions related to the Quote.</p>
     */

    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Used to select a ShippingRatePriceTier.</p>
     */

    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Line items reference these addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Discounts that are only valid for the Quote and cannot be associated to any other Cart or Order.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    /**
     *  <p>Custom Fields of the Quote Request.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>State of the Quote Request. This reference can point to a State in a custom workflow.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer.</p>
     */

    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>The Cart from which a Quote is requested.</p>
     */

    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>The BusinessUnit for the Quote Request. Only available for B2B-enabled Projects.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
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

    public void setKey(final String key) {
        this.key = key;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setQuoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
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

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setPriceRoundingMode(final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setShippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public void setPaymentInfo(final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
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

    public void setDirectDiscounts(final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        this.directDiscounts = new ArrayList<>(Arrays.asList(directDiscounts));
    }

    public void setDirectDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts) {
        this.directDiscounts = directDiscounts;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setPurchaseOrderNumber(final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public void setCart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        QuoteRequestImpl that = (QuoteRequestImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(quoteRequestState, that.quoteRequestState)
                .append(comment, that.comment)
                .append(customer, that.customer)
                .append(customerGroup, that.customerGroup)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(shippingAddress, that.shippingAddress)
                .append(billingAddress, that.billingAddress)
                .append(inventoryMode, that.inventoryMode)
                .append(taxMode, that.taxMode)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(country, that.country)
                .append(shippingInfo, that.shippingInfo)
                .append(paymentInfo, that.paymentInfo)
                .append(shippingRateInput, that.shippingRateInput)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(directDiscounts, that.directDiscounts)
                .append(custom, that.custom)
                .append(state, that.state)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(cart, that.cart)
                .append(businessUnit, that.businessUnit)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(key, that.key)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(quoteRequestState, that.quoteRequestState)
                .append(comment, that.comment)
                .append(customer, that.customer)
                .append(customerGroup, that.customerGroup)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(totalPrice, that.totalPrice)
                .append(taxedPrice, that.taxedPrice)
                .append(shippingAddress, that.shippingAddress)
                .append(billingAddress, that.billingAddress)
                .append(inventoryMode, that.inventoryMode)
                .append(taxMode, that.taxMode)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(country, that.country)
                .append(shippingInfo, that.shippingInfo)
                .append(paymentInfo, that.paymentInfo)
                .append(shippingRateInput, that.shippingRateInput)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(directDiscounts, that.directDiscounts)
                .append(custom, that.custom)
                .append(state, that.state)
                .append(purchaseOrderNumber, that.purchaseOrderNumber)
                .append(cart, that.cart)
                .append(businessUnit, that.businessUnit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(key)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(quoteRequestState)
                .append(comment)
                .append(customer)
                .append(customerGroup)
                .append(store)
                .append(lineItems)
                .append(customLineItems)
                .append(totalPrice)
                .append(taxedPrice)
                .append(shippingAddress)
                .append(billingAddress)
                .append(inventoryMode)
                .append(taxMode)
                .append(priceRoundingMode)
                .append(taxRoundingMode)
                .append(taxCalculationMode)
                .append(country)
                .append(shippingInfo)
                .append(paymentInfo)
                .append(shippingRateInput)
                .append(itemShippingAddresses)
                .append(directDiscounts)
                .append(custom)
                .append(state)
                .append(purchaseOrderNumber)
                .append(cart)
                .append(businessUnit)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("key", key)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("quoteRequestState", quoteRequestState)
                .append("comment", comment)
                .append("customer", customer)
                .append("customerGroup", customerGroup)
                .append("store", store)
                .append("lineItems", lineItems)
                .append("customLineItems", customLineItems)
                .append("totalPrice", totalPrice)
                .append("taxedPrice", taxedPrice)
                .append("shippingAddress", shippingAddress)
                .append("billingAddress", billingAddress)
                .append("inventoryMode", inventoryMode)
                .append("taxMode", taxMode)
                .append("priceRoundingMode", priceRoundingMode)
                .append("taxRoundingMode", taxRoundingMode)
                .append("taxCalculationMode", taxCalculationMode)
                .append("country", country)
                .append("shippingInfo", shippingInfo)
                .append("paymentInfo", paymentInfo)
                .append("shippingRateInput", shippingRateInput)
                .append("itemShippingAddresses", itemShippingAddresses)
                .append("directDiscounts", directDiscounts)
                .append("custom", custom)
                .append("state", state)
                .append("purchaseOrderNumber", purchaseOrderNumber)
                .append("cart", cart)
                .append("businessUnit", businessUnit)
                .build();
    }

    @Override
    public QuoteRequest copyDeep() {
        return QuoteRequest.deepCopy(this);
    }
}
