
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeQuoteStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuoteStateChange changeQuoteStateChange = ChangeQuoteStateChange.builder()
 *             .change("{change}")
 *             .previousValue(QuoteState.PENDING)
 *             .nextValue(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeQuoteStateChangeBuilder implements Builder<ChangeQuoteStateChange> {

    private String change;

    private com.commercetools.history.models.common.QuoteState previousValue;

    private com.commercetools.history.models.common.QuoteState nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.QuoteState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder nextValue(final com.commercetools.history.models.common.QuoteState nextValue) {
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

    public com.commercetools.history.models.common.QuoteState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.QuoteState getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeQuoteStateChange with checking for non-null required values
     * @return ChangeQuoteStateChange
     */
    public ChangeQuoteStateChange build() {
        Objects.requireNonNull(change, ChangeQuoteStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeQuoteStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeQuoteStateChange.class + ": nextValue is missing");
        return new ChangeQuoteStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeQuoteStateChange without checking for non-null required values
     * @return ChangeQuoteStateChange
     */
    public ChangeQuoteStateChange buildUnchecked() {
        return new ChangeQuoteStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeQuoteStateChangeBuilder
     * @return builder
     */
    public static ChangeQuoteStateChangeBuilder of() {
        return new ChangeQuoteStateChangeBuilder();
    }

    /**
     * create builder for ChangeQuoteStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeQuoteStateChangeBuilder of(final ChangeQuoteStateChange template) {
        ChangeQuoteStateChangeBuilder builder = new ChangeQuoteStateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
