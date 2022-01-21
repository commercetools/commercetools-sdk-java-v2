
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MyCartDraftImpl implements MyCartDraft, ModelBase {

    private String currency;

    private String customerEmail;

    private String country;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.common.BaseAddress billingAddress;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String locale;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private Long deleteDaysAfterLastModification;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    @JsonCreator
    MyCartDraftImpl(@JsonProperty("currency") final String currency,
            @JsonProperty("customerEmail") final String customerEmail, @JsonProperty("country") final String country,
            @JsonProperty("inventoryMode") final com.commercetools.api.models.cart.InventoryMode inventoryMode,
            @JsonProperty("lineItems") final java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems,
            @JsonProperty("shippingAddress") final com.commercetools.api.models.common.BaseAddress shippingAddress,
            @JsonProperty("billingAddress") final com.commercetools.api.models.common.BaseAddress billingAddress,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("locale") final String locale,
            @JsonProperty("taxMode") final com.commercetools.api.models.cart.TaxMode taxMode,
            @JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification,
            @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses,
            @JsonProperty("store") final com.commercetools.api.models.store.StoreKeyReference store,
            @JsonProperty("discountCodes") final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.currency = currency;
        this.customerEmail = customerEmail;
        this.country = country;
        this.inventoryMode = inventoryMode;
        this.lineItems = lineItems;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.shippingMethod = shippingMethod;
        this.custom = custom;
        this.locale = locale;
        this.taxMode = taxMode;
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.itemShippingAddresses = itemShippingAddresses;
        this.store = store;
        this.discountCodes = discountCodes;
    }

    public MyCartDraftImpl() {
    }

    /**
    *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCurrency() {
        return this.currency;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
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

    public java.util.List<com.commercetools.api.models.me.MyLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public String getLocale() {
        return this.locale;
    }

    /**
    *  <p>The <code>TaxMode</code> <code>Disabled</code> can not be set on the My Carts endpoint.</p>
    */
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
    *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState.
    *  If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
    */
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
    *  <p>Contains addresses for orders with multiple shipping addresses.
    *  Each address must contain a key which is unique in this cart.</p>
    */
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setInventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public void setLineItems(final com.commercetools.api.models.me.MyLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }

    public void setLineItems(final java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems) {
        this.lineItems = lineItems;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setTaxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    public void setItemShippingAddresses(
            final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
    }

    public void setItemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    public void setStore(final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
    }

    public void setDiscountCodes(final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
    }

    public void setDiscountCodes(
            final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
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
                .append(country, that.country)
                .append(inventoryMode, that.inventoryMode)
                .append(lineItems, that.lineItems)
                .append(shippingAddress, that.shippingAddress)
                .append(billingAddress, that.billingAddress)
                .append(shippingMethod, that.shippingMethod)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(taxMode, that.taxMode)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(itemShippingAddresses, that.itemShippingAddresses)
                .append(store, that.store)
                .append(discountCodes, that.discountCodes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currency)
                .append(customerEmail)
                .append(country)
                .append(inventoryMode)
                .append(lineItems)
                .append(shippingAddress)
                .append(billingAddress)
                .append(shippingMethod)
                .append(custom)
                .append(locale)
                .append(taxMode)
                .append(deleteDaysAfterLastModification)
                .append(itemShippingAddresses)
                .append(store)
                .append(discountCodes)
                .toHashCode();
    }

}
