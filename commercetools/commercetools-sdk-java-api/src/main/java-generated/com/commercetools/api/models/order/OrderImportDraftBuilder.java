
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportDraft orderImportDraft = OrderImportDraft.builder()
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderImportDraftBuilder implements Builder<OrderImportDraft> {

    @Nullable
    private String orderNumber;

    @Nullable
    private String purchaseOrderNumber;

    @Nullable
    private String customerId;

    @Nullable
    private String customerEmail;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.CustomLineItemImportDraft> customLineItems;

    private com.commercetools.api.models.common.Money totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

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
    private java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses;

    @Nullable
    private com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo;

    @Nullable
    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.OrderState orderState;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private String country;

    @Nullable
    private com.commercetools.api.models.cart.CartOrigin origin;

    @Nullable
    private java.time.ZonedDateTime completedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined identifier of the Order. Must be unique across a Project. Once set, the value cannot be changed.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> the Order belongs to.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>The Email address of the Customer the Order belongs to. Can be used instead of <code>customerId</code> when no check against existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customers</a> is required.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>The Customer Group of the Customer the Order belongs to.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderImportDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Customer Group of the Customer the Order belongs to.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderImportDraftBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Customer Group of the Customer the Order belongs to.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Order should belong to. When the <code>customerId</code> of the Order is also set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderImportDraftBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Order should belong to. When the <code>customerId</code> of the Order is also set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderImportDraftBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Order should belong to. When the <code>customerId</code> of the Order is also set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>The Store the Order belongs to. Used for <span>filtering</span>.</p>
     *  <p>If a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemImportDraft" rel="nofollow">LineItemImportDraft</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemImportDraft" rel="nofollow">CustomLineItemImportDraft</a> specifies a <code>distributionChannel</code> or a <code>supplyChannel</code> that is not defined for the referenced Store, the Order Import gets rejected. The same applies when the provided <code>country</code> is not defined for the referenced Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderImportDraftBuilder store(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Store the Order belongs to. Used for <span>filtering</span>.</p>
     *  <p>If a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemImportDraft" rel="nofollow">LineItemImportDraft</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemImportDraft" rel="nofollow">CustomLineItemImportDraft</a> specifies a <code>distributionChannel</code> or a <code>supplyChannel</code> that is not defined for the referenced Store, the Order Import gets rejected. The same applies when the provided <code>country</code> is not defined for the referenced Store.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderImportDraftBuilder withStore(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Store the Order belongs to. Used for <span>filtering</span>.</p>
     *  <p>If a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemImportDraft" rel="nofollow">LineItemImportDraft</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemImportDraft" rel="nofollow">CustomLineItemImportDraft</a> specifies a <code>distributionChannel</code> or a <code>supplyChannel</code> that is not defined for the referenced Store, the Order Import gets rejected. The same applies when the provided <code>country</code> is not defined for the referenced Store.</p>
     * @param store value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder store(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder lineItems(
            @Nullable final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder lineItems(
            @Nullable final java.util.List<com.commercetools.api.models.order.LineItemImportDraft> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder plusLineItems(
            @Nullable final com.commercetools.api.models.order.LineItemImportDraft... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder plusLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraftBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder withLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraftBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder addLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraft> builder) {
        return plusLineItems(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder setLineItems(
            Function<com.commercetools.api.models.order.LineItemImportDraftBuilder, com.commercetools.api.models.order.LineItemImportDraft> builder) {
        return lineItems(builder.apply(com.commercetools.api.models.order.LineItemImportDraftBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customLineItems(
            @Nullable final com.commercetools.api.models.order.CustomLineItemImportDraft... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder customLineItems(
            @Nullable final java.util.List<com.commercetools.api.models.order.CustomLineItemImportDraft> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder plusCustomLineItems(
            @Nullable final com.commercetools.api.models.order.CustomLineItemImportDraft... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.order.CustomLineItemImportDraftBuilder, com.commercetools.api.models.order.CustomLineItemImportDraftBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.order.CustomLineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder withCustomLineItems(
            Function<com.commercetools.api.models.order.CustomLineItemImportDraftBuilder, com.commercetools.api.models.order.CustomLineItemImportDraftBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems
                .add(builder.apply(com.commercetools.api.models.order.CustomLineItemImportDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder addCustomLineItems(
            Function<com.commercetools.api.models.order.CustomLineItemImportDraftBuilder, com.commercetools.api.models.order.CustomLineItemImportDraft> builder) {
        return plusCustomLineItems(
            builder.apply(com.commercetools.api.models.order.CustomLineItemImportDraftBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderImportDraftBuilder setCustomLineItems(
            Function<com.commercetools.api.models.order.CustomLineItemImportDraftBuilder, com.commercetools.api.models.order.CustomLineItemImportDraft> builder) {
        return customLineItems(builder.apply(com.commercetools.api.models.order.CustomLineItemImportDraftBuilder.of()));
    }

    /**
     *  <p>The total Price of the Order. The amount can be negative.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderImportDraftBuilder totalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The total Price of the Order. The amount can be negative.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderImportDraftBuilder withTotalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>The total Price of the Order. The amount can be negative.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder totalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Include TaxedPrice information for the Order. If not included, and if you have Tax Rates set for Line Items and Custom Line Items, the Order total will not be recalculated.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderImportDraftBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceDraftBuilder, com.commercetools.api.models.cart.TaxedPriceDraftBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Include TaxedPrice information for the Order. If not included, and if you have Tax Rates set for Line Items and Custom Line Items, the Order total will not be recalculated.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderImportDraftBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceDraftBuilder, com.commercetools.api.models.cart.TaxedPriceDraft> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Include TaxedPrice information for the Order. If not included, and if you have Tax Rates set for Line Items and Custom Line Items, the Order total will not be recalculated.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder taxedPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedPriceDraft taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Determines how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @param priceRoundingMode value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder priceRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        return this;
    }

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder taxCalculationMode(
            @Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderImportDraftBuilder billingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderImportDraftBuilder withBillingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param billingAddress value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder billingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Shipping address associated with the Order.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderImportDraftBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping address associated with the Order.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderImportDraftBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping address associated with the Order.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportDraftBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportDraftBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses
                .add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportDraftBuilder addItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return plusItemShippingAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderImportDraftBuilder setItemShippingAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return itemShippingAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Shipping-related information of the Order.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderImportDraftBuilder shippingInfo(
            Function<com.commercetools.api.models.order.ShippingInfoImportDraftBuilder, com.commercetools.api.models.order.ShippingInfoImportDraftBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.order.ShippingInfoImportDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shipping-related information of the Order.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderImportDraftBuilder withShippingInfo(
            Function<com.commercetools.api.models.order.ShippingInfoImportDraftBuilder, com.commercetools.api.models.order.ShippingInfoImportDraft> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.order.ShippingInfoImportDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping-related information of the Order.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder shippingInfo(
            @Nullable final com.commercetools.api.models.order.ShippingInfoImportDraft shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Payment information associated with the Order.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public OrderImportDraftBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Payment information associated with the Order.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public OrderImportDraftBuilder withPaymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfo> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Payment information associated with the Order.</p>
     * @param paymentInfo value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder paymentInfo(
            @Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     *  <p>Payment status of the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>Shipment status of the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Current status of the Order.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder orderState(
            @Nullable final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderImportDraftBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderImportDraftBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Include a value to associate a country with the Order.</p>
     * @param country value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Indicates the origin of the Order.</p>
     * @param origin value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder origin(@Nullable final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>User-defined date and time for the Order. This value does not influence the <code>createdAt</code> or <code>lastModifiedAt</code> values of the Order created by the Order Import.</p>
     * @param completedAt value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     *  <p>Custom Fields for the Order.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderImportDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Order.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderImportDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Order.</p>
     * @param custom value to be set
     * @return Builder
     */

    public OrderImportDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined identifier of the Order. Must be unique across a Project. Once set, the value cannot be changed.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> the Order belongs to.</p>
     * @return customerId
     */

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>The Email address of the Customer the Order belongs to. Can be used instead of <code>customerId</code> when no check against existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customers</a> is required.</p>
     * @return customerEmail
     */

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>The Customer Group of the Customer the Order belongs to.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Order should belong to. When the <code>customerId</code> of the Order is also set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>The Store the Order belongs to. Used for <span>filtering</span>.</p>
     *  <p>If a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemImportDraft" rel="nofollow">LineItemImportDraft</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemImportDraft" rel="nofollow">CustomLineItemImportDraft</a> specifies a <code>distributionChannel</code> or a <code>supplyChannel</code> that is not defined for the referenced Store, the Order Import gets rejected. The same applies when the provided <code>country</code> is not defined for the referenced Store.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore() {
        return this.store;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @return lineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.LineItemImportDraft> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @return customLineItems
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.CustomLineItemImportDraft> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>The total Price of the Order. The amount can be negative.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Include TaxedPrice information for the Order. If not included, and if you have Tax Rates set for Line Items and Custom Line Items, the Order total will not be recalculated.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPriceDraft getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Determines how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @return priceRoundingMode
     */

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
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
     *  <p>Billing address associated with the Order.</p>
     * @return billingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address associated with the Order.</p>
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @return itemShippingAddresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Shipping-related information of the Order.</p>
     * @return shippingInfo
     */

    @Nullable
    public com.commercetools.api.models.order.ShippingInfoImportDraft getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Payment information associated with the Order.</p>
     * @return paymentInfo
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Payment status of the Order.</p>
     * @return paymentState
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Shipment status of the Order.</p>
     * @return shipmentState
     */

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Current status of the Order.</p>
     * @return orderState
     */

    @Nullable
    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Include a value to associate a country with the Order.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Indicates the origin of the Order.</p>
     * @return origin
     */

    @Nullable
    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>User-defined date and time for the Order. This value does not influence the <code>createdAt</code> or <code>lastModifiedAt</code> values of the Order created by the Order Import.</p>
     * @return completedAt
     */

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     *  <p>Custom Fields for the Order.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds OrderImportDraft with checking for non-null required values
     * @return OrderImportDraft
     */
    public OrderImportDraft build() {
        Objects.requireNonNull(totalPrice, OrderImportDraft.class + ": totalPrice is missing");
        return new OrderImportDraftImpl(orderNumber, purchaseOrderNumber, customerId, customerEmail, customerGroup,
            businessUnit, store, lineItems, customLineItems, totalPrice, taxedPrice, priceRoundingMode, taxRoundingMode,
            taxCalculationMode, inventoryMode, billingAddress, shippingAddress, itemShippingAddresses, shippingInfo,
            paymentInfo, paymentState, shipmentState, orderState, state, country, origin, completedAt, custom);
    }

    /**
     * builds OrderImportDraft without checking for non-null required values
     * @return OrderImportDraft
     */
    public OrderImportDraft buildUnchecked() {
        return new OrderImportDraftImpl(orderNumber, purchaseOrderNumber, customerId, customerEmail, customerGroup,
            businessUnit, store, lineItems, customLineItems, totalPrice, taxedPrice, priceRoundingMode, taxRoundingMode,
            taxCalculationMode, inventoryMode, billingAddress, shippingAddress, itemShippingAddresses, shippingInfo,
            paymentInfo, paymentState, shipmentState, orderState, state, country, origin, completedAt, custom);
    }

    /**
     * factory method for an instance of OrderImportDraftBuilder
     * @return builder
     */
    public static OrderImportDraftBuilder of() {
        return new OrderImportDraftBuilder();
    }

    /**
     * create builder for OrderImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportDraftBuilder of(final OrderImportDraft template) {
        OrderImportDraftBuilder builder = new OrderImportDraftBuilder();
        builder.orderNumber = template.getOrderNumber();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.customerGroup = template.getCustomerGroup();
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.priceRoundingMode = template.getPriceRoundingMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.inventoryMode = template.getInventoryMode();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingAddress = template.getShippingAddress();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.shippingInfo = template.getShippingInfo();
        builder.paymentInfo = template.getPaymentInfo();
        builder.paymentState = template.getPaymentState();
        builder.shipmentState = template.getShipmentState();
        builder.orderState = template.getOrderState();
        builder.state = template.getState();
        builder.country = template.getCountry();
        builder.origin = template.getOrigin();
        builder.completedAt = template.getCompletedAt();
        builder.custom = template.getCustom();
        return builder;
    }

}
