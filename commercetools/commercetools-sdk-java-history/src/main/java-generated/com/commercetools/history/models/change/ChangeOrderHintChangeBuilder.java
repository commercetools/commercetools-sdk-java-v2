
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeOrderHintChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeOrderHintChange changeOrderHintChange = ChangeOrderHintChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeOrderHintChangeBuilder implements Builder<ChangeOrderHintChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeOrderHint</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeOrderHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeOrderHintChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeOrderHintChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>changeOrderHint</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeOrderHintChange with checking for non-null required values
     * @return ChangeOrderHintChange
     */
    public ChangeOrderHintChange build() {
        Objects.requireNonNull(change, ChangeOrderHintChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeOrderHintChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeOrderHintChange.class + ": nextValue is missing");
        return new ChangeOrderHintChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeOrderHintChange without checking for non-null required values
     * @return ChangeOrderHintChange
     */
    public ChangeOrderHintChange buildUnchecked() {
        return new ChangeOrderHintChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeOrderHintChangeBuilder
     * @return builder
     */
    public static ChangeOrderHintChangeBuilder of() {
        return new ChangeOrderHintChangeBuilder();
    }

    /**
     * create builder for ChangeOrderHintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeOrderHintChangeBuilder of(final ChangeOrderHintChange template) {
        ChangeOrderHintChangeBuilder builder = new ChangeOrderHintChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
