
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetVariantExclusionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetVariantExclusionAction productSelectionSetVariantExclusionAction = ProductSelectionSetVariantExclusionAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSetVariantExclusionActionBuilder
        implements Builder<ProductSelectionSetVariantExclusionAction> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionSetVariantExclusionActionBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductSelectionSetVariantExclusionActionBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Determines which Variants of the previously excluded Product are to be included in the Product Selection of type Individual Exclusion. Leave it empty to unset an existing Variant Exclusion.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public ProductSelectionSetVariantExclusionActionBuilder variantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Determines which Variants of the previously excluded Product are to be included in the Product Selection of type Individual Exclusion. Leave it empty to unset an existing Variant Exclusion.</p>
     * @param variantExclusion value to be set
     * @return Builder
     */

    public ProductSelectionSetVariantExclusionActionBuilder variantExclusion(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     * builds ProductSelectionSetVariantExclusionAction with checking for non-null required values
     * @return ProductSelectionSetVariantExclusionAction
     */
    public ProductSelectionSetVariantExclusionAction build() {
        Objects.requireNonNull(product, ProductSelectionSetVariantExclusionAction.class + ": product is missing");
        return new ProductSelectionSetVariantExclusionActionImpl(product, variantExclusion);
    }

    /**
     * builds ProductSelectionSetVariantExclusionAction without checking for non-null required values
     * @return ProductSelectionSetVariantExclusionAction
     */
    public ProductSelectionSetVariantExclusionAction buildUnchecked() {
        return new ProductSelectionSetVariantExclusionActionImpl(product, variantExclusion);
    }

    public static ProductSelectionSetVariantExclusionActionBuilder of() {
        return new ProductSelectionSetVariantExclusionActionBuilder();
    }

    public static ProductSelectionSetVariantExclusionActionBuilder of(
            final ProductSelectionSetVariantExclusionAction template) {
        ProductSelectionSetVariantExclusionActionBuilder builder = new ProductSelectionSetVariantExclusionActionBuilder();
        builder.product = template.getProduct();
        builder.variantExclusion = template.getVariantExclusion();
        return builder;
    }

}
