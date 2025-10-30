
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVariantExclusionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantExclusionChange setVariantExclusionChange = SetVariantExclusionChange.builder()
 *             .change("{change}")
 *             .product(productBuilder -> productBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetVariantExclusionChangeBuilder implements Builder<SetVariantExclusionChange> {

    private String change;

    private com.commercetools.history.models.common.Reference product;

    private com.commercetools.history.models.common.ProductVariantExclusion previousValue;

    private com.commercetools.history.models.common.ProductVariantExclusion nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param product value to be set
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder product(final com.commercetools.history.models.common.Reference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder product(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.product = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ProductVariantExclusionBuilder, com.commercetools.history.models.common.ProductVariantExclusionBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ProductVariantExclusionBuilder, com.commercetools.history.models.common.ProductVariantExclusion> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductVariantExclusionBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductVariantExclusion previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ProductVariantExclusionBuilder, com.commercetools.history.models.common.ProductVariantExclusionBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantExclusionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ProductVariantExclusionBuilder, com.commercetools.history.models.common.ProductVariantExclusion> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantExclusionBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetVariantExclusionChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductVariantExclusion nextValue) {
        this.nextValue = nextValue;
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
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return product
     */

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.ProductVariantExclusion getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ProductVariantExclusion getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetVariantExclusionChange with checking for non-null required values
     * @return SetVariantExclusionChange
     */
    public SetVariantExclusionChange build() {
        Objects.requireNonNull(change, SetVariantExclusionChange.class + ": change is missing");
        Objects.requireNonNull(product, SetVariantExclusionChange.class + ": product is missing");
        Objects.requireNonNull(previousValue, SetVariantExclusionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVariantExclusionChange.class + ": nextValue is missing");
        return new SetVariantExclusionChangeImpl(change, product, previousValue, nextValue);
    }

    /**
     * builds SetVariantExclusionChange without checking for non-null required values
     * @return SetVariantExclusionChange
     */
    public SetVariantExclusionChange buildUnchecked() {
        return new SetVariantExclusionChangeImpl(change, product, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetVariantExclusionChangeBuilder
     * @return builder
     */
    public static SetVariantExclusionChangeBuilder of() {
        return new SetVariantExclusionChangeBuilder();
    }

    /**
     * create builder for SetVariantExclusionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVariantExclusionChangeBuilder of(final SetVariantExclusionChange template) {
        SetVariantExclusionChangeBuilder builder = new SetVariantExclusionChangeBuilder();
        builder.change = template.getChange();
        builder.product = template.getProduct();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
