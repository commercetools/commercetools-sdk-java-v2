
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeShipmentStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShipmentStateChange changeShipmentStateChange = ChangeShipmentStateChange.builder()
 *             .change("{change}")
 *             .previousValue(ShipmentState.SHIPPED)
 *             .nextValue(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeShipmentStateChangeBuilder implements Builder<ChangeShipmentStateChange> {

    private String change;

    private com.commercetools.history.models.common.ShipmentState previousValue;

    private com.commercetools.history.models.common.ShipmentState nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeShipmentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeShipmentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ShipmentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeShipmentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ShipmentState nextValue) {
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

    public com.commercetools.history.models.common.ShipmentState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ShipmentState getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeShipmentStateChange with checking for non-null required values
     * @return ChangeShipmentStateChange
     */
    public ChangeShipmentStateChange build() {
        Objects.requireNonNull(change, ChangeShipmentStateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeShipmentStateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeShipmentStateChange.class + ": nextValue is missing");
        return new ChangeShipmentStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeShipmentStateChange without checking for non-null required values
     * @return ChangeShipmentStateChange
     */
    public ChangeShipmentStateChange buildUnchecked() {
        return new ChangeShipmentStateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeShipmentStateChangeBuilder
     * @return builder
     */
    public static ChangeShipmentStateChangeBuilder of() {
        return new ChangeShipmentStateChangeBuilder();
    }

    /**
     * create builder for ChangeShipmentStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShipmentStateChangeBuilder of(final ChangeShipmentStateChange template) {
        ChangeShipmentStateChangeBuilder builder = new ChangeShipmentStateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
