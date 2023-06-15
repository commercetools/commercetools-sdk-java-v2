
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextChange setTextChange = SetTextChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTextChangeBuilder implements Builder<SetTextChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTextChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTextChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTextChangeBuilder nextValue(final String nextValue) {
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
     * builds SetTextChange with checking for non-null required values
     * @return SetTextChange
     */
    public SetTextChange build() {
        Objects.requireNonNull(change, SetTextChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTextChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTextChange.class + ": nextValue is missing");
        return new SetTextChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTextChange without checking for non-null required values
     * @return SetTextChange
     */
    public SetTextChange buildUnchecked() {
        return new SetTextChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTextChangeBuilder
     * @return builder
     */
    public static SetTextChangeBuilder of() {
        return new SetTextChangeBuilder();
    }

    /**
     * create builder for SetTextChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextChangeBuilder of(final SetTextChange template) {
        SetTextChangeBuilder builder = new SetTextChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
