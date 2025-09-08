
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Cart cart = Cart.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .taxCalculationMode(TaxCalculationMode.LINE_ITEM_LEVEL)
 *             .inventoryMode(InventoryMode.NONE)
 *             .cartState(CartState.ACTIVE)
 *             .shippingMode(ShippingMode.SINGLE)
 *             .plusShipping(shippingBuilder -> shippingBuilder)
 *             .plusItemShippingAddresses(itemShippingAddressesBuilder -> itemShippingAddressesBuilder)
 *             .plusDiscountCodes(discountCodesBuilder -> discountCodesBuilder)
 *             .plusDirectDiscounts(directDiscountsBuilder -> directDiscountsBuilder)
 *             .plusRefusedGifts(refusedGiftsBuilder -> refusedGiftsBuilder)
 *             .origin(CartOrigin.CUSTOMER)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartBuilder implements Builder<Cart> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private String key;

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

    @Nullable
    private Long totalLineItemQuantity;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedPrice;

    @Nullable
    private com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice;

    @Nullable
    private com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice;

    private com.commercetools.api.models.cart.TaxMode taxMode;

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

    private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    private com.commercetools.api.models.cart.CartState cartState;

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

    private java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses;

    private java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes;

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
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination;

    @Nullable
    private Integer deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the Cart.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Cart.</p>
     * @param version value to be set
     * @return Builder
     */

    public CartBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Cart was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CartBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Cart was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CartBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Cart.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that the Cart belongs to.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public CartBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     * @param customerEmail value to be set
     * @return Builder
     */

    public CartBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CartBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CartBuilder withCustomerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CartBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">Anonymous session</a> associated with the Cart.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public CartBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Business Unit the Cart belongs to. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public CartBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Business Unit the Cart belongs to. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public CartBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Business Unit the Cart belongs to. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public CartBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store the Cart belongs to.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store the Cart belongs to.</p>
     * @param builder function to build the store value
     * @return Builder
     */

    public CartBuilder withStore(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store the Cart belongs to.</p>
     * @param store value to be set
     * @return Builder
     */

    public CartBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public CartBuilder lineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public CartBuilder lineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param lineItems value to be set
     * @return Builder
     */

    public CartBuilder plusLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public CartBuilder plusLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public CartBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public CartBuilder addLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItem> builder) {
        return plusLineItems(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @param builder function to build the lineItems value
     * @return Builder
     */

    public CartBuilder setLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItem> builder) {
        return lineItems(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public CartBuilder customLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public CartBuilder customLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param customLineItems value to be set
     * @return Builder
     */

    public CartBuilder plusCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartBuilder plusCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartBuilder addCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItem> builder) {
        return plusCustomLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @param builder function to build the customLineItems value
     * @return Builder
     */

    public CartBuilder setCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItem> builder) {
        return customLineItems(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()));
    }

    /**
     *  <p>Sum of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> quantities, excluding <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>. Only present when the Cart has at least one LineItem.</p>
     * @param totalLineItemQuantity value to be set
     * @return Builder
     */

    public CartBuilder totalLineItemQuantity(@Nullable final Long totalLineItemQuantity) {
        this.totalLineItemQuantity = totalLineItemQuantity;
        return this;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and if available, the <code>price</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CartBuilder totalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and if available, the <code>price</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CartBuilder withTotalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and if available, the <code>price</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public CartBuilder totalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all Line Items and Custom Line Items must be fully distributed between the Shipping Methods (via <code>shippingDetails</code>), otherwise <code>taxedPrice</code> is not automatically set.</li>
     *   <li>For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all allocations must have their respective tax rates present in <code>perMethodTaxRate</code>, otherwise <code>taxedPrice</code> is not automatically set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CartBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all Line Items and Custom Line Items must be fully distributed between the Shipping Methods (via <code>shippingDetails</code>), otherwise <code>taxedPrice</code> is not automatically set.</li>
     *   <li>For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all allocations must have their respective tax rates present in <code>perMethodTaxRate</code>, otherwise <code>taxedPrice</code> is not automatically set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CartBuilder withTaxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all Line Items and Custom Line Items must be fully distributed between the Shipping Methods (via <code>shippingDetails</code>), otherwise <code>taxedPrice</code> is not automatically set.</li>
     *   <li>For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all allocations must have their respective tax rates present in <code>perMethodTaxRate</code>, otherwise <code>taxedPrice</code> is not automatically set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public CartBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> across all Shipping Methods.</p>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param builder function to build the taxedShippingPrice value
     * @return Builder
     */

    public CartBuilder taxedShippingPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedShippingPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> across all Shipping Methods.</p>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param builder function to build the taxedShippingPrice value
     * @return Builder
     */

    public CartBuilder withTaxedShippingPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPrice> builder) {
        this.taxedShippingPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> across all Shipping Methods.</p>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @param taxedShippingPrice value to be set
     * @return Builder
     */

    public CartBuilder taxedShippingPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice) {
        this.taxedShippingPrice = taxedShippingPrice;
        return this;
    }

    /**
     *  <p>Discounts that apply on the Cart <code>totalPrice</code>.</p>
     * @param builder function to build the discountOnTotalPrice value
     * @return Builder
     */

    public CartBuilder discountOnTotalPrice(
            Function<com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder, com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder> builder) {
        this.discountOnTotalPrice = builder.apply(com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Discounts that apply on the Cart <code>totalPrice</code>.</p>
     * @param builder function to build the discountOnTotalPrice value
     * @return Builder
     */

    public CartBuilder withDiscountOnTotalPrice(
            Function<com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder, com.commercetools.api.models.cart.DiscountOnTotalPrice> builder) {
        this.discountOnTotalPrice = builder.apply(com.commercetools.api.models.cart.DiscountOnTotalPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Discounts that apply on the Cart <code>totalPrice</code>.</p>
     * @param discountOnTotalPrice value to be set
     * @return Builder
     */

    public CartBuilder discountOnTotalPrice(
            @Nullable final com.commercetools.api.models.cart.DiscountOnTotalPrice discountOnTotalPrice) {
        this.discountOnTotalPrice = discountOnTotalPrice;
        return this;
    }

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public CartBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @param priceRoundingMode value to be set
     * @return Builder
     */

    public CartBuilder priceRoundingMode(final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        return this;
    }

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @param taxRoundingMode value to be set
     * @return Builder
     */

    public CartBuilder taxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     * @return Builder
     */

    public CartBuilder taxCalculationMode(
            final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public CartBuilder inventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Current status of the Cart.</p>
     * @param cartState value to be set
     * @return Builder
     */

    public CartBuilder cartState(final com.commercetools.api.models.cart.CartState cartState) {
        this.cartState = cartState;
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public CartBuilder billingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param builder function to build the billingAddress value
     * @return Builder
     */

    public CartBuilder withBillingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @param billingAddress value to be set
     * @return Builder
     */

    public CartBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public CartBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public CartBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public CartBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Indicates whether the Cart has one or multiple Shipping Methods.</p>
     * @param shippingMode value to be set
     * @return Builder
     */

    public CartBuilder shippingMode(final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Shipping Method is set</a>.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public CartBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Shipping Method is set</a>.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public CartBuilder withShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfo> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Shipping Method is set</a>.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public CartBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public CartBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public CartBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param builder function to build the shippingCustomFields value
     * @return Builder
     */

    public CartBuilder shippingCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.shippingCustomFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param builder function to build the shippingCustomFields value
     * @return Builder
     */

    public CartBuilder withShippingCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.shippingCustomFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingCustomFields value to be set
     * @return Builder
     */

    public CartBuilder shippingCustomFields(
            @Nullable final com.commercetools.api.models.type.CustomFields shippingCustomFields) {
        this.shippingCustomFields = shippingCustomFields;
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public CartBuilder shipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public CartBuilder shipping(final java.util.List<com.commercetools.api.models.cart.Shipping> shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param shipping value to be set
     * @return Builder
     */

    public CartBuilder plusShipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.addAll(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartBuilder plusShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.ShippingBuilder> builder) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartBuilder withShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.ShippingBuilder> builder) {
        this.shipping = new ArrayList<>();
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartBuilder addShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.Shipping> builder) {
        return plusShipping(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()));
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param builder function to build the shipping value
     * @return Builder
     */

    public CartBuilder setShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.Shipping> builder) {
        return shipping(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()));
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public CartBuilder itemShippingAddresses(
            final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public CartBuilder itemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses value to be set
     * @return Builder
     */

    public CartBuilder plusItemShippingAddresses(
            final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.addAll(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartBuilder plusItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.itemShippingAddresses == null) {
            this.itemShippingAddresses = new ArrayList<>();
        }
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartBuilder addItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return plusItemShippingAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @param builder function to build the itemShippingAddresses value
     * @return Builder
     */

    public CartBuilder setItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return itemShippingAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public CartBuilder discountCodes(final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public CartBuilder discountCodes(
            final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param discountCodes value to be set
     * @return Builder
     */

    public CartBuilder plusDiscountCodes(final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.addAll(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public CartBuilder plusDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        if (this.discountCodes == null) {
            this.discountCodes = new ArrayList<>();
        }
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public CartBuilder withDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        this.discountCodes = new ArrayList<>();
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public CartBuilder addDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfo> builder) {
        return plusDiscountCodes(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()));
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @param builder function to build the discountCodes value
     * @return Builder
     */

    public CartBuilder setDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfo> builder) {
        return discountCodes(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()));
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public CartBuilder directDiscounts(final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        this.directDiscounts = new ArrayList<>(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public CartBuilder directDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts) {
        this.directDiscounts = directDiscounts;
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param directDiscounts value to be set
     * @return Builder
     */

    public CartBuilder plusDirectDiscounts(final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.addAll(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public CartBuilder plusDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        if (this.directDiscounts == null) {
            this.directDiscounts = new ArrayList<>();
        }
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public CartBuilder withDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        this.directDiscounts = new ArrayList<>();
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public CartBuilder addDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscount> builder) {
        return plusDirectDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @param builder function to build the directDiscounts value
     * @return Builder
     */

    public CartBuilder setDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscount> builder) {
        return directDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()));
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public CartBuilder refusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public CartBuilder refusedGifts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.refusedGifts = refusedGifts;
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param refusedGifts value to be set
     * @return Builder
     */

    public CartBuilder plusRefusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        if (this.refusedGifts == null) {
            this.refusedGifts = new ArrayList<>();
        }
        this.refusedGifts.addAll(Arrays.asList(refusedGifts));
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public CartBuilder plusRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        if (this.refusedGifts == null) {
            this.refusedGifts = new ArrayList<>();
        }
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public CartBuilder withRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        this.refusedGifts = new ArrayList<>();
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public CartBuilder addRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReference> builder) {
        return plusRefusedGifts(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()));
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @param builder function to build the refusedGifts value
     * @return Builder
     */

    public CartBuilder setRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReference> builder) {
        return refusedGifts(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()));
    }

    /**
     *  <p>Payment information related to the Cart.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public CartBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Payment information related to the Cart.</p>
     * @param builder function to build the paymentInfo value
     * @return Builder
     */

    public CartBuilder withPaymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfo> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Payment information related to the Cart.</p>
     * @param paymentInfo value to be set
     * @return Builder
     */

    public CartBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     *  <p>Used for <span>Line Item price selection</span>.</p>
     * @param country value to be set
     * @return Builder
     */

    public CartBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Language of the Cart. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param locale value to be set
     * @return Builder
     */

    public CartBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Indicates how the Cart was created.</p>
     * @param origin value to be set
     * @return Builder
     */

    public CartBuilder origin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Custom Fields of the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Cart.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Cart.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CartBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Indicates if a combination of discount types can apply on a Cart.</p>
     * @param discountTypeCombination value to be set
     * @return Builder
     */

    public CartBuilder discountTypeCombination(
            @Nullable final com.commercetools.api.models.cart.DiscountTypeCombination discountTypeCombination) {
        this.discountTypeCombination = discountTypeCombination;
        return this;
    }

    /**
     *  <p>Indicates if a combination of discount types can apply on a Cart.</p>
     * @param builder function to build the discountTypeCombination value
     * @return Builder
     */

    public CartBuilder discountTypeCombination(
            Function<com.commercetools.api.models.cart.DiscountTypeCombinationBuilder, Builder<? extends com.commercetools.api.models.cart.DiscountTypeCombination>> builder) {
        this.discountTypeCombination = builder
                .apply(com.commercetools.api.models.cart.DiscountTypeCombinationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @param deleteDaysAfterLastModification value to be set
     * @return Builder
     */

    public CartBuilder deleteDaysAfterLastModification(@Nullable final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Cart.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CartBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Cart.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CartBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Cart.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public CartBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Cart.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CartBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Cart.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CartBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Cart.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public CartBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the Cart.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Cart.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Cart was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Cart was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the Cart.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> that the Cart belongs to.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the Customer Group of the Customer that the Cart belongs to. Used for <span>Line Item price selection</span>.</p>
     * @return customerGroup
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">Anonymous session</a> associated with the Cart.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Business Unit the Cart belongs to. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a Store the Cart belongs to.</p>
     * @return store
     */

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> added to the Cart.</p>
     * @return lineItems
     */

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> added to the Cart.</p>
     * @return customLineItems
     */

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    /**
     *  <p>Sum of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> quantities, excluding <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>. Only present when the Cart has at least one LineItem.</p>
     * @return totalLineItemQuantity
     */

    @Nullable
    public Long getTotalLineItemQuantity() {
        return this.totalLineItemQuantity;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a>, and if available, the <code>price</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>. If a discount applies on <code>totalPrice</code>, this field holds the discounted value.</p>
     *  <p>Taxes are included if <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code> for each price.</p>
     * @return totalPrice
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingAddressAction" rel="nofollow">shipping address is set</a>. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all Line Items and Custom Line Items must be fully distributed between the Shipping Methods (via <code>shippingDetails</code>), otherwise <code>taxedPrice</code> is not automatically set.</li>
     *   <li>For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, it is automatically set when <code>shippingAddress</code> and external Tax Rates for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set. For Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>, all allocations must have their respective tax rates present in <code>perMethodTaxRate</code>, otherwise <code>taxedPrice</code> is not automatically set.</li>
     *  </ul>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> across all Shipping Methods.</p>
     *  <p>If a discount applies on <code>totalPrice</code>, this field holds the proportionally discounted value.</p>
     * @return taxedShippingPrice
     */

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedShippingPrice() {
        return this.taxedShippingPrice;
    }

    /**
     *  <p>Discounts that apply on the Cart <code>totalPrice</code>.</p>
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

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>Indicates how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @return priceRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @return taxRoundingMode
     */

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxCalculationMode
     */

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Cart.</p>
     * @return inventoryMode
     */

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Current status of the Cart.</p>
     * @return cartState
     */

    public com.commercetools.api.models.cart.CartState getCartState() {
        return this.cartState;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     * @return billingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     *  <p>Shipping address for a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Determines eligible <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> rates and Tax Rates of Line Items.</p>
     * @return shippingAddress
     */

    @Nullable
    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Indicates whether the Cart has one or multiple Shipping Methods.</p>
     * @return shippingMode
     */

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set when a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetShippingMethodAction" rel="nofollow">Shipping Method is set</a>.</p>
     * @return shippingInfo
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @return shippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Custom Fields of the Shipping Method in a Cart with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingCustomFields
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getShippingCustomFields() {
        return this.shippingCustomFields;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Updated automatically each time a new <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @return shipping
     */

    public java.util.List<com.commercetools.api.models.cart.Shipping> getShipping() {
        return this.shipping;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> using the <code>shippingDetails</code> field.</p>
     *  <p>For Carts with <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>: eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */

    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     * @return discountCodes
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     * @return directDiscounts
     */

    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemMode" rel="nofollow">LineItemMode</a> is <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveLineItemAction" rel="nofollow">removed</a> from the Cart.</p>
     * @return refusedGifts
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts() {
        return this.refusedGifts;
    }

    /**
     *  <p>Payment information related to the Cart.</p>
     * @return paymentInfo
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /**
     *  <p>Used for <span>Line Item price selection</span>.</p>
     * @return country
     */

    @Nullable
    public String getCountry() {
        return this.country;
    }

    /**
     *  <p>Language of the Cart. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
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

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    /**
     *  <p>Custom Fields of the Cart.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Indicates if a combination of discount types can apply on a Cart.</p>
     * @return discountTypeCombination
     */

    @Nullable
    public com.commercetools.api.models.cart.DiscountTypeCombination getDiscountTypeCombination() {
        return this.discountTypeCombination;
    }

    /**
     *  <p>Number of days after the last modification before a Cart is deleted. Configured in <a href="https://docs.commercetools.com/apis/ctp:api:type:CartsConfiguration" rel="nofollow">Project settings</a>.</p>
     * @return deleteDaysAfterLastModification
     */

    @Nullable
    public Integer getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    /**
     *  <p>IDs and references that last modified the Cart.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Cart.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     * builds Cart with checking for non-null required values
     * @return Cart
     */
    public Cart build() {
        Objects.requireNonNull(id, Cart.class + ": id is missing");
        Objects.requireNonNull(version, Cart.class + ": version is missing");
        Objects.requireNonNull(createdAt, Cart.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Cart.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(lineItems, Cart.class + ": lineItems is missing");
        Objects.requireNonNull(customLineItems, Cart.class + ": customLineItems is missing");
        Objects.requireNonNull(totalPrice, Cart.class + ": totalPrice is missing");
        Objects.requireNonNull(taxMode, Cart.class + ": taxMode is missing");
        Objects.requireNonNull(priceRoundingMode, Cart.class + ": priceRoundingMode is missing");
        Objects.requireNonNull(taxRoundingMode, Cart.class + ": taxRoundingMode is missing");
        Objects.requireNonNull(taxCalculationMode, Cart.class + ": taxCalculationMode is missing");
        Objects.requireNonNull(inventoryMode, Cart.class + ": inventoryMode is missing");
        Objects.requireNonNull(cartState, Cart.class + ": cartState is missing");
        Objects.requireNonNull(shippingMode, Cart.class + ": shippingMode is missing");
        Objects.requireNonNull(shipping, Cart.class + ": shipping is missing");
        Objects.requireNonNull(itemShippingAddresses, Cart.class + ": itemShippingAddresses is missing");
        Objects.requireNonNull(discountCodes, Cart.class + ": discountCodes is missing");
        Objects.requireNonNull(directDiscounts, Cart.class + ": directDiscounts is missing");
        Objects.requireNonNull(refusedGifts, Cart.class + ": refusedGifts is missing");
        Objects.requireNonNull(origin, Cart.class + ": origin is missing");
        return new CartImpl(id, version, createdAt, lastModifiedAt, key, customerId, customerEmail, customerGroup,
            anonymousId, businessUnit, store, lineItems, customLineItems, totalLineItemQuantity, totalPrice, taxedPrice,
            taxedShippingPrice, discountOnTotalPrice, taxMode, priceRoundingMode, taxRoundingMode, taxCalculationMode,
            inventoryMode, cartState, billingAddress, shippingAddress, shippingMode, shippingKey, shippingInfo,
            shippingRateInput, shippingCustomFields, shipping, itemShippingAddresses, discountCodes, directDiscounts,
            refusedGifts, paymentInfo, country, locale, origin, custom, discountTypeCombination,
            deleteDaysAfterLastModification, lastModifiedBy, createdBy);
    }

    /**
     * builds Cart without checking for non-null required values
     * @return Cart
     */
    public Cart buildUnchecked() {
        return new CartImpl(id, version, createdAt, lastModifiedAt, key, customerId, customerEmail, customerGroup,
            anonymousId, businessUnit, store, lineItems, customLineItems, totalLineItemQuantity, totalPrice, taxedPrice,
            taxedShippingPrice, discountOnTotalPrice, taxMode, priceRoundingMode, taxRoundingMode, taxCalculationMode,
            inventoryMode, cartState, billingAddress, shippingAddress, shippingMode, shippingKey, shippingInfo,
            shippingRateInput, shippingCustomFields, shipping, itemShippingAddresses, discountCodes, directDiscounts,
            refusedGifts, paymentInfo, country, locale, origin, custom, discountTypeCombination,
            deleteDaysAfterLastModification, lastModifiedBy, createdBy);
    }

    /**
     * factory method for an instance of CartBuilder
     * @return builder
     */
    public static CartBuilder of() {
        return new CartBuilder();
    }

    /**
     * create builder for Cart instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartBuilder of(final Cart template) {
        CartBuilder builder = new CartBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.customerId = template.getCustomerId();
        builder.customerEmail = template.getCustomerEmail();
        builder.customerGroup = template.getCustomerGroup();
        builder.anonymousId = template.getAnonymousId();
        builder.businessUnit = template.getBusinessUnit();
        builder.store = template.getStore();
        builder.lineItems = template.getLineItems();
        builder.customLineItems = template.getCustomLineItems();
        builder.totalLineItemQuantity = template.getTotalLineItemQuantity();
        builder.totalPrice = template.getTotalPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedShippingPrice = template.getTaxedShippingPrice();
        builder.discountOnTotalPrice = template.getDiscountOnTotalPrice();
        builder.taxMode = template.getTaxMode();
        builder.priceRoundingMode = template.getPriceRoundingMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.inventoryMode = template.getInventoryMode();
        builder.cartState = template.getCartState();
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
        builder.custom = template.getCustom();
        builder.discountTypeCombination = template.getDiscountTypeCombination();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
