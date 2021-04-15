
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartDraftBuilder {

    private String currency;

    @Nullable
    private String customerEmail;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems;

    @Nullable
    private com.commercetools.api.models.common.Address shippingAddress;

    @Nullable
    private com.commercetools.api.models.common.Address billingAddress;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String locale;

    @Nullable
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    public MyCartDraftBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    public MyCartDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public MyCartDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public MyCartDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    public MyCartDraftBuilder lineItems(@Nullable final com.commercetools.api.models.me.MyLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public MyCartDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public MyCartDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public MyCartDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public MyCartDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public MyCartDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public MyCartDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public MyCartDraftBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public MyCartDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    public MyCartDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    public MyCartDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    public MyCartDraftBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    public MyCartDraftBuilder discountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    public MyCartDraftBuilder discountCodes(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.me.MyLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    public MyCartDraft build() {
        return new MyCartDraftImpl(currency, customerEmail, country, inventoryMode, lineItems, shippingAddress,
            billingAddress, shippingMethod, custom, locale, taxMode, deleteDaysAfterLastModification,
            itemShippingAddresses, store, discountCodes);
    }

    public static MyCartDraftBuilder of() {
        return new MyCartDraftBuilder();
    }

    public static MyCartDraftBuilder of(final MyCartDraft template) {
        MyCartDraftBuilder builder = new MyCartDraftBuilder();
        builder.currency = template.getCurrency();
        builder.customerEmail = template.getCustomerEmail();
        builder.country = template.getCountry();
        builder.inventoryMode = template.getInventoryMode();
        builder.lineItems = template.getLineItems();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingMethod = template.getShippingMethod();
        builder.custom = template.getCustom();
        builder.locale = template.getLocale();
        builder.taxMode = template.getTaxMode();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.store = template.getStore();
        builder.discountCodes = template.getDiscountCodes();
        return builder;
    }

}
