
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetNameChange setNameChange = SetNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetNameChangeBuilder implements Builder<SetNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetNameChangeBuilder nextValue(final String nextValue) {
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
     * builds SetNameChange with checking for non-null required values
     * @return SetNameChange
     */
    public SetNameChange build() {
        Objects.requireNonNull(change, SetNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetNameChange.class + ": nextValue is missing");
        return new SetNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetNameChange without checking for non-null required values
     * @return SetNameChange
     */
    public SetNameChange buildUnchecked() {
        return new SetNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetNameChangeBuilder
     * @return builder
     */
    public static SetNameChangeBuilder of() {
        return new SetNameChangeBuilder();
    }

    /**
     * create builder for SetNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetNameChangeBuilder of(final SetNameChange template) {
        SetNameChangeBuilder builder = new SetNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
