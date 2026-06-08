
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.ParcelMeasurements;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetParcelMeasurementsAction" rel="nofollow">SetParcelMeasurements</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetParcelMeasurementsAction" rel="nofollow">SetParcelMeasurements</a> on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelMeasurementsChange setParcelMeasurementsChange = SetParcelMeasurementsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetParcelMeasurementsChange")
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
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ParcelMeasurements getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ParcelMeasurements getNextValue();

    /**
     *  <p>Information about the updated Parcel.</p>
     * @return parcel
     */
    @NotNull
    @Valid
    @JsonProperty("parcel")
    public ParcelChangeValue getParcel();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ParcelMeasurements previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ParcelMeasurements nextValue);

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param parcel value to be set
     */

    public void setParcel(final ParcelChangeValue parcel);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setParcel(template.getParcel());
        return instance;
    }

    public SetParcelMeasurementsChange copyDeep();

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
        instance.setPreviousValue(
            com.commercetools.history.models.common.ParcelMeasurements.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.ParcelMeasurements.deepCopy(template.getNextValue()));
        instance.setParcel(
            com.commercetools.history.models.change_value.ParcelChangeValue.deepCopy(template.getParcel()));
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
