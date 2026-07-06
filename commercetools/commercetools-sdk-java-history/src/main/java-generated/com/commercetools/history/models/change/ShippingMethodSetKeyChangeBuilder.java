
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetKeyChange shippingMethodSetKeyChange = ShippingMethodSetKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetKeyChangeBuilder implements Builder<ShippingMethodSetKeyChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodSetKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodSetKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodSetKeyChangeBuilder nextValue(final String nextValue) {
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ShippingMethodSetKeyChange with checking for non-null required values
     * @return ShippingMethodSetKeyChange
     */
    public ShippingMethodSetKeyChange build() {
        Objects.requireNonNull(change, ShippingMethodSetKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ShippingMethodSetKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ShippingMethodSetKeyChange.class + ": nextValue is missing");
        return new ShippingMethodSetKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ShippingMethodSetKeyChange without checking for non-null required values
     * @return ShippingMethodSetKeyChange
     */
    public ShippingMethodSetKeyChange buildUnchecked() {
        return new ShippingMethodSetKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodSetKeyChangeBuilder
     * @return builder
     */
    public static ShippingMethodSetKeyChangeBuilder of() {
        return new ShippingMethodSetKeyChangeBuilder();
    }

    /**
     * create builder for ShippingMethodSetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetKeyChangeBuilder of(final ShippingMethodSetKeyChange template) {
        ShippingMethodSetKeyChangeBuilder builder = new ShippingMethodSetKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
