
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
public class StateDraftImpl implements StateDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.state.StateTypeEnum type;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private Boolean initial;

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    private java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions;

    @JsonCreator
    StateDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("initial") final Boolean initial,
            @JsonProperty("roles") final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles,
            @JsonProperty("transitions") final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.key = key;
        this.type = type;
        this.name = name;
        this.description = description;
        this.initial = initial;
        this.roles = roles;
        this.transitions = transitions;
    }

    public StateDraftImpl() {
    }

    /**
    *  <p>User-defined unique identifier for the State.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Specify to which resource or object type the State is assigned to.</p>
    */
    public com.commercetools.api.models.state.StateTypeEnum getType() {
        return this.type;
    }

    /**
    *  <p>Name of the State.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>Description of the State.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>Set to <code>false</code> if the State is not the first step in a workflow.</p>
    */
    public Boolean getInitial() {
        return this.initial;
    }

    /**
    *  <p>If suitable, assign predifined roles the State can fulfill in case the State's <code>type</code> is <code>LineItemState</code> or <code>ReviewState</code>.</p>
    */
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    /**
    *  <p>Define the list of States of the same <code>type</code> to which the current State can be transitioned to.</p>
    *  <ul>
    *  <li>If, for example, the current State is the <em>Initial</em> State of <a href="ctp:api:type:StateTypeEnum">StateType</a> <code>OrderState</code> and you want to allow the transition <em>Initial</em> -&gt; <em>Shipped</em>, then add the <a href="ctp:api:type:StateResourceIdentifier">StateResourceIdentifier</a> to the <em>Shipped</em> <code>OrderState</code> to this list.</li>
    *  <li>Set to empty list for not allowing any transition from the current State and defining it as final State for a workflow.</li>
    *  <li>Do not set this field at all to turn off validation and allowing transitions to any other State of the same <code>type</code> as the current State.</li>
    *  </ul>
    */
    public java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> getTransitions() {
        return this.transitions;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setType(final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setInitial(final Boolean initial) {
        this.initial = initial;
    }

    public void setRoles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    public void setRoles(final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
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

        StateDraftImpl that = (StateDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(type, that.type)
                .append(name, that.name)
                .append(description, that.description)
                .append(initial, that.initial)
                .append(roles, that.roles)
                .append(transitions, that.transitions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(type)
                .append(name)
                .append(description)
                .append(initial)
                .append(roles)
                .append(transitions)
                .toHashCode();
    }

}
