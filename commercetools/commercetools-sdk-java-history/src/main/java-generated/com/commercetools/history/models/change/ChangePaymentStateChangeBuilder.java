
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
 *             .previousValue(PaymentState.BALANCE_DUE)
 *             .nextValue(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangePaymentStateChangeBuilder implements Builder<ChangePaymentStateChange> {

    private String change;

    private com.commercetools.history.models.common.PaymentState previousValue;

    private com.commercetools.history.models.common.PaymentState nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangePaymentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePaymentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.PaymentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePaymentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.PaymentState nextValue) {
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

    public com.commercetools.history.models.common.PaymentState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.PaymentState getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangePaymentStateChange with checking for non-null required values
     * @return ChangePaymentStateChange
     */
    public ChangePaymentStateChange build() {
        Objects.requireNonNull(change, ChangePaymentStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangePaymentStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangePaymentStateChange.class + ": nextValue is missing");
        return new ChangePaymentStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangePaymentStateChange without checking for non-null required values
     * @return ChangePaymentStateChange
     */
    public ChangePaymentStateChange buildUnchecked() {
        return new ChangePaymentStateChangeImpl(change, previousValue, nextValue);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
