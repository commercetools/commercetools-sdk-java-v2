
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionAddProductActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionAddProductAction productSelectionAddProductAction = ProductSelectionAddProductAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAddProductActionBuilder implements Builder<ProductSelectionAddProductAction> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionAddProductActionBuilder product(
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

    public ProductSelectionAddProductActionBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be included from the Product Selection. If not supplied all Variants are deemed to be included.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public ProductSelectionAddProductActionBuilder variantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be included from the Product Selection. If not supplied all Variants are deemed to be included.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public ProductSelectionAddProductActionBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     * builds ProductSelectionAddProductAction with checking for non-null required values
     * @return ProductSelectionAddProductAction
     */
    public ProductSelectionAddProductAction build() {
        Objects.requireNonNull(product, ProductSelectionAddProductAction.class + ": product is missing");
        return new ProductSelectionAddProductActionImpl(product, variantSelection);
    }

    /**
     * builds ProductSelectionAddProductAction without checking for non-null required values
     * @return ProductSelectionAddProductAction
     */
    public ProductSelectionAddProductAction buildUnchecked() {
        return new ProductSelectionAddProductActionImpl(product, variantSelection);
    }

    public static ProductSelectionAddProductActionBuilder of() {
        return new ProductSelectionAddProductActionBuilder();
    }

    public static ProductSelectionAddProductActionBuilder of(final ProductSelectionAddProductAction template) {
        ProductSelectionAddProductActionBuilder builder = new ProductSelectionAddProductActionBuilder();
        builder.product = template.getProduct();
        builder.variantSelection = template.getVariantSelection();
        return builder;
    }

}
