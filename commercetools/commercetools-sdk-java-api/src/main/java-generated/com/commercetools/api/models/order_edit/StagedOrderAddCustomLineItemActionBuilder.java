
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddCustomLineItemActionBuilder implements Builder<StagedOrderAddCustomLineItemAction> {

    private com.commercetools.api.models.common.Money money;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private Double quantity;

    private String slug;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderAddCustomLineItemActionBuilder money(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder quantity(@Nullable final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderAddCustomLineItemActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public com.commercetools.api.models.common.Money getMoney() {
        return this.money;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public Double getQuantity() {
        return this.quantity;
    }

    public String getSlug() {
        return this.slug;
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
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public StagedOrderAddCustomLineItemAction build() {
        Objects.requireNonNull(money, StagedOrderAddCustomLineItemAction.class + ": money is missing");
        Objects.requireNonNull(name, StagedOrderAddCustomLineItemAction.class + ": name is missing");
        Objects.requireNonNull(slug, StagedOrderAddCustomLineItemAction.class + ": slug is missing");
        return new StagedOrderAddCustomLineItemActionImpl(money, name, quantity, slug, taxCategory, custom,
            externalTaxRate);
    }

    /**
     * builds StagedOrderAddCustomLineItemAction without checking for non null required values
     */
    public StagedOrderAddCustomLineItemAction buildUnchecked() {
        return new StagedOrderAddCustomLineItemActionImpl(money, name, quantity, slug, taxCategory, custom,
            externalTaxRate);
    }

    public static StagedOrderAddCustomLineItemActionBuilder of() {
        return new StagedOrderAddCustomLineItemActionBuilder();
    }

    public static StagedOrderAddCustomLineItemActionBuilder of(final StagedOrderAddCustomLineItemAction template) {
        StagedOrderAddCustomLineItemActionBuilder builder = new StagedOrderAddCustomLineItemActionBuilder();
        builder.money = template.getMoney();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        builder.slug = template.getSlug();
        builder.taxCategory = template.getTaxCategory();
        builder.custom = template.getCustom();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
