
package com.commercetools.history.models.common;

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

    @Nullable
    private String key;

    private String productId;

    @Nullable
    private String productKey;

    private com.commercetools.history.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.history.models.common.LocalizedString productSlug;

    private com.commercetools.history.models.common.ProductTypeReference productType;

    private com.commercetools.history.models.common.ProductVariant variant;

    private com.commercetools.history.models.common.Price price;

    private Long quantity;

    private com.commercetools.history.models.common.CentPrecisionMoney totalPrice;

    private java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    private java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions;

    private java.util.List<com.commercetools.history.models.common.ItemState> state;

    @Nullable
    private com.commercetools.history.models.common.TaxRate taxRate;

    private java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate;

    @Nullable
    private com.commercetools.history.models.common.ChannelReference supplyChannel;

    @Nullable
    private com.commercetools.history.models.common.ChannelReference distributionChannel;

    private com.commercetools.history.models.common.LineItemPriceMode priceMode;

    private com.commercetools.history.models.common.LineItemMode lineItemMode;

    @Nullable
    private com.commercetools.history.models.common.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.history.models.common.ItemShippingDetails shippingDetails;

    @Nullable
    private com.commercetools.history.models.common.CustomFields custom;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.history.models.common.LineItemRecurrenceInfo recurrenceInfo;

    /**
     *  <p>Unique identifier of the LineItem.</p>
     * @param id value to be set
     * @return Builder
     */

    public LineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @param key value to be set
     * @return Builder
     */

    public LineItemBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param productId value to be set
     * @return Builder
     */

    public LineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> when the <code>key</code> is available on that specific Product at the time the LineItem was created or updated on the Cart.</li>
     *   <li>Line Items in an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
     *  </ul>
     *  <p>Present on resources created or updated after 3 December 2021.</p>
     * @param productKey value to be set
     * @return Builder
     */

    public LineItemBuilder productKey(@Nullable final String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public LineItemBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public LineItemBuilder withName(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Product.</p>
     * @param name value to be set
     * @return Builder
     */

    public LineItemBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using <span>Reference Expansion</span>.</p>
     * @param builder function to build the productSlug value
     * @return Builder
     */

    public LineItemBuilder productSlug(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.productSlug = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using <span>Reference Expansion</span>.</p>
     * @param builder function to build the productSlug value
     * @return Builder
     */

    public LineItemBuilder withProductSlug(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.productSlug = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using <span>Reference Expansion</span>.</p>
     * @param productSlug value to be set
     * @return Builder
     */

    public LineItemBuilder productSlug(
            @Nullable final com.commercetools.history.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    /**
     *  <p>Product Type of the Product.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public LineItemBuilder productType(
            Function<com.commercetools.history.models.common.ProductTypeReferenceBuilder, com.commercetools.history.models.common.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.history.models.common.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Type of the Product.</p>
     * @param builder function to build the productType value
     * @return Builder
     */

    public LineItemBuilder withProductType(
            Function<com.commercetools.history.models.common.ProductTypeReferenceBuilder, com.commercetools.history.models.common.ProductTypeReference> builder) {
        this.productType = builder.apply(com.commercetools.history.models.common.ProductTypeReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Product Type of the Product.</p>
     * @param productType value to be set
     * @return Builder
     */

    public LineItemBuilder productType(final com.commercetools.history.models.common.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public LineItemBuilder variant(
            Function<com.commercetools.history.models.common.ProductVariantBuilder, com.commercetools.history.models.common.ProductVariantBuilder> builder) {
        this.variant = builder.apply(com.commercetools.history.models.common.ProductVariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public LineItemBuilder withVariant(
            Function<com.commercetools.history.models.common.ProductVariantBuilder, com.commercetools.history.models.common.ProductVariant> builder) {
        this.variant = builder.apply(com.commercetools.history.models.common.ProductVariantBuilder.of());
        return this;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action.</p>
     * @param variant value to be set
     * @return Builder
     */

    public LineItemBuilder variant(final com.commercetools.history.models.common.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public LineItemBuilder price(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public LineItemBuilder withPrice(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @param price value to be set
     * @return Builder
     */

    public LineItemBuilder price(final com.commercetools.history.models.common.Price price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Number of Line Items of the given Product Variant present in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public LineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     *  <p>If <code>ExternalPrice</code> <span>LineItemPriceMode</span> is used with high-precision money, then the total price is rounded by using the <code>HalfEven</code> rounding mode.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public LineItemBuilder totalPrice(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     *  <p>If <code>ExternalPrice</code> <span>LineItemPriceMode</span> is used with high-precision money, then the total price is rounded by using the <code>HalfEven</code> rounding mode.</p>
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public LineItemBuilder withTotalPrice(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoney> builder) {
        this.totalPrice = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     *  <p>If <code>ExternalPrice</code> <span>LineItemPriceMode</span> is used with high-precision money, then the total price is rounded by using the <code>HalfEven</code> rounding mode.</p>
     * @param totalPrice value to be set
     * @return Builder
     */

    public LineItemBuilder totalPrice(final com.commercetools.history.models.common.CentPrecisionMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public LineItemBuilder discountedPricePerQuantity(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public LineItemBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param discountedPricePerQuantity value to be set
     * @return Builder
     */

    public LineItemBuilder plusDiscountedPricePerQuantity(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.addAll(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public LineItemBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public LineItemBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public LineItemBuilder addDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        return plusDiscountedPricePerQuantity(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @param builder function to build the discountedPricePerQuantity value
     * @return Builder
     */

    public LineItemBuilder setDiscountedPricePerQuantity(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        return discountedPricePerQuantity(
            builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of()));
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public LineItemBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public LineItemBuilder withTaxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @param taxedPrice value to be set
     * @return Builder
     */

    public LineItemBuilder taxedPrice(
            @Nullable final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public LineItemBuilder taxedPricePortions(
            final com.commercetools.history.models.common.MethodTaxedPrice... taxedPricePortions) {
        this.taxedPricePortions = new ArrayList<>(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public LineItemBuilder taxedPricePortions(
            final java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> taxedPricePortions) {
        this.taxedPricePortions = taxedPricePortions;
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param taxedPricePortions value to be set
     * @return Builder
     */

    public LineItemBuilder plusTaxedPricePortions(
            final com.commercetools.history.models.common.MethodTaxedPrice... taxedPricePortions) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions.addAll(Arrays.asList(taxedPricePortions));
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public LineItemBuilder plusTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPriceBuilder> builder) {
        if (this.taxedPricePortions == null) {
            this.taxedPricePortions = new ArrayList<>();
        }
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public LineItemBuilder withTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPriceBuilder> builder) {
        this.taxedPricePortions = new ArrayList<>();
        this.taxedPricePortions
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public LineItemBuilder addTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPrice> builder) {
        return plusTaxedPricePortions(
            builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @param builder function to build the taxedPricePortions value
     * @return Builder
     */

    public LineItemBuilder setTaxedPricePortions(
            Function<com.commercetools.history.models.common.MethodTaxedPriceBuilder, com.commercetools.history.models.common.MethodTaxedPrice> builder) {
        return taxedPricePortions(builder.apply(com.commercetools.history.models.common.MethodTaxedPriceBuilder.of()));
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemBuilder state(final com.commercetools.history.models.common.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemBuilder state(final java.util.List<com.commercetools.history.models.common.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemBuilder plusState(final com.commercetools.history.models.common.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemBuilder plusState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemBuilder withState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemBuilder addState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemBuilder setState(
            Function<com.commercetools.history.models.common.ItemStateBuilder, com.commercetools.history.models.common.ItemState> builder) {
        return state(builder.apply(com.commercetools.history.models.common.ItemStateBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public LineItemBuilder taxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public LineItemBuilder withTaxRate(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @param taxRate value to be set
     * @return Builder
     */

    public LineItemBuilder taxRate(@Nullable final com.commercetools.history.models.common.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public LineItemBuilder perMethodTaxRate(
            final com.commercetools.history.models.common.MethodTaxRate... perMethodTaxRate) {
        this.perMethodTaxRate = new ArrayList<>(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public LineItemBuilder perMethodTaxRate(
            final java.util.List<com.commercetools.history.models.common.MethodTaxRate> perMethodTaxRate) {
        this.perMethodTaxRate = perMethodTaxRate;
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param perMethodTaxRate value to be set
     * @return Builder
     */

    public LineItemBuilder plusPerMethodTaxRate(
            final com.commercetools.history.models.common.MethodTaxRate... perMethodTaxRate) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate.addAll(Arrays.asList(perMethodTaxRate));
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public LineItemBuilder plusPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRateBuilder> builder) {
        if (this.perMethodTaxRate == null) {
            this.perMethodTaxRate = new ArrayList<>();
        }
        this.perMethodTaxRate
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public LineItemBuilder withPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRateBuilder> builder) {
        this.perMethodTaxRate = new ArrayList<>();
        this.perMethodTaxRate
                .add(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public LineItemBuilder addPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRate> builder) {
        return plusPerMethodTaxRate(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()));
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @param builder function to build the perMethodTaxRate value
     * @return Builder
     */

    public LineItemBuilder setPerMethodTaxRate(
            Function<com.commercetools.history.models.common.MethodTaxRateBuilder, com.commercetools.history.models.common.MethodTaxRate> builder) {
        return perMethodTaxRate(builder.apply(com.commercetools.history.models.common.MethodTaxRateBuilder.of()));
    }

    /**
     *  <p>Identifies <span>Inventory entries</span> that are reserved. The referenced Channel has the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public LineItemBuilder supplyChannel(
            Function<com.commercetools.history.models.common.ChannelReferenceBuilder, com.commercetools.history.models.common.ChannelReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.history.models.common.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Identifies <span>Inventory entries</span> that are reserved. The referenced Channel has the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public LineItemBuilder withSupplyChannel(
            Function<com.commercetools.history.models.common.ChannelReferenceBuilder, com.commercetools.history.models.common.ChannelReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.history.models.common.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Identifies <span>Inventory entries</span> that are reserved. The referenced Channel has the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public LineItemBuilder supplyChannel(
            @Nullable final com.commercetools.history.models.common.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The referenced Channel has the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public LineItemBuilder distributionChannel(
            Function<com.commercetools.history.models.common.ChannelReferenceBuilder, com.commercetools.history.models.common.ChannelReferenceBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.history.models.common.ChannelReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The referenced Channel has the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public LineItemBuilder withDistributionChannel(
            Function<com.commercetools.history.models.common.ChannelReferenceBuilder, com.commercetools.history.models.common.ChannelReference> builder) {
        this.distributionChannel = builder.apply(com.commercetools.history.models.common.ChannelReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The referenced Channel has the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public LineItemBuilder distributionChannel(
            @Nullable final com.commercetools.history.models.common.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Indicates how the Price for the Line Item is set.</p>
     * @param priceMode value to be set
     * @return Builder
     */

    public LineItemBuilder priceMode(final com.commercetools.history.models.common.LineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    /**
     *  <p>Indicates how the Line Item is added to the Cart.</p>
     * @param lineItemMode value to be set
     * @return Builder
     */

    public LineItemBuilder lineItemMode(final com.commercetools.history.models.common.LineItemMode lineItemMode) {
        this.lineItemMode = lineItemMode;
        return this;
    }

    /**
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public LineItemBuilder inventoryMode(
            @Nullable final com.commercetools.history.models.common.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public LineItemBuilder shippingDetails(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public LineItemBuilder withShippingDetails(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetails> builder) {
        this.shippingDetails = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public LineItemBuilder shippingDetails(
            @Nullable final com.commercetools.history.models.common.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemBuilder withCustom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @param custom value to be set
     * @return Builder
     */

    public LineItemBuilder custom(@Nullable final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was added to the Cart.</p>
     * @param addedAt value to be set
     * @return Builder
     */

    public LineItemBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public LineItemBuilder lastModifiedAt(@Nullable final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public LineItemBuilder recurrenceInfo(
            Function<com.commercetools.history.models.common.LineItemRecurrenceInfoBuilder, com.commercetools.history.models.common.LineItemRecurrenceInfoBuilder> builder) {
        this.recurrenceInfo = builder.apply(com.commercetools.history.models.common.LineItemRecurrenceInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param builder function to build the recurrenceInfo value
     * @return Builder
     */

    public LineItemBuilder withRecurrenceInfo(
            Function<com.commercetools.history.models.common.LineItemRecurrenceInfoBuilder, com.commercetools.history.models.common.LineItemRecurrenceInfo> builder) {
        this.recurrenceInfo = builder.apply(com.commercetools.history.models.common.LineItemRecurrenceInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @param recurrenceInfo value to be set
     * @return Builder
     */

    public LineItemBuilder recurrenceInfo(
            @Nullable final com.commercetools.history.models.common.LineItemRecurrenceInfo recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
        return this;
    }

    /**
     *  <p>Unique identifier of the LineItem.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return productId
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     *  <p>This field is only present on:</p>
     *  <ul>
     *   <li>Line Items in a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> when the <code>key</code> is available on that specific Product at the time the LineItem was created or updated on the Cart.</li>
     *   <li>Line Items in an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> when the <code>key</code> is available on the specific Product at the time the Order was created from the Cart.</li>
     *  </ul>
     *  <p>Present on resources created or updated after 3 December 2021.</p>
     * @return productKey
     */

    @Nullable
    public String getProductKey() {
        return this.productKey;
    }

    /**
     *  <p>Name of the Product.</p>
     * @return name
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p><code>slug</code> of the current version of the Product. Updated automatically if the <code>slug</code> changes. Empty if the Product has been deleted. The <code>productSlug</code> field of LineItem is not expanded when using <span>Reference Expansion</span>.</p>
     * @return productSlug
     */

    @Nullable
    public com.commercetools.history.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    /**
     *  <p>Product Type of the Product.</p>
     * @return productType
     */

    public com.commercetools.history.models.common.ProductTypeReference getProductType() {
        return this.productType;
    }

    /**
     *  <p>Holds the data of the Product Variant added to the Cart.</p>
     *  <p>The data is saved at the time the Product Variant is added to the Cart and is not updated automatically when Product Variant data changes. Must be updated using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRecalculateAction" rel="nofollow">Recalculate</a> update action.</p>
     * @return variant
     */

    public com.commercetools.history.models.common.ProductVariant getVariant() {
        return this.variant;
    }

    /**
     *  <p>Price of a Line Item selected from the Product Variant according to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> <code>priceMode</code>. If the <code>priceMode</code> is <code>Embedded</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPriceModeEnum" rel="nofollow">ProductPriceMode</a> and the <code>variant</code> field hasn't been updated, the price may not correspond to a price in <code>variant.prices</code>.</p>
     * @return price
     */

    public com.commercetools.history.models.common.Price getPrice() {
        return this.price;
    }

    /**
     *  <p>Number of Line Items of the given Product Variant present in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Total price of this Line Item equalling <code>price</code> multiplied by <code>quantity</code>. If the Line Item is discounted, the total price is the <code>discountedPricePerQuantity</code> multiplied by <code>quantity</code>. Includes taxes if the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxRate" rel="nofollow">TaxRate</a> <code>includedInPrice</code> is <code>true</code>.</p>
     *  <p>If <code>ExternalPrice</code> <span>LineItemPriceMode</span> is used with high-precision money, then the total price is rounded by using the <code>HalfEven</code> rounding mode.</p>
     * @return totalPrice
     */

    public com.commercetools.history.models.common.CentPrecisionMoney getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>Discounted price of a single quantity of the Line Item.</p>
     * @return discountedPricePerQuantity
     */

    public java.util.List<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>Automatically set after <code>taxRate</code> is set.</p>
     * @return taxedPrice
     */

    @Nullable
    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     *  <p>Total taxed prices based on the quantity of Line Item assigned to each <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">Shipping Method</a>. Only applicable for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. Automatically set after <code>perMethodTaxRate</code> is set.</p>
     * @return taxedPricePortions
     */

    public java.util.List<com.commercetools.history.models.common.MethodTaxedPrice> getTaxedPricePortions() {
        return this.taxedPricePortions;
    }

    /**
     *  <p>Tracks specific quantities of the Line Item within a given State. When a Line Item is added to a Cart, its full quantity is set to the built-in "Initial" state. State transitions for Line Items are managed on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return state
     */

    public java.util.List<com.commercetools.history.models.common.ItemState> getState() {
        return this.state;
    }

    /**
     *  <ul>
     *   <li>For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the <code>taxRate</code> of Line Items is set automatically once a shipping address is set. The rate is based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a> that applies for the shipping address.</li>
     *   <li>For a Cart with <code>External</code> TaxMode, the <code>taxRate</code> of Line Items can be set using <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</li>
     *  </ul>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.history.models.common.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Tax Rate per Shipping Method for a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. For a Cart with <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a> it is automatically set after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>. For a Cart with <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>, the Tax Rate must be set with <a href="https://docs.commercetools.com/apis/ctp:api:type:ExternalTaxRateDraft" rel="nofollow">ExternalTaxRateDraft</a>.</p>
     * @return perMethodTaxRate
     */

    public java.util.List<com.commercetools.history.models.common.MethodTaxRate> getPerMethodTaxRate() {
        return this.perMethodTaxRate;
    }

    /**
     *  <p>Identifies <span>Inventory entries</span> that are reserved. The referenced Channel has the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.history.models.common.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Used to <span>select</span> a Product Price. The referenced Channel has the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.history.models.common.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Indicates how the Price for the Line Item is set.</p>
     * @return priceMode
     */

    public com.commercetools.history.models.common.LineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    /**
     *  <p>Indicates how the Line Item is added to the Cart.</p>
     * @return lineItemMode
     */

    public com.commercetools.history.models.common.LineItemMode getLineItemMode() {
        return this.lineItemMode;
    }

    /**
     *  <p>Inventory mode specific to this Line Item only, and valid for the entire <code>quantity</code> of the Line Item. Only present if the inventory mode is different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.history.models.common.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.history.models.common.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Custom Fields of the Line Item.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was added to the Cart.</p>
     * @return addedAt
     */

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Date and time (UTC) the Line Item was last updated.</p>
     * @return lastModifiedAt
     */

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Recurring Order and frequency data.</p>
     * @return recurrenceInfo
     */

    @Nullable
    public com.commercetools.history.models.common.LineItemRecurrenceInfo getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    /**
     * builds LineItem with checking for non-null required values
     * @return LineItem
     */
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
        return new LineItemImpl(id, key, productId, productKey, name, productSlug, productType, variant, price,
            quantity, totalPrice, discountedPricePerQuantity, taxedPrice, taxedPricePortions, state, taxRate,
            perMethodTaxRate, supplyChannel, distributionChannel, priceMode, lineItemMode, inventoryMode,
            shippingDetails, custom, addedAt, lastModifiedAt, recurrenceInfo);
    }

    /**
     * builds LineItem without checking for non-null required values
     * @return LineItem
     */
    public LineItem buildUnchecked() {
        return new LineItemImpl(id, key, productId, productKey, name, productSlug, productType, variant, price,
            quantity, totalPrice, discountedPricePerQuantity, taxedPrice, taxedPricePortions, state, taxRate,
            perMethodTaxRate, supplyChannel, distributionChannel, priceMode, lineItemMode, inventoryMode,
            shippingDetails, custom, addedAt, lastModifiedAt, recurrenceInfo);
    }

    /**
     * factory method for an instance of LineItemBuilder
     * @return builder
     */
    public static LineItemBuilder of() {
        return new LineItemBuilder();
    }

    /**
     * create builder for LineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemBuilder of(final LineItem template) {
        LineItemBuilder builder = new LineItemBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
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
        builder.recurrenceInfo = template.getRecurrenceInfo();
        return builder;
    }

}
