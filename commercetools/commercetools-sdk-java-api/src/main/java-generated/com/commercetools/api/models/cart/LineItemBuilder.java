
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItem lineItem = LineItem.builder()
 *             .id("{id}")
 *             .productId("{productId}")
 *             .name(nameBuilder -> nameBuilder)
 *             .productType(productTypeBuilder -> productTypeBuilder)
 *             .variant(variantBuilder -> variantBuilder)
 *             .price(priceBuilder -> priceBuilder)
 *             .quantity(0.3)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .plusDiscountedPricePerQuantity(discountedPricePerQuantityBuilder -> discountedPricePerQuantityBuilder)
 *             .plusTaxedPricePortions(taxedPricePortionsBuilder -> taxedPricePortionsBuilder)
 *             .plusState(stateBuilder -> stateBuilder)
 *             .plusPerMethodTaxRate(perMethodTaxRateBuilder -> perMethodTaxRateBuilder)
 *             .priceMode(LineItemPriceMode.PLATFORM)
 *             .lineItemMode(LineItemMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemBuilder implements Builder<LineItem> {

    private String id;

    private String productId;

    @Nullable
    private String productKey;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.product.ProductVariant variant;

    private com.commercetools.api.models.common.Price price;

    private Long quantity;

    private com.commercetools.api.models.common.CentPrecisionMoney totalPrice;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    private java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    private com.commercetools.api.models.cart.LineItemPriceMode priceMode;

    private com.commercetools.api.models.cart.LineItemMode lineItemMode;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    /**
     *  <p>Unique identifier of the Line Item.</p>
     * @param id
     * @return Builder
     */

    public LineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p><code>id</code> of the Product the Line Item is based on.</p>
     * @param productId
     * @return Builder
     */

    public LineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Product.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a Cart when the <code>key</code> is available on that specific Product at the time the Line Item was created or updated on the Cart.</li>
     *   <li>Orders when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
     *  </ul>
     *  <p>Present on resources created or updated after 3 December 2021.</p>
     * @param productKey
     * @return Builder
     */

    public LineItemBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @return Builder
     */

    public LineItemBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param name
     * @return Builder
     */

    public LineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using Reference Expansion.</p>
     * @return Builder
     */

    public LineItemBuilder productSlug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using Reference Expansion.</p>
     * @param productSlug
     * @return Builder
     */

    public LineItemBuilder productSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    /**
     *  <p>Product Type of the Product.</p>
     * @return Builder
     */

    public LineItemBuilder productType(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Type of the Product.</p>
     * @param productType
     * @return Builder
     */

    public LineItemBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the Recalculate update action.</p>
     * @return Builder
     */

    public LineItemBuilder variant(
            Function<com.commercetools.api.models.product.ProductVariantBuilder, com.commercetools.api.models.product.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.product.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the Recalculate update action.</p>
     * @param variant
     * @return Builder
     */

    public LineItemBuilder variant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the Product <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> ProductPriceMode and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @return Builder
     */

    public LineItemBuilder price(
            Function<com.commercetools.api.models.common.PriceBuilder, com.commercetools.api.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the Product <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> ProductPriceMode and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @param price
     * @return Builder
     */

    public LineItemBuilder price(final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Number of Line Items of the given Product Variant present in the Cart.</p>
     * @param quantity
     * @return Builder
     */

    public LineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @return Builder
     */

    public LineItemBuilder totalPrice(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the TaxRate <code>includedInPrice</code> is <code>true</code>.</p>
     * @param totalPrice
     * @return Builder
     */

    public LineItemBuilder totalPrice(final com.commercetools.api.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity
     * @return Builder
     */

    public LineItemBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity
     * @return Builder
     */

    public LineItemBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity
     * @return Builder
     */

    public LineItemBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @return Builder
     */

    public LineItemBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @return Builder
     */

    public LineItemBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantityBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @return Builder
     */

    public LineItemBuilder taxedPrice(
            Function<com.commercetools.api.models.cart.TaxedItemPriceBuilder, com.commercetools.api.models.cart.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.api.models.cart.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @param taxedPrice
     * @return Builder
     */

    public LineItemBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Method that is automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions
     * @return Builder
     */

    public LineItemBuilder taxedPricePortions(
            final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Method that is automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions
     * @return Builder
     */

    public LineItemBuilder taxedPricePortions(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Method that is automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions
     * @return Builder
     */

    public LineItemBuilder plusTaxedPricePortions(
            final com.commercetools.api.models.cart.MethodTaxedPrice... taxedPricePortions) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions.addAll(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Method that is automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return Builder
     */

    public LineItemBuilder plusTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPriceBuilder> builder) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Taxed price of the Shipping Method that is automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return Builder
     */

    public LineItemBuilder withTaxedPricePortions(
            Function<com.commercetools.api.models.cart.MethodTaxedPriceBuilder, com.commercetools.api.models.cart.MethodTaxedPriceBuilder> builder) {
        this.taxedPricePortions = new ArrayList<>();
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.api.models.cart.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>State of the Line Item in the Cart.</p>
     * @param state
     * @return Builder
     */

    public LineItemBuilder state(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>State of the Line Item in the Cart.</p>
     * @param state
     * @return Builder
     */

    public LineItemBuilder state(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>State of the Line Item in the Cart.</p>
     * @param state
     * @return Builder
     */

    public LineItemBuilder plusState(final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>State of the Line Item in the Cart.</p>
     * @return Builder
     */

    public LineItemBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>State of the Line Item in the Cart.</p>
     * @return Builder
     */

    public LineItemBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @return Builder
     */

    public LineItemBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> TaxMode, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the TaxCategory that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using ExternalTaxRateDraft.</li>
     *  </ul>
     * @param taxRate
     * @return Builder
     */

    public LineItemBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param perMethodTaxRate
     * @return Builder
     */

    public LineItemBuilder perMethodTaxRate(final com.commercetools.api.models.cart.MethodTaxRate... perMethodTaxRate) {
        this.perMethodTaxRate = new ArrayList<>(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param perMethodTaxRate
     * @return Builder
     */

    public LineItemBuilder perMethodTaxRate(
            final java.util.List<com.commercetools.api.models.cart.MethodTaxRate> perMethodTaxRate) {
        this.perMethodTaxRate = perMethodTaxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @param perMethodTaxRate
     * @return Builder
     */

    public LineItemBuilder plusPerMethodTaxRate(
            final com.commercetools.api.models.cart.MethodTaxRate... perMethodTaxRate) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate.addAll(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @return Builder
     */

    public LineItemBuilder plusPerMethodTaxRate(
            Function<com.commercetools.api.models.cart.MethodTaxRateBuilder, com.commercetools.api.models.cart.MethodTaxRateBuilder> builder) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate.add(builder.apply(com.commercetools.api.models.cart.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> ShippingMode. For a Cart with <code>Platform</code> TaxMode it is automatically set after the Shipping Method is added. For a Cart with <code>External</code> TaxMode, the Tax Rate must be set with ExternalTaxRateDraft.</p>
     * @return Builder
     */

    public LineItemBuilder withPerMethodTaxRate(
            Function<com.commercetools.api.models.cart.MethodTaxRateBuilder, com.commercetools.api.models.cart.MethodTaxRateBuilder> builder) {
        this.perMethodTaxRate = new ArrayList<>();
        this.perMethodTaxRate.add(builder.apply(com.commercetools.api.models.cart.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Identifies Inventory entries that are reserved. The referenced Channel has the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return Builder
     */

    public LineItemBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Identifies Inventory entries that are reserved. The referenced Channel has the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel
     * @return Builder
     */

    public LineItemBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Used to select a Product Price. The referenced Channel has the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @return Builder
     */

    public LineItemBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to select a Product Price. The referenced Channel has the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannel
     * @return Builder
     */

    public LineItemBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Indicates how the Price for the Line Item is set.</p>
     * @param priceMode
     * @return Builder
     */

    public LineItemBuilder priceMode(final com.commercetools.api.models.cart.LineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>Indicates how the Line Item is added to the Cart.</p>
     * @param lineItemMode
     * @return Builder
     */

    public LineItemBuilder lineItemMode(final com.commercetools.api.models.cart.LineItemMode lineItemMode) {
        this.lineItemMode = lineItemMode;
        return this;
    }

    /**
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the Cart.</p>
     * @param inventoryMode
     * @return Builder
     */

    public LineItemBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @return Builder
     */

    public LineItemBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsBuilder, com.commercetools.api.models.cart.ItemShippingDetailsBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails
     * @return Builder
     */

    public LineItemBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @return Builder
     */

    public LineItemBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @param custom
     * @return Builder
     */

    public LineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was added to the Cart.</p>
     * @param addedAt
     * @return Builder
     */

    public LineItemBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was last updated.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public LineItemBuilder lastModifiedAt(@Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getProductType() {
        return this.productType;
    }

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    public com.commercetools.api.models.common.Price getPrice() {
        return this.price;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public java.util.List<com.commercetools.api.models.cart.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    public java.util.List<com.commercetools.api.models.cart.MethodTaxRate> getPerMethodTaxRate() {
        return this.perMethodTaxRate;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public com.commercetools.api.models.cart.LineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    public com.commercetools.api.models.cart.LineItemMode getLineItemMode() {
        return this.lineItemMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public LineItem build() {
        Objects.requireNonNull(id, LineItem.class + ": id is missing");
        Objects.requireNonNull(productId, LineItem.class + ": productId is missing");
        Objects.requireNonNull(name, LineItem.class + ": name is missing");
        Objects.requireNonNull(productType, LineItem.class + ": productType is missing");
        Objects.requireNonNull(variant, LineItem.class + ": variant is missing");
        Objects.requireNonNull(price, LineItem.class + ": price is missing");
        Objects.requireNonNull(quantity, LineItem.class + ": quantity is missing");
        Objects.requireNonNull(totalPrice, LineItem.class + ": totalPrice is missing");
        Objects.requireNonNull(discountedPricePerQuantity, LineItem.class + ": discountedPricePerQuantity is missing");
        Objects.requireNonNull(taxedPricePortions, LineItem.class + ": taxedPricePortions is missing");
        Objects.requireNonNull(state, LineItem.class + ": state is missing");
        Objects.requireNonNull(perMethodTaxRate, LineItem.class + ": perMethodTaxRate is missing");
        Objects.requireNonNull(priceMode, LineItem.class + ": priceMode is missing");
        Objects.requireNonNull(lineItemMode, LineItem.class + ": lineItemMode is missing");
        return new LineItemImpl(id, productId, productKey, name, productSlug, productType, variant, price, quantity,
            totalPrice, discountedPricePerQuantity, taxedPrice, taxedPricePortions, state, taxRate, perMethodTaxRate,
            supplyChannel, distributionChannel, priceMode, lineItemMode, inventoryMode, shippingDetails, custom,
            addedAt, lastModifiedAt);
    }

    /**
     * builds LineItem without checking for non null required values
     */
    public LineItem buildUnchecked() {
        return new LineItemImpl(id, productId, productKey, name, productSlug, productType, variant, price, quantity,
            totalPrice, discountedPricePerQuantity, taxedPrice, taxedPricePortions, state, taxRate, perMethodTaxRate,
            supplyChannel, distributionChannel, priceMode, lineItemMode, inventoryMode, shippingDetails, custom,
            addedAt, lastModifiedAt);
    }

    public static LineItemBuilder of() {
        return new LineItemBuilder();
    }

    public static LineItemBuilder of(final LineItem template) {
        LineItemBuilder builder = new LineItemBuilder();
        builder.id = template.getId();
        builder.productId = template.getProductId();
        builder.productKey = template.getProductKey();
        builder.name = template.getName();
        builder.productSlug = template.getProductSlug();
        builder.productType = template.getProductType();
        builder.variant = template.getVariant();
        builder.price = template.getPrice();
        builder.quantity = template.getQuantity();
        builder.totalPrice = template.getTotalPrice();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.taxedPrice = template.getTaxedPrice();
        builder.taxedPricePortions = template.getTaxedPricePortions();
        builder.state = template.getState();
        builder.taxRate = template.getTaxRate();
        builder.perMethodTaxRate = template.getPerMethodTaxRate();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.priceMode = template.getPriceMode();
        builder.lineItemMode = template.getLineItemMode();
        builder.inventoryMode = template.getInventoryMode();
        builder.shippingDetails = template.getShippingDetails();
        builder.custom = template.getCustom();
        builder.addedAt = template.getAddedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
