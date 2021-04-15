
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LineItemBuilder {

    private String id;

    private String productId;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString productSlug;

    private com.commercetools.api.models.product_type.ProductTypeReference productType;

    private com.commercetools.api.models.product.ProductVariant variant;

    private com.commercetools.api.models.common.Price price;

    @Nullable
    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    private com.commercetools.api.models.common.TypedMoney totalPrice;

    private Long quantity;

    @Nullable
    private java.time.ZonedDateTime addedAt;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.cart.LineItemPriceMode priceMode;

    private com.commercetools.api.models.cart.LineItemMode lineItemMode;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetails shippingDetails;

    @Nullable
    private java.time.ZonedDateTime lastModifiedAt;

    public LineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public LineItemBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    public LineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public LineItemBuilder productSlug(
            @Nullable final com.commercetools.api.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
        return this;
    }

    public LineItemBuilder productType(
            final com.commercetools.api.models.product_type.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    public LineItemBuilder variant(final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    public LineItemBuilder price(final com.commercetools.api.models.common.Price price) {
        this.price = price;
        return this;
    }

    public LineItemBuilder taxedPrice(@Nullable final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public LineItemBuilder totalPrice(final com.commercetools.api.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public LineItemBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public LineItemBuilder addedAt(@Nullable final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public LineItemBuilder state(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public LineItemBuilder state(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public LineItemBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public LineItemBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public LineItemBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public LineItemBuilder discountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    public LineItemBuilder discountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    public LineItemBuilder priceMode(final com.commercetools.api.models.cart.LineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }

    public LineItemBuilder lineItemMode(final com.commercetools.api.models.cart.LineItemMode lineItemMode) {
        this.lineItemMode = lineItemMode;
        return this;
    }

    public LineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public LineItemBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

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

    @Nullable
    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.api.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    public com.commercetools.api.models.cart.LineItemPriceMode getPriceMode() {
        return this.priceMode;
    }

    public com.commercetools.api.models.cart.LineItemMode getLineItemMode() {
        return this.lineItemMode;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetails getShippingDetails() {
        return this.shippingDetails;
    }

    @Nullable
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public LineItem build() {
        return new LineItemImpl(id, productId, name, productSlug, productType, variant, price, taxedPrice, totalPrice,
            quantity, addedAt, state, taxRate, supplyChannel, distributionChannel, discountedPricePerQuantity,
            priceMode, lineItemMode, custom, shippingDetails, lastModifiedAt);
    }

    public static LineItemBuilder of() {
        return new LineItemBuilder();
    }

    public static LineItemBuilder of(final LineItem template) {
        LineItemBuilder builder = new LineItemBuilder();
        builder.id = template.getId();
        builder.productId = template.getProductId();
        builder.name = template.getName();
        builder.productSlug = template.getProductSlug();
        builder.productType = template.getProductType();
        builder.variant = template.getVariant();
        builder.price = template.getPrice();
        builder.taxedPrice = template.getTaxedPrice();
        builder.totalPrice = template.getTotalPrice();
        builder.quantity = template.getQuantity();
        builder.addedAt = template.getAddedAt();
        builder.state = template.getState();
        builder.taxRate = template.getTaxRate();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.priceMode = template.getPriceMode();
        builder.lineItemMode = template.getLineItemMode();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
