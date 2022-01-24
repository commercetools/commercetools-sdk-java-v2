
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSetTaxCategoryActionBuilder implements Builder<ProductSetTaxCategoryAction> {

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    public ProductSetTaxCategoryActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public ProductSetTaxCategoryActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    public ProductSetTaxCategoryAction build() {
        return new ProductSetTaxCategoryActionImpl(taxCategory);
    }

    /**
     * builds ProductSetTaxCategoryAction without checking for non null required values
     */
    public ProductSetTaxCategoryAction buildUnchecked() {
        return new ProductSetTaxCategoryActionImpl(taxCategory);
    }

    public static ProductSetTaxCategoryActionBuilder of() {
        return new ProductSetTaxCategoryActionBuilder();
    }

    public static ProductSetTaxCategoryActionBuilder of(final ProductSetTaxCategoryAction template) {
        ProductSetTaxCategoryActionBuilder builder = new ProductSetTaxCategoryActionBuilder();
        builder.taxCategory = template.getTaxCategory();
        return builder;
    }

}
