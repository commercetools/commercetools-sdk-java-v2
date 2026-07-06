
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

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public AssignedProductReferenceBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public AssignedProductReferenceBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     * @param product value to be set
     * @return Builder
     */

    public AssignedProductReferenceBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>Individual</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>. In absence of this field, all Variants are deemed to be included.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public AssignedProductReferenceBuilder variantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>Individual</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>. In absence of this field, all Variants are deemed to be included.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public AssignedProductReferenceBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>. In absence of this field, all Variants are deemed to be excluded.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public AssignedProductReferenceBuilder variantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>. In absence of this field, all Variants are deemed to be excluded.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public AssignedProductReferenceBuilder withVariantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusion> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of());
        return this;
    }

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>. In absence of this field, all Variants are deemed to be excluded.</p>
     * @param variantExclusion value to be set
     * @return Builder
     */

    public AssignedProductReferenceBuilder variantExclusion(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>Individual</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>. In absence of this field, all Variants are deemed to be included.</p>
     * @return variantSelection
     */

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>. In absence of this field, all Variants are deemed to be excluded.</p>
     * @return variantExclusion
     */

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     * builds AssignedProductReference with checking for non-null required values
     * @return AssignedProductReference
     */
    public AssignedProductReference build() {
        Objects.requireNonNull(product, AssignedProductReference.class + ": product is missing");
        return new AssignedProductReferenceImpl(product, variantSelection, variantExclusion);
    }

    /**
     * builds AssignedProductReference without checking for non-null required values
     * @return AssignedProductReference
     */
    public AssignedProductReference buildUnchecked() {
        return new AssignedProductReferenceImpl(product, variantSelection, variantExclusion);
    }

    /**
     * factory method for an instance of AssignedProductReferenceBuilder
     * @return builder
     */
    public static AssignedProductReferenceBuilder of() {
        return new AssignedProductReferenceBuilder();
    }

    /**
     * create builder for AssignedProductReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssignedProductReferenceBuilder of(final AssignedProductReference template) {
        AssignedProductReferenceBuilder builder = new AssignedProductReferenceBuilder();
        builder.product = template.getProduct();
        builder.variantSelection = template.getVariantSelection();
        builder.variantExclusion = template.getVariantExclusion();
        return builder;
    }

}
