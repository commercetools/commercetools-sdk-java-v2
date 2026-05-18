
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodRemoveZoneChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveZoneChange shippingMethodRemoveZoneChange = ShippingMethodRemoveZoneChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodRemoveZoneChangeBuilder implements Builder<ShippingMethodRemoveZoneChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodRemoveZoneChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodRemoveZoneChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ShippingMethodRemoveZoneChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
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

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ShippingMethodRemoveZoneChange with checking for non-null required values
     * @return ShippingMethodRemoveZoneChange
     */
    public ShippingMethodRemoveZoneChange build() {
        Objects.requireNonNull(change, ShippingMethodRemoveZoneChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ShippingMethodRemoveZoneChange.class + ": previousValue is missing");
        return new ShippingMethodRemoveZoneChangeImpl(change, previousValue);
    }

    /**
     * builds ShippingMethodRemoveZoneChange without checking for non-null required values
     * @return ShippingMethodRemoveZoneChange
     */
    public ShippingMethodRemoveZoneChange buildUnchecked() {
        return new ShippingMethodRemoveZoneChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of ShippingMethodRemoveZoneChangeBuilder
     * @return builder
     */
    public static ShippingMethodRemoveZoneChangeBuilder of() {
        return new ShippingMethodRemoveZoneChangeBuilder();
    }

    /**
     * create builder for ShippingMethodRemoveZoneChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveZoneChangeBuilder of(final ShippingMethodRemoveZoneChange template) {
        ShippingMethodRemoveZoneChangeBuilder builder = new ShippingMethodRemoveZoneChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
