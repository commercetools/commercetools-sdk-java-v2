
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetParcelCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelCustomTypeChange setParcelCustomTypeChange = SetParcelCustomTypeChange.builder()
 *             .change("{change}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelCustomTypeChangeBuilder implements Builder<SetParcelCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder parcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValueBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param builder function to build the parcel value
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder withParcel(
            Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValue> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param parcel value to be set
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder parcel(
            final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetParcelCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
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
     *  <p>Information about the updated Parcel.</p>
     * @return parcel
     */

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetParcelCustomTypeChange with checking for non-null required values
     * @return SetParcelCustomTypeChange
     */
    public SetParcelCustomTypeChange build() {
        Objects.requireNonNull(change, SetParcelCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(parcel, SetParcelCustomTypeChange.class + ": parcel is missing");
        Objects.requireNonNull(previousValue, SetParcelCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetParcelCustomTypeChange.class + ": nextValue is missing");
        return new SetParcelCustomTypeChangeImpl(change, parcel, previousValue, nextValue);
    }

    /**
     * builds SetParcelCustomTypeChange without checking for non-null required values
     * @return SetParcelCustomTypeChange
     */
    public SetParcelCustomTypeChange buildUnchecked() {
        return new SetParcelCustomTypeChangeImpl(change, parcel, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetParcelCustomTypeChangeBuilder
     * @return builder
     */
    public static SetParcelCustomTypeChangeBuilder of() {
        return new SetParcelCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetParcelCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelCustomTypeChangeBuilder of(final SetParcelCustomTypeChange template) {
        SetParcelCustomTypeChangeBuilder builder = new SetParcelCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
