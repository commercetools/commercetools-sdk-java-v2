
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodRemoveShippingRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveShippingRateChange shippingMethodRemoveShippingRateChange = ShippingMethodRemoveShippingRateChange.builder()
 *             .change("{change}")
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodRemoveShippingRateChangeBuilder implements Builder<ShippingMethodRemoveShippingRateChange> {

    private String change;

    private com.commercetools.history.models.common.ZoneResourceIdentifier zone;

    private com.commercetools.history.models.common.ShippingRate previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Zone from which the ShippingRate was removed.</p>
     * @param builder function to build the zone value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateChangeBuilder zone(
            Function<com.commercetools.history.models.common.ZoneResourceIdentifierBuilder, com.commercetools.history.models.common.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.history.models.common.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Zone from which the ShippingRate was removed.</p>
     * @param builder function to build the zone value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateChangeBuilder withZone(
            Function<com.commercetools.history.models.common.ZoneResourceIdentifierBuilder, com.commercetools.history.models.common.ZoneResourceIdentifier> builder) {
        this.zone = builder.apply(com.commercetools.history.models.common.ZoneResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Zone from which the ShippingRate was removed.</p>
     * @param zone value to be set
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateChangeBuilder zone(
            final com.commercetools.history.models.common.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ShippingRateBuilder, com.commercetools.history.models.common.ShippingRate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShippingRateBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ShippingRate previousValue) {
        this.previousValue = previousValue;
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
     *  <p>Zone from which the ShippingRate was removed.</p>
     * @return zone
     */

    public com.commercetools.history.models.common.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.ShippingRate getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ShippingMethodRemoveShippingRateChange with checking for non-null required values
     * @return ShippingMethodRemoveShippingRateChange
     */
    public ShippingMethodRemoveShippingRateChange build() {
        Objects.requireNonNull(change, ShippingMethodRemoveShippingRateChange.class + ": change is missing");
        Objects.requireNonNull(zone, ShippingMethodRemoveShippingRateChange.class + ": zone is missing");
        Objects.requireNonNull(previousValue,
            ShippingMethodRemoveShippingRateChange.class + ": previousValue is missing");
        return new ShippingMethodRemoveShippingRateChangeImpl(change, zone, previousValue);
    }

    /**
     * builds ShippingMethodRemoveShippingRateChange without checking for non-null required values
     * @return ShippingMethodRemoveShippingRateChange
     */
    public ShippingMethodRemoveShippingRateChange buildUnchecked() {
        return new ShippingMethodRemoveShippingRateChangeImpl(change, zone, previousValue);
    }

    /**
     * factory method for an instance of ShippingMethodRemoveShippingRateChangeBuilder
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateChangeBuilder of() {
        return new ShippingMethodRemoveShippingRateChangeBuilder();
    }

    /**
     * create builder for ShippingMethodRemoveShippingRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateChangeBuilder of(
            final ShippingMethodRemoveShippingRateChange template) {
        ShippingMethodRemoveShippingRateChangeBuilder builder = new ShippingMethodRemoveShippingRateChangeBuilder();
        builder.change = template.getChange();
        builder.zone = template.getZone();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
