
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateSetTransitionsActionImpl.class)
public interface StateSetTransitionsAction extends StateUpdateAction {

    String SET_TRANSITIONS = "setTransitions";

    @Valid
    @JsonProperty("transitions")
    public List<StateResourceIdentifier> getTransitions();

    @JsonIgnore
    public void setTransitions(final StateResourceIdentifier... transitions);

    public void setTransitions(final List<StateResourceIdentifier> transitions);

    public static StateSetTransitionsAction of() {
        return new StateSetTransitionsActionImpl();
    }

    public static StateSetTransitionsAction of(final StateSetTransitionsAction template) {
        StateSetTransitionsActionImpl instance = new StateSetTransitionsActionImpl();
        instance.setTransitions(template.getTransitions());
        return instance;
    }

    public static StateSetTransitionsActionBuilder builder() {
        return StateSetTransitionsActionBuilder.of();
    }

    public static StateSetTransitionsActionBuilder builder(final StateSetTransitionsAction template) {
        return StateSetTransitionsActionBuilder.of(template);
    }

    default <T> T withStateSetTransitionsAction(Function<StateSetTransitionsAction, T> helper) {
        return helper.apply(this);
    }
}
