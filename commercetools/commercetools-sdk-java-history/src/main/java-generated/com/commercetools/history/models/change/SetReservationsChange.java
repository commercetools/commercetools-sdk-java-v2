
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reservation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetReservationsChangeImpl.class)
public interface SetReservationsChange extends Change {

    String SET_RESERVATIONS_CHANGE = "SetReservationsChange";

    /**
    *  <p>Update action for <code>setReservations</code> on inventories</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reservation> getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reservation> getPreviousValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setNextValue(final Reservation... nextValue);

    public void setNextValue(final List<Reservation> nextValue);

    @JsonIgnore
    public void setPreviousValue(final Reservation... previousValue);

    public void setPreviousValue(final List<Reservation> previousValue);

    public static SetReservationsChange of() {
        return new SetReservationsChangeImpl();
    }

    public static SetReservationsChange of(final SetReservationsChange template) {
        SetReservationsChangeImpl instance = new SetReservationsChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetReservationsChangeBuilder builder() {
        return SetReservationsChangeBuilder.of();
    }

    public static SetReservationsChangeBuilder builder(final SetReservationsChange template) {
        return SetReservationsChangeBuilder.of(template);
    }

    default <T> T withSetReservationsChange(Function<SetReservationsChange, T> helper) {
        return helper.apply(this);
    }
}
