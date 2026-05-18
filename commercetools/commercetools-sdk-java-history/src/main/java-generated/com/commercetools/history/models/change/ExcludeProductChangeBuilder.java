
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExcludeProductChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExcludeProductChange excludeProductChange = ExcludeProductChange.builder()
 *             .change("{change}")
 *             .variantExclusion(variantExclusionBuilder -> variantExclusionBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExcludeProductChangeBuilder implements Builder<ExcludeProductChange> {

    private String change;

    private com.commercetools.history.models.common.ProductVariantExclusion variantExclusion;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ExcludeProductChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public ExcludeProductChangeBuilder variantExclusion(
            Function<com.commercetools.history.models.common.ProductVariantExclusionBuilder, com.commercetools.history.models.common.ProductVariantExclusionBuilder> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.history.models.common.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param builder function to build the variantExclusion value
     * @return Builder
     */

    public ExcludeProductChangeBuilder withVariantExclusion(
            Function<com.commercetools.history.models.common.ProductVariantExclusionBuilder, com.commercetools.history.models.common.ProductVariantExclusion> builder) {
        this.variantExclusion = builder
                .apply(com.commercetools.history.models.common.ProductVariantExclusionBuilder.of());
        return this;
    }

    /**
     *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @param variantExclusion value to be set
     * @return Builder
     */

    public ExcludeProductChangeBuilder variantExclusion(
            final com.commercetools.history.models.common.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ExcludeProductChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ExcludeProductChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     * @return variantExclusion
     */

    public com.commercetools.history.models.common.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ExcludeProductChange with checking for non-null required values
     * @return ExcludeProductChange
     */
    public ExcludeProductChange build() {
        Objects.requireNonNull(change, ExcludeProductChange.class + ": change is missing");
        Objects.requireNonNull(variantExclusion, ExcludeProductChange.class + ": variantExclusion is missing");
        Objects.requireNonNull(nextValue, ExcludeProductChange.class + ": nextValue is missing");
        return new ExcludeProductChangeImpl(change, variantExclusion, nextValue);
    }

    /**
     * builds ExcludeProductChange without checking for non-null required values
     * @return ExcludeProductChange
     */
    public ExcludeProductChange buildUnchecked() {
        return new ExcludeProductChangeImpl(change, variantExclusion, nextValue);
    }

    /**
     * factory method for an instance of ExcludeProductChangeBuilder
     * @return builder
     */
    public static ExcludeProductChangeBuilder of() {
        return new ExcludeProductChangeBuilder();
    }

    /**
     * create builder for ExcludeProductChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExcludeProductChangeBuilder of(final ExcludeProductChange template) {
        ExcludeProductChangeBuilder builder = new ExcludeProductChangeBuilder();
        builder.change = template.getChange();
        builder.variantExclusion = template.getVariantExclusion();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
