
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetExpectedDeliveryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetExpectedDeliveryChange setExpectedDeliveryChange = SetExpectedDeliveryChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetExpectedDeliveryChangeBuilder implements Builder<SetExpectedDeliveryChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setExpectedDelivery</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetExpectedDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetExpectedDeliveryChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetExpectedDeliveryChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setExpectedDelivery</code></p>
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
     * builds SetExpectedDeliveryChange with checking for non-null required values
     * @return SetExpectedDeliveryChange
     */
    public SetExpectedDeliveryChange build() {
        Objects.requireNonNull(change, SetExpectedDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetExpectedDeliveryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetExpectedDeliveryChange.class + ": nextValue is missing");
        return new SetExpectedDeliveryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetExpectedDeliveryChange without checking for non-null required values
     * @return SetExpectedDeliveryChange
     */
    public SetExpectedDeliveryChange buildUnchecked() {
        return new SetExpectedDeliveryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetExpectedDeliveryChangeBuilder
     * @return builder
     */
    public static SetExpectedDeliveryChangeBuilder of() {
        return new SetExpectedDeliveryChangeBuilder();
    }

    /**
     * create builder for SetExpectedDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetExpectedDeliveryChangeBuilder of(final SetExpectedDeliveryChange template) {
        SetExpectedDeliveryChangeBuilder builder = new SetExpectedDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
