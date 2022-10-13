
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CartDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDraftImpl implements CartDraft, ModelBase {

    private String currency;

    private String key;

    private String customerId;

    private String customerEmail;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private String anonymousId;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    private String country;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.common.BaseAddress billingAddress;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String locale;

    private Long deleteDaysAfterLastModification;

    private com.commercetools.api.models.cart.CartOrigin origin;

    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    private java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping;

    private java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    private java.util.List<String> discountCodes;

    @JsonCreator
    CartDraftImpl(@JsonProperty("currency") final String currency, @JsonProperty("key") final String key,
            @JsonProperty("customerId") final String customerId,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store,
            @JsonProperty("country") final String country,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.BaseAddress billingAddress,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod,
            @JsonProperty("externalTaxRateForShippingMethod") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("locale") final String locale,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin,
            @JsonProperty("shippingMode") final com.commercetools.api.models.cart.ShippingMode shippingMode,
            @JsonProperty("customShipping") final java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping,
            @JsonProperty("shipping") final java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses,
            @JsonProperty("discountCodes") final java.util.List<String> discountCodes) {
        this.currency = currency;
        this.key = key;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.customerGroup = customerGroup;
        this.anonymousId = anonymousId;
        this.businessUnit = businessUnit;
        this.store = store;
        this.country = country;
        this.inventoryMode = inventoryMode;
        this.taxMode = taxMode;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.shippingMethod = shippingMethod;
        this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
        this.custom = custom;
        this.locale = locale;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.origin = origin;
        this.shippingMode = shippingMode;
        this.customShipping = customShipping;
        this.shipping = shipping;
        this.shippingRateInput = shippingRateInput;
        this.itemShippingAddresses = itemShippingAddresses;
        this.discountCodes = discountCodes;
    }

    public CartDraftImpl() {
    }

    /**
     *  <p>A three-digit currency code as per ISO 4217.</p>
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Id of an existing Customer.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>Will be set automatically when the <code>customerId</code> is set and the customer is a member of a customer group. Can be set explicitly when no <code>customerId</code> is present.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Assigns the new cart to an anonymous session (the customer has not signed up/in yet).</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>The Business Unit the Cart belongs to.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Assigns the new cart to the store. The store assignment can not be modified.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Default inventory mode is <code>None</code>.</p>
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>The default tax mode is <code>Platform</code>.</p>
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>The default tax rounding mode is <code>HalfEven</code>.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>The default tax calculation mode is <code>LineItemLevel</code>.</p>
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.cart.LineItemDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>The shipping address is used to determine the eligible shipping methods and rates as well as the tax rate of the line items.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *
     */

    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>An external tax rate can be set for the <code>shippingMethod</code> if the cart has the <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod() {
        return this.externalTaxRateForShippingMethod;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Must be one of the languages supported for this project</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState. If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
     */

    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>The default origin is <code>Customer</code>.</p>
     */

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <ul>
     *   <li>If <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> getCustomShipping() {
        return this.customShipping;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.ShippingDraft> getShipping() {
        return this.shipping;
    }

    /**
     *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier. Based on the definition of ShippingRateInputType. If CartClassification is defined, it must be ClassificationShippingRateInput. If CartScore is defined, it must be ScoreShippingRateInput. Otherwise it can not bet set.</p>
     */

    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Contains addresses for carts with multiple shipping addresses. Each address must contain a key which is unique in this cart. Line items will use these keys to reference the addresses under their <code>shippingDetails</code>. The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate. Only the cart's <code>shippingAddress</code> is used for this.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>The code of existing DiscountCodes.</p>
     */

    public java.util.List<String> getDiscountCodes() {
        return this.discountCodes;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setKey(final String key) {
        this.key = key;
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

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setTaxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public void setTaxCalculationMode(final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    public void setLineItems(final com.commercetools.api.models.cart.LineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setCustomLineItems(final com.commercetools.api.models.cart.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
    }

    public void setCustomLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setExternalTaxRateForShippingMethod(
            final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod) {
        this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
    }

    public void setShippingMode(final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
    }

    public void setCustomShipping(final com.commercetools.api.models.cart.CustomShippingDraft... customShipping) {
        this.customShipping = new ArrayList<>(Arrays.asList(customShipping));
    }

    public void setCustomShipping(
            final java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping) {
        this.customShipping = customShipping;
    }

    public void setShipping(final com.commercetools.api.models.cart.ShippingDraft... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
    }

    public void setShipping(final java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping) {
        this.shipping = shipping;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    public void setItemShippingAddresses(
            final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }

    public void setItemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    public void setDiscountCodes(final String... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
    }

    public void setDiscountCodes(final java.util.List<String> discountCodes) {
        this.discountCodes = discountCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDraftImpl that = (CartDraftImpl) o;

        return new EqualsBuilder().append(currency, that.currency)
                .append(key, that.key)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(anonymousId, that.anonymousId)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(country, that.country)
                .append(inventoryMode, that.inventoryMode)
                .append(taxMode, that.taxMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(shippingAddress, that.shippingAddress)
                .append(billingAddress, that.billingAddress)
                .append(shippingMethod, that.shippingMethod)
                .append(externalTaxRateForShippingMethod, that.externalTaxRateForShippingMethod)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(origin, that.origin)
                .append(shippingMode, that.shippingMode)
                .append(customShipping, that.customShipping)
                .append(shipping, that.shipping)
                .append(shippingRateInput, that.shippingRateInput)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(discountCodes, that.discountCodes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currency)
                .append(key)
                .append(customerId)
                .append(customerEmail)
                .append(customerGroup)
                .append(anonymousId)
                .append(businessUnit)
                .append(store)
                .append(country)
                .append(inventoryMode)
                .append(taxMode)
                .append(taxRoundingMode)
                .append(taxCalculationMode)
                .append(lineItems)
                .append(customLineItems)
                .append(shippingAddress)
                .append(billingAddress)
                .append(shippingMethod)
                .append(externalTaxRateForShippingMethod)
                .append(custom)
                .append(locale)
                .append(deleteDaysAfterLastModification)
                .append(origin)
                .append(shippingMode)
                .append(customShipping)
                .append(shipping)
                .append(shippingRateInput)
                .append(itemShippingAddresses)
                .append(discountCodes)
                .toHashCode();
    }

}
