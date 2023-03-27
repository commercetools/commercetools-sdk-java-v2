
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReturnPaymentStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnPaymentStateChange setReturnPaymentStateChange = SetReturnPaymentStateChange.builder()
 *             .change("{change}")
 *             .nextValue(ReturnPaymentState.NON_REFUNDABLE)
 *             .previousValue(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReturnPaymentStateChangeBuilder implements Builder<SetReturnPaymentStateChange> {

    private String change;

    private com.commercetools.history.models.common.ReturnPaymentState nextValue;

    private com.commercetools.history.models.common.ReturnPaymentState previousValue;

    /**
     *  <p>Update action for <code>setReturnPaymentState</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetReturnPaymentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReturnPaymentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ReturnPaymentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReturnPaymentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ReturnPaymentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setReturnPaymentState</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.ReturnPaymentState getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.ReturnPaymentState getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetReturnPaymentStateChange with checking for non-null required values
     * @return SetReturnPaymentStateChange
     */
    public SetReturnPaymentStateChange build() {
        Objects.requireNonNull(change, SetReturnPaymentStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetReturnPaymentStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetReturnPaymentStateChange.class + ": previousValue is missing");
        return new SetReturnPaymentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetReturnPaymentStateChange without checking for non-null required values
     * @return SetReturnPaymentStateChange
     */
    public SetReturnPaymentStateChange buildUnchecked() {
        return new SetReturnPaymentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetReturnPaymentStateChangeBuilder
     * @return builder
     */
    public static SetReturnPaymentStateChangeBuilder of() {
        return new SetReturnPaymentStateChangeBuilder();
    }

    /**
     * create builder for SetReturnPaymentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnPaymentStateChangeBuilder of(final SetReturnPaymentStateChange template) {
        SetReturnPaymentStateChangeBuilder builder = new SetReturnPaymentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
