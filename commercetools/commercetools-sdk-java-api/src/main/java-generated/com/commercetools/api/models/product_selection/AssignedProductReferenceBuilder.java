
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssignedProductReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssignedProductReference assignedProductReference = AssignedProductReference.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssignedProductReferenceBuilder implements Builder<AssignedProductReference> {

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     */

    public AssignedProductReferenceBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     */

    public AssignedProductReferenceBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The Variants of the Product that are included, or excluded, from the Product Selection. In absence of this field, all Variants are deemed to be included.</p>
     */

    public AssignedProductReferenceBuilder variantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>The Variants of the Product that are included, or excluded, from the Product Selection. In absence of this field, all Variants are deemed to be included.</p>
     */

    public AssignedProductReferenceBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    public AssignedProductReference build() {
        Objects.requireNonNull(product, AssignedProductReference.class + ": product is missing");
        return new AssignedProductReferenceImpl(product, variantSelection);
    }

    /**
     * builds AssignedProductReference without checking for non null required values
     */
    public AssignedProductReference buildUnchecked() {
        return new AssignedProductReferenceImpl(product, variantSelection);
    }

    public static AssignedProductReferenceBuilder of() {
        return new AssignedProductReferenceBuilder();
    }

    public static AssignedProductReferenceBuilder of(final AssignedProductReference template) {
        AssignedProductReferenceBuilder builder = new AssignedProductReferenceBuilder();
        builder.product = template.getProduct();
        builder.variantSelection = template.getVariantSelection();
        return builder;
    }

}
