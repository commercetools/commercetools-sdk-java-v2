
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodAddZoneChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddZoneChange shippingMethodAddZoneChange = ShippingMethodAddZoneChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddZoneChangeBuilder implements Builder<ShippingMethodAddZoneChange> {

    private String change;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodAddZoneChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodAddZoneChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ShippingMethodAddZoneChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ShippingMethodAddZoneChange with checking for non-null required values
     * @return ShippingMethodAddZoneChange
     */
    public ShippingMethodAddZoneChange build() {
        Objects.requireNonNull(change, ShippingMethodAddZoneChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ShippingMethodAddZoneChange.class + ": nextValue is missing");
        return new ShippingMethodAddZoneChangeImpl(change, nextValue);
    }

    /**
     * builds ShippingMethodAddZoneChange without checking for non-null required values
     * @return ShippingMethodAddZoneChange
     */
    public ShippingMethodAddZoneChange buildUnchecked() {
        return new ShippingMethodAddZoneChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodAddZoneChangeBuilder
     * @return builder
     */
    public static ShippingMethodAddZoneChangeBuilder of() {
        return new ShippingMethodAddZoneChangeBuilder();
    }

    /**
     * create builder for ShippingMethodAddZoneChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddZoneChangeBuilder of(final ShippingMethodAddZoneChange template) {
        ShippingMethodAddZoneChangeBuilder builder = new ShippingMethodAddZoneChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
