
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
@JsonDeserialize(as = SetTransitionsChangeImpl.class)
public interface SetTransitionsChange extends Change {

    String SET_TRANSITIONS_CHANGE = "SetTransitionsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setTransitions</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    public void setPreviousValue(final List<Reference> previousValue);

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    public void setNextValue(final List<Reference> nextValue);

    public static SetTransitionsChange of() {
        return new SetTransitionsChangeImpl();
    }

    public static SetTransitionsChange of(final SetTransitionsChange template) {
        SetTransitionsChangeImpl instance = new SetTransitionsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetTransitionsChangeBuilder builder() {
        return SetTransitionsChangeBuilder.of();
    }

    public static SetTransitionsChangeBuilder builder(final SetTransitionsChange template) {
        return SetTransitionsChangeBuilder.of(template);
    }

    default <T> T withSetTransitionsChange(Function<SetTransitionsChange, T> helper) {
        return helper.apply(this);
    }
}
