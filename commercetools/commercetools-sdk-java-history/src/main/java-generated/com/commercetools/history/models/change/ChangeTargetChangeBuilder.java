
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetChange changeTargetChange = ChangeTargetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetChangeBuilder implements Builder<ChangeTargetChange> {

    private String change;

    private com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue;

    private com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeTargetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTargetChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeTargetChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeTargetChangeValue>> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTargetChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeTargetChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeTargetChangeValue>> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder.of())
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

    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeTargetChange with checking for non-null required values
     * @return ChangeTargetChange
     */
    public ChangeTargetChange build() {
        Objects.requireNonNull(change, ChangeTargetChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTargetChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTargetChange.class + ": nextValue is missing");
        return new ChangeTargetChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeTargetChange without checking for non-null required values
     * @return ChangeTargetChange
     */
    public ChangeTargetChange buildUnchecked() {
        return new ChangeTargetChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeTargetChangeBuilder
     * @return builder
     */
    public static ChangeTargetChangeBuilder of() {
        return new ChangeTargetChangeBuilder();
    }

    /**
     * create builder for ChangeTargetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetChangeBuilder of(final ChangeTargetChange template) {
        ChangeTargetChangeBuilder builder = new ChangeTargetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
