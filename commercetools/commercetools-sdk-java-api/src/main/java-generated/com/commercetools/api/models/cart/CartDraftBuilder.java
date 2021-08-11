
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDraftBuilder implements Builder<CartDraft> {

    private String currency;

    @Nullable
    private String key;

    @Nullable
    private String customerId;

    @Nullable
    private String customerEmail;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @Nullable
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress billingAddress;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String locale;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.cart.CartOrigin origin;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    @Nullable
    private java.util.List<String> discountCodes;

    public CartDraftBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    public CartDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public CartDraftBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    public CartDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public CartDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    public CartDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    public CartDraftBuilder store(@Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    public CartDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    public CartDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    public CartDraftBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public CartDraftBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    public CartDraftBuilder taxCalculationMode(
            @Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    public CartDraftBuilder lineItems(@Nullable final com.commercetools.api.models.cart.LineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    public CartDraftBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()).build());
        return this;
    }

    public CartDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()).build());
        return this;
    }

    public CartDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public CartDraftBuilder customLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    public CartDraftBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraftBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    public CartDraftBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraftBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    public CartDraftBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    public CartDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public CartDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public CartDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public CartDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public CartDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public CartDraftBuilder externalTaxRateForShippingMethod(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRateForShippingMethod = builder
                .apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public CartDraftBuilder externalTaxRateForShippingMethod(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod) {
        this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
        return this;
    }

    public CartDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public CartDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public CartDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    public CartDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    public CartDraftBuilder origin(@Nullable final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    public CartDraftBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    public CartDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    public CartDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public CartDraftBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    public CartDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    public CartDraftBuilder discountCodes(@Nullable final String... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    public CartDraftBuilder discountCodes(@Nullable final java.util.List<String> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
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
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.LineItemDraft> getLineItems() {
        return this.lineItems;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod() {
        return this.externalTaxRateForShippingMethod;
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
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    @Nullable
    public java.util.List<String> getDiscountCodes() {
        return this.discountCodes;
    }

    public CartDraft build() {
        Objects.requireNonNull(currency, CartDraft.class + ": currency is missing");
        return new CartDraftImpl(currency, key, customerId, customerEmail, customerGroup, anonymousId, store, country,
            inventoryMode, taxMode, taxRoundingMode, taxCalculationMode, lineItems, customLineItems, shippingAddress,
            billingAddress, shippingMethod, externalTaxRateForShippingMethod, custom, locale,
            deleteDaysAfterLastModification, origin, shippingRateInput, itemShippingAddresses, discountCodes);
    }

    /**
     * builds CartDraft without checking for non null required values
     */
    public CartDraft buildUnchecked() {
        return new CartDraftImpl(currency, key, customerId, customerEmail, customerGroup, anonymousId, store, country,
            inventoryMode, taxMode, taxRoundingMode, taxCalculationMode, lineItems, customLineItems, shippingAddress,
            billingAddress, shippingMethod, externalTaxRateForShippingMethod, custom, locale,
            deleteDaysAfterLastModification, origin, shippingRateInput, itemShippingAddresses, discountCodes);
    }

    public static CartDraftBuilder of() {
        return new CartDraftBuilder();
    }

    public static CartDraftBuilder of(final CartDraft template) {
        CartDraftBuilder builder = new CartDraftBuilder();
        builder.currency = template.getCurrency();
        builder.key = template.getKey();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.customerGroup = template.getCustomerGroup();
        builder.anonymousId = template.getAnonymousId();
        builder.store = template.getStore();
        builder.country = template.getCountry();
        builder.inventoryMode = template.getInventoryMode();
        builder.taxMode = template.getTaxMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.shippingAddress = template.getShippingAddress();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRateForShippingMethod = template.getExternalTaxRateForShippingMethod();
        builder.custom = template.getCustom();
        builder.locale = template.getLocale();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.origin = template.getOrigin();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.discountCodes = template.getDiscountCodes();
        return builder;
    }

}
