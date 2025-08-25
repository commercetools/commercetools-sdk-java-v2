
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssignedProductSelectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssignedProductSelection assignedProductSelection = AssignedProductSelection.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssignedProductSelectionBuilder implements Builder<AssignedProductSelection> {

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    private java.time.ZonedDateTime createdAt;

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public AssignedProductSelectionBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder, com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public AssignedProductSelectionBuilder withProductSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder, com.commercetools.api.models.product_selection.ProductSelectionReference> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @param productSelection value to be set
     * @return Builder
     */

    public AssignedProductSelectionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public AssignedProductSelectionBuilder variantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public AssignedProductSelectionBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public AssignedProductSelectionBuilder variantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public AssignedProductSelectionBuilder withVariantExclusion(
            Function<com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder, com.commercetools.api.models.product_selection.ProductVariantExclusion> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantExclusionBuilder.of());
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param variantExclusion value to be set
     * @return Builder
     */

    public AssignedProductSelectionBuilder variantExclusion(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }

    /**
     *  <p>Date and time (UTC) this assignment was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public AssignedProductSelectionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @return productSelection
     */

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @return variantSelection
     */

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @return variantExclusion
     */

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     *  <p>Date and time (UTC) this assignment was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * builds AssignedProductSelection with checking for non-null required values
     * @return AssignedProductSelection
     */
    public AssignedProductSelection build() {
        Objects.requireNonNull(productSelection, AssignedProductSelection.class + ": productSelection is missing");
        Objects.requireNonNull(createdAt, AssignedProductSelection.class + ": createdAt is missing");
        return new AssignedProductSelectionImpl(productSelection, variantSelection, variantExclusion, createdAt);
    }

    /**
     * builds AssignedProductSelection without checking for non-null required values
     * @return AssignedProductSelection
     */
    public AssignedProductSelection buildUnchecked() {
        return new AssignedProductSelectionImpl(productSelection, variantSelection, variantExclusion, createdAt);
    }

    /**
     * factory method for an instance of AssignedProductSelectionBuilder
     * @return builder
     */
    public static AssignedProductSelectionBuilder of() {
        return new AssignedProductSelectionBuilder();
    }

    /**
     * create builder for AssignedProductSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssignedProductSelectionBuilder of(final AssignedProductSelection template) {
        AssignedProductSelectionBuilder builder = new AssignedProductSelectionBuilder();
        builder.productSelection = template.getProductSelection();
        builder.variantSelection = template.getVariantSelection();
        builder.variantExclusion = template.getVariantExclusion();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
