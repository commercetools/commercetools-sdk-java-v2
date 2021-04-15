
package com.commercetools.api.models.state;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateImpl.class)
public interface State extends BaseResource, com.commercetools.api.models.DomainResource<State> {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>A unique identifier for the state.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("type")
    public StateTypeEnum getType();

    /**
    *  <p>A human-readable name of the state.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>A human-readable description of the state.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>A state can be declared as an initial state for any state machine.
    *  When a workflow starts, this first state must be an <code>initial</code> state.</p>
    */
    @NotNull
    @JsonProperty("initial")
    public Boolean getInitial();

    /**
    *  <p>Builtin states are integral parts of the project that cannot be deleted nor the key can be changed.</p>
    */
    @NotNull
    @JsonProperty("builtIn")
    public Boolean getBuiltIn();

    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
    *  <p>Transitions are a way to describe possible transformations of the current state to other states of the same <code>type</code> (e.g.: <em>Initial</em> -&gt; <em>Shipped</em>).
    *  When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced state must have a transition to the new state.
    *  If <code>transitions</code> is an empty list, it means the current state is a final state and no further transitions are allowed.
    *  If <code>transitions</code> is not set, the validation is turned off.
    *  When performing a <code>transitionState</code> update action, any other state of the same <code>type</code> can be transitioned to.</p>
    */
    @Valid
    @JsonProperty("transitions")
    public List<StateReference> getTransitions();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setType(final StateTypeEnum type);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setInitial(final Boolean initial);

    public void setBuiltIn(final Boolean builtIn);

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    public void setRoles(final List<StateRoleEnum> roles);

    @JsonIgnore
    public void setTransitions(final StateReference... transitions);

    public void setTransitions(final List<StateReference> transitions);

    public static State of() {
        return new StateImpl();
    }

    public static State of(final State template) {
        StateImpl instance = new StateImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setInitial(template.getInitial());
        instance.setBuiltIn(template.getBuiltIn());
        instance.setRoles(template.getRoles());
        instance.setTransitions(template.getTransitions());
        return instance;
    }

    public static StateBuilder builder() {
        return StateBuilder.of();
    }

    public static StateBuilder builder(final State template) {
        return StateBuilder.of(template);
    }

    default <T> T withState(Function<State, T> helper) {
        return helper.apply(this);
    }
}
