
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeTaxCategoryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeTaxCategoryChange shippingMethodChangeTaxCategoryChange = ShippingMethodChangeTaxCategoryChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeTaxCategoryChangeBuilder implements Builder<ShippingMethodChangeTaxCategoryChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ShippingMethodChangeTaxCategoryChangeBuilder nextValue(
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ShippingMethodChangeTaxCategoryChange with checking for non-null required values
     * @return ShippingMethodChangeTaxCategoryChange
     */
    public ShippingMethodChangeTaxCategoryChange build() {
        Objects.requireNonNull(change, ShippingMethodChangeTaxCategoryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            ShippingMethodChangeTaxCategoryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ShippingMethodChangeTaxCategoryChange.class + ": nextValue is missing");
        return new ShippingMethodChangeTaxCategoryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ShippingMethodChangeTaxCategoryChange without checking for non-null required values
     * @return ShippingMethodChangeTaxCategoryChange
     */
    public ShippingMethodChangeTaxCategoryChange buildUnchecked() {
        return new ShippingMethodChangeTaxCategoryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodChangeTaxCategoryChangeBuilder
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryChangeBuilder of() {
        return new ShippingMethodChangeTaxCategoryChangeBuilder();
    }

    /**
     * create builder for ShippingMethodChangeTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryChangeBuilder of(
            final ShippingMethodChangeTaxCategoryChange template) {
        ShippingMethodChangeTaxCategoryChangeBuilder builder = new ShippingMethodChangeTaxCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
