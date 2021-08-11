
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemImportDraftBuilder implements Builder<LineItemImportDraft> {

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

    public LineItemImportDraftBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    public LineItemImportDraftBuilder product(
            @Nullable final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    public LineItemImportDraftBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public LineItemImportDraftBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public LineItemImportDraftBuilder variant(
            Function<com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder, com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder> builder) {
        this.variant = builder
                .apply(com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftBuilder.of())
                .build();
        return this;
    }

    public LineItemImportDraftBuilder variant(
            final com.commercetools.importapi.models.orders.LineItemProductVariantImportDraft variant) {
        this.variant = variant;
        return this;
    }

    public LineItemImportDraftBuilder price(
            Function<com.commercetools.importapi.models.orders.LineItemPriceBuilder, com.commercetools.importapi.models.orders.LineItemPriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.orders.LineItemPriceBuilder.of()).build();
        return this;
    }

    public LineItemImportDraftBuilder price(final com.commercetools.importapi.models.orders.LineItemPrice price) {
        this.price = price;
        return this;
    }

    public LineItemImportDraftBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public LineItemImportDraftBuilder state(
            @Nullable final com.commercetools.importapi.models.orders.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public LineItemImportDraftBuilder withState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    public LineItemImportDraftBuilder plusState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    public LineItemImportDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.ItemState> state) {
        this.state = state;
        return this;
    }

    public LineItemImportDraftBuilder supplyChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public LineItemImportDraftBuilder supplyChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public LineItemImportDraftBuilder distributionChannel(
            Function<com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder, com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.importapi.models.common.ChannelKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public LineItemImportDraftBuilder distributionChannel(
            @Nullable final com.commercetools.importapi.models.common.ChannelKeyReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public LineItemImportDraftBuilder taxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of()).build();
        return this;
    }

    public LineItemImportDraftBuilder taxRate(
            @Nullable final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public LineItemImportDraftBuilder shippingDetails(
            Function<com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder, com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder
                .apply(com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public LineItemImportDraftBuilder shippingDetails(
            @Nullable final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
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

    public LineItemImportDraft build() {
        Objects.requireNonNull(name, LineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(variant, LineItemImportDraft.class + ": variant is missing");
        Objects.requireNonNull(price, LineItemImportDraft.class + ": price is missing");
        Objects.requireNonNull(quantity, LineItemImportDraft.class + ": quantity is missing");
        return new LineItemImportDraftImpl(product, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, shippingDetails);
    }

    /**
     * builds LineItemImportDraft without checking for non null required values
     */
    public LineItemImportDraft buildUnchecked() {
        return new LineItemImportDraftImpl(product, name, variant, price, quantity, state, supplyChannel,
            distributionChannel, taxRate, shippingDetails);
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
        return builder;
    }

}
