
package com.commercetools.api.models.me;

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
 *  <p>The <code>customerId</code> is determined by a password flow token and automatically set on the resulting Cart. The <code>anonymousId</code> is determined by a token for an anonymous session and automatically set on the resulting Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartDraftImpl implements MyCartDraft, ModelBase {

    private String currency;

    private String customerEmail;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    private java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.common.BaseAddress billingAddress;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    private java.util.List<String> discountCodes;

    private String country;

    private String locale;

    private Long deleteDaysAfterLastModification;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartDraftImpl(@JsonProperty("currency") final String currency,
            @JsonProperty("customerEmail") final String customerEmail,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreResourceIdentifier store,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.BaseAddress billingAddress,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses,
            @JsonProperty("discountCodes") final java.util.List<String> discountCodes,
            @JsonProperty("country") final String country, @JsonProperty("locale") final String locale,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.currency = currency;
        this.customerEmail = customerEmail;
        this.businessUnit = businessUnit;
        this.store = store;
        this.lineItems = lineItems;
        this.taxMode = taxMode;
        this.inventoryMode = inventoryMode;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.shippingMethod = shippingMethod;
        this.itemShippingAddresses = itemShippingAddresses;
        this.discountCodes = discountCodes;
        this.country = country;
        this.locale = locale;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public MyCartDraftImpl() {
    }

    /**
     *  <p>Currency the Cart uses.</p>
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>Email address of the Customer the Cart belongs to.</p>
     */

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     */

    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     */

    public java.util.List<com.commercetools.api.models.me.MyLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Determines how Tax Rates are set. The <code>Disabled</code> TaxMode <strong>cannot</strong> be set.</p>
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
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
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Shipping Method for the Cart. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     */

    public java.util.List<String> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
     *  <p>Used for LineItem Price selection. If used for Create Cart in Store, the provided country must be one of the Store's <code>countries</code>.</p>
     */

    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Number of days after which a Cart with <code>Active</code> CartState is deleted since its last modification. If not provided, the default value for this field configured in Project settings is assigned.</p>
     *  <p>Create a ChangeSubscription for Carts to receive a ResourceDeletedDeliveryPayload upon deletion of the Cart.</p>
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

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setStore(final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
    }

    public void setLineItems(final com.commercetools.api.models.me.MyLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems) {
        this.lineItems = lineItems;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
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

        MyCartDraftImpl that = (MyCartDraftImpl) o;

        return new EqualsBuilder().append(currency, that.currency)
                .append(customerEmail, that.customerEmail)
                .append(businessUnit, that.businessUnit)
                .append(store, that.store)
                .append(lineItems, that.lineItems)
                .append(taxMode, that.taxMode)
                .append(inventoryMode, that.inventoryMode)
                .append(billingAddress, that.billingAddress)
                .append(shippingAddress, that.shippingAddress)
                .append(shippingMethod, that.shippingMethod)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(discountCodes, that.discountCodes)
                .append(country, that.country)
                .append(locale, that.locale)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currency)
                .append(customerEmail)
                .append(businessUnit)
                .append(store)
                .append(lineItems)
                .append(taxMode)
                .append(inventoryMode)
                .append(billingAddress)
                .append(shippingAddress)
                .append(shippingMethod)
                .append(itemShippingAddresses)
                .append(discountCodes)
                .append(country)
                .append(locale)
                .append(deleteDaysAfterLastModification)
                .append(custom)
                .toHashCode();
    }

}
