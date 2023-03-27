
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetGeoLocationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetGeoLocationChange setGeoLocationChange = SetGeoLocationChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetGeoLocationChangeBuilder implements Builder<SetGeoLocationChange> {

    private String change;

    private com.commercetools.history.models.common.GeoLocation nextValue;

    private com.commercetools.history.models.common.GeoLocation previousValue;

    /**
     *  <p>Update action for <code>setGeoLocation</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetGeoLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetGeoLocationChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.GeoLocationBuilder, com.commercetools.history.models.common.GeoLocationBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.GeoLocationBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetGeoLocationChangeBuilder nextValue(final com.commercetools.history.models.common.GeoLocation nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetGeoLocationChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.GeoLocationBuilder, com.commercetools.history.models.common.GeoLocationBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.GeoLocationBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetGeoLocationChangeBuilder previousValue(
            final com.commercetools.history.models.common.GeoLocation previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setGeoLocation</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.GeoLocation getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.GeoLocation getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetGeoLocationChange with checking for non-null required values
     * @return SetGeoLocationChange
     */
    public SetGeoLocationChange build() {
        Objects.requireNonNull(change, SetGeoLocationChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetGeoLocationChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetGeoLocationChange.class + ": previousValue is missing");
        return new SetGeoLocationChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetGeoLocationChange without checking for non-null required values
     * @return SetGeoLocationChange
     */
    public SetGeoLocationChange buildUnchecked() {
        return new SetGeoLocationChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetGeoLocationChangeBuilder
     * @return builder
     */
    public static SetGeoLocationChangeBuilder of() {
        return new SetGeoLocationChangeBuilder();
    }

    /**
     * create builder for SetGeoLocationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetGeoLocationChangeBuilder of(final SetGeoLocationChange template) {
        SetGeoLocationChangeBuilder builder = new SetGeoLocationChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
