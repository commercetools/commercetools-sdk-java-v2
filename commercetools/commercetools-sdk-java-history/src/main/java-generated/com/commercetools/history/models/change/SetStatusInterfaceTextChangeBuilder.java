
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStatusInterfaceTextChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceTextChange setStatusInterfaceTextChange = SetStatusInterfaceTextChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStatusInterfaceTextChangeBuilder implements Builder<SetStatusInterfaceTextChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setStatusInterfaceText</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetStatusInterfaceTextChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetStatusInterfaceTextChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetStatusInterfaceTextChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setStatusInterfaceText</code></p>
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
     * builds SetStatusInterfaceTextChange with checking for non-null required values
     * @return SetStatusInterfaceTextChange
     */
    public SetStatusInterfaceTextChange build() {
        Objects.requireNonNull(change, SetStatusInterfaceTextChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStatusInterfaceTextChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStatusInterfaceTextChange.class + ": nextValue is missing");
        return new SetStatusInterfaceTextChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStatusInterfaceTextChange without checking for non-null required values
     * @return SetStatusInterfaceTextChange
     */
    public SetStatusInterfaceTextChange buildUnchecked() {
        return new SetStatusInterfaceTextChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetStatusInterfaceTextChangeBuilder
     * @return builder
     */
    public static SetStatusInterfaceTextChangeBuilder of() {
        return new SetStatusInterfaceTextChangeBuilder();
    }

    /**
     * create builder for SetStatusInterfaceTextChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusInterfaceTextChangeBuilder of(final SetStatusInterfaceTextChange template) {
        SetStatusInterfaceTextChangeBuilder builder = new SetStatusInterfaceTextChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
