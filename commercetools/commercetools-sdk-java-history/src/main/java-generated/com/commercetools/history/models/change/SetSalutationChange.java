
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetSalutationChangeImpl.class)
public interface SetSalutationChange extends Change {

    String SET_SALUTATION_CHANGE = "SetSalutationChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setSalutation</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetSalutationChange of() {
        return new SetSalutationChangeImpl();
    }

    public static SetSalutationChange of(final SetSalutationChange template) {
        SetSalutationChangeImpl instance = new SetSalutationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetSalutationChangeBuilder builder() {
        return SetSalutationChangeBuilder.of();
    }

    public static SetSalutationChangeBuilder builder(final SetSalutationChange template) {
        return SetSalutationChangeBuilder.of(template);
    }

    default <T> T withSetSalutationChange(Function<SetSalutationChange, T> helper) {
        return helper.apply(this);
    }
}
