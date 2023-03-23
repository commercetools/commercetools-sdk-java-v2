
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeSortOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSortOrderChange changeSortOrderChange = ChangeSortOrderChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeSortOrderChangeBuilder implements Builder<ChangeSortOrderChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeSortOrder</code></p>
     * @param change
     * @return Builder
     */

    public ChangeSortOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public ChangeSortOrderChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public ChangeSortOrderChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public ChangeSortOrderChange build() {
        Objects.requireNonNull(change, ChangeSortOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeSortOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeSortOrderChange.class + ": nextValue is missing");
        return new ChangeSortOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeSortOrderChange without checking for non null required values
     */
    public ChangeSortOrderChange buildUnchecked() {
        return new ChangeSortOrderChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeSortOrderChangeBuilder of() {
        return new ChangeSortOrderChangeBuilder();
    }

    public static ChangeSortOrderChangeBuilder of(final ChangeSortOrderChange template) {
        ChangeSortOrderChangeBuilder builder = new ChangeSortOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
