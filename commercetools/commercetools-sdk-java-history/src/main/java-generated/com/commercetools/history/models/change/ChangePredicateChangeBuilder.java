
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePredicateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePredicateChange changePredicateChange = ChangePredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangePredicateChangeBuilder implements Builder<ChangePredicateChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangePredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePredicateChangeBuilder nextValue(final String nextValue) {
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangePredicateChange with checking for non-null required values
     * @return ChangePredicateChange
     */
    public ChangePredicateChange build() {
        Objects.requireNonNull(change, ChangePredicateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangePredicateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangePredicateChange.class + ": nextValue is missing");
        return new ChangePredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangePredicateChange without checking for non-null required values
     * @return ChangePredicateChange
     */
    public ChangePredicateChange buildUnchecked() {
        return new ChangePredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangePredicateChangeBuilder
     * @return builder
     */
    public static ChangePredicateChangeBuilder of() {
        return new ChangePredicateChangeBuilder();
    }

    /**
     * create builder for ChangePredicateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePredicateChangeBuilder of(final ChangePredicateChange template) {
        ChangePredicateChangeBuilder builder = new ChangePredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
