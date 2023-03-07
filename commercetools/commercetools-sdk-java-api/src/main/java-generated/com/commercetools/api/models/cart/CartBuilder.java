
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

    private com.commercetools.api.models.cart.TaxMode taxMode;

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
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private java.util.List<com.commercetools.api.models.cart.Shipping> shipping;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

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
    private Integer deleteDaysAfterLastModification;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the Cart.</p>
     */

    public CartBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Cart.</p>
     */

    public CartBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Cart was initially created.</p>
     */

    public CartBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Cart was last updated.</p>
     */

    public CartBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Cart.</p>
     */

    public CartBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>id</code> of the Customer that the Cart belongs to.</p>
     */

    public CartBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Email address of the Customer that the Cart belongs to.</p>
     */

    public CartBuilder customerEmail(@Nullable final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     *  <p>Reference to the Customer Group of the Customer that the Cart belongs to. Used for LineItem Price selection.</p>
     */

    public CartBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the Customer Group of the Customer that the Cart belongs to. Used for LineItem Price selection.</p>
     */

    public CartBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Anonymous session associated with the Cart.</p>
     */

    public CartBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Reference to a Business Unit the Cart belongs to.</p>
     */

    public CartBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a Business Unit the Cart belongs to.</p>
     */

    public CartBuilder businessUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>Reference to a Store the Cart belongs to.</p>
     */

    public CartBuilder store(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.store = builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Store the Cart belongs to.</p>
     */

    public CartBuilder store(@Nullable final com.commercetools.api.models.store.StoreKeyReference store) {
        this.store = store;
        return this;
    }

    /**
     *  <p>Line Items added to the Cart.</p>
     */

    public CartBuilder lineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items added to the Cart.</p>
     */

    public CartBuilder lineItems(final java.util.List<com.commercetools.api.models.cart.LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    /**
     *  <p>Line Items added to the Cart.</p>
     */

    public CartBuilder plusLineItems(final com.commercetools.api.models.cart.LineItem... lineItems) {
        if (this.lineItems == null) {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.addAll(Arrays.asList(lineItems));
        return this;
    }

    /**
     *  <p>Line Items added to the Cart.</p>
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
     *  <p>Line Items added to the Cart.</p>
     */

    public CartBuilder withLineItems(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItems = new ArrayList<>();
        this.lineItems.add(builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Line Items added to the Cart.</p>
     */

    public CartBuilder customLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        this.customLineItems = new ArrayList<>(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Custom Line Items added to the Cart.</p>
     */

    public CartBuilder customLineItems(
            final java.util.List<com.commercetools.api.models.cart.CustomLineItem> customLineItems) {
        this.customLineItems = customLineItems;
        return this;
    }

    /**
     *  <p>Custom Line Items added to the Cart.</p>
     */

    public CartBuilder plusCustomLineItems(final com.commercetools.api.models.cart.CustomLineItem... customLineItems) {
        if (this.customLineItems == null) {
            this.customLineItems = new ArrayList<>();
        }
        this.customLineItems.addAll(Arrays.asList(customLineItems));
        return this;
    }

    /**
     *  <p>Custom Line Items added to the Cart.</p>
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
     *  <p>Custom Line Items added to the Cart.</p>
     */

    public CartBuilder withCustomLineItems(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItems = new ArrayList<>();
        this.customLineItems.add(builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sum of all LineItem quantities, excluding CustomLineItems. Only present when the Cart has at least one LineItem.</p>
     */

    public CartBuilder totalLineItemQuantity(@Nullable final Long totalLineItemQuantity) {
        this.totalLineItemQuantity = totalLineItemQuantity;
        return this;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     */

    public CartBuilder totalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sum of the <code>totalPrice</code> field of all LineItems and CustomLineItems, and if available, the <code>price</code> field of ShippingInfo.</p>
     *  <p>Taxes are included if TaxRate <code>includedInPrice</code> is <code>true</code> for each price.</p>
     */

    public CartBuilder totalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, it is automatically set when the external Tax Rate for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     */

    public CartBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, it is automatically set when a shipping address is set.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, it is automatically set when the external Tax Rate for all Line Items, Custom Line Items, and Shipping Methods in the Cart are set.</li>
     *  </ul>
     */

    public CartBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     */

    public CartBuilder taxedShippingPrice(
            Function<com.commercetools.api.models.cart.TaxedPriceBuilder, com.commercetools.api.models.cart.TaxedPriceBuilder> builder) {
        this.taxedShippingPrice = builder.apply(com.commercetools.api.models.cart.TaxedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sum of the <code>taxedPrice</code> field of ShippingInfo across all Shipping Methods.</p>
     */

    public CartBuilder taxedShippingPrice(
            @Nullable final com.commercetools.api.models.cart.TaxedPrice taxedShippingPrice) {
        this.taxedShippingPrice = taxedShippingPrice;
        return this;
    }

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     */

    public CartBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>Indicates how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     */

    public CartBuilder taxRoundingMode(final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
        return this;
    }

    /**
     *  <p>Indicates how taxes are calculated when calculating taxes for <code>taxedPrice</code>.</p>
     */

    public CartBuilder taxCalculationMode(
            final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
        return this;
    }

    /**
     *  <p>Indicates how stock quantities are tracked for Line Items in the Cart.</p>
     */

    public CartBuilder inventoryMode(final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Current status of the Cart.</p>
     */

    public CartBuilder cartState(final com.commercetools.api.models.cart.CartState cartState) {
        this.cartState = cartState;
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     */

    public CartBuilder billingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.billingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Billing address associated with the Cart.</p>
     */

    public CartBuilder billingAddress(@Nullable final com.commercetools.api.models.common.Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     */

    public CartBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping address associated with the Cart. Determines eligible ShippingMethod rates and Tax Rates of Line Items.</p>
     */

    public CartBuilder shippingAddress(@Nullable final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Indicates whether the Cart has one or multiple Shipping Methods.</p>
     */

    public CartBuilder shippingMode(final com.commercetools.api.models.cart.ShippingMode shippingMode) {
        this.shippingMode = shippingMode;
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     */

    public CartBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Single</code> ShippingMode. Automatically set when a Shipping Method is set.</p>
     */

    public CartBuilder shippingInfo(@Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     */

    public CartBuilder shipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        this.shipping = new ArrayList<>(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     */

    public CartBuilder shipping(final java.util.List<com.commercetools.api.models.cart.Shipping> shipping) {
        this.shipping = shipping;
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     */

    public CartBuilder plusShipping(final com.commercetools.api.models.cart.Shipping... shipping) {
        if (this.shipping == null) {
            this.shipping = new ArrayList<>();
        }
        this.shipping.addAll(Arrays.asList(shipping));
        return this;
    }

    /**
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
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
     *  <p>Shipping-related information of a Cart with <code>Multiple</code> ShippingMode. Updated automatically each time a new Shipping Method is added.</p>
     */

    public CartBuilder withShipping(
            Function<com.commercetools.api.models.cart.ShippingBuilder, com.commercetools.api.models.cart.ShippingBuilder> builder) {
        this.shipping = new ArrayList<>();
        this.shipping.add(builder.apply(com.commercetools.api.models.cart.ShippingBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     */

    public CartBuilder shippingRateInput(
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
     */

    public CartBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by LineItems using the <code>shippingDetails</code> field.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */

    public CartBuilder itemShippingAddresses(
            final com.commercetools.api.models.common.Address... itemShippingAddresses) {
        this.itemShippingAddresses = new ArrayList<>(Arrays.asList(itemShippingAddresses));
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by LineItems using the <code>shippingDetails</code> field.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */

    public CartBuilder itemShippingAddresses(
            final java.util.List<com.commercetools.api.models.common.Address> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
        return this;
    }

    /**
     *  <p>Additional shipping addresses of the Cart as specified by LineItems using the <code>shippingDetails</code> field.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
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
     *  <p>Additional shipping addresses of the Cart as specified by LineItems using the <code>shippingDetails</code> field.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
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
     *  <p>Additional shipping addresses of the Cart as specified by LineItems using the <code>shippingDetails</code> field.</p>
     *  <p>Eligible Shipping Methods or applicable Tax Rates are determined by the address in <code>shippingAddress</code>, and not <code>itemShippingAddresses</code>.</p>
     */

    public CartBuilder withItemShippingAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.itemShippingAddresses = new ArrayList<>();
        this.itemShippingAddresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     */

    public CartBuilder discountCodes(final com.commercetools.api.models.cart.DiscountCodeInfo... discountCodes) {
        this.discountCodes = new ArrayList<>(Arrays.asList(discountCodes));
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
     */

    public CartBuilder discountCodes(
            final java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    /**
     *  <p>Discount Codes applied to the Cart. A Cart that has <code>directDiscounts</code> cannot have <code>discountCodes</code>.</p>
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
     */

    public CartBuilder withDiscountCodes(
            Function<com.commercetools.api.models.cart.DiscountCodeInfoBuilder, com.commercetools.api.models.cart.DiscountCodeInfoBuilder> builder) {
        this.discountCodes = new ArrayList<>();
        this.discountCodes.add(builder.apply(com.commercetools.api.models.cart.DiscountCodeInfoBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     */

    public CartBuilder directDiscounts(final com.commercetools.api.models.cart.DirectDiscount... directDiscounts) {
        this.directDiscounts = new ArrayList<>(Arrays.asList(directDiscounts));
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
     */

    public CartBuilder directDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DirectDiscount> directDiscounts) {
        this.directDiscounts = directDiscounts;
        return this;
    }

    /**
     *  <p>Direct Discounts added to the Cart. A Cart that has <code>discountCodes</code> cannot have <code>directDiscounts</code>.</p>
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
     */

    public CartBuilder withDirectDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountBuilder, com.commercetools.api.models.cart.DirectDiscountBuilder> builder) {
        this.directDiscounts = new ArrayList<>();
        this.directDiscounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Cart.</p>
     */

    public CartBuilder refusedGifts(
            final com.commercetools.api.models.cart_discount.CartDiscountReference... refusedGifts) {
        this.refusedGifts = new ArrayList<>(Arrays.asList(refusedGifts));
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Cart.</p>
     */

    public CartBuilder refusedGifts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> refusedGifts) {
        this.refusedGifts = refusedGifts;
        return this;
    }

    /**
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Cart.</p>
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
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Cart.</p>
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
     *  <p>Automatically set when a Line Item with <code>GiftLineItem</code> LineItemMode is removed from the Cart.</p>
     */

    public CartBuilder withRefusedGifts(
            Function<com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder, com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder> builder) {
        this.refusedGifts = new ArrayList<>();
        this.refusedGifts.add(
            builder.apply(com.commercetools.api.models.cart_discount.CartDiscountReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Payment information related to the Cart.</p>
     */

    public CartBuilder paymentInfo(
            Function<com.commercetools.api.models.order.PaymentInfoBuilder, com.commercetools.api.models.order.PaymentInfoBuilder> builder) {
        this.paymentInfo = builder.apply(com.commercetools.api.models.order.PaymentInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Payment information related to the Cart.</p>
     */

    public CartBuilder paymentInfo(@Nullable final com.commercetools.api.models.order.PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }

    /**
     *  <p>Used for LineItem Price selection.</p>
     */

    public CartBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    /**
     *  <p>Languages of the Cart. Can only contain languages supported by the Project.</p>
     */

    public CartBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Indicates how the Cart was created.</p>
     */

    public CartBuilder origin(final com.commercetools.api.models.cart.CartOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Custom Fields of the Cart.</p>
     */

    public CartBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Cart.</p>
     */

    public CartBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Number of days after which an active Cart is deleted since its last modification. Configured in Project settings.</p>
     */

    public CartBuilder deleteDaysAfterLastModification(@Nullable final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CartBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public CartBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CartBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public CartBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
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
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getBusinessUnit() {
        return this.businessUnit;
    }

    @Nullable
    public com.commercetools.api.models.store.StoreKeyReference getStore() {
        return this.store;
    }

    public java.util.List<com.commercetools.api.models.cart.LineItem> getLineItems() {
        return this.lineItems;
    }

    public java.util.List<com.commercetools.api.models.cart.CustomLineItem> getCustomLineItems() {
        return this.customLineItems;
    }

    @Nullable
    public Long getTotalLineItemQuantity() {
        return this.totalLineItemQuantity;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedPrice getTaxedShippingPrice() {
        return this.taxedShippingPrice;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode() {
        return this.taxRoundingMode;
    }

    public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode() {
        return this.taxCalculationMode;
    }

    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    public com.commercetools.api.models.cart.CartState getCartState() {
        return this.cartState;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    public com.commercetools.api.models.cart.ShippingMode getShippingMode() {
        return this.shippingMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    public java.util.List<com.commercetools.api.models.cart.Shipping> getShipping() {
        return this.shipping;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    public java.util.List<com.commercetools.api.models.common.Address> getItemShippingAddresses() {
        return this.itemShippingAddresses;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountCodeInfo> getDiscountCodes() {
        return this.discountCodes;
    }

    public java.util.List<com.commercetools.api.models.cart.DirectDiscount> getDirectDiscounts() {
        return this.directDiscounts;
    }

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountReference> getRefusedGifts() {
        return this.refusedGifts;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public com.commercetools.api.models.cart.CartOrigin getOrigin() {
        return this.origin;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public Integer getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Cart build() {
        Objects.requireNonNull(id, Cart.class + ": id is missing");
        Objects.requireNonNull(version, Cart.class + ": version is missing");
        Objects.requireNonNull(createdAt, Cart.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Cart.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(lineItems, Cart.class + ": lineItems is missing");
        Objects.requireNonNull(customLineItems, Cart.class + ": customLineItems is missing");
        Objects.requireNonNull(totalPrice, Cart.class + ": totalPrice is missing");
        Objects.requireNonNull(taxMode, Cart.class + ": taxMode is missing");
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
            taxedShippingPrice, taxMode, taxRoundingMode, taxCalculationMode, inventoryMode, cartState, billingAddress,
            shippingAddress, shippingMode, shippingInfo, shipping, shippingRateInput, itemShippingAddresses,
            discountCodes, directDiscounts, refusedGifts, paymentInfo, country, locale, origin, custom,
            deleteDaysAfterLastModification, lastModifiedBy, createdBy);
    }

    /**
     * builds Cart without checking for non null required values
     */
    public Cart buildUnchecked() {
        return new CartImpl(id, version, createdAt, lastModifiedAt, key, customerId, customerEmail, customerGroup,
            anonymousId, businessUnit, store, lineItems, customLineItems, totalLineItemQuantity, totalPrice, taxedPrice,
            taxedShippingPrice, taxMode, taxRoundingMode, taxCalculationMode, inventoryMode, cartState, billingAddress,
            shippingAddress, shippingMode, shippingInfo, shipping, shippingRateInput, itemShippingAddresses,
            discountCodes, directDiscounts, refusedGifts, paymentInfo, country, locale, origin, custom,
            deleteDaysAfterLastModification, lastModifiedBy, createdBy);
    }

    public static CartBuilder of() {
        return new CartBuilder();
    }

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
        builder.taxMode = template.getTaxMode();
        builder.taxRoundingMode = template.getTaxRoundingMode();
        builder.taxCalculationMode = template.getTaxCalculationMode();
        builder.inventoryMode = template.getInventoryMode();
        builder.cartState = template.getCartState();
        builder.billingAddress = template.getBillingAddress();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingMode = template.getShippingMode();
        builder.shippingInfo = template.getShippingInfo();
        builder.shipping = template.getShipping();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.itemShippingAddresses = template.getItemShippingAddresses();
        builder.discountCodes = template.getDiscountCodes();
        builder.directDiscounts = template.getDirectDiscounts();
        builder.refusedGifts = template.getRefusedGifts();
        builder.paymentInfo = template.getPaymentInfo();
        builder.country = template.getCountry();
        builder.locale = template.getLocale();
        builder.origin = template.getOrigin();
        builder.custom = template.getCustom();
        builder.deleteDaysAfterLastModification = template.getDeleteDaysAfterLastModification();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
