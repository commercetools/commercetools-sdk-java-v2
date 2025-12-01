
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVariantSelectionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantSelectionChange setVariantSelectionChange = SetVariantSelectionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetVariantSelectionChangeBuilder implements Builder<SetVariantSelectionChange> {

    private String change;

    private com.commercetools.history.models.common.ProductVariantSelection previousValue;

    private com.commercetools.history.models.common.ProductVariantSelection nextValue;

    private com.commercetools.history.models.common.Reference product;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ProductVariantSelectionBuilder, com.commercetools.history.models.common.ProductVariantSelectionBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ProductVariantSelectionBuilder, com.commercetools.history.models.common.ProductVariantSelection> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductVariantSelectionBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductVariantSelection previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ProductVariantSelectionBuilder, com.commercetools.history.models.common.ProductVariantSelectionBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ProductVariantSelectionBuilder, com.commercetools.history.models.common.ProductVariantSelection> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductVariantSelectionBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductVariantSelection nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param product value to be set
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder product(final com.commercetools.history.models.common.Reference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public SetVariantSelectionChangeBuilder product(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.product = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.ProductVariantSelection getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ProductVariantSelection getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Reference to the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     * @return product
     */

    public com.commercetools.history.models.common.Reference getProduct() {
        return this.product;
    }

    /**
     * builds SetVariantSelectionChange with checking for non-null required values
     * @return SetVariantSelectionChange
     */
    public SetVariantSelectionChange build() {
        Objects.requireNonNull(change, SetVariantSelectionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetVariantSelectionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVariantSelectionChange.class + ": nextValue is missing");
        Objects.requireNonNull(product, SetVariantSelectionChange.class + ": product is missing");
        return new SetVariantSelectionChangeImpl(change, previousValue, nextValue, product);
    }

    /**
     * builds SetVariantSelectionChange without checking for non-null required values
     * @return SetVariantSelectionChange
     */
    public SetVariantSelectionChange buildUnchecked() {
        return new SetVariantSelectionChangeImpl(change, previousValue, nextValue, product);
    }

    /**
     * factory method for an instance of SetVariantSelectionChangeBuilder
     * @return builder
     */
    public static SetVariantSelectionChangeBuilder of() {
        return new SetVariantSelectionChangeBuilder();
    }

    /**
     * create builder for SetVariantSelectionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVariantSelectionChangeBuilder of(final SetVariantSelectionChange template) {
        SetVariantSelectionChangeBuilder builder = new SetVariantSelectionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.product = template.getProduct();
        return builder;
    }

}
