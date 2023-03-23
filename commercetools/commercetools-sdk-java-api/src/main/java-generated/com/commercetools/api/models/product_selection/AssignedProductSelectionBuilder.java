
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
     * @param productSelection
     * @return Builder
     */

    public AssignedProductSelectionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be included from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual.</p>
     * @param variantSelection
     * @return Builder
     */

    public AssignedProductSelectionBuilder variantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Defines which Variants of the Product will be included from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual.</p>
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
     *  <p>This field is only available for Assignments to a Product Selection of type Individual Exclusion.</p>
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
     *  <p>This field is only available for Assignments to a Product Selection of type Individual Exclusion.</p>
     * @param variantExclusion
     * @return Builder
     */

    public AssignedProductSelectionBuilder variantExclusion(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }

    /**
     *  <p>Date and time (UTC) this assignment was initially created.</p>
     * @param createdAt
     * @return Builder
     */

    public AssignedProductSelectionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public AssignedProductSelection build() {
        Objects.requireNonNull(productSelection, AssignedProductSelection.class + ": productSelection is missing");
        Objects.requireNonNull(createdAt, AssignedProductSelection.class + ": createdAt is missing");
        return new AssignedProductSelectionImpl(productSelection, variantSelection, variantExclusion, createdAt);
    }

    /**
     * builds AssignedProductSelection without checking for non null required values
     */
    public AssignedProductSelection buildUnchecked() {
        return new AssignedProductSelectionImpl(productSelection, variantSelection, variantExclusion, createdAt);
    }

    public static AssignedProductSelectionBuilder of() {
        return new AssignedProductSelectionBuilder();
    }

    public static AssignedProductSelectionBuilder of(final AssignedProductSelection template) {
        AssignedProductSelectionBuilder builder = new AssignedProductSelectionBuilder();
        builder.productSelection = template.getProductSelection();
        builder.variantSelection = template.getVariantSelection();
        builder.variantExclusion = template.getVariantExclusion();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
