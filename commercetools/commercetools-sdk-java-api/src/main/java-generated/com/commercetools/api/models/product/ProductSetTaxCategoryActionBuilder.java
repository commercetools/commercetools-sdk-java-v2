
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetTaxCategoryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetTaxCategoryAction productSetTaxCategoryAction = ProductSetTaxCategoryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetTaxCategoryActionBuilder implements Builder<ProductSetTaxCategoryAction> {

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    /**
     *  <p>The Tax Category to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ProductSetTaxCategoryActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Tax Category to set. If empty, any existing value will be removed.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ProductSetTaxCategoryActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>The Tax Category to set. If empty, any existing value will be removed.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     * builds ProductSetTaxCategoryAction with checking for non-null required values
     * @return ProductSetTaxCategoryAction
     */
    public ProductSetTaxCategoryAction build() {
        return new ProductSetTaxCategoryActionImpl(taxCategory);
    }

    /**
     * builds ProductSetTaxCategoryAction without checking for non-null required values
     * @return ProductSetTaxCategoryAction
     */
    public ProductSetTaxCategoryAction buildUnchecked() {
        return new ProductSetTaxCategoryActionImpl(taxCategory);
    }

    /**
     * factory method for an instance of ProductSetTaxCategoryActionBuilder
     * @return builder
     */
    public static ProductSetTaxCategoryActionBuilder of() {
        return new ProductSetTaxCategoryActionBuilder();
    }

    /**
     * create builder for ProductSetTaxCategoryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetTaxCategoryActionBuilder of(final ProductSetTaxCategoryAction template) {
        ProductSetTaxCategoryActionBuilder builder = new ProductSetTaxCategoryActionBuilder();
        builder.taxCategory = template.getTaxCategory();
        return builder;
    }

}
