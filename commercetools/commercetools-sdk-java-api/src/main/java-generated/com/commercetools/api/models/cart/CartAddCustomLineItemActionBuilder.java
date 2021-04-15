
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartAddCustomLineItemActionBuilder {

    private com.commercetools.api.models.common.Money money;

    private com.commercetools.api.models.common.LocalizedString name;

    private Long quantity;

    private String slug;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public CartAddCustomLineItemActionBuilder money(final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }

    public CartAddCustomLineItemActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public CartAddCustomLineItemActionBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    public CartAddCustomLineItemActionBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    public CartAddCustomLineItemActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public CartAddCustomLineItemActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public CartAddCustomLineItemActionBuilder externalTaxRate(
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

    public Long getQuantity() {
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

    public CartAddCustomLineItemAction build() {
        return new CartAddCustomLineItemActionImpl(money, name, quantity, slug, taxCategory, custom, externalTaxRate);
    }

    public static CartAddCustomLineItemActionBuilder of() {
        return new CartAddCustomLineItemActionBuilder();
    }

    public static CartAddCustomLineItemActionBuilder of(final CartAddCustomLineItemAction template) {
        CartAddCustomLineItemActionBuilder builder = new CartAddCustomLineItemActionBuilder();
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
