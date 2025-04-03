
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDraft cartDraft = CartDraft.builder()
 *             .currency("{currency}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDraftBuilder implements Builder<CartDraft> {

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
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems;

    @Nullable
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @Nullable
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress billingAddress;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @Nullable
    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    @Nullable
    private java.util.List<String> discountCodes;

    @Nullable
    private String country;

    @Nullable
    private String locale;

    @Nullable
    private com.commercetools.api.models.cart.CartOrigin origin;

    @Nullable
    private Long deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Currency the Cart uses.</p>
     * @param currency value to be set
     * @return Builder
     */

    public CartDraftBuilder currency(final String currency) {
        this.currency = currency;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Cart.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>id</code> of the Customer that the Cart belongs to.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public CartDraftBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public CartDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Customer Group of the Customer that the Cart belongs to. Used for Line Item price selection.</p>
     *  <p>You can set either a <code>customerId</code> or a <code>customerGroup</code>. If the Customer referenced in <code>customerId</code> belongs to a Customer Group then <code>customerGroup</code> is set automatically.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CartDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Customer Group of the Customer that the Cart belongs to. Used for Line Item price selection.</p>
     *  <p>You can set either a <code>customerId</code> or a <code>customerGroup</code>. If the Customer referenced in <code>customerId</code> belongs to a Customer Group then <code>customerGroup</code> is set automatically.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CartDraftBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Customer Group of the Customer that the Cart belongs to. Used for Line Item price selection.</p>
     *  <p>You can set either a <code>customerId</code> or a <code>customerGroup</code>. If the Customer referenced in <code>customerId</code> belongs to a Customer Group then <code>customerGroup</code> is set automatically.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CartDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Anonymous session associated with the Cart.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public CartDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. When the <code>customerId</code> of the Cart is also set, the Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public CartDraftBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. When the <code>customerId</code> of the Cart is also set, the Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public CartDraftBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. When the <code>customerId</code> of the Cart is also set, the Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public CartDraftBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartDraftBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to the Store the Cart should belong to. Once set, it cannot be updated.</p>
     * @param store value to be set
     * @return Builder
     */

    public CartDraftBuilder store(@Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public CartDraftBuilder lineItems(@Nullable final com.commercetools.api.models.cart.LineItemDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public CartDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.LineItemDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public CartDraftBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.cart.LineItemDraft... lineItems) {
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

    public CartDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public CartDraftBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public CartDraftBuilder addLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraft> builder) {
        return plusLineItems(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()));
    }

    /**
     *  <p>Line Items to add to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public CartDraftBuilder setLineItems(
            Function<com.commercetools.api.models.cart.LineItemDraftBuilder, com.commercetools.api.models.cart.LineItemDraft> builder) {
        return lineItems(builder.apply(com.commercetools.api.models.cart.LineItemDraftBuilder.of()));
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public CartDraftBuilder customLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public CartDraftBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public CartDraftBuilder plusCustomLineItems(
            @Nullable final com.commercetools.api.models.cart.CustomLineItemDraft... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartDraftBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraftBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartDraftBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraftBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartDraftBuilder addCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraft> builder) {
        return plusCustomLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartDraftBuilder setCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemDraftBuilder, com.commercetools.api.models.cart.CustomLineItemDraft> builder) {
        return customLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemDraftBuilder.of()));
    }

    /**
     *  <p>Determines how Tax Rates are set.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public CartDraftBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRateForShippingMethod value
     * @return Builder
     */

    public CartDraftBuilder externalTaxRateForShippingMethod(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRateForShippingMethod = builder
                .apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRateForShippingMethod value
     * @return Builder
     */

    public CartDraftBuilder withExternalTaxRateForShippingMethod(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRateForShippingMethod = builder
                .apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> TaxMode.</p>
     * @param externalTaxRateForShippingMethod value to be set
     * @return Builder
     */

    public CartDraftBuilder externalTaxRateForShippingMethod(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRateForShippingMethod) {
        this.externalTaxRateForShippingMethod = externalTaxRateForShippingMethod;
        return this;
    }

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public CartDraftBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public CartDraftBuilder taxCalculationMode(
            @Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public CartDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public CartDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public CartDraftBuilder withBillingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param billingAddress value to be set
     * @return Builder
     */

    public CartDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> ShippingMode. Determines eligible ShippingMethod rates and Tax Rates of Line Items. Must be one of the <code>itemShippingAddresses</code> when that field is also provided.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public CartDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> ShippingMode. Determines eligible ShippingMethod rates and Tax Rates of Line Items. Must be one of the <code>itemShippingAddresses</code> when that field is also provided.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public CartDraftBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> ShippingMode. Determines eligible ShippingMethod rates and Tax Rates of Line Items. Must be one of the <code>itemShippingAddresses</code> when that field is also provided.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public CartDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> ShippingMode. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public CartDraftBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> ShippingMode. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public CartDraftBuilder withShippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> ShippingMode. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public CartDraftBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public CartDraftBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public CartDraftBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <ul>
     *   <li>If set to <code>Single</code>, only a single Shipping Method can be added to the Cart.</li>
     *   <li>If set to <code>Multiple</code>, multiple Shipping Methods can be added to the Cart.</li>
     *  </ul>
     * @param shippingMode value to be set
     * @return Builder
     */

    public CartDraftBuilder shippingMode(@Nullable final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param customShipping value to be set
     * @return Builder
     */

    public CartDraftBuilder customShipping(
            @Nullable final com.commercetools.api.models.cart.CustomShippingDraft... customShipping) {
        this.customShipping = new ArrayList<>(Arrays.asList(customShipping));
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param customShipping value to be set
     * @return Builder
     */

    public CartDraftBuilder customShipping(
            @Nullable final java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> customShipping) {
        this.customShipping = customShipping;
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param customShipping value to be set
     * @return Builder
     */

    public CartDraftBuilder plusCustomShipping(
            @Nullable final com.commercetools.api.models.cart.CustomShippingDraft... customShipping) {
        if (this.customShipping == null) {
            this.customShipping = new ArrayList<>();
        }
        this.customShipping.addAll(Arrays.asList(customShipping));
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the customShipping value
     * @return Builder
     */

    public CartDraftBuilder plusCustomShipping(
            Function<com.commercetools.api.models.cart.CustomShippingDraftBuilder, com.commercetools.api.models.cart.CustomShippingDraftBuilder> builder) {
        if (this.customShipping == null) {
            this.customShipping = new ArrayList<>();
        }
        this.customShipping
                .add(builder.apply(com.commercetools.api.models.cart.CustomShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the customShipping value
     * @return Builder
     */

    public CartDraftBuilder withCustomShipping(
            Function<com.commercetools.api.models.cart.CustomShippingDraftBuilder, com.commercetools.api.models.cart.CustomShippingDraftBuilder> builder) {
        this.customShipping = new ArrayList<>();
        this.customShipping
                .add(builder.apply(com.commercetools.api.models.cart.CustomShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the customShipping value
     * @return Builder
     */

    public CartDraftBuilder addCustomShipping(
            Function<com.commercetools.api.models.cart.CustomShippingDraftBuilder, com.commercetools.api.models.cart.CustomShippingDraft> builder) {
        return plusCustomShipping(builder.apply(com.commercetools.api.models.cart.CustomShippingDraftBuilder.of()));
    }

    /**
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the customShipping value
     * @return Builder
     */

    public CartDraftBuilder setCustomShipping(
            Function<com.commercetools.api.models.cart.CustomShippingDraftBuilder, com.commercetools.api.models.cart.CustomShippingDraft> builder) {
        return customShipping(builder.apply(com.commercetools.api.models.cart.CustomShippingDraftBuilder.of()));
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public CartDraftBuilder shipping(@Nullable final com.commercetools.api.models.cart.ShippingDraft... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public CartDraftBuilder shipping(
            @Nullable final java.util.List<com.commercetools.api.models.cart.ShippingDraft> shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public CartDraftBuilder plusShipping(@Nullable final com.commercetools.api.models.cart.ShippingDraft... shipping) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.addAll(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartDraftBuilder plusShipping(
            Function<com.commercetools.api.models.cart.ShippingDraftBuilder, com.commercetools.api.models.cart.ShippingDraftBuilder> builder) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartDraftBuilder withShipping(
            Function<com.commercetools.api.models.cart.ShippingDraftBuilder, com.commercetools.api.models.cart.ShippingDraftBuilder> builder) {
        this.shipping = new ArrayList<>();
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartDraftBuilder addShipping(
            Function<com.commercetools.api.models.cart.ShippingDraftBuilder, com.commercetools.api.models.cart.ShippingDraft> builder) {
        return plusShipping(builder.apply(com.commercetools.api.models.cart.ShippingDraftBuilder.of()));
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartDraftBuilder setShipping(
            Function<com.commercetools.api.models.cart.ShippingDraftBuilder, com.commercetools.api.models.cart.ShippingDraft> builder) {
        return shipping(builder.apply(com.commercetools.api.models.cart.ShippingDraftBuilder.of()));
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public CartDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public CartDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public CartDraftBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartDraftBuilder plusItemShippingAddresses(
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
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartDraftBuilder addItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return plusItemShippingAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartDraftBuilder setItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return itemShippingAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public CartDraftBuilder discountCodes(@Nullable final String... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public CartDraftBuilder discountCodes(@Nullable final java.util.List<String> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *  <p><code>code</code> of the existing DiscountCodes to add to the Cart.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public CartDraftBuilder plusDiscountCodes(@Nullable final String... discountCodes) {
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

    public CartDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
     * @param locale value to be set
     * @return Builder
     */

    public CartDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Indicates how the Cart was created.</p>
     * @param origin value to be set
     * @return Builder
     */

    public CartDraftBuilder origin(@Nullable final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Number of days after which an active Cart is deleted since its last modification. If not provided, the default value for this field configured in Project settings is assigned.</p>
     *  <p>Create a ChangeSubscription for Carts to receive a ResourceDeletedDeliveryPayload upon deletion of the Cart.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public CartDraftBuilder deleteDaysAfterLastModification(@Nullable final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Cart.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CartDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
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
     *  <p>User-defined unique identifier for the Cart.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>id</code> of the Customer that the Cart belongs to.</p>
     * @return customerId
     */

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     * @return customerEmail
     */

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>ResourceIdentifier to the Customer Group of the Customer that the Cart belongs to. Used for Line Item price selection.</p>
     *  <p>You can set either a <code>customerId</code> or a <code>customerGroup</code>. If the Customer referenced in <code>customerId</code> belongs to a Customer Group then <code>customerGroup</code> is set automatically.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Anonymous session associated with the Cart.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>ResourceIdentifier to the Business Unit the Cart should belong to. When the <code>customerId</code> of the Cart is also set, the Customer must be an Associate of the Business Unit. Only available for B2B-enabled Projects.</p>
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
    public java.util.List<com.commercetools.api.models.cart.LineItemDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Custom Line Items to add to the Cart.</p>
     * @return customLineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.CustomLineItemDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Determines how Tax Rates are set.</p>
     * @return taxMode
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingMethod</code> if the Cart has <code>External</code> TaxMode.</p>
     * @return externalTaxRateForShippingMethod
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRateForShippingMethod() {
        return this.externalTaxRateForShippingMethod;
    }

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxRoundingMode
     */

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     * @return taxCalculationMode
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
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
     *  <p>Shipping address for a Cart with <code>Single</code> ShippingMode. Determines eligible ShippingMethod rates and Tax Rates of Line Items. Must be one of the <code>itemShippingAddresses</code> when that field is also provided.</p>
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Shipping Method for a Cart with <code>Single</code> ShippingMode. If the referenced ShippingMethod has a <code>predicate</code> that does not match the Cart, an InvalidOperation error is returned when creating a Cart.</p>
     * @return shippingMethod
     */

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
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
     *  <p>Custom Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return customShipping
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.CustomShippingDraft> getCustomShipping() {
        return this.customShipping;
    }

    /**
     *  <p>Shipping Methods for a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shipping
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.ShippingDraft> getShipping() {
        return this.shipping;
    }

    /**
     *  <p>Multiple shipping addresses of the Cart. Each address must contain a <code>key</code> that is unique in this Cart. The keys are used by LineItems to reference these addresses under their <code>shippingDetails</code>.</p>
     *  <p>For Carts with <code>Single</code> ShippingMode: eligible Shipping Methods or applicable Tax Rates are determined by the address <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
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
     *  <p>Indicates how the Cart was created.</p>
     * @return origin
     */

    @Nullable
    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>Number of days after which an active Cart is deleted since its last modification. If not provided, the default value for this field configured in Project settings is assigned.</p>
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
     * builds CartDraft with checking for non-null required values
     * @return CartDraft
     */
    public CartDraft build() {
        Objects.requireNonNull(currency, CartDraft.class + ": currency is missing");
        return new CartDraftImpl(currency, key, customerId, customerEmail, customerGroup, anonymousId, businessUnit,
            store, lineItems, customLineItems, taxMode, externalTaxRateForShippingMethod, taxRoundingMode,
            taxCalculationMode, inventoryMode, billingAddress, shippingAddress, shippingMethod, shippingRateInput,
            shippingMode, customShipping, shipping, itemShippingAddresses, discountCodes, country, locale, origin,
            deleteDaysAfterLastModification, custom);
    }

    /**
     * builds CartDraft without checking for non-null required values
     * @return CartDraft
     */
    public CartDraft buildUnchecked() {
        return new CartDraftImpl(currency, key, customerId, customerEmail, customerGroup, anonymousId, businessUnit,
            store, lineItems, customLineItems, taxMode, externalTaxRateForShippingMethod, taxRoundingMode,
            taxCalculationMode, inventoryMode, billingAddress, shippingAddress, shippingMethod, shippingRateInput,
            shippingMode, customShipping, shipping, itemShippingAddresses, discountCodes, country, locale, origin,
            deleteDaysAfterLastModification, custom);
    }

    /**
     * factory method for an instance of CartDraftBuilder
     * @return builder
     */
    public static CartDraftBuilder of() {
        return new CartDraftBuilder();
    }

    /**
     * create builder for CartDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDraftBuilder of(final CartDraft template) {
        CartDraftBuilder builder = new CartDraftBuilder();
        builder.currency = template.getCurrency();
        builder.key = template.getKey();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.customerGroup = template.getCustomerGroup();
        builder.anonymousId = template.getAnonymousId();
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.taxMode = template.getTaxMode();
        builder.externalTaxRateForShippingMethod = template.getExternalTaxRateForShippingMethod();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.inventoryMode = template.getInventoryMode();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingMethod = template.getShippingMethod();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.shippingMode = template.getShippingMode();
        builder.customShipping = template.getCustomShipping();
        builder.shipping = template.getShipping();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.discountCodes = template.getDiscountCodes();
        builder.country = template.getCountry();
        builder.locale = template.getLocale();
        builder.origin = template.getOrigin();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.custom = template.getCustom();
        return builder;
    }

}
