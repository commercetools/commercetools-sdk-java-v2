
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingRateInputChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingRateInputChange setShippingRateInputChange = SetShippingRateInputChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingRateInputChangeBuilder implements Builder<SetShippingRateInputChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingRateInputChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingRateInputChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingRateInputChangeBuilder nextValue(final java.lang.Object nextValue) {
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetShippingRateInputChange with checking for non-null required values
     * @return SetShippingRateInputChange
     */
    public SetShippingRateInputChange build() {
        Objects.requireNonNull(change, SetShippingRateInputChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetShippingRateInputChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingRateInputChange.class + ": nextValue is missing");
        return new SetShippingRateInputChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetShippingRateInputChange without checking for non-null required values
     * @return SetShippingRateInputChange
     */
    public SetShippingRateInputChange buildUnchecked() {
        return new SetShippingRateInputChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingRateInputChangeBuilder
     * @return builder
     */
    public static SetShippingRateInputChangeBuilder of() {
        return new SetShippingRateInputChangeBuilder();
    }

    /**
     * create builder for SetShippingRateInputChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingRateInputChangeBuilder of(final SetShippingRateInputChange template) {
        SetShippingRateInputChangeBuilder builder = new SetShippingRateInputChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
