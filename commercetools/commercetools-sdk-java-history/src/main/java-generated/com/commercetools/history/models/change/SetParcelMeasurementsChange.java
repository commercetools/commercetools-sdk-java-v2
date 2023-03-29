
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.ParcelMeasurements;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetParcelMeasurementsChange
 *
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
@JsonDeserialize(as = SetParcelMeasurementsChangeImpl.class)
public interface SetParcelMeasurementsChange extends Change {

    /**
     * discriminator value for SetParcelMeasurementsChange
     */
    String SET_PARCEL_MEASUREMENTS_CHANGE = "SetParcelMeasurementsChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setParcelMeasurements</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return parcel
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public ParcelChangeValue getParcel();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ParcelMeasurements getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ParcelMeasurements getPreviousValue();

    /**
     *  <p>Update action for <code>setParcelMeasurements</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set parcel
     * @param parcel value to be set
     */

    public void setParcel(final ParcelChangeValue parcel);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ParcelMeasurements nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ParcelMeasurements previousValue);

    /**
     * factory method
     * @return instance of SetParcelMeasurementsChange
     */
    public static SetParcelMeasurementsChange of() {
        return new SetParcelMeasurementsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetParcelMeasurementsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetParcelMeasurementsChange of(final SetParcelMeasurementsChange template) {
        SetParcelMeasurementsChangeImpl instance = new SetParcelMeasurementsChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(template.getParcel());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetParcelMeasurementsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetParcelMeasurementsChange deepCopy(@Nullable final SetParcelMeasurementsChange template) {
        if (template == null) {
            return null;
        }
        SetParcelMeasurementsChangeImpl instance = new SetParcelMeasurementsChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(Optional.ofNullable(template.getParcel())
                .map(com.commercetools.history.models.change_value.ParcelChangeValue::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.ParcelMeasurements::deepCopy)
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.ParcelMeasurements::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetParcelMeasurementsChange
     * @return builder
     */
    public static SetParcelMeasurementsChangeBuilder builder() {
        return SetParcelMeasurementsChangeBuilder.of();
    }

    /**
     * create builder for SetParcelMeasurementsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelMeasurementsChangeBuilder builder(final SetParcelMeasurementsChange template) {
        return SetParcelMeasurementsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetParcelMeasurementsChange(Function<SetParcelMeasurementsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelMeasurementsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelMeasurementsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelMeasurementsChange>";
            }
        };
    }
}
