
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidUntilChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidUntilChange setValidUntilChange = SetValidUntilChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValidUntilChangeBuilder implements Builder<SetValidUntilChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetValidUntilChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetValidUntilChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetValidUntilChangeBuilder nextValue(final String nextValue) {
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
     * builds SetValidUntilChange with checking for non-null required values
     * @return SetValidUntilChange
     */
    public SetValidUntilChange build() {
        Objects.requireNonNull(change, SetValidUntilChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValidUntilChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValidUntilChange.class + ": nextValue is missing");
        return new SetValidUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidUntilChange without checking for non-null required values
     * @return SetValidUntilChange
     */
    public SetValidUntilChange buildUnchecked() {
        return new SetValidUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetValidUntilChangeBuilder
     * @return builder
     */
    public static SetValidUntilChangeBuilder of() {
        return new SetValidUntilChangeBuilder();
    }

    /**
     * create builder for SetValidUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidUntilChangeBuilder of(final SetValidUntilChange template) {
        SetValidUntilChangeBuilder builder = new SetValidUntilChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
