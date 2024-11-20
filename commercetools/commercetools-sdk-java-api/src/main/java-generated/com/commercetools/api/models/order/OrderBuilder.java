
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Order order = Order.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .shippingMode(ShippingMode.SINGLE)
 *             .plusShipping(shippingBuilder -> shippingBuilder)
 *             .plusRefusedGifts(refusedGiftsBuilder -> refusedGiftsBuilder)
 *             .origin(CartOrigin.CUSTOMER)
 *             .orderState(OrderState.OPEN)
 *             .plusSyncInfo(syncInfoBuilder -> syncInfoBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderBuilder implements Builder<Order> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private String orderNumber;

    @Nullable
    private String purchaseOrderNumber;

    @Nullable
    private String customerId;

    @Nullable
    private String customerEmail;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

    @Nullable
    private String anonymousId;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit;

    @Nullable
    private com.commercetools.api.models.store.StoreKeyReference store;

    private java.util.List<com.commercetools.api.models.cart.LineItem> lineItems;

    private java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice;

    @Nullable
    private com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxMode taxMode;

    @Nullable
    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    @Nullable
    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.common.Address billingAddress;

    @Nullable
    private com.commercetools.api.models.common.Address shippingAddress;

    private com.commercetools.api.models.cart.ShippingMode shippingMode;

    @Nullable
    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    @Nullable
    private com.commercetools.api.models.type.CustomFields shippingCustomFields;

    private java.util.List<com.commercetools.api.models.cart.Shipping> shipping;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

    @Nullable
    private java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts;

    @Nullable
    private com.commercetools.api.models.order.PaymentInfo paymentInfo;

    @Nullable
    private String country;

    @Nullable
    private String locale;

    private com.commercetools.api.models.cart.CartOrigin origin;

    @Nullable
    private com.commercetools.api.models.cart.CartReference cart;

    @Nullable
    private com.commercetools.api.models.quote.QuoteReference quote;

    private com.commercetools.api.models.order.OrderState orderState;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    private java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    @Deprecated
    @Nullable
    private Long lastMessageSequenceNumber;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private java.time.ZonedDateTime completedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the Order.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Order.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Order was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public OrderBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Order was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public OrderBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined identifier of the Order that is unique across a Project.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>User-defined identifier of a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     * @param purchaseOrderNumber value to be set
     * @return Builder
     */

    public OrderBuilder purchaseOrderNumber(@Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     *  <p><code>id</code> of the Customer that the Order belongs to.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public OrderBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public OrderBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>Reference to the Customer Group of the Customer that the Order belongs to. Used for Line Item price selection.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the Customer Group of the Customer that the Order belongs to. Used for Line Item price selection.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public OrderBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Customer Group of the Customer that the Order belongs to. Used for Line Item price selection.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public OrderBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Anonymous session associated with the Order.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public OrderBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Reference to a Business Unit the Order belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a Business Unit the Order belongs to.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public OrderBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Business Unit the Order belongs to.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public OrderBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Reference to a Store the Order belongs to.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Store the Order belongs to.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public OrderBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Store the Order belongs to.</p>
     * @param store value to be set
     * @return Builder
     */

    public OrderBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderBuilder lineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderBuilder lineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public OrderBuilder plusLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderBuilder addLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItem> builder) {
        return plusLineItems(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()));
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public OrderBuilder setLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItem> builder) {
        return lineItems(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()));
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderBuilder customLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderBuilder customLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public OrderBuilder plusCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderBuilder addCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItem> builder) {
        return plusCustomLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()));
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public OrderBuilder setCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItem> builder) {
        return customLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()));
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderBuilder totalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public OrderBuilder withTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public OrderBuilder totalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <ul>
     *   <li>For <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For <code>External</code> TaxMode, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the discounted values.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <ul>
     *   <li>For <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For <code>External</code> TaxMode, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the discounted values.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public OrderBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <ul>
     *   <li>For <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For <code>External</code> TaxMode, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the discounted values.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public OrderBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     * @param builder function to build the taxedShippingPrice value
     * @return Builder
     */

    public OrderBuilder taxedShippingPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedShippingPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     * @param builder function to build the taxedShippingPrice value
     * @return Builder
     */

    public OrderBuilder withTaxedShippingPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPrice> builder) {
        this.taxedShippingPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     * @param taxedShippingPrice value to be set
     * @return Builder
     */

    public OrderBuilder taxedShippingPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice) {
        this.taxedShippingPrice = taxedShippingPrice;
        return this;
    }

    /**
     *  <p>Discounts that apply on the total price of the Order.</p>
     * @param builder function to build the discountOnTotalPrice value
     * @return Builder
     */

    public OrderBuilder discountOnTotalPrice(
            Function<com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder, com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder> builder) {
        this.discountOnTotalPrice = builder.apply(com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Discounts that apply on the total price of the Order.</p>
     * @param builder function to build the discountOnTotalPrice value
     * @return Builder
     */

    public OrderBuilder withDiscountOnTotalPrice(
            Function<com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder, com.commercetools.api.models.cart.DiscountOnTotalPrice> builder) {
        this.discountOnTotalPrice = builder.apply(com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Discounts that apply on the total price of the Order.</p>
     * @param discountOnTotalPrice value to be set
     * @return Builder
     */

    public OrderBuilder discountOnTotalPrice(
            @Nullable final com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice) {
        this.discountOnTotalPrice = discountOnTotalPrice;
        return this;
    }

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public OrderBuilder taxMode(@Nullable final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public OrderBuilder taxRoundingMode(
            @Nullable final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public OrderBuilder taxCalculationMode(
            @Nullable final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Order.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public OrderBuilder inventoryMode(@Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderBuilder billingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public OrderBuilder withBillingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param billingAddress value to be set
     * @return Builder
     */

    public OrderBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Shipping address associated with the Order. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping address associated with the Order. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public OrderBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping address associated with the Order. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public OrderBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Indicates whether there can be one or multiple Shipping Methods.</p>
     * @param shippingMode value to be set
     * @return Builder
     */

    public OrderBuilder shippingMode(final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
        return this;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod for <code>Single</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public OrderBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderBuilder withShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfo> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public OrderBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public OrderBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public OrderBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Shipping Method for <code>Single</code> ShippingMode.</p>
     * @param builder function to build the shippingCustomFields value
     * @return Builder
     */

    public OrderBuilder shippingCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.shippingCustomFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Shipping Method for <code>Single</code> ShippingMode.</p>
     * @param builder function to build the shippingCustomFields value
     * @return Builder
     */

    public OrderBuilder withShippingCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.shippingCustomFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Shipping Method for <code>Single</code> ShippingMode.</p>
     * @param shippingCustomFields value to be set
     * @return Builder
     */

    public OrderBuilder shippingCustomFields(
            @Nullable final com.commercetools.api.models.type.CustomFields shippingCustomFields) {
        this.shippingCustomFields = shippingCustomFields;
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public OrderBuilder shipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public OrderBuilder shipping(final java.util.List<com.commercetools.api.models.cart.Shipping> shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public OrderBuilder plusShipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.addAll(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public OrderBuilder plusShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.ShippingBuilder> builder) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public OrderBuilder withShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.ShippingBuilder> builder) {
        this.shipping = new ArrayList<>();
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public OrderBuilder addShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.Shipping> builder) {
        return plusShipping(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()));
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public OrderBuilder setShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.Shipping> builder) {
        return shipping(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()));
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderBuilder itemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderBuilder itemShippingAddresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public OrderBuilder plusItemShippingAddresses(
            @Nullable final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderBuilder addItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return plusItemShippingAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public OrderBuilder setItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return itemShippingAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public OrderBuilder discountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public OrderBuilder discountCodes(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public OrderBuilder plusDiscountCodes(
            @Nullable final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.addAll(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public OrderBuilder plusDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public OrderBuilder withDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        this.discountCodes = new ArrayList<>();
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public OrderBuilder addDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfo> builder) {
        return plusDiscountCodes(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()));
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public OrderBuilder setDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfo> builder) {
        return discountCodes(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()));
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public OrderBuilder directDiscounts(
            @Nullable final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        this.directDiscounts = new ArrayList<>(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public OrderBuilder directDiscounts(
            @Nullable final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts) {
        this.directDiscounts = directDiscounts;
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public OrderBuilder plusDirectDiscounts(
            @Nullable final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.addAll(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public OrderBuilder plusDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public OrderBuilder withDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        this.directDiscounts = new ArrayList<>();
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public OrderBuilder addDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscount> builder) {
        return plusDirectDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public OrderBuilder setDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscount> builder) {
        return directDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public OrderBuilder refusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public OrderBuilder refusedGifts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.refusedGifts = refusedGifts;
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public OrderBuilder plusRefusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        if (this.refusedGifts == null) {
            this.refusedGifts = new ArrayList<>();
        }
        this.refusedGifts.addAll(Arrays.asList(refusedGifts));
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public OrderBuilder plusRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        if (this.refusedGifts == null) {
            this.refusedGifts = new ArrayList<>();
        }
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public OrderBuilder withRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        this.refusedGifts = new ArrayList<>();
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public OrderBuilder addRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReference> builder) {
        return plusRefusedGifts(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()));
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public OrderBuilder setRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReference> builder) {
        return refusedGifts(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()));
    }

    /**
     *  <p>Payment information related to the Order.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public OrderBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Payment information related to the Order.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public OrderBuilder withPaymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfo> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Payment information related to the Order.</p>
     * @param paymentInfo value to be set
     * @return Builder
     */

    public OrderBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     *  <p>Used for Line Item price selection.</p>
     * @param country value to be set
     * @return Builder
     */

    public OrderBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Languages of the Order. Can only contain languages supported by the Project.</p>
     * @param locale value to be set
     * @return Builder
     */

    public OrderBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Indicates the origin of the Cart from which the Order was created.</p>
     * @param origin value to be set
     * @return Builder
     */

    public OrderBuilder origin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Reference to the Cart for an Order created from Cart. The referenced Cart will have the <code>Ordered</code> CartState.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public OrderBuilder cart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReferenceBuilder> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Cart for an Order created from Cart. The referenced Cart will have the <code>Ordered</code> CartState.</p>
     * @param builder function to build the cart value
     * @return Builder
     */

    public OrderBuilder withCart(
            Function<com.commercetools.api.models.cart.CartReferenceBuilder, com.commercetools.api.models.cart.CartReference> builder) {
        this.cart = builder.apply(com.commercetools.api.models.cart.CartReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Cart for an Order created from Cart. The referenced Cart will have the <code>Ordered</code> CartState.</p>
     * @param cart value to be set
     * @return Builder
     */

    public OrderBuilder cart(@Nullable final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
        return this;
    }

    /**
     *  <p>Reference to the Quote for an Order created from Quote.</p>
     * @param builder function to build the quote value
     * @return Builder
     */

    public OrderBuilder quote(
            Function<com.commercetools.api.models.quote.QuoteReferenceBuilder, com.commercetools.api.models.quote.QuoteReferenceBuilder> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Quote for an Order created from Quote.</p>
     * @param builder function to build the quote value
     * @return Builder
     */

    public OrderBuilder withQuote(
            Function<com.commercetools.api.models.quote.QuoteReferenceBuilder, com.commercetools.api.models.quote.QuoteReference> builder) {
        this.quote = builder.apply(com.commercetools.api.models.quote.QuoteReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Quote for an Order created from Quote.</p>
     * @param quote value to be set
     * @return Builder
     */

    public OrderBuilder quote(@Nullable final com.commercetools.api.models.quote.QuoteReference quote) {
        this.quote = quote;
        return this;
    }

    /**
     *  <p>Current status of the Order.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderBuilder orderState(final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>Shipment status of the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderBuilder shipmentState(@Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>Payment status of the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderBuilder paymentState(@Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>State of the Order. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Order. This reference can point to a State in a custom workflow.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public OrderBuilder withState(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReference> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>State of the Order. This reference can point to a State in a custom workflow.</p>
     * @param state value to be set
     * @return Builder
     */

    public OrderBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param syncInfo value to be set
     * @return Builder
     */

    public OrderBuilder syncInfo(final com.commercetools.api.models.order.SyncInfo... syncInfo) {
        this.syncInfo = new ArrayList<>(Arrays.asList(syncInfo));
        return this;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param syncInfo value to be set
     * @return Builder
     */

    public OrderBuilder syncInfo(final java.util.List<com.commercetools.api.models.order.SyncInfo> syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param syncInfo value to be set
     * @return Builder
     */

    public OrderBuilder plusSyncInfo(final com.commercetools.api.models.order.SyncInfo... syncInfo) {
        if (this.syncInfo == null) {
            this.syncInfo = new ArrayList<>();
        }
        this.syncInfo.addAll(Arrays.asList(syncInfo));
        return this;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param builder function to build the syncInfo value
     * @return Builder
     */

    public OrderBuilder plusSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfoBuilder> builder) {
        if (this.syncInfo == null) {
            this.syncInfo = new ArrayList<>();
        }
        this.syncInfo.add(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param builder function to build the syncInfo value
     * @return Builder
     */

    public OrderBuilder withSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfoBuilder> builder) {
        this.syncInfo = new ArrayList<>();
        this.syncInfo.add(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param builder function to build the syncInfo value
     * @return Builder
     */

    public OrderBuilder addSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfo> builder) {
        return plusSyncInfo(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()));
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @param builder function to build the syncInfo value
     * @return Builder
     */

    public OrderBuilder setSyncInfo(
            Function<com.commercetools.api.models.order.SyncInfoBuilder, com.commercetools.api.models.order.SyncInfo> builder) {
        return syncInfo(builder.apply(com.commercetools.api.models.order.SyncInfoBuilder.of()));
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param returnInfo value to be set
     * @return Builder
     */

    public OrderBuilder returnInfo(@Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
        return this;
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param returnInfo value to be set
     * @return Builder
     */

    public OrderBuilder returnInfo(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
        return this;
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param returnInfo value to be set
     * @return Builder
     */

    public OrderBuilder plusReturnInfo(@Nullable final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.addAll(Arrays.asList(returnInfo));
        return this;
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public OrderBuilder plusReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        if (this.returnInfo == null) {
            this.returnInfo = new ArrayList<>();
        }
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public OrderBuilder withReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfoBuilder> builder) {
        this.returnInfo = new ArrayList<>();
        this.returnInfo.add(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public OrderBuilder addReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfo> builder) {
        return plusReturnInfo(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()));
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @param builder function to build the returnInfo value
     * @return Builder
     */

    public OrderBuilder setReturnInfo(
            Function<com.commercetools.api.models.order.ReturnInfoBuilder, com.commercetools.api.models.order.ReturnInfo> builder) {
        return returnInfo(builder.apply(com.commercetools.api.models.order.ReturnInfoBuilder.of()));
    }

    /**
     *  <p>Internal-only field.</p>
     * @param lastMessageSequenceNumber value to be set
     * @return Builder
     */
    @Deprecated
    public OrderBuilder lastMessageSequenceNumber(@Nullable final Long lastMessageSequenceNumber) {
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
        return this;
    }

    /**
     *  <p>Custom Fields of the Order.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Order.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Order.</p>
     * @param custom value to be set
     * @return Builder
     */

    public OrderBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined date and time (UTC) of the Order. Present only on an Order created using Order Import.</p>
     * @param completedAt value to be set
     * @return Builder
     */

    public OrderBuilder completedAt(@Nullable final java.time.ZonedDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Order.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Order.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Order.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public OrderBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Order.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Order.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Order.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public OrderBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the Order.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Order.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Order was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Order was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined identifier of the Order that is unique across a Project.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     *  <p>User-defined identifier of a purchase Order.</p>
     *  <p>It is typically set by the Buyer and can be used with Quotes to track the purchase Order during the quote and order flow.</p>
     * @return purchaseOrderNumber
     */

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    /**
     *  <p><code>id</code> of the Customer that the Order belongs to.</p>
     * @return customerId
     */

    @Nullable
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Email address of the Customer that the Order belongs to.</p>
     * @return customerEmail
     */

    @Nullable
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     *  <p>Reference to the Customer Group of the Customer that the Order belongs to. Used for Line Item price selection.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Anonymous session associated with the Order.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Reference to a Business Unit the Order belongs to.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p>Reference to a Store the Order belongs to.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p>Line Items that are part of the Order.</p>
     * @return lineItems
     */

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p>Custom Line Items that are part of the Order.</p>
     * @return customLineItems
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <ul>
     *   <li>For <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For <code>External</code> TaxMode, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the discounted values.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     * @return taxedShippingPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedShippingPrice() {
        return this.taxedShippingPrice;
    }

    /**
     *  <p>Discounts that apply on the total price of the Order.</p>
     * @return discountOnTotalPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.DiscountOnTotalPrice getDiscountOnTotalPrice() {
        return this.discountOnTotalPrice;
    }

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @return taxMode
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxRoundingMode
     */

    @Nullable
    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxCalculationMode
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Order.</p>
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
    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address associated with the Order. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Indicates whether there can be one or multiple Shipping Methods.</p>
     * @return shippingMode
     */

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod for <code>Single</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Shipping-related information for <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     * @return shippingInfo
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @return shippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Custom Fields of the Shipping Method for <code>Single</code> ShippingMode.</p>
     * @return shippingCustomFields
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getShippingCustomFields() {
        return this.shippingCustomFields;
    }

    /**
     *  <p>Shipping-related information for <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     * @return shipping
     */

    public java.util.List<com.commercetools.api.models.cart.Shipping> getShipping() {
        return this.shipping;
    }

    /**
     *  <p>Additional shipping addresses of the Order as specified by LineItems using the <code>shippingDetails</code> field. Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Discount Codes added to the Order. An Order that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @return discountCodes
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
     *  <p>Direct Discounts added to the Order. An Order that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @return directDiscounts
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Order.</p>
     * @return refusedGifts
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts() {
        return this.refusedGifts;
    }

    /**
     *  <p>Payment information related to the Order.</p>
     * @return paymentInfo
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Used for Line Item price selection.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Languages of the Order. Can only contain languages supported by the Project.</p>
     * @return locale
     */

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Indicates the origin of the Cart from which the Order was created.</p>
     * @return origin
     */

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>Reference to the Cart for an Order created from Cart. The referenced Cart will have the <code>Ordered</code> CartState.</p>
     * @return cart
     */

    @Nullable
    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>Reference to the Quote for an Order created from Quote.</p>
     * @return quote
     */

    @Nullable
    public com.commercetools.api.models.quote.QuoteReference getQuote() {
        return this.quote;
    }

    /**
     *  <p>Current status of the Order.</p>
     * @return orderState
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
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
     *  <p>Payment status of the Order.</p>
     * @return paymentState
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>State of the Order. This reference can point to a State in a custom workflow.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Contains synchronization activity information of the Order (like export or import). Can only be set with Update SyncInfo update action.</p>
     * @return syncInfo
     */

    public java.util.List<com.commercetools.api.models.order.SyncInfo> getSyncInfo() {
        return this.syncInfo;
    }

    /**
     *  <p>Contains information regarding the returns associated with the Order.</p>
     * @return returnInfo
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    /**
     *  <p>Internal-only field.</p>
     * @return lastMessageSequenceNumber
     */
    @Deprecated
    @Nullable
    public Long getLastMessageSequenceNumber() {
        return this.lastMessageSequenceNumber;
    }

    /**
     *  <p>Custom Fields of the Order.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined date and time (UTC) of the Order. Present only on an Order created using Order Import.</p>
     * @return completedAt
     */

    @Nullable
    public java.time.ZonedDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     *  <p>IDs and references that last modified the Order.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Order.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     * builds Order with checking for non-null required values
     * @return Order
     */
    public Order build() {
        Objects.requireNonNull(id, Order.class + ": id is missing");
        Objects.requireNonNull(version, Order.class + ": version is missing");
        Objects.requireNonNull(createdAt, Order.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Order.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(lineItems, Order.class + ": lineItems is missing");
        Objects.requireNonNull(customLineItems, Order.class + ": customLineItems is missing");
        Objects.requireNonNull(totalPrice, Order.class + ": totalPrice is missing");
        Objects.requireNonNull(shippingMode, Order.class + ": shippingMode is missing");
        Objects.requireNonNull(shipping, Order.class + ": shipping is missing");
        Objects.requireNonNull(refusedGifts, Order.class + ": refusedGifts is missing");
        Objects.requireNonNull(origin, Order.class + ": origin is missing");
        Objects.requireNonNull(orderState, Order.class + ": orderState is missing");
        Objects.requireNonNull(syncInfo, Order.class + ": syncInfo is missing");
        return new OrderImpl(id, version, createdAt, lastModifiedAt, orderNumber, purchaseOrderNumber, customerId,
            customerEmail, customerGroup, anonymousId, businessUnit, store, lineItems, customLineItems, totalPrice,
            taxedPrice, taxedShippingPrice, discountOnTotalPrice, taxMode, taxRoundingMode, taxCalculationMode,
            inventoryMode, billingAddress, shippingAddress, shippingMode, shippingKey, shippingInfo, shippingRateInput,
            shippingCustomFields, shipping, itemShippingAddresses, discountCodes, directDiscounts, refusedGifts,
            paymentInfo, country, locale, origin, cart, quote, orderState, shipmentState, paymentState, state, syncInfo,
            returnInfo, lastMessageSequenceNumber, custom, completedAt, lastModifiedBy, createdBy);
    }

    /**
     * builds Order without checking for non-null required values
     * @return Order
     */
    public Order buildUnchecked() {
        return new OrderImpl(id, version, createdAt, lastModifiedAt, orderNumber, purchaseOrderNumber, customerId,
            customerEmail, customerGroup, anonymousId, businessUnit, store, lineItems, customLineItems, totalPrice,
            taxedPrice, taxedShippingPrice, discountOnTotalPrice, taxMode, taxRoundingMode, taxCalculationMode,
            inventoryMode, billingAddress, shippingAddress, shippingMode, shippingKey, shippingInfo, shippingRateInput,
            shippingCustomFields, shipping, itemShippingAddresses, discountCodes, directDiscounts, refusedGifts,
            paymentInfo, country, locale, origin, cart, quote, orderState, shipmentState, paymentState, state, syncInfo,
            returnInfo, lastMessageSequenceNumber, custom, completedAt, lastModifiedBy, createdBy);
    }

    /**
     * factory method for an instance of OrderBuilder
     * @return builder
     */
    public static OrderBuilder of() {
        return new OrderBuilder();
    }

    /**
     * create builder for Order instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBuilder of(final Order template) {
        OrderBuilder builder = new OrderBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.orderNumber = template.getOrderNumber();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.customerGroup = template.getCustomerGroup();
        builder.anonymousId = template.getAnonymousId();
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedShippingPrice = template.getTaxedShippingPrice();
        builder.discountOnTotalPrice = template.getDiscountOnTotalPrice();
        builder.taxMode = template.getTaxMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.inventoryMode = template.getInventoryMode();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingMode = template.getShippingMode();
        builder.shippingKey = template.getShippingKey();
        builder.shippingInfo = template.getShippingInfo();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.shippingCustomFields = template.getShippingCustomFields();
        builder.shipping = template.getShipping();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.discountCodes = template.getDiscountCodes();
        builder.directDiscounts = template.getDirectDiscounts();
        builder.refusedGifts = template.getRefusedGifts();
        builder.paymentInfo = template.getPaymentInfo();
        builder.country = template.getCountry();
        builder.locale = template.getLocale();
        builder.origin = template.getOrigin();
        builder.cart = template.getCart();
        builder.quote = template.getQuote();
        builder.orderState = template.getOrderState();
        builder.shipmentState = template.getShipmentState();
        builder.paymentState = template.getPaymentState();
        builder.state = template.getState();
        builder.syncInfo = template.getSyncInfo();
        builder.returnInfo = template.getReturnInfo();
        builder.lastMessageSequenceNumber = template.getLastMessageSequenceNumber();
        builder.custom = template.getCustom();
        builder.completedAt = template.getCompletedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
