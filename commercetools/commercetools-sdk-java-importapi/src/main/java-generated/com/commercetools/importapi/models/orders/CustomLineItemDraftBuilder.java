
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemDraftBuilder implements Builder<CustomLineItemDraft> {

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.TypedMoney money;

    @Nullable
    private com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice;

    private com.commercetools.importapi.models.common.TypedMoney totalPrice;

    private String slug;

    private Double quantity;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.ItemState> state;

    @Nullable
    private com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory;

    @Nullable
    private com.commercetools.importapi.models.prices.TaxRate taxRate;

    @Nullable
    private com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity;

    @Nullable
    private com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails;

    public CustomLineItemDraftBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CustomLineItemDraftBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CustomLineItemDraftBuilder money(final com.commercetools.importapi.models.common.TypedMoney money) {
        this.money = money;
        return this;
    }

    public CustomLineItemDraftBuilder taxedPrice(
            Function<com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder, com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.importapi.models.orders.CustomLineItemTaxedPriceBuilder.of())
                .build();
        return this;
    }

    public CustomLineItemDraftBuilder taxedPrice(
            @Nullable final com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    public CustomLineItemDraftBuilder totalPrice(
            final com.commercetools.importapi.models.common.TypedMoney totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public CustomLineItemDraftBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    public CustomLineItemDraftBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public CustomLineItemDraftBuilder state(
            @Nullable final com.commercetools.importapi.models.orders.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public CustomLineItemDraftBuilder withState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    public CustomLineItemDraftBuilder plusState(
            Function<com.commercetools.importapi.models.orders.ItemStateBuilder, com.commercetools.importapi.models.orders.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.importapi.models.orders.ItemStateBuilder.of()).build());
        return this;
    }

    public CustomLineItemDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.ItemState> state) {
        this.state = state;
        return this;
    }

    public CustomLineItemDraftBuilder taxCategory(
            Function<com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder, com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.importapi.models.common.TaxCategoryKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public CustomLineItemDraftBuilder taxCategory(
            @Nullable final com.commercetools.importapi.models.common.TaxCategoryKeyReference taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public CustomLineItemDraftBuilder taxRate(
            Function<com.commercetools.importapi.models.prices.TaxRateBuilder, com.commercetools.importapi.models.prices.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.importapi.models.prices.TaxRateBuilder.of()).build();
        return this;
    }

    public CustomLineItemDraftBuilder taxRate(
            @Nullable final com.commercetools.importapi.models.prices.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public CustomLineItemDraftBuilder externalTaxRate(
            Function<com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder, com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.importapi.models.orders.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public CustomLineItemDraftBuilder externalTaxRate(
            @Nullable final com.commercetools.importapi.models.orders.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public CustomLineItemDraftBuilder discountedPricePerQuantity(
            @Nullable final com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
        return this;
    }

    public CustomLineItemDraftBuilder withDiscountedPricePerQuantity(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder> builder) {
        this.discountedPricePerQuantity = new ArrayList<>();
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of()).build());
        return this;
    }

    public CustomLineItemDraftBuilder plusDiscountedPricePerQuantity(
            Function<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder, com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder> builder) {
        if (this.discountedPricePerQuantity == null) {
            this.discountedPricePerQuantity = new ArrayList<>();
        }
        this.discountedPricePerQuantity.add(
            builder.apply(com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftBuilder.of()).build());
        return this;
    }

    public CustomLineItemDraftBuilder discountedPricePerQuantity(
            @Nullable final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        return this;
    }

    public CustomLineItemDraftBuilder shippingDetails(
            Function<com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder, com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder
                .apply(com.commercetools.importapi.models.orders.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public CustomLineItemDraftBuilder shippingDetails(
            @Nullable final com.commercetools.importapi.models.orders.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.TypedMoney getMoney() {
        return this.money;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.CustomLineItemTaxedPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public com.commercetools.importapi.models.common.TypedMoney getTotalPrice() {
        return this.totalPrice;
    }

    public String getSlug() {
        return this.slug;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.importapi.models.common.TaxCategoryKeyReference getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.importapi.models.prices.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraft> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    @Nullable
    public com.commercetools.importapi.models.orders.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public CustomLineItemDraft build() {
        Objects.requireNonNull(name, CustomLineItemDraft.class + ": name is missing");
        Objects.requireNonNull(money, CustomLineItemDraft.class + ": money is missing");
        Objects.requireNonNull(totalPrice, CustomLineItemDraft.class + ": totalPrice is missing");
        Objects.requireNonNull(slug, CustomLineItemDraft.class + ": slug is missing");
        Objects.requireNonNull(quantity, CustomLineItemDraft.class + ": quantity is missing");
        return new CustomLineItemDraftImpl(name, money, taxedPrice, totalPrice, slug, quantity, state, taxCategory,
            taxRate, externalTaxRate, discountedPricePerQuantity, shippingDetails);
    }

    /**
     * builds CustomLineItemDraft without checking for non null required values
     */
    public CustomLineItemDraft buildUnchecked() {
        return new CustomLineItemDraftImpl(name, money, taxedPrice, totalPrice, slug, quantity, state, taxCategory,
            taxRate, externalTaxRate, discountedPricePerQuantity, shippingDetails);
    }

    public static CustomLineItemDraftBuilder of() {
        return new CustomLineItemDraftBuilder();
    }

    public static CustomLineItemDraftBuilder of(final CustomLineItemDraft template) {
        CustomLineItemDraftBuilder builder = new CustomLineItemDraftBuilder();
        builder.name = template.getName();
        builder.money = template.getMoney();
        builder.taxedPrice = template.getTaxedPrice();
        builder.totalPrice = template.getTotalPrice();
        builder.slug = template.getSlug();
        builder.quantity = template.getQuantity();
        builder.state = template.getState();
        builder.taxCategory = template.getTaxCategory();
        builder.taxRate = template.getTaxRate();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.discountedPricePerQuantity = template.getDiscountedPricePerQuantity();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
