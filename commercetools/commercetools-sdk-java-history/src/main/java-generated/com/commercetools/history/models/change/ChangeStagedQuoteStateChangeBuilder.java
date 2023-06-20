
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
 *             .previousValue(StagedQuoteState.IN_PROGRESS)
 *             .nextValue(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeStagedQuoteStateChangeBuilder implements Builder<ChangeStagedQuoteStateChange> {

    private String change;

    private com.commercetools.history.models.common.StagedQuoteState previousValue;

    private com.commercetools.history.models.common.StagedQuoteState nextValue;

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
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.StagedQuoteState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.StagedQuoteState nextValue) {
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

    public com.commercetools.history.models.common.StagedQuoteState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.StagedQuoteState getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeStagedQuoteStateChange with checking for non-null required values
     * @return ChangeStagedQuoteStateChange
     */
    public ChangeStagedQuoteStateChange build() {
        Objects.requireNonNull(change, ChangeStagedQuoteStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeStagedQuoteStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeStagedQuoteStateChange.class + ": nextValue is missing");
        return new ChangeStagedQuoteStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeStagedQuoteStateChange without checking for non-null required values
     * @return ChangeStagedQuoteStateChange
     */
    public ChangeStagedQuoteStateChange buildUnchecked() {
        return new ChangeStagedQuoteStateChangeImpl(change, previousValue, nextValue);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
