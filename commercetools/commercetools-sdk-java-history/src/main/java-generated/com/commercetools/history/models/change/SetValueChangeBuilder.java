
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

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    /**
     *  <p>Update action for <code>setValue</code> on custom objects</p>
     * @param change value to be set
     * @return Builder
     */

    public SetValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetValueChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetValueChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setValue</code> on custom objects</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetValueChange with checking for non-null required values
     * @return SetValueChange
     */
    public SetValueChange build() {
        Objects.requireNonNull(change, SetValueChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetValueChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetValueChange.class + ": previousValue is missing");
        return new SetValueChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetValueChange without checking for non-null required values
     * @return SetValueChange
     */
    public SetValueChange buildUnchecked() {
        return new SetValueChangeImpl(change, nextValue, previousValue);
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
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
