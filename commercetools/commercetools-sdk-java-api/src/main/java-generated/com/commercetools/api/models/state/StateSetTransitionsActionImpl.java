
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StateSetTransitionsActionImpl implements StateSetTransitionsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions;

    @JsonCreator
    StateSetTransitionsActionImpl(
            @JsonProperty("transitions") final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.transitions = transitions;
        this.action = SET_TRANSITIONS;
    }

    public StateSetTransitionsActionImpl() {
        this.action = SET_TRANSITIONS;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Value to set.
    *  If empty, any existing value will be removed.</p>
    *  <p>Possible transformations of the current State to other States of the same <code>type</code> (for example, <em>Initial</em> -&gt; <em>Shipped</em>).
    *  When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced State must have a transition to the new State.</p>
    *  <p>If <code>transitions</code> is an empty list, it means the current State is a final State and no further transitions are allowed.
    *  If <code>transitions</code> is not set, the validation is turned off.</p>
    *  <p>When performing a <code>transitionState</code> update action, any other State of the same <code>type</code> can be transitioned to.</p>
    */
    public java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> getTransitions() {
        return this.transitions;
    }

    public void setTransitions(final com.commercetools.api.models.state.StateResourceIdentifier... transitions) {
        this.transitions = new ArrayList<>(Arrays.asList(transitions));
    }

    public void setTransitions(
            final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.transitions = transitions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StateSetTransitionsActionImpl that = (StateSetTransitionsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(transitions, that.transitions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(transitions).toHashCode();
    }

}
