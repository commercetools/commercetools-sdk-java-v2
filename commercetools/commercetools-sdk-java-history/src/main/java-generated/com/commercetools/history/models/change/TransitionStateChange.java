
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
@JsonDeserialize(as = TransitionStateChangeImpl.class)
public interface TransitionStateChange extends Change {

    String TRANSITION_STATE_CHANGE = "TransitionStateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>transitionState</code></p>
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

    public static TransitionStateChange of() {
        return new TransitionStateChangeImpl();
    }

    public static TransitionStateChange of(final TransitionStateChange template) {
        TransitionStateChangeImpl instance = new TransitionStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static TransitionStateChangeBuilder builder() {
        return TransitionStateChangeBuilder.of();
    }

    public static TransitionStateChangeBuilder builder(final TransitionStateChange template) {
        return TransitionStateChangeBuilder.of(template);
    }

    default <T> T withTransitionStateChange(Function<TransitionStateChange, T> helper) {
        return helper.apply(this);
    }
}
