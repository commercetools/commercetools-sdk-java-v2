
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
 *             .nextValue(QuoteState.PENDING)
 *             .previousValue(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeQuoteStateChangeBuilder implements Builder<ChangeQuoteStateChange> {

    private String change;

    private com.commercetools.history.models.common.QuoteState nextValue;

    private com.commercetools.history.models.common.QuoteState previousValue;

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
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder nextValue(final com.commercetools.history.models.common.QuoteState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.QuoteState previousValue) {
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

    public com.commercetools.history.models.common.QuoteState getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.QuoteState getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeQuoteStateChange with checking for non-null required values
     * @return ChangeQuoteStateChange
     */
    public ChangeQuoteStateChange build() {
        Objects.requireNonNull(change, ChangeQuoteStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeQuoteStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeQuoteStateChange.class + ": previousValue is missing");
        return new ChangeQuoteStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeQuoteStateChange without checking for non-null required values
     * @return ChangeQuoteStateChange
     */
    public ChangeQuoteStateChange buildUnchecked() {
        return new ChangeQuoteStateChangeImpl(change, nextValue, previousValue);
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
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
