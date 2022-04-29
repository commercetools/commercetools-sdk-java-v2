
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetParcelTrackingDataChangeImpl.class)
public interface SetParcelTrackingDataChange extends Change {

    String SET_PARCEL_TRACKING_DATA_CHANGE = "SetParcelTrackingDataChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setParcelTrackingData</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("parcel")
    public ParcelChangeValue getParcel();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TrackingData getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TrackingData getPreviousValue();

    public void setChange(final String change);

    public void setParcel(final ParcelChangeValue parcel);

    public void setNextValue(final TrackingData nextValue);

    public void setPreviousValue(final TrackingData previousValue);

    public static SetParcelTrackingDataChange of() {
        return new SetParcelTrackingDataChangeImpl();
    }

    public static SetParcelTrackingDataChange of(final SetParcelTrackingDataChange template) {
        SetParcelTrackingDataChangeImpl instance = new SetParcelTrackingDataChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(template.getParcel());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetParcelTrackingDataChangeBuilder builder() {
        return SetParcelTrackingDataChangeBuilder.of();
    }

    public static SetParcelTrackingDataChangeBuilder builder(final SetParcelTrackingDataChange template) {
        return SetParcelTrackingDataChangeBuilder.of(template);
    }

    default <T> T withSetParcelTrackingDataChange(Function<SetParcelTrackingDataChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelTrackingDataChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelTrackingDataChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelTrackingDataChange>";
            }
        };
    }
}
