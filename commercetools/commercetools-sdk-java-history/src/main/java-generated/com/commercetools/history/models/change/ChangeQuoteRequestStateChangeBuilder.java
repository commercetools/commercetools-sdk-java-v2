
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeQuoteRequestStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuoteRequestStateChange changeQuoteRequestStateChange = ChangeQuoteRequestStateChange.builder()
 *             .change("{change}")
 *             .nextValue(QuoteRequestState.SUBMITTED)
 *             .previousValue(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeQuoteRequestStateChangeBuilder implements Builder<ChangeQuoteRequestStateChange> {

    private String change;

    private com.commercetools.history.models.common.QuoteRequestState nextValue;

    private com.commercetools.history.models.common.QuoteRequestState previousValue;

    /**
     *
     * @param change
     * @return Builder
     */

    public ChangeQuoteRequestStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public ChangeQuoteRequestStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.QuoteRequestState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public ChangeQuoteRequestStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.QuoteRequestState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.QuoteRequestState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.QuoteRequestState getPreviousValue() {
        return this.previousValue;
    }

    public ChangeQuoteRequestStateChange build() {
        Objects.requireNonNull(change, ChangeQuoteRequestStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeQuoteRequestStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeQuoteRequestStateChange.class + ": previousValue is missing");
        return new ChangeQuoteRequestStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeQuoteRequestStateChange without checking for non null required values
     */
    public ChangeQuoteRequestStateChange buildUnchecked() {
        return new ChangeQuoteRequestStateChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeQuoteRequestStateChangeBuilder of() {
        return new ChangeQuoteRequestStateChangeBuilder();
    }

    public static ChangeQuoteRequestStateChangeBuilder of(final ChangeQuoteRequestStateChange template) {
        ChangeQuoteRequestStateChangeBuilder builder = new ChangeQuoteRequestStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
