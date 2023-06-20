
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
 *             .previousValue(OrderState.OPEN)
 *             .nextValue(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeOrderStateChangeBuilder implements Builder<ChangeOrderStateChange> {

    private String change;

    private com.commercetools.history.models.common.OrderState previousValue;

    private com.commercetools.history.models.common.OrderState nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeOrderStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeOrderStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.OrderState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeOrderStateChangeBuilder nextValue(final com.commercetools.history.models.common.OrderState nextValue) {
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

    public com.commercetools.history.models.common.OrderState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.OrderState getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeOrderStateChange with checking for non-null required values
     * @return ChangeOrderStateChange
     */
    public ChangeOrderStateChange build() {
        Objects.requireNonNull(change, ChangeOrderStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeOrderStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeOrderStateChange.class + ": nextValue is missing");
        return new ChangeOrderStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeOrderStateChange without checking for non-null required values
     * @return ChangeOrderStateChange
     */
    public ChangeOrderStateChange buildUnchecked() {
        return new ChangeOrderStateChangeImpl(change, previousValue, nextValue);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
