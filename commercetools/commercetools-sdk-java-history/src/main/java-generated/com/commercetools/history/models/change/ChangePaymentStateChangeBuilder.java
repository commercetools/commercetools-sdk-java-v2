
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePaymentStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePaymentStateChange changePaymentStateChange = ChangePaymentStateChange.builder()
 *             .change("{change}")
 *             .nextValue(PaymentState.BALANCE_DUE)
 *             .previousValue(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangePaymentStateChangeBuilder implements Builder<ChangePaymentStateChange> {

    private String change;

    private com.commercetools.history.models.common.PaymentState nextValue;

    private com.commercetools.history.models.common.PaymentState previousValue;

    /**
     *  <p>Update action for <code>changePaymentState</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangePaymentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePaymentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.PaymentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePaymentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changePaymentState</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.PaymentState getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.PaymentState getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangePaymentStateChange with checking for non-null required values
     * @return ChangePaymentStateChange
     */
    public ChangePaymentStateChange build() {
        Objects.requireNonNull(change, ChangePaymentStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangePaymentStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangePaymentStateChange.class + ": previousValue is missing");
        return new ChangePaymentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangePaymentStateChange without checking for non-null required values
     * @return ChangePaymentStateChange
     */
    public ChangePaymentStateChange buildUnchecked() {
        return new ChangePaymentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangePaymentStateChangeBuilder
     * @return builder
     */
    public static ChangePaymentStateChangeBuilder of() {
        return new ChangePaymentStateChangeBuilder();
    }

    /**
     * create builder for ChangePaymentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePaymentStateChangeBuilder of(final ChangePaymentStateChange template) {
        ChangePaymentStateChangeBuilder builder = new ChangePaymentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
