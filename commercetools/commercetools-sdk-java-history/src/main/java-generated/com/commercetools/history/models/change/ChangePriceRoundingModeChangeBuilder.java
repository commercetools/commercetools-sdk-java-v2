
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePriceRoundingModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePriceRoundingModeChange changePriceRoundingModeChange = ChangePriceRoundingModeChange.builder()
 *             .change("{change}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangePriceRoundingModeChangeBuilder implements Builder<ChangePriceRoundingModeChange> {

    private String change;

    private com.commercetools.history.models.common.RoundingMode previousValue;

    private com.commercetools.history.models.common.RoundingMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangePriceRoundingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePriceRoundingModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.RoundingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePriceRoundingModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.RoundingMode nextValue) {
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

    public com.commercetools.history.models.common.RoundingMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.RoundingMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangePriceRoundingModeChange with checking for non-null required values
     * @return ChangePriceRoundingModeChange
     */
    public ChangePriceRoundingModeChange build() {
        Objects.requireNonNull(change, ChangePriceRoundingModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangePriceRoundingModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangePriceRoundingModeChange.class + ": nextValue is missing");
        return new ChangePriceRoundingModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangePriceRoundingModeChange without checking for non-null required values
     * @return ChangePriceRoundingModeChange
     */
    public ChangePriceRoundingModeChange buildUnchecked() {
        return new ChangePriceRoundingModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangePriceRoundingModeChangeBuilder
     * @return builder
     */
    public static ChangePriceRoundingModeChangeBuilder of() {
        return new ChangePriceRoundingModeChangeBuilder();
    }

    /**
     * create builder for ChangePriceRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePriceRoundingModeChangeBuilder of(final ChangePriceRoundingModeChange template) {
        ChangePriceRoundingModeChangeBuilder builder = new ChangePriceRoundingModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
