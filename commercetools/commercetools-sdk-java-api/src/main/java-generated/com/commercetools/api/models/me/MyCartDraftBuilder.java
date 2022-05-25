
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartDraft myCartDraft = MyCartDraft.builder()
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartDraftBuilder implements Builder<MyCartDraft> {

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
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress billingAddress;

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
    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    /**
     *  <p>A three-digit currency code as per ISO 3166-1 alpha-2.</p>
     */

    public MyCartDraftBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2.</p>
     */

    public MyCartDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Default inventory mode is <code>None</code>.</p>
     */

    public MyCartDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder lineItems(@Nullable final com.commercetools.api.models.me.MyLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.me.MyLineItemDraft... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.me.MyLineItemDraftBuilder, com.commercetools.api.models.me.MyLineItemDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.me.MyLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder withLineItems(
            Function<com.commercetools.api.models.me.MyLineItemDraftBuilder, com.commercetools.api.models.me.MyLineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.me.MyLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public MyCartDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public MyCartDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>The <code>TaxMode</code> <code>Disabled</code> can not be set on the My Carts endpoint.</p>
     */

    public MyCartDraftBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState. If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
     */

    public MyCartDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses. Each address must contain a key which is unique in this cart.</p>
     */

    public MyCartDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses. Each address must contain a key which is unique in this cart.</p>
     */

    public MyCartDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses. Each address must contain a key which is unique in this cart.</p>
     */

    public MyCartDraftBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses. Each address must contain a key which is unique in this cart.</p>
     */

    public MyCartDraftBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses. Each address must contain a key which is unique in this cart.</p>
     */

    public MyCartDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder discountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder discountCodes(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder plusDiscountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.addAll(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder plusDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public MyCartDraftBuilder withDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        this.discountCodes = new ArrayList<>();
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
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
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
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
        Objects.requireNonNull(currency, MyCartDraft.class + ": currency is missing");
        return new MyCartDraftImpl(currency, customerEmail, country, inventoryMode, lineItems, shippingAddress,
            billingAddress, shippingMethod, custom, locale, taxMode, deleteDaysAfterLastModification,
            itemShippingAddresses, store, discountCodes);
    }

    /**
     * builds MyCartDraft without checking for non null required values
     */
    public MyCartDraft buildUnchecked() {
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
