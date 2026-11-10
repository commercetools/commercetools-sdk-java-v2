
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeIsDefaultChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeIsDefaultChange shippingMethodChangeIsDefaultChange = ShippingMethodChangeIsDefaultChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeIsDefaultChangeBuilder implements Builder<ShippingMethodChangeIsDefaultChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodChangeIsDefaultChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodChangeIsDefaultChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodChangeIsDefaultChangeBuilder nextValue(final Boolean nextValue) {
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

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ShippingMethodChangeIsDefaultChange with checking for non-null required values
     * @return ShippingMethodChangeIsDefaultChange
     */
    public ShippingMethodChangeIsDefaultChange build() {
        Objects.requireNonNull(change, ShippingMethodChangeIsDefaultChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ShippingMethodChangeIsDefaultChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ShippingMethodChangeIsDefaultChange.class + ": nextValue is missing");
        return new ShippingMethodChangeIsDefaultChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ShippingMethodChangeIsDefaultChange without checking for non-null required values
     * @return ShippingMethodChangeIsDefaultChange
     */
    public ShippingMethodChangeIsDefaultChange buildUnchecked() {
        return new ShippingMethodChangeIsDefaultChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodChangeIsDefaultChangeBuilder
     * @return builder
     */
    public static ShippingMethodChangeIsDefaultChangeBuilder of() {
        return new ShippingMethodChangeIsDefaultChangeBuilder();
    }

    /**
     * create builder for ShippingMethodChangeIsDefaultChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeIsDefaultChangeBuilder of(final ShippingMethodChangeIsDefaultChange template) {
        ShippingMethodChangeIsDefaultChangeBuilder builder = new ShippingMethodChangeIsDefaultChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
