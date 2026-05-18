
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemImportDraft lineItemImportDraft = LineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .variant(variantBuilder -> variantBuilder)
 *             .quantity(0.3)
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemImportDraftBuilder implements Builder<LineItemImportDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    private com.commercetools.api.models.order.ProductVariantImportDraft variant;

    @Nullable
    private String productId;

    private Long quantity;

    private com.commercetools.api.models.common.PriceDraft price;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @Nullable
    private com.commercetools.api.models.cart.InventoryMode inventoryMode;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Name of the Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public LineItemImportDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Line Item.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public LineItemImportDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Line Item.</p>
     * @param name value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Line Item.</p>
     * @param key value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Product Variant to use as a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public LineItemImportDraftBuilder variant(
            Function<com.commercetools.api.models.order.ProductVariantImportDraftBuilder, com.commercetools.api.models.order.ProductVariantImportDraftBuilder> builder) {
        this.variant = builder.apply(com.commercetools.api.models.order.ProductVariantImportDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Product Variant to use as a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public LineItemImportDraftBuilder withVariant(
            Function<com.commercetools.api.models.order.ProductVariantImportDraftBuilder, com.commercetools.api.models.order.ProductVariantImportDraft> builder) {
        this.variant = builder.apply(com.commercetools.api.models.order.ProductVariantImportDraftBuilder.of());
        return this;
    }

    /**
     *  <p>The Product Variant to use as a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     * @param variant value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder variant(
            final com.commercetools.api.models.order.ProductVariantImportDraft variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Product Variant belongs to.</p>
     *  <p>If provided, you must also set <code>variant.id</code>.</p>
     * @param productId value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder productId(@Nullable final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>The number of Product Variants in the LineItem. Can be a negative value.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The Line Item price for <code>quantity</code> = <code>1</code>. The amount can be negative.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public LineItemImportDraftBuilder price(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Line Item price for <code>quantity</code> = <code>1</code>. The amount can be negative.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public LineItemImportDraftBuilder withPrice(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of());
        return this;
    }

    /**
     *  <p>The Line Item price for <code>quantity</code> = <code>1</code>. The amount can be negative.</p>
     * @param price value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder price(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public LineItemImportDraftBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public LineItemImportDraftBuilder withTaxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder taxRate(
            @Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>The Channel used to <span>select a Price</span>. This Channel must have the <code>ProductDistribution</code> role.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Channel used to <span>select a Price</span>. This Channel must have the <code>ProductDistribution</code> role.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Channel used to <span>select a Price</span>. This Channel must have the <code>ProductDistribution</code> role.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>The Channel used to supply Line Items. By providing supply Channel information, you can uniquely identify <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory entries</a> that should be reserved. This Channel must have the <code>InventorySupply</code> role.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Channel used to supply Line Items. By providing supply Channel information, you can uniquely identify <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory entries</a> that should be reserved. This Channel must have the <code>InventorySupply</code> role.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Channel used to supply Line Items. By providing supply Channel information, you can uniquely identify <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory entries</a> that should be reserved. This Channel must have the <code>InventorySupply</code> role.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Inventory mode specific to the LineItem, valid for the entire <code>quantity</code> of the LineItem. Set only if Inventory mode should be different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderImportDraft" rel="nofollow">OrderImportDraft</a>.</p>
     * @param inventoryMode value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder inventoryMode(
            @Nullable final com.commercetools.api.models.cart.InventoryMode inventoryMode) {
        this.inventoryMode = inventoryMode;
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public LineItemImportDraftBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public LineItemImportDraftBuilder withShippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>States of the Line Item.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder state(@Nullable final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>States of the Line Item.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>States of the Line Item.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder plusState(@Nullable final com.commercetools.api.models.order.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>States of the Line Item.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>States of the Line Item.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>States of the Line Item.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder addState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>States of the Line Item.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder setState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return state(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }

    /**
     *  <p>Custom Fields for the LineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemImportDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the LineItem.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemImportDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the LineItem.</p>
     * @param custom value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Name of the Line Item.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier of the Line Item.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The Product Variant to use as a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     * @return variant
     */

    public com.commercetools.api.models.order.ProductVariantImportDraft getVariant() {
        return this.variant;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Product Variant belongs to.</p>
     *  <p>If provided, you must also set <code>variant.id</code>.</p>
     * @return productId
     */

    @Nullable
    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The number of Product Variants in the LineItem. Can be a negative value.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>The Line Item price for <code>quantity</code> = <code>1</code>. The amount can be negative.</p>
     * @return price
     */

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    /**
     *  <p>The tax rate used to calculate the <code>taxedPrice</code> of the Order.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>The Channel used to <span>select a Price</span>. This Channel must have the <code>ProductDistribution</code> role.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>The Channel used to supply Line Items. By providing supply Channel information, you can uniquely identify <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory entries</a> that should be reserved. This Channel must have the <code>InventorySupply</code> role.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Inventory mode specific to the LineItem, valid for the entire <code>quantity</code> of the LineItem. Set only if Inventory mode should be different from the <code>inventoryMode</code> specified on the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderImportDraft" rel="nofollow">OrderImportDraft</a>.</p>
     * @return inventoryMode
     */

    @Nullable
    public com.commercetools.api.models.cart.InventoryMode getInventoryMode() {
        return this.inventoryMode;
    }

    /**
     *  <p>Container for Line Item-specific addresses.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>States of the Line Item.</p>
     * @return state
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields for the LineItem.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds LineItemImportDraft with checking for non-null required values
     * @return LineItemImportDraft
     */
    public LineItemImportDraft build() {
        Objects.requireNonNull(name, LineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(variant, LineItemImportDraft.class + ": variant is missing");
        Objects.requireNonNull(quantity, LineItemImportDraft.class + ": quantity is missing");
        Objects.requireNonNull(price, LineItemImportDraft.class + ": price is missing");
        return new LineItemImportDraftImpl(name, key, variant, productId, quantity, price, taxRate, distributionChannel,
            supplyChannel, inventoryMode, shippingDetails, state, custom);
    }

    /**
     * builds LineItemImportDraft without checking for non-null required values
     * @return LineItemImportDraft
     */
    public LineItemImportDraft buildUnchecked() {
        return new LineItemImportDraftImpl(name, key, variant, productId, quantity, price, taxRate, distributionChannel,
            supplyChannel, inventoryMode, shippingDetails, state, custom);
    }

    /**
     * factory method for an instance of LineItemImportDraftBuilder
     * @return builder
     */
    public static LineItemImportDraftBuilder of() {
        return new LineItemImportDraftBuilder();
    }

    /**
     * create builder for LineItemImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemImportDraftBuilder of(final LineItemImportDraft template) {
        LineItemImportDraftBuilder builder = new LineItemImportDraftBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.variant = template.getVariant();
        builder.productId = template.getProductId();
        builder.quantity = template.getQuantity();
        builder.price = template.getPrice();
        builder.taxRate = template.getTaxRate();
        builder.distributionChannel = template.getDistributionChannel();
        builder.supplyChannel = template.getSupplyChannel();
        builder.inventoryMode = template.getInventoryMode();
        builder.shippingDetails = template.getShippingDetails();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        return builder;
    }

}
