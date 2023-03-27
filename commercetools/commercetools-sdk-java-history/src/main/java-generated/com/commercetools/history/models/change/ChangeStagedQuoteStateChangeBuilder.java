
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeStagedQuoteStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeStagedQuoteStateChange changeStagedQuoteStateChange = ChangeStagedQuoteStateChange.builder()
 *             .change("{change}")
 *             .nextValue(StagedQuoteState.IN_PROGRESS)
 *             .previousValue(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeStagedQuoteStateChangeBuilder implements Builder<ChangeStagedQuoteStateChange> {

    private String change;

    private com.commercetools.history.models.common.StagedQuoteState nextValue;

    private com.commercetools.history.models.common.StagedQuoteState previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.StagedQuoteState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.StagedQuoteState previousValue) {
        this.previousValue = previousValue;
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
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.StagedQuoteState getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.StagedQuoteState getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeStagedQuoteStateChange with checking for non-null required values
     * @return ChangeStagedQuoteStateChange
     */
    public ChangeStagedQuoteStateChange build() {
        Objects.requireNonNull(change, ChangeStagedQuoteStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeStagedQuoteStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeStagedQuoteStateChange.class + ": previousValue is missing");
        return new ChangeStagedQuoteStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeStagedQuoteStateChange without checking for non-null required values
     * @return ChangeStagedQuoteStateChange
     */
    public ChangeStagedQuoteStateChange buildUnchecked() {
        return new ChangeStagedQuoteStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeStagedQuoteStateChangeBuilder
     * @return builder
     */
    public static ChangeStagedQuoteStateChangeBuilder of() {
        return new ChangeStagedQuoteStateChangeBuilder();
    }

    /**
     * create builder for ChangeStagedQuoteStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeStagedQuoteStateChangeBuilder of(final ChangeStagedQuoteStateChange template) {
        ChangeStagedQuoteStateChangeBuilder builder = new ChangeStagedQuoteStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
