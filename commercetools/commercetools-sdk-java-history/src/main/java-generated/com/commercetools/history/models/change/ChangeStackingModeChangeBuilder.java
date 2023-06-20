
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStackingModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStackingModeChange changeStackingModeChange = ChangeStackingModeChange.builder()
 *             .change("{change}")
 *             .previousValue(StackingMode.STACKING)
 *             .nextValue(StackingMode.STACKING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeStackingModeChangeBuilder implements Builder<ChangeStackingModeChange> {

    private String change;

    private com.commercetools.history.models.common.StackingMode previousValue;

    private com.commercetools.history.models.common.StackingMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeStackingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeStackingModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.StackingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeStackingModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.StackingMode nextValue) {
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.StackingMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.StackingMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeStackingModeChange with checking for non-null required values
     * @return ChangeStackingModeChange
     */
    public ChangeStackingModeChange build() {
        Objects.requireNonNull(change, ChangeStackingModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeStackingModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeStackingModeChange.class + ": nextValue is missing");
        return new ChangeStackingModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeStackingModeChange without checking for non-null required values
     * @return ChangeStackingModeChange
     */
    public ChangeStackingModeChange buildUnchecked() {
        return new ChangeStackingModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeStackingModeChangeBuilder
     * @return builder
     */
    public static ChangeStackingModeChangeBuilder of() {
        return new ChangeStackingModeChangeBuilder();
    }

    /**
     * create builder for ChangeStackingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStackingModeChangeBuilder of(final ChangeStackingModeChange template) {
        ChangeStackingModeChangeBuilder builder = new ChangeStackingModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
