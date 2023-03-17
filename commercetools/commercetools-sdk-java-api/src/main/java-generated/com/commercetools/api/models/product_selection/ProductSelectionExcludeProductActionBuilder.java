
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionExcludeProductActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionExcludeProductAction productSelectionExcludeProductAction = ProductSelectionExcludeProductAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionExcludeProductActionBuilder implements Builder<ProductSelectionExcludeProductAction> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     *  <p>ResourceIdentifier of the Product</p>
     */

    public ProductSelectionExcludeProductActionBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product</p>
     */

    public ProductSelectionExcludeProductActionBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection. If not supplied all Variants are deemed to be excluded.</p>
     */

    public ProductSelectionExcludeProductActionBuilder variantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection. If not supplied all Variants are deemed to be excluded.</p>
     */

    public ProductSelectionExcludeProductActionBuilder variantExclusion(
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

    public ProductSelectionExcludeProductAction build() {
        Objects.requireNonNull(product, ProductSelectionExcludeProductAction.class + ": product is missing");
        return new ProductSelectionExcludeProductActionImpl(product, variantExclusion);
    }

    /**
     * builds ProductSelectionExcludeProductAction without checking for non null required values
     */
    public ProductSelectionExcludeProductAction buildUnchecked() {
        return new ProductSelectionExcludeProductActionImpl(product, variantExclusion);
    }

    public static ProductSelectionExcludeProductActionBuilder of() {
        return new ProductSelectionExcludeProductActionBuilder();
    }

    public static ProductSelectionExcludeProductActionBuilder of(final ProductSelectionExcludeProductAction template) {
        ProductSelectionExcludeProductActionBuilder builder = new ProductSelectionExcludeProductActionBuilder();
        builder.product = template.getProduct();
        builder.variantExclusion = template.getVariantExclusion();
        return builder;
    }

}
