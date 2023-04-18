
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionAssignmentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionAssignment productSelectionAssignment = ProductSelectionAssignment.builder()
 *             .product(productBuilder -> productBuilder)
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAssignmentBuilder implements Builder<ProductSelectionAssignment> {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     *  <p>Reference to a Product that is assigned to the ProductSelection.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Product that is assigned to the ProductSelection.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder, com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @param productSelection value to be set
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Define which Variants of the added Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Define which Variants of the added Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @param variantExclusion value to be set
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantExclusion(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }

    /**
     *  <p>Reference to a Product that is assigned to the ProductSelection.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @return productSelection
     */

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Define which Variants of the added Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @return variantSelection
     */

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @return variantExclusion
     */

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     * builds ProductSelectionAssignment with checking for non-null required values
     * @return ProductSelectionAssignment
     */
    public ProductSelectionAssignment build() {
        Objects.requireNonNull(product, ProductSelectionAssignment.class + ": product is missing");
        Objects.requireNonNull(productSelection, ProductSelectionAssignment.class + ": productSelection is missing");
        return new ProductSelectionAssignmentImpl(product, productSelection, variantSelection, variantExclusion);
    }

    /**
     * builds ProductSelectionAssignment without checking for non-null required values
     * @return ProductSelectionAssignment
     */
    public ProductSelectionAssignment buildUnchecked() {
        return new ProductSelectionAssignmentImpl(product, productSelection, variantSelection, variantExclusion);
    }

    /**
     * factory method for an instance of ProductSelectionAssignmentBuilder
     * @return builder
     */
    public static ProductSelectionAssignmentBuilder of() {
        return new ProductSelectionAssignmentBuilder();
    }

    /**
     * create builder for ProductSelectionAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionAssignmentBuilder of(final ProductSelectionAssignment template) {
        ProductSelectionAssignmentBuilder builder = new ProductSelectionAssignmentBuilder();
        builder.product = template.getProduct();
        builder.productSelection = template.getProductSelection();
        builder.variantSelection = template.getVariantSelection();
        builder.variantExclusion = template.getVariantExclusion();
        return builder;
    }

}
