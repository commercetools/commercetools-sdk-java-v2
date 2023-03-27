
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionSetVariantSelectionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetVariantSelectionAction productSelectionSetVariantSelectionAction = ProductSelectionSetVariantSelectionAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSetVariantSelectionActionBuilder
        implements Builder<ProductSelectionSetVariantSelectionAction> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionSetVariantSelectionActionBuilder product(
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

    public ProductSelectionSetVariantSelectionActionBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Determines which Variants of the previously added Product are to be included in, or excluded from, the Product Selection. Leave it empty to unset an existing Variant Selection.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public ProductSelectionSetVariantSelectionActionBuilder variantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Determines which Variants of the previously added Product are to be included in, or excluded from, the Product Selection. Leave it empty to unset an existing Variant Selection.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public ProductSelectionSetVariantSelectionActionBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>Determines which Variants of the previously added Product are to be included in, or excluded from, the Product Selection. Leave it empty to unset an existing Variant Selection.</p>
     * @return variantSelection
     */

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     * builds ProductSelectionSetVariantSelectionAction with checking for non-null required values
     * @return ProductSelectionSetVariantSelectionAction
     */
    public ProductSelectionSetVariantSelectionAction build() {
        Objects.requireNonNull(product, ProductSelectionSetVariantSelectionAction.class + ": product is missing");
        return new ProductSelectionSetVariantSelectionActionImpl(product, variantSelection);
    }

    /**
     * builds ProductSelectionSetVariantSelectionAction without checking for non-null required values
     * @return ProductSelectionSetVariantSelectionAction
     */
    public ProductSelectionSetVariantSelectionAction buildUnchecked() {
        return new ProductSelectionSetVariantSelectionActionImpl(product, variantSelection);
    }

    /**
     * factory method for an instance of ProductSelectionSetVariantSelectionActionBuilder
     * @return builder
     */
    public static ProductSelectionSetVariantSelectionActionBuilder of() {
        return new ProductSelectionSetVariantSelectionActionBuilder();
    }

    /**
     * create builder for ProductSelectionSetVariantSelectionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetVariantSelectionActionBuilder of(
            final ProductSelectionSetVariantSelectionAction template) {
        ProductSelectionSetVariantSelectionActionBuilder builder = new ProductSelectionSetVariantSelectionActionBuilder();
        builder.product = template.getProduct();
        builder.variantSelection = template.getVariantSelection();
        return builder;
    }

}
