
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetPredicateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetPredicateChange shippingMethodSetPredicateChange = ShippingMethodSetPredicateChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetPredicateChangeBuilder implements Builder<ShippingMethodSetPredicateChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodSetPredicateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodSetPredicateChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodSetPredicateChangeBuilder nextValue(final String nextValue) {
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
     * builds ShippingMethodSetPredicateChange with checking for non-null required values
     * @return ShippingMethodSetPredicateChange
     */
    public ShippingMethodSetPredicateChange build() {
        Objects.requireNonNull(change, ShippingMethodSetPredicateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ShippingMethodSetPredicateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ShippingMethodSetPredicateChange.class + ": nextValue is missing");
        return new ShippingMethodSetPredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ShippingMethodSetPredicateChange without checking for non-null required values
     * @return ShippingMethodSetPredicateChange
     */
    public ShippingMethodSetPredicateChange buildUnchecked() {
        return new ShippingMethodSetPredicateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodSetPredicateChangeBuilder
     * @return builder
     */
    public static ShippingMethodSetPredicateChangeBuilder of() {
        return new ShippingMethodSetPredicateChangeBuilder();
    }

    /**
     * create builder for ShippingMethodSetPredicateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetPredicateChangeBuilder of(final ShippingMethodSetPredicateChange template) {
        ShippingMethodSetPredicateChangeBuilder builder = new ShippingMethodSetPredicateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
