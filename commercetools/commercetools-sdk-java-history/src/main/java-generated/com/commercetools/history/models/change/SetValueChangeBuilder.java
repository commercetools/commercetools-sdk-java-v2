
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValueChange setValueChange = SetValueChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValueChangeBuilder implements Builder<SetValueChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetValueChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetValueChangeBuilder nextValue(final java.lang.Object nextValue) {
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetValueChange with checking for non-null required values
     * @return SetValueChange
     */
    public SetValueChange build() {
        Objects.requireNonNull(change, SetValueChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValueChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValueChange.class + ": nextValue is missing");
        return new SetValueChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValueChange without checking for non-null required values
     * @return SetValueChange
     */
    public SetValueChange buildUnchecked() {
        return new SetValueChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetValueChangeBuilder
     * @return builder
     */
    public static SetValueChangeBuilder of() {
        return new SetValueChangeBuilder();
    }

    /**
     * create builder for SetValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValueChangeBuilder of(final SetValueChange template) {
        SetValueChangeBuilder builder = new SetValueChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
