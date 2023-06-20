
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStatusInterfaceCodeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStatusInterfaceCodeChange setStatusInterfaceCodeChange = SetStatusInterfaceCodeChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStatusInterfaceCodeChangeBuilder implements Builder<SetStatusInterfaceCodeChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetStatusInterfaceCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetStatusInterfaceCodeChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetStatusInterfaceCodeChangeBuilder nextValue(final String nextValue) {
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
     * builds SetStatusInterfaceCodeChange with checking for non-null required values
     * @return SetStatusInterfaceCodeChange
     */
    public SetStatusInterfaceCodeChange build() {
        Objects.requireNonNull(change, SetStatusInterfaceCodeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStatusInterfaceCodeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStatusInterfaceCodeChange.class + ": nextValue is missing");
        return new SetStatusInterfaceCodeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStatusInterfaceCodeChange without checking for non-null required values
     * @return SetStatusInterfaceCodeChange
     */
    public SetStatusInterfaceCodeChange buildUnchecked() {
        return new SetStatusInterfaceCodeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetStatusInterfaceCodeChangeBuilder
     * @return builder
     */
    public static SetStatusInterfaceCodeChangeBuilder of() {
        return new SetStatusInterfaceCodeChangeBuilder();
    }

    /**
     * create builder for SetStatusInterfaceCodeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStatusInterfaceCodeChangeBuilder of(final SetStatusInterfaceCodeChange template) {
        SetStatusInterfaceCodeChangeBuilder builder = new SetStatusInterfaceCodeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
