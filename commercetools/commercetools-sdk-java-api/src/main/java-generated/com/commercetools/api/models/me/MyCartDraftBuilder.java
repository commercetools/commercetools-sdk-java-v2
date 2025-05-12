
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
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems;

    @Nullable
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress billingAddress;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    @Nullable
    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    @Nullable
    private java.util.List<String> discountCodes;

    @Nullable
    private String country;

    @Nullable
    private String locale;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Currency the Cart uses.</p>
     * @param currency value to be set
     * @return Builder
     */

    public MyCartDraftBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>Email address of the Customer the Cart belongs to.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public MyCartDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. The Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public MyCartDraftBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. The Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public MyCartDraftBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. The Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public MyCartDraftBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public MyCartDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public MyCartDraftBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param store value to be set
     * @return Builder
     */

    public MyCartDraftBuilder store(@Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public MyCartDraftBuilder lineItems(@Nullable final com.commercetools.api.models.me.MyLineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public MyCartDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.me.MyLineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
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
     *  <p>Line Items to add to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
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
     *  <p>Line Items to add to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public MyCartDraftBuilder withLineItems(
            Function<com.commercetools.api.models.me.MyLineItemDraftBuilder, com.commercetools.api.models.me.MyLineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.me.MyLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public MyCartDraftBuilder addLineItems(
            Function<com.commercetools.api.models.me.MyLineItemDraftBuilder, com.commercetools.api.models.me.MyLineItemDraft> builder) {
        return plusLineItems(builder.apply(com.commercetools.api.models.me.MyLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public MyCartDraftBuilder setLineItems(
            Function<com.commercetools.api.models.me.MyLineItemDraftBuilder, com.commercetools.api.models.me.MyLineItemDraft> builder) {
        return lineItems(builder.apply(com.commercetools.api.models.me.MyLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Determines how Tax Rates are set. The <code>Disabled</code> TaxMode <strong>cannot</strong> be set.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public MyCartDraftBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public MyCartDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public MyCartDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public MyCartDraftBuilder withBillingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param billingAddress value to be set
     * @return Builder
     */

    public MyCartDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public MyCartDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public MyCartDraftBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public MyCartDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Shipping Method for the Cart. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public MyCartDraftBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shipping Method for the Cart. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public MyCartDraftBuilder withShippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping Method for the Cart. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public MyCartDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public MyCartDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public MyCartDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
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
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
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
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public MyCartDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public MyCartDraftBuilder addItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return plusItemShippingAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public MyCartDraftBuilder setItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return itemShippingAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     * @param shippingMode value to be set
     * @return Builder
     */

    public MyCartDraftBuilder shippingMode(
            @Nullable final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
        return this;
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public MyCartDraftBuilder discountCodes(@Nullable final String... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public MyCartDraftBuilder discountCodes(@Nullable final java.util.List<String> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public MyCartDraftBuilder plusDiscountCodes(@Nullable final String... discountCodes) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.addAll(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p>Used for Line Item price selection. If used for Create Cart in Store, the provided country must be one of the Store's <code>countries</code>.</p>
     * @param country value to be set
     * @return Builder
     */

    public MyCartDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
     * @param locale value to be set
     * @return Builder
     */

    public MyCartDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. If not provided, the default value for this field configured in Project settings is assigned.</p>
     *  <p>Create a ChangeSubscription for Carts to receive a ResourceDeletedDeliveryPayload upon deletion of the Cart.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public MyCartDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyCartDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyCartDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyCartDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Currency the Cart uses.</p>
     * @return currency
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     *  <p>Email address of the Customer the Cart belongs to.</p>
     * @return customerEmail
     */

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. The Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @return lineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.me.MyLineItemDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Determines how Tax Rates are set. The <code>Disabled</code> TaxMode <strong>cannot</strong> be set.</p>
     * @return taxMode
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @return billingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Shipping Method for the Cart. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @return shippingMethod
     */

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the Cart <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     * @return shippingMode
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @return discountCodes
     */

    @Nullable
    public java.util.List<String> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
     *  <p>Used for Line Item price selection. If used for Create Cart in Store, the provided country must be one of the Store's <code>countries</code>.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. If not provided, the default value for this field configured in Project settings is assigned.</p>
     *  <p>Create a ChangeSubscription for Carts to receive a ResourceDeletedDeliveryPayload upon deletion of the Cart.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Long getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds MyCartDraft with checking for non-null required values
     * @return MyCartDraft
     */
    public MyCartDraft build() {
        Objects.requireNonNull(currency, MyCartDraft.class + ": currency is missing");
        return new MyCartDraftImpl(currency, customerEmail, businessUnit, store, lineItems, taxMode, inventoryMode,
            billingAddress, shippingAddress, shippingMethod, itemShippingAddresses, shippingMode, discountCodes,
            country, locale, deleteDaysAfterLastModification, custom);
    }

    /**
     * builds MyCartDraft without checking for non-null required values
     * @return MyCartDraft
     */
    public MyCartDraft buildUnchecked() {
        return new MyCartDraftImpl(currency, customerEmail, businessUnit, store, lineItems, taxMode, inventoryMode,
            billingAddress, shippingAddress, shippingMethod, itemShippingAddresses, shippingMode, discountCodes,
            country, locale, deleteDaysAfterLastModification, custom);
    }

    /**
     * factory method for an instance of MyCartDraftBuilder
     * @return builder
     */
    public static MyCartDraftBuilder of() {
        return new MyCartDraftBuilder();
    }

    /**
     * create builder for MyCartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartDraftBuilder of(final MyCartDraft template) {
        MyCartDraftBuilder builder = new MyCartDraftBuilder();
        builder.currency = template.getCurrency();
        builder.customerEmail = template.getCustomerEmail();
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.taxMode = template.getTaxMode();
        builder.inventoryMode = template.getInventoryMode();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingMethod = template.getShippingMethod();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.shippingMode = template.getShippingMode();
        builder.discountCodes = template.getDiscountCodes();
        builder.country = template.getCountry();
        builder.locale = template.getLocale();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.custom = template.getCustom();
        return builder;
    }

}
