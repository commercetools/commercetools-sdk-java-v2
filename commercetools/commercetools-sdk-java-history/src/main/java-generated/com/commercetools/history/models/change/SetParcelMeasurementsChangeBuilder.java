
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetParcelMeasurementsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelMeasurementsChange setParcelMeasurementsChange = SetParcelMeasurementsChange.builder()
 *             .change("{change}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelMeasurementsChangeBuilder implements Builder<SetParcelMeasurementsChange> {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private com.commercetools.history.models.common.ParcelMeasurements nextValue;

    private com.commercetools.history.models.common.ParcelMeasurements previousValue;

    /**
     *  <p>Update action for <code>setParcelMeasurements</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the parcel using the builder function
     * @param builder function to build the parcel value
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder parcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValueBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the parcel using the builder function
     * @param builder function to build the parcel value
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder withParcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValue> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of());
        return this;
    }

    /**
     * set the value to the parcel
     * @param parcel value to be set
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurementsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurements> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ParcelMeasurements nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurementsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ParcelMeasurementsBuilder, com.commercetools.history.models.common.ParcelMeasurements> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ParcelMeasurementsBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetParcelMeasurementsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ParcelMeasurements previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setParcelMeasurements</code></p>
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

    public com.commercetools.history.models.common.ParcelMeasurements getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.ParcelMeasurements getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetParcelMeasurementsChange with checking for non-null required values
     * @return SetParcelMeasurementsChange
     */
    public SetParcelMeasurementsChange build() {
        Objects.requireNonNull(change, SetParcelMeasurementsChange.class + ": change is missing");
        Objects.requireNonNull(parcel, SetParcelMeasurementsChange.class + ": parcel is missing");
        Objects.requireNonNull(nextValue, SetParcelMeasurementsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetParcelMeasurementsChange.class + ": previousValue is missing");
        return new SetParcelMeasurementsChangeImpl(change, parcel, nextValue, previousValue);
    }

    /**
     * builds SetParcelMeasurementsChange without checking for non-null required values
     * @return SetParcelMeasurementsChange
     */
    public SetParcelMeasurementsChange buildUnchecked() {
        return new SetParcelMeasurementsChangeImpl(change, parcel, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetParcelMeasurementsChangeBuilder
     * @return builder
     */
    public static SetParcelMeasurementsChangeBuilder of() {
        return new SetParcelMeasurementsChangeBuilder();
    }

    /**
     * create builder for SetParcelMeasurementsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelMeasurementsChangeBuilder of(final SetParcelMeasurementsChange template) {
        SetParcelMeasurementsChangeBuilder builder = new SetParcelMeasurementsChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
