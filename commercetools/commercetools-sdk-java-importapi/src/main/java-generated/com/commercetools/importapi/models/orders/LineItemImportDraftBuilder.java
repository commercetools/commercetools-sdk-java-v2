
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

    private Double quantity;

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
     *  <p>Maps to <code>LineItem.productId</code>.</p>
     * @return Builder
     */

    public LineItemImportDraftBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.productId</code>.</p>
     * @param product
     * @return Builder
     */

    public LineItemImportDraftBuilder product(
            @Nullable final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @return Builder
     */

    public LineItemImportDraftBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.name</code>.</p>
     * @param name
     * @return Builder
     */

    public LineItemImportDraftBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Maps to <code>ProductVariantImportDraft</code>.</p>
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
     * @param variant
     * @return Builder
     */

    public LineItemImportDraftBuilder variant(
            final com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @return Builder
     */

    public LineItemImportDraftBuilder price(
            Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.price</code>.</p>
     * @param price
     * @return Builder
     */

    public LineItemImportDraftBuilder price(final com.commercetools.importapi.models.orders.LineItemPrice price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.quantity</code>.</p>
     * @param quantity
     * @return Builder
     */

    public LineItemImportDraftBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     * @param state
     * @return Builder
     */

    public LineItemImportDraftBuilder state(
            @Nullable final com.commercetools.importapi.models.orders.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    /**
     *
     * @param state
     * @return Builder
     */

    public LineItemImportDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.ItemState> state) {
        this.state = state;
        return this;
    }

    /**
     *
     * @param state
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
     *
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
     *
     * @return Builder
     */

    public LineItemImportDraftBuilder withState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. The Reference to the Supply Channel with which the LineItem is associated. If referenced Supply Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Supply Channel is created.</p>
     * @return Builder
     */

    public LineItemImportDraftBuilder supplyChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.supplyChannel</code>. The Reference to the Supply Channel with which the LineItem is associated. If referenced Supply Channel does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Supply Channel is created.</p>
     * @param supplyChannel
     * @return Builder
     */

    public LineItemImportDraftBuilder supplyChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.distributionChannel</code>. The Reference to the Distribution Channel with which the LineItem is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Distribution Channel is created.</p>
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
     *  <p>Maps to <code>LineItem.distributionChannel</code>. The Reference to the Distribution Channel with which the LineItem is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Distribution Channel is created.</p>
     * @param distributionChannel
     * @return Builder
     */

    public LineItemImportDraftBuilder distributionChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @return Builder
     */

    public LineItemImportDraftBuilder taxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Maps to <code>LineItem.taxRate</code>.</p>
     * @param taxRate
     * @return Builder
     */

    public LineItemImportDraftBuilder taxRate(
            @Nullable final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>Maps to LineItem.shippingDetails.</p>
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
     *  <p>Maps to LineItem.shippingDetails.</p>
     * @param shippingDetails
     * @return Builder
     */

    public LineItemImportDraftBuilder shippingDetails(
            @Nullable final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    /**
     *  <p>Custom Fields for this Line Item.</p>
     * @return Builder
     */

    public LineItemImportDraftBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for this Line Item.</p>
     * @param custom
     * @return Builder
     */

    public LineItemImportDraftBuilder custom(
            @Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft getVariant() {
        return this.variant;
    }

    public com.commercetools.importapi.models.orders.LineItemPrice getPrice() {
        return this.price;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ChannelKeyReference getDistributionChannel() {
        return this.distributionChannel;
    }

    @Nullable
    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public LineItemImportDraft build() {
        Objects.requireNonNull(name, LineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(variant, LineItemImportDraft.class + ": variant is missing");
        Objects.requireNonNull(price, LineItemImportDraft.class + ": price is missing");
        Objects.requireNonNull(quantity, LineItemImportDraft.class + ": quantity is missing");
        return new LineItemImportDraftImpl(product, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, shippingDetails, custom);
    }

    /**
     * builds LineItemImportDraft without checking for non null required values
     */
    public LineItemImportDraft buildUnchecked() {
        return new LineItemImportDraftImpl(product, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, shippingDetails, custom);
    }

    public static LineItemImportDraftBuilder of() {
        return new LineItemImportDraftBuilder();
    }

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
