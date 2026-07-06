
package com.commercetools.importapi.models.orders;

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
 *             .price(priceBuilder -> priceBuilder)
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemImportDraftBuilder implements Builder<LineItemImportDraft> {

    @Nullable
    private com.commercetools.importapi.models.common.ProductKeyReference product;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft variant;

    private com.commercetools.importapi.models.orders.LineItemPrice price;

    private Long quantity;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.ItemState> state;

    @Nullable
    private com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel;

    @Nullable
    private com.commercetools.importapi.models.common.ChannelKeyReference distributionChannel;

    @Nullable
    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    @Nullable
    private com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     *  <p>Maps to <code>LineItem.productId</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public LineItemImportDraftBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.productId</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public LineItemImportDraftBuilder withProduct(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReference> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.productId</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @param product value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder product(
            @Nullable final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public LineItemImportDraftBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public LineItemImportDraftBuilder withName(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @param name value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public LineItemImportDraftBuilder variant(
            Function<com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder, com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder> builder) {
        this.variant = builder
                .apply(com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
     * @param builder function to build the variant value
     * @return Builder
     */

    public LineItemImportDraftBuilder withVariant(
            Function<com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder, com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft> builder) {
        this.variant = builder
                .apply(com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
     * @param variant value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder variant(
            final com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public LineItemImportDraftBuilder price(
            Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public LineItemImportDraftBuilder withPrice(
            Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPrice> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @param price value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder price(final com.commercetools.importapi.models.orders.LineItemPrice price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.quantity</code>.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder state(
            @Nullable final com.commercetools.importapi.models.orders.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @param state value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder plusState(
            @Nullable final com.commercetools.importapi.models.orders.ItemState... state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder plusState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder withState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder addState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()));
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public LineItemImportDraftBuilder setState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemState> builder) {
        return state(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()));
    }

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder supplyChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder withSupplyChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReference> builder) {
        this.supplyChannel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder supplyChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder distributionChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public LineItemImportDraftBuilder withDistributionChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReference> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder distributionChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public LineItemImportDraftBuilder taxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public LineItemImportDraftBuilder withTaxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder taxRate(
            @Nullable final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.shippingDetails</code>.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public LineItemImportDraftBuilder shippingDetails(
            Function<com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder, com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder
                .apply(com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.shippingDetails</code>.</p>
     * @param builder function to build the shippingDetails value
     * @return Builder
     */

    public LineItemImportDraftBuilder withShippingDetails(
            Function<com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder, com.commercetools.importapi.models.orders.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder
                .apply(com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.shippingDetails</code>.</p>
     * @param shippingDetails value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder shippingDetails(
            @Nullable final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemImportDraftBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.custom</code>.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public LineItemImportDraftBuilder withCustom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.Custom> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.custom</code>.</p>
     * @param custom value to be set
     * @return Builder
     */

    public LineItemImportDraftBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.productId</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     * @return product
     */

    @Nullable
    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @return name
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
     * @return variant
     */

    public com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft getVariant() {
        return this.variant;
    }

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @return price
     */

    public com.commercetools.importapi.models.orders.LineItemPrice getPrice() {
        return this.price;
    }

    /**
     *  <p>Maps to <code>LineItem.quantity</code>.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Maps to <code>LineItem.state</code>.</p>
     * @return state
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.ItemState> getState() {
        return this.state;
    }

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    /**
     *  <p>Maps to <code>LineItem.shippingDetails</code>.</p>
     * @return shippingDetails
     */

    @Nullable
    public com.commercetools.importapi.models.orders.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    /**
     *  <p>Maps to <code>LineItem.custom</code>.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    /**
     * builds LineItemImportDraft with checking for non-null required values
     * @return LineItemImportDraft
     */
    public LineItemImportDraft build() {
        Objects.requireNonNull(name, LineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(variant, LineItemImportDraft.class + ": variant is missing");
        Objects.requireNonNull(price, LineItemImportDraft.class + ": price is missing");
        Objects.requireNonNull(quantity, LineItemImportDraft.class + ": quantity is missing");
        return new LineItemImportDraftImpl(product, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, shippingDetails, custom);
    }

    /**
     * builds LineItemImportDraft without checking for non-null required values
     * @return LineItemImportDraft
     */
    public LineItemImportDraft buildUnchecked() {
        return new LineItemImportDraftImpl(product, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, shippingDetails, custom);
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
        builder.product = template.getProduct();
        builder.name = template.getName();
        builder.variant = template.getVariant();
        builder.price = template.getPrice();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.taxRate = template.getTaxRate();
        builder.shippingDetails = template.getShippingDetails();
        builder.custom = template.getCustom();
        return builder;
    }

}
