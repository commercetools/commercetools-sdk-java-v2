
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeOrderStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeOrderStateChange changeOrderStateChange = ChangeOrderStateChange.builder()
 *             .change("{change}")
 *             .nextValue(OrderState.OPEN)
 *             .previousValue(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeOrderStateChangeBuilder implements Builder<ChangeOrderStateChange> {

    private String change;

    private com.commercetools.history.models.common.OrderState nextValue;

    private com.commercetools.history.models.common.OrderState previousValue;

    /**
     *  <p>Update action for <code>changeOrderState</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeOrderStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeOrderStateChangeBuilder nextValue(final com.commercetools.history.models.common.OrderState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeOrderStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.OrderState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeOrderState</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.OrderState getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.OrderState getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeOrderStateChange with checking for non-null required values
     * @return ChangeOrderStateChange
     */
    public ChangeOrderStateChange build() {
        Objects.requireNonNull(change, ChangeOrderStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeOrderStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeOrderStateChange.class + ": previousValue is missing");
        return new ChangeOrderStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeOrderStateChange without checking for non-null required values
     * @return ChangeOrderStateChange
     */
    public ChangeOrderStateChange buildUnchecked() {
        return new ChangeOrderStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeOrderStateChangeBuilder
     * @return builder
     */
    public static ChangeOrderStateChangeBuilder of() {
        return new ChangeOrderStateChangeBuilder();
    }

    /**
     * create builder for ChangeOrderStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeOrderStateChangeBuilder of(final ChangeOrderStateChange template) {
        ChangeOrderStateChangeBuilder builder = new ChangeOrderStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
