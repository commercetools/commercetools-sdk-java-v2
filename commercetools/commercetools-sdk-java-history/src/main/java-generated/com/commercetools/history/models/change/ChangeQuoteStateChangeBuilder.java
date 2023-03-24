
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
     *
     * @param change value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder nextValue(final com.commercetools.history.models.common.QuoteState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeQuoteStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.QuoteState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.QuoteState getNextValue() {
        return this.nextValue;
    }

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

    public static ChangeQuoteStateChangeBuilder of() {
        return new ChangeQuoteStateChangeBuilder();
    }

    public static ChangeQuoteStateChangeBuilder of(final ChangeQuoteStateChange template) {
        ChangeQuoteStateChangeBuilder builder = new ChangeQuoteStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
