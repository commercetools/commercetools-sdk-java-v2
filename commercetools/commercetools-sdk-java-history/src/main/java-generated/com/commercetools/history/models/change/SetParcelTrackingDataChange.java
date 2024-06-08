
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Parcel Tracking Data on Orders.</li>
 *   <li>Set Parcel Tracking Data on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelTrackingDataChange setParcelTrackingDataChange = SetParcelTrackingDataChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetParcelTrackingDataChangeImpl.class)
public interface SetParcelTrackingDataChange extends Change {

    /**
     * discriminator value for SetParcelTrackingDataChange
     */
    String SET_PARCEL_TRACKING_DATA_CHANGE = "SetParcelTrackingDataChange";

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
    public TrackingData getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TrackingData getNextValue();

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

    public void setPreviousValue(final TrackingData previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final TrackingData nextValue);

    /**
     *  <p>Information about the updated Parcel.</p>
     * @param parcel value to be set
     */

    public void setParcel(final ParcelChangeValue parcel);

    /**
     * factory method
     * @return instance of SetParcelTrackingDataChange
     */
    public static SetParcelTrackingDataChange of() {
        return new SetParcelTrackingDataChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetParcelTrackingDataChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetParcelTrackingDataChange of(final SetParcelTrackingDataChange template) {
        SetParcelTrackingDataChangeImpl instance = new SetParcelTrackingDataChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setParcel(template.getParcel());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetParcelTrackingDataChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetParcelTrackingDataChange deepCopy(@Nullable final SetParcelTrackingDataChange template) {
        if (template == null) {
            return null;
        }
        SetParcelTrackingDataChangeImpl instance = new SetParcelTrackingDataChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.TrackingData.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.TrackingData.deepCopy(template.getNextValue()));
        instance.setParcel(
            com.commercetools.history.models.change_value.ParcelChangeValue.deepCopy(template.getParcel()));
        return instance;
    }

    /**
     * builder factory method for SetParcelTrackingDataChange
     * @return builder
     */
    public static SetParcelTrackingDataChangeBuilder builder() {
        return SetParcelTrackingDataChangeBuilder.of();
    }

    /**
     * create builder for SetParcelTrackingDataChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelTrackingDataChangeBuilder builder(final SetParcelTrackingDataChange template) {
        return SetParcelTrackingDataChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetParcelTrackingDataChange(Function<SetParcelTrackingDataChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelTrackingDataChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelTrackingDataChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelTrackingDataChange>";
            }
        };
    }
}
