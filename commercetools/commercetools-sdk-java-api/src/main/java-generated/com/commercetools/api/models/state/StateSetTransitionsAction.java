
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

    /**
    *  <p>Value to set.
    *  If empty, any existing value will be removed.</p>
    *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>).
    *  When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
    *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed.
    *  If <code>transitions</code> is not set, the validation is turned off.</p>
    *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
    */
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

    public static com.fasterxml.jackson.core.type.TypeReference<StateSetTransitionsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateSetTransitionsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateSetTransitionsAction>";
            }
        };
    }
}
