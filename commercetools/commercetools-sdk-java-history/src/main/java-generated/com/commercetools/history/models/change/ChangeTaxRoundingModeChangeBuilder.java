
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTaxRoundingModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTaxRoundingModeChange changeTaxRoundingModeChange = ChangeTaxRoundingModeChange.builder()
 *             .change("{change}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTaxRoundingModeChangeBuilder implements Builder<ChangeTaxRoundingModeChange> {

    private String change;

    private com.commercetools.history.models.common.RoundingMode previousValue;

    private com.commercetools.history.models.common.RoundingMode nextValue;

    /**
     *  <p>Shape of the action for <code>changeTaxRoundingMode</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeTaxRoundingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTaxRoundingModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.RoundingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTaxRoundingModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.RoundingMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>changeTaxRoundingMode</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.RoundingMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.RoundingMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeTaxRoundingModeChange with checking for non-null required values
     * @return ChangeTaxRoundingModeChange
     */
    public ChangeTaxRoundingModeChange build() {
        Objects.requireNonNull(change, ChangeTaxRoundingModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTaxRoundingModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTaxRoundingModeChange.class + ": nextValue is missing");
        return new ChangeTaxRoundingModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeTaxRoundingModeChange without checking for non-null required values
     * @return ChangeTaxRoundingModeChange
     */
    public ChangeTaxRoundingModeChange buildUnchecked() {
        return new ChangeTaxRoundingModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeTaxRoundingModeChangeBuilder
     * @return builder
     */
    public static ChangeTaxRoundingModeChangeBuilder of() {
        return new ChangeTaxRoundingModeChangeBuilder();
    }

    /**
     * create builder for ChangeTaxRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTaxRoundingModeChangeBuilder of(final ChangeTaxRoundingModeChange template) {
        ChangeTaxRoundingModeChangeBuilder builder = new ChangeTaxRoundingModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
