
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodAddShippingRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddShippingRateChange shippingMethodAddShippingRateChange = ShippingMethodAddShippingRateChange.builder()
 *             .change("{change}")
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddShippingRateChangeBuilder implements Builder<ShippingMethodAddShippingRateChange> {

    private String change;

    private com.commercetools.history.models.common.ZoneResourceIdentifier zone;

    private com.commercetools.history.models.common.ShippingRate nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodAddShippingRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Zone to which the ShippingRate was added.</p>
     * @param builder function to build the zone value
     * @return Builder
     */

    public ShippingMethodAddShippingRateChangeBuilder zone(
            Function<com.commercetools.history.models.common.ZoneResourceIdentifierBuilder, com.commercetools.history.models.common.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.history.models.common.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Zone to which the ShippingRate was added.</p>
     * @param builder function to build the zone value
     * @return Builder
     */

    public ShippingMethodAddShippingRateChangeBuilder withZone(
            Function<com.commercetools.history.models.common.ZoneResourceIdentifierBuilder, com.commercetools.history.models.common.ZoneResourceIdentifier> builder) {
        this.zone = builder.apply(com.commercetools.history.models.common.ZoneResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Zone to which the ShippingRate was added.</p>
     * @param zone value to be set
     * @return Builder
     */

    public ShippingMethodAddShippingRateChangeBuilder zone(
            final com.commercetools.history.models.common.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ShippingMethodAddShippingRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ShippingMethodAddShippingRateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ShippingMethodAddShippingRateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ShippingRate nextValue) {
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
     *  <p>Zone to which the ShippingRate was added.</p>
     * @return zone
     */

    public com.commercetools.history.models.common.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ShippingRate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ShippingMethodAddShippingRateChange with checking for non-null required values
     * @return ShippingMethodAddShippingRateChange
     */
    public ShippingMethodAddShippingRateChange build() {
        Objects.requireNonNull(change, ShippingMethodAddShippingRateChange.class + ": change is missing");
        Objects.requireNonNull(zone, ShippingMethodAddShippingRateChange.class + ": zone is missing");
        Objects.requireNonNull(nextValue, ShippingMethodAddShippingRateChange.class + ": nextValue is missing");
        return new ShippingMethodAddShippingRateChangeImpl(change, zone, nextValue);
    }

    /**
     * builds ShippingMethodAddShippingRateChange without checking for non-null required values
     * @return ShippingMethodAddShippingRateChange
     */
    public ShippingMethodAddShippingRateChange buildUnchecked() {
        return new ShippingMethodAddShippingRateChangeImpl(change, zone, nextValue);
    }

    /**
     * factory method for an instance of ShippingMethodAddShippingRateChangeBuilder
     * @return builder
     */
    public static ShippingMethodAddShippingRateChangeBuilder of() {
        return new ShippingMethodAddShippingRateChangeBuilder();
    }

    /**
     * create builder for ShippingMethodAddShippingRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodAddShippingRateChangeBuilder of(final ShippingMethodAddShippingRateChange template) {
        ShippingMethodAddShippingRateChangeBuilder builder = new ShippingMethodAddShippingRateChangeBuilder();
        builder.change = template.getChange();
        builder.zone = template.getZone();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
