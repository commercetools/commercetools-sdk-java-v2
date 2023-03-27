
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReturnShipmentStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnShipmentStateChange setReturnShipmentStateChange = SetReturnShipmentStateChange.builder()
 *             .change("{change}")
 *             .nextValue(ReturnShipmentState.ADVISED)
 *             .previousValue(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReturnShipmentStateChangeBuilder implements Builder<SetReturnShipmentStateChange> {

    private String change;

    private com.commercetools.history.models.common.ReturnShipmentState nextValue;

    private com.commercetools.history.models.common.ReturnShipmentState previousValue;

    /**
     *  <p>Update action for <code>setReturnShipmentState</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetReturnShipmentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReturnShipmentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ReturnShipmentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReturnShipmentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ReturnShipmentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setReturnShipmentState</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.ReturnShipmentState getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.ReturnShipmentState getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetReturnShipmentStateChange with checking for non-null required values
     * @return SetReturnShipmentStateChange
     */
    public SetReturnShipmentStateChange build() {
        Objects.requireNonNull(change, SetReturnShipmentStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetReturnShipmentStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetReturnShipmentStateChange.class + ": previousValue is missing");
        return new SetReturnShipmentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetReturnShipmentStateChange without checking for non-null required values
     * @return SetReturnShipmentStateChange
     */
    public SetReturnShipmentStateChange buildUnchecked() {
        return new SetReturnShipmentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetReturnShipmentStateChangeBuilder
     * @return builder
     */
    public static SetReturnShipmentStateChangeBuilder of() {
        return new SetReturnShipmentStateChangeBuilder();
    }

    /**
     * create builder for SetReturnShipmentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnShipmentStateChangeBuilder of(final SetReturnShipmentStateChange template) {
        SetReturnShipmentStateChangeBuilder builder = new SetReturnShipmentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
