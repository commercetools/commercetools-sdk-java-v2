
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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

    private java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.common.BaseAddress billingAddress;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    private java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping;

    private java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    private java.util.List<String> discountCodes;

    private String country;

    private String locale;

    private com.commercetools.api.models.cart.CartOrigin origin;

    private Long deleteDaysAfterLastModification;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDraftImpl(@JsonProperty("currency") final String currency, @JsonProperty("key") final String key,
            @JsonProperty("customerId") final String customerId,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems,
            @JsonProperty("customLineItems") final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("externalTaxRateForShippingMethod") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod,
            @JsonProperty("priceRoundingMode") final com.commercetools.api.models.cart.RoundingMode priceRoundingMode,
            @JsonProperty("taxRoundingMode") final com.commercetools.api.models.cart.RoundingMode taxRoundingMode,
            @JsonProperty("taxCalculationMode") final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.BaseAddress billingAddress,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod,
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput,
            @JsonProperty("shippingMode") final com.commercetools.api.models.cart.ShippingMode shippingMode,
            @JsonProperty("customShipping") final java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping,
            @JsonProperty("shipping") final java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses,
            @JsonProperty("discountCodes") final java.util.List<String> discountCodes,
            @JsonProperty("country") final String country, @JsonProperty("locale") final String locale,
            @JsonProperty("origin") final com.commercetools.api.models.cart.CartOrigin origin,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.currency = currency;
        this.key = key;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.customerGroup = customerGroup;
        this.anonymousId = anonymousId;
        this.businessUnit = businessUnit;
        this.store = store;
        this.lineItems = lineItems;
        this.customLineItems = customLineItems;
        this.taxMode = taxMode;
        this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
        this.priceRoundingMode = priceRoundingMode;
        this.taxRoundingMode = taxRoundingMode;
        this.taxCalculationMode = taxCalculationMode;
        this.inventoryMode = inventoryMode;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.shippingMethod = shippingMethod;
        this.shippingRateInput = shippingRateInput;
        this.shippingMode = shippingMode;
        this.customShipping = customShipping;
        this.shipping = shipping;
        this.itemShippingAddresses = itemShippingAddresses;
        this.discountCodes = discountCodes;
        this.country = country;
        this.locale = locale;
        this.origin = origin;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public CartDraftImpl() {
    }

    /**
     *  <p>Currency the Cart uses.</p>
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
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that the Cart belongs to.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     *  <p>You can set either a <code>customerId</code> or a <code>customerGroup</code>. If the Customer referenced in <code>customerId</code> belongs to a Customer Group then <code>customerGroup</code> is set automatically.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">Anonymous session</a> associated with the Cart.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Cart should belong to. When the <code>customerId</code> of the Cart is also set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Cart.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.LineItemDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Determines how Tax Rates are set.</p>
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod() {
        return this.externalTaxRateForShippingMethod;
    }

    /**
     *  <p>Determines how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated. If not set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">default value</a> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> is used.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>. If not set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">default value</a> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> is used.</p>
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
     *  <p>Billing address associated with the Cart.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items. Must be one of the <code>itemShippingAddresses</code> when that field is also provided.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> has a <code>predicate</code> that does not match the Cart, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned when <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/carts:POST" rel="nofollow">creating a Cart</a>.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Used as an input to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInputDraft" rel="nofollow">ClassificationShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartScore</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInputDraft" rel="nofollow">ScoreShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> getCustomShipping() {
        return this.customShipping;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.ShippingDraft> getShipping() {
        return this.shipping;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p><code>code</code> of the existing <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> to add to the Cart.</p>
     */

    public java.util.List<String> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
     *  <p>Used for <span>Line Item price selection</span>. If used for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/carts:POST" rel="nofollow">Create Cart in Store</a>, the provided country must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store's</a> <code>countries</code>.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Indicates how the Cart was created.</p>
     */

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. If not provided, the default value for this field configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a> is assigned.</p>
     *  <p>Create a <a href="https://docs.commercetools.com/apis/ctp:api:type:ChangeSubscription" rel="nofollow">ChangeSubscription</a> for Carts to receive a <a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceDeletedDeliveryPayload" rel="nofollow">ResourceDeletedDeliveryPayload</a> upon deletion of the Cart.</p>
     */

    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
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

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setExternalTaxRateForShippingMethod(
            final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod) {
        this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
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

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setBillingAddress(final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setShippingAddress(final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setShippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
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

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setOrigin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
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

        CartDraftImpl that = (CartDraftImpl) o;

        return new EqualsBuilder().append(currency, that.currency)
                .append(key, that.key)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(anonymousId, that.anonymousId)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(taxMode, that.taxMode)
                .append(externalTaxRateForShippingMethod, that.externalTaxRateForShippingMethod)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(billingAddress, that.billingAddress)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingMethod, that.shippingMethod)
                .append(shippingRateInput, that.shippingRateInput)
                .append(shippingMode, that.shippingMode)
                .append(customShipping, that.customShipping)
                .append(shipping, that.shipping)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(discountCodes, that.discountCodes)
                .append(country, that.country)
                .append(locale, that.locale)
                .append(origin, that.origin)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(custom, that.custom)
                .append(currency, that.currency)
                .append(key, that.key)
                .append(customerId, that.customerId)
                .append(customerEmail, that.customerEmail)
                .append(customerGroup, that.customerGroup)
                .append(anonymousId, that.anonymousId)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(customLineItems, that.customLineItems)
                .append(taxMode, that.taxMode)
                .append(externalTaxRateForShippingMethod, that.externalTaxRateForShippingMethod)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(taxRoundingMode, that.taxRoundingMode)
                .append(taxCalculationMode, that.taxCalculationMode)
                .append(inventoryMode, that.inventoryMode)
                .append(billingAddress, that.billingAddress)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingMethod, that.shippingMethod)
                .append(shippingRateInput, that.shippingRateInput)
                .append(shippingMode, that.shippingMode)
                .append(customShipping, that.customShipping)
                .append(shipping, that.shipping)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(discountCodes, that.discountCodes)
                .append(country, that.country)
                .append(locale, that.locale)
                .append(origin, that.origin)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(custom, that.custom)
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
                .append(lineItems)
                .append(customLineItems)
                .append(taxMode)
                .append(externalTaxRateForShippingMethod)
                .append(priceRoundingMode)
                .append(taxRoundingMode)
                .append(taxCalculationMode)
                .append(inventoryMode)
                .append(billingAddress)
                .append(shippingAddress)
                .append(shippingMethod)
                .append(shippingRateInput)
                .append(shippingMode)
                .append(customShipping)
                .append(shipping)
                .append(itemShippingAddresses)
                .append(discountCodes)
                .append(country)
                .append(locale)
                .append(origin)
                .append(deleteDaysAfterLastModification)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("currency", currency)
                .append("key", key)
                .append("customerId", customerId)
                .append("customerEmail", customerEmail)
                .append("customerGroup", customerGroup)
                .append("anonymousId", anonymousId)
                .append("businessUnit", businessUnit)
                .append("store", store)
                .append("lineItems", lineItems)
                .append("customLineItems", customLineItems)
                .append("taxMode", taxMode)
                .append("externalTaxRateForShippingMethod", externalTaxRateForShippingMethod)
                .append("priceRoundingMode", priceRoundingMode)
                .append("taxRoundingMode", taxRoundingMode)
                .append("taxCalculationMode", taxCalculationMode)
                .append("inventoryMode", inventoryMode)
                .append("billingAddress", billingAddress)
                .append("shippingAddress", shippingAddress)
                .append("shippingMethod", shippingMethod)
                .append("shippingRateInput", shippingRateInput)
                .append("shippingMode", shippingMode)
                .append("customShipping", customShipping)
                .append("shipping", shipping)
                .append("itemShippingAddresses", itemShippingAddresses)
                .append("discountCodes", discountCodes)
                .append("country", country)
                .append("locale", locale)
                .append("origin", origin)
                .append("deleteDaysAfterLastModification", deleteDaysAfterLastModification)
                .append("custom", custom)
                .build();
    }

    @Override
    public CartDraft copyDeep() {
        return CartDraft.deepCopy(this);
    }
}
