
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetTargetChangeImpl.class)
public interface SetTargetChange extends Change {

    String SET_TARGET_CHANGE = "SetTargetChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setTarget</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static SetTargetChange of() {
        return new SetTargetChangeImpl();
    }

    public static SetTargetChange of(final SetTargetChange template) {
        SetTargetChangeImpl instance = new SetTargetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetTargetChangeBuilder builder() {
        return SetTargetChangeBuilder.of();
    }

    public static SetTargetChangeBuilder builder(final SetTargetChange template) {
        return SetTargetChangeBuilder.of(template);
    }

    default <T> T withSetTargetChange(Function<SetTargetChange, T> helper) {
        return helper.apply(this);
    }
}
