
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetRestockableInDaysChangeImpl.class)
public interface SetRestockableInDaysChange extends Change {

    String SET_RESTOCKABLE_IN_DAYS_CHANGE = "SetRestockableInDaysChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setRestockableInDays</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Integer previousValue);

    public void setNextValue(final Integer nextValue);

    public static SetRestockableInDaysChange of() {
        return new SetRestockableInDaysChangeImpl();
    }

    public static SetRestockableInDaysChange of(final SetRestockableInDaysChange template) {
        SetRestockableInDaysChangeImpl instance = new SetRestockableInDaysChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetRestockableInDaysChangeBuilder builder() {
        return SetRestockableInDaysChangeBuilder.of();
    }

    public static SetRestockableInDaysChangeBuilder builder(final SetRestockableInDaysChange template) {
        return SetRestockableInDaysChangeBuilder.of(template);
    }

    default <T> T withSetRestockableInDaysChange(Function<SetRestockableInDaysChange, T> helper) {
        return helper.apply(this);
    }
}
