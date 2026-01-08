
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeNameChange shippingMethodChangeNameChange = ShippingMethodChangeNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeNameChangeBuilder implements Builder<ShippingMethodChangeNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodChangeNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodChangeNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodChangeNameChangeBuilder nextValue(final String nextValue) {
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
     * builds ShippingMethodChangeNameChange with checking for non-null required values
     * @return ShippingMethodChangeNameChange
     */
    public ShippingMethodChangeNameChange build() {
        Objects.requireNonNull(change, ShippingMethodChangeNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ShippingMethodChangeNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ShippingMethodChangeNameChange.class + ": nextValue is missing");
        return new ShippingMethodChangeNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ShippingMethodChangeNameChange without checking for non-null required values
     * @return ShippingMethodChangeNameChange
     */
    public ShippingMethodChangeNameChange buildUnchecked() {
        return new ShippingMethodChangeNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodChangeNameChangeBuilder
     * @return builder
     */
    public static ShippingMethodChangeNameChangeBuilder of() {
        return new ShippingMethodChangeNameChangeBuilder();
    }

    /**
     * create builder for ShippingMethodChangeNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeNameChangeBuilder of(final ShippingMethodChangeNameChange template) {
        ShippingMethodChangeNameChangeBuilder builder = new ShippingMethodChangeNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
