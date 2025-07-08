
package com.commercetools.importapi.models.product_selections;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAssignmentBuilder implements Builder<ProductSelectionAssignment> {

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    @Nullable
    private com.commercetools.importapi.models.product_selections.VariantSelection variantSelection;

    @Nullable
    private com.commercetools.importapi.models.product_selections.VariantExclusion variantExclusion;

    /**
     *  <p>Reference to the Product by key.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder product(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Product by key.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder withProduct(
            Function<com.commercetools.importapi.models.common.ProductKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductKeyReference> builder) {
        this.product = builder.apply(com.commercetools.importapi.models.common.ProductKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product by key.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder product(
            final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Variant selection specifying included SKUs.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantSelection(
            Function<com.commercetools.importapi.models.product_selections.VariantSelectionBuilder, com.commercetools.importapi.models.product_selections.VariantSelectionBuilder> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.importapi.models.product_selections.VariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Variant selection specifying included SKUs.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder withVariantSelection(
            Function<com.commercetools.importapi.models.product_selections.VariantSelectionBuilder, com.commercetools.importapi.models.product_selections.VariantSelection> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.importapi.models.product_selections.VariantSelectionBuilder.of());
        return this;
    }

    /**
     *  <p>Variant selection specifying included SKUs.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantSelection(
            @Nullable final com.commercetools.importapi.models.product_selections.VariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Variant exclusion specifying excluded SKUs.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantExclusion(
            Function<com.commercetools.importapi.models.product_selections.VariantExclusionBuilder, com.commercetools.importapi.models.product_selections.VariantExclusionBuilder> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.importapi.models.product_selections.VariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Variant exclusion specifying excluded SKUs.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder withVariantExclusion(
            Function<com.commercetools.importapi.models.product_selections.VariantExclusionBuilder, com.commercetools.importapi.models.product_selections.VariantExclusion> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.importapi.models.product_selections.VariantExclusionBuilder.of());
        return this;
    }

    /**
     *  <p>Variant exclusion specifying excluded SKUs.</p>
     * @param variantExclusion value to be set
     * @return Builder
     */

    public ProductSelectionAssignmentBuilder variantExclusion(
            @Nullable final com.commercetools.importapi.models.product_selections.VariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }

    /**
     *  <p>Reference to the Product by key.</p>
     * @return product
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Variant selection specifying included SKUs.</p>
     * @return variantSelection
     */

    @Nullable
    public com.commercetools.importapi.models.product_selections.VariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>Variant exclusion specifying excluded SKUs.</p>
     * @return variantExclusion
     */

    @Nullable
    public com.commercetools.importapi.models.product_selections.VariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     * builds ProductSelectionAssignment with checking for non-null required values
     * @return ProductSelectionAssignment
     */
    public ProductSelectionAssignment build() {
        Objects.requireNonNull(product, ProductSelectionAssignment.class + ": product is missing");
        return new ProductSelectionAssignmentImpl(product, variantSelection, variantExclusion);
    }

    /**
     * builds ProductSelectionAssignment without checking for non-null required values
     * @return ProductSelectionAssignment
     */
    public ProductSelectionAssignment buildUnchecked() {
        return new ProductSelectionAssignmentImpl(product, variantSelection, variantExclusion);
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
        builder.variantSelection = template.getVariantSelection();
        builder.variantExclusion = template.getVariantExclusion();
        return builder;
    }

}
