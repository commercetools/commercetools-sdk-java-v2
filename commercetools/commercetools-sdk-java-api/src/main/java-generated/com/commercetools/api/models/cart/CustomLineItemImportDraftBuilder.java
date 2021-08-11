
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomLineItemImportDraftBuilder implements Builder<CustomLineItemImportDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    private Long quantity;

    private com.commercetools.api.models.common.Money money;

    private String slug;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;

    public CustomLineItemImportDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public CustomLineItemImportDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CustomLineItemImportDraftBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public CustomLineItemImportDraftBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public CustomLineItemImportDraftBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    public CustomLineItemImportDraftBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    public CustomLineItemImportDraftBuilder state(
            @Nullable final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public CustomLineItemImportDraftBuilder withState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public CustomLineItemImportDraftBuilder plusState(
            Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }

    public CustomLineItemImportDraftBuilder state(
            @Nullable final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public CustomLineItemImportDraftBuilder taxRate(
            Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }

    public CustomLineItemImportDraftBuilder taxRate(
            @Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    public CustomLineItemImportDraftBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public CustomLineItemImportDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public CustomLineItemImportDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public CustomLineItemImportDraftBuilder shippingDetails(
            Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of())
                .build();
        return this;
    }

    public CustomLineItemImportDraftBuilder shippingDetails(
            @Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public String getSlug() {
        return this.slug;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails() {
        return this.shippingDetails;
    }

    public CustomLineItemImportDraft build() {
        Objects.requireNonNull(name, CustomLineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(quantity, CustomLineItemImportDraft.class + ": quantity is missing");
        Objects.requireNonNull(money, CustomLineItemImportDraft.class + ": money is missing");
        Objects.requireNonNull(slug, CustomLineItemImportDraft.class + ": slug is missing");
        return new CustomLineItemImportDraftImpl(name, quantity, money, slug, state, taxRate, taxCategory, custom,
            shippingDetails);
    }

    /**
     * builds CustomLineItemImportDraft without checking for non null required values
     */
    public CustomLineItemImportDraft buildUnchecked() {
        return new CustomLineItemImportDraftImpl(name, quantity, money, slug, state, taxRate, taxCategory, custom,
            shippingDetails);
    }

    public static CustomLineItemImportDraftBuilder of() {
        return new CustomLineItemImportDraftBuilder();
    }

    public static CustomLineItemImportDraftBuilder of(final CustomLineItemImportDraft template) {
        CustomLineItemImportDraftBuilder builder = new CustomLineItemImportDraftBuilder();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        builder.money = template.getMoney();
        builder.slug = template.getSlug();
        builder.state = template.getState();
        builder.taxRate = template.getTaxRate();
        builder.taxCategory = template.getTaxCategory();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        return builder;
    }

}
