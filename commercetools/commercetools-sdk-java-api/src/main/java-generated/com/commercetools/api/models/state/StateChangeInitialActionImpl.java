
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
public class StateChangeInitialActionImpl implements StateChangeInitialAction, ModelBase {

    private String action;

    private Boolean initial;

    @JsonCreator
    StateChangeInitialActionImpl(@JsonProperty("initial") final Boolean initial) {
        this.initial = initial;
        this.action = CHANGE_INITIAL;
    }

    public StateChangeInitialActionImpl() {
        this.action = CHANGE_INITIAL;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Set to <code>true</code> for defining the State as initial State in a state machine and making it the first step in a workflow.</p>
    */
    public Boolean getInitial() {
        return this.initial;
    }

    public void setInitial(final Boolean initial) {
        this.initial = initial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StateChangeInitialActionImpl that = (StateChangeInitialActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(initial, that.initial).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(initial).toHashCode();
    }

}
