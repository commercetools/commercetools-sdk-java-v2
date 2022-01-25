
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodChangeTaxCategoryActionBuilder implements Builder<ShippingMethodChangeTaxCategoryAction> {

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    public ShippingMethodChangeTaxCategoryActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public ShippingMethodChangeTaxCategoryActionBuilder taxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    public ShippingMethodChangeTaxCategoryAction build() {
        Objects.requireNonNull(taxCategory, ShippingMethodChangeTaxCategoryAction.class + ": taxCategory is missing");
        return new ShippingMethodChangeTaxCategoryActionImpl(taxCategory);
    }

    /**
     * builds ShippingMethodChangeTaxCategoryAction without checking for non null required values
     */
    public ShippingMethodChangeTaxCategoryAction buildUnchecked() {
        return new ShippingMethodChangeTaxCategoryActionImpl(taxCategory);
    }

    public static ShippingMethodChangeTaxCategoryActionBuilder of() {
        return new ShippingMethodChangeTaxCategoryActionBuilder();
    }

    public static ShippingMethodChangeTaxCategoryActionBuilder of(
            final ShippingMethodChangeTaxCategoryAction template) {
        ShippingMethodChangeTaxCategoryActionBuilder builder = new ShippingMethodChangeTaxCategoryActionBuilder();
        builder.taxCategory = template.getTaxCategory();
        return builder;
    }

}
