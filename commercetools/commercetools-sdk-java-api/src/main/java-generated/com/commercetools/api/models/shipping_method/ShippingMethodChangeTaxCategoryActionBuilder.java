
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeTaxCategoryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeTaxCategoryAction shippingMethodChangeTaxCategoryAction = ShippingMethodChangeTaxCategoryAction.builder()
 *             .taxCategory(taxCategoryBuilder -> taxCategoryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeTaxCategoryActionBuilder implements Builder<ShippingMethodChangeTaxCategoryAction> {

    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryActionBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryActionBuilder taxCategory(
            final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return taxCategory
     */

    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     * builds ShippingMethodChangeTaxCategoryAction with checking for non-null required values
     * @return ShippingMethodChangeTaxCategoryAction
     */
    public ShippingMethodChangeTaxCategoryAction build() {
        Objects.requireNonNull(taxCategory, ShippingMethodChangeTaxCategoryAction.class + ": taxCategory is missing");
        return new ShippingMethodChangeTaxCategoryActionImpl(taxCategory);
    }

    /**
     * builds ShippingMethodChangeTaxCategoryAction without checking for non-null required values
     * @return ShippingMethodChangeTaxCategoryAction
     */
    public ShippingMethodChangeTaxCategoryAction buildUnchecked() {
        return new ShippingMethodChangeTaxCategoryActionImpl(taxCategory);
    }

    /**
     * factory method for an instance of ShippingMethodChangeTaxCategoryActionBuilder
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryActionBuilder of() {
        return new ShippingMethodChangeTaxCategoryActionBuilder();
    }

    /**
     * create builder for ShippingMethodChangeTaxCategoryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryActionBuilder of(
            final ShippingMethodChangeTaxCategoryAction template) {
        ShippingMethodChangeTaxCategoryActionBuilder builder = new ShippingMethodChangeTaxCategoryActionBuilder();
        builder.taxCategory = template.getTaxCategory();
        return builder;
    }

}
