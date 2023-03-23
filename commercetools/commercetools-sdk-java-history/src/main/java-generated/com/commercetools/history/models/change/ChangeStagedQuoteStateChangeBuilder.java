
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
     *
     * @param change
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.StagedQuoteState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public ChangeStagedQuoteStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.StagedQuoteState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.StagedQuoteState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.StagedQuoteState getPreviousValue() {
        return this.previousValue;
    }

    public ChangeStagedQuoteStateChange build() {
        Objects.requireNonNull(change, ChangeStagedQuoteStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeStagedQuoteStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeStagedQuoteStateChange.class + ": previousValue is missing");
        return new ChangeStagedQuoteStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeStagedQuoteStateChange without checking for non null required values
     */
    public ChangeStagedQuoteStateChange buildUnchecked() {
        return new ChangeStagedQuoteStateChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeStagedQuoteStateChangeBuilder of() {
        return new ChangeStagedQuoteStateChangeBuilder();
    }

    public static ChangeStagedQuoteStateChangeBuilder of(final ChangeStagedQuoteStateChange template) {
        ChangeStagedQuoteStateChangeBuilder builder = new ChangeStagedQuoteStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
