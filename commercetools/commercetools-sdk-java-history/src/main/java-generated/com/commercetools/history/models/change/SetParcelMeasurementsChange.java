
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.ParcelMeasurements;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetParcelMeasurementsChangeImpl.class)
public interface SetParcelMeasurementsChange extends Change {

    String SET_PARCEL_MEASUREMENTS_CHANGE = "SetParcelMeasurementsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setParcelMeasurements</code></p>
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
    public ParcelMeasurements getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ParcelMeasurements getPreviousValue();

    public void setChange(final String change);

    public void setParcel(final ParcelChangeValue parcel);

    public void setNextValue(final ParcelMeasurements nextValue);

    public void setPreviousValue(final ParcelMeasurements previousValue);

    public static SetParcelMeasurementsChange of() {
        return new SetParcelMeasurementsChangeImpl();
    }

    public static SetParcelMeasurementsChange of(final SetParcelMeasurementsChange template) {
        SetParcelMeasurementsChangeImpl instance = new SetParcelMeasurementsChangeImpl();
        instance.setChange(template.getChange());
        instance.setParcel(template.getParcel());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetParcelMeasurementsChangeBuilder builder() {
        return SetParcelMeasurementsChangeBuilder.of();
    }

    public static SetParcelMeasurementsChangeBuilder builder(final SetParcelMeasurementsChange template) {
        return SetParcelMeasurementsChangeBuilder.of(template);
    }

    default <T> T withSetParcelMeasurementsChange(Function<SetParcelMeasurementsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetParcelMeasurementsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetParcelMeasurementsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetParcelMeasurementsChange>";
            }
        };
    }
}
