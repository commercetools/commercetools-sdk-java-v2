
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeDiscountTypeCombinationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeDiscountTypeCombinationChange changeDiscountTypeCombinationChange = ChangeDiscountTypeCombinationChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeDiscountTypeCombinationChangeBuilder implements Builder<ChangeDiscountTypeCombinationChange> {

    private String change;

    private com.commercetools.history.models.common.DiscountTypeCombination previousValue;

    private com.commercetools.history.models.common.DiscountTypeCombination nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeDiscountTypeCombinationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeDiscountTypeCombinationChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountTypeCombination previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeDiscountTypeCombinationChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountTypeCombinationBuilder, Builder<? extends com.commercetools.history.models.common.DiscountTypeCombination>> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountTypeCombinationBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeDiscountTypeCombinationChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountTypeCombination nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeDiscountTypeCombinationChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountTypeCombinationBuilder, Builder<? extends com.commercetools.history.models.common.DiscountTypeCombination>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountTypeCombinationBuilder.of())
                .build();
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

    public com.commercetools.history.models.common.DiscountTypeCombination getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountTypeCombination getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeDiscountTypeCombinationChange with checking for non-null required values
     * @return ChangeDiscountTypeCombinationChange
     */
    public ChangeDiscountTypeCombinationChange build() {
        Objects.requireNonNull(change, ChangeDiscountTypeCombinationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeDiscountTypeCombinationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeDiscountTypeCombinationChange.class + ": nextValue is missing");
        return new ChangeDiscountTypeCombinationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeDiscountTypeCombinationChange without checking for non-null required values
     * @return ChangeDiscountTypeCombinationChange
     */
    public ChangeDiscountTypeCombinationChange buildUnchecked() {
        return new ChangeDiscountTypeCombinationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeDiscountTypeCombinationChangeBuilder
     * @return builder
     */
    public static ChangeDiscountTypeCombinationChangeBuilder of() {
        return new ChangeDiscountTypeCombinationChangeBuilder();
    }

    /**
     * create builder for ChangeDiscountTypeCombinationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeDiscountTypeCombinationChangeBuilder of(final ChangeDiscountTypeCombinationChange template) {
        ChangeDiscountTypeCombinationChangeBuilder builder = new ChangeDiscountTypeCombinationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
