
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetParcelTrackingDataChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelTrackingDataChange setParcelTrackingDataChange = SetParcelTrackingDataChange.builder()
 *             .change("{change}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelTrackingDataChangeBuilder implements Builder<SetParcelTrackingDataChange> {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private com.commercetools.history.models.common.TrackingData nextValue;

    private com.commercetools.history.models.common.TrackingData previousValue;

    /**
     *  <p>Update action for <code>setParcelTrackingData</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetParcelTrackingDataChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the parcel using the builder function
     * @param builder function to build the parcel value
     * @return Builder
     */

    public SetParcelTrackingDataChangeBuilder parcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValueBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the parcel
     * @param parcel value to be set
     * @return Builder
     */

    public SetParcelTrackingDataChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetParcelTrackingDataChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TrackingDataBuilder, com.commercetools.history.models.common.TrackingDataBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetParcelTrackingDataChangeBuilder nextValue(
            final com.commercetools.history.models.common.TrackingData nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetParcelTrackingDataChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TrackingDataBuilder, com.commercetools.history.models.common.TrackingDataBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TrackingDataBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetParcelTrackingDataChangeBuilder previousValue(
            final com.commercetools.history.models.common.TrackingData previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setParcelTrackingData</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of parcel}
     * @return parcel
     */

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.TrackingData getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.TrackingData getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetParcelTrackingDataChange with checking for non-null required values
     * @return SetParcelTrackingDataChange
     */
    public SetParcelTrackingDataChange build() {
        Objects.requireNonNull(change, SetParcelTrackingDataChange.class + ": change is missing");
        Objects.requireNonNull(parcel, SetParcelTrackingDataChange.class + ": parcel is missing");
        Objects.requireNonNull(nextValue, SetParcelTrackingDataChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetParcelTrackingDataChange.class + ": previousValue is missing");
        return new SetParcelTrackingDataChangeImpl(change, parcel, nextValue, previousValue);
    }

    /**
     * builds SetParcelTrackingDataChange without checking for non-null required values
     * @return SetParcelTrackingDataChange
     */
    public SetParcelTrackingDataChange buildUnchecked() {
        return new SetParcelTrackingDataChangeImpl(change, parcel, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetParcelTrackingDataChangeBuilder
     * @return builder
     */
    public static SetParcelTrackingDataChangeBuilder of() {
        return new SetParcelTrackingDataChangeBuilder();
    }

    /**
     * create builder for SetParcelTrackingDataChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelTrackingDataChangeBuilder of(final SetParcelTrackingDataChange template) {
        SetParcelTrackingDataChangeBuilder builder = new SetParcelTrackingDataChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
