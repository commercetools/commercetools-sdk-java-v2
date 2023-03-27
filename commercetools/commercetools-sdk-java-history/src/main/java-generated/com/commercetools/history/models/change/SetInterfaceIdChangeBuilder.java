
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetInterfaceIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInterfaceIdChange setInterfaceIdChange = SetInterfaceIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetInterfaceIdChangeBuilder implements Builder<SetInterfaceIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setInterfaceId</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetInterfaceIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetInterfaceIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetInterfaceIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setInterfaceId</code></p>
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
     * builds SetInterfaceIdChange with checking for non-null required values
     * @return SetInterfaceIdChange
     */
    public SetInterfaceIdChange build() {
        Objects.requireNonNull(change, SetInterfaceIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetInterfaceIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetInterfaceIdChange.class + ": nextValue is missing");
        return new SetInterfaceIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetInterfaceIdChange without checking for non-null required values
     * @return SetInterfaceIdChange
     */
    public SetInterfaceIdChange buildUnchecked() {
        return new SetInterfaceIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetInterfaceIdChangeBuilder
     * @return builder
     */
    public static SetInterfaceIdChangeBuilder of() {
        return new SetInterfaceIdChangeBuilder();
    }

    /**
     * create builder for SetInterfaceIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetInterfaceIdChangeBuilder of(final SetInterfaceIdChange template) {
        SetInterfaceIdChangeBuilder builder = new SetInterfaceIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
