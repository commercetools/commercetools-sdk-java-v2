
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
public class StateImpl implements State, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.state.StateTypeEnum type;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private Boolean initial;

    private Boolean builtIn;

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    private java.util.List<com.commercetools.api.models.state.StateReference> transitions;

    @JsonCreator
    StateImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("initial") final Boolean initial, @JsonProperty("builtIn") final Boolean builtIn,
            @JsonProperty("roles") final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles,
            @JsonProperty("transitions") final java.util.List<com.commercetools.api.models.state.StateReference> transitions) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.type = type;
        this.name = name;
        this.description = description;
        this.initial = initial;
        this.builtIn = builtIn;
        this.roles = roles;
        this.transitions = transitions;
    }

    public StateImpl() {
    }

    /**
    *  <p>Unique ID of the State.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Current version of the State.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>Date and time (UTC) the State was initially created.</p>
    */
    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
    *  <p>Date and time (UTC) the State was last updated.</p>
    */
    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
    *  <p>User-defined unique identifier for the State.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Indicates to which resource or object types the State is assigned to.</p>
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
    *  <p><code>true</code> for an initial State, the first State in a workflow.</p>
    */
    public Boolean getInitial() {
        return this.initial;
    }

    /**
    *  <p><code>true</code> for States that are an integral part of the <a href="ctp:api:type:Project">Project</a>. Those States cannot be deleted and their <code>key</code> cannot be changed.</p>
    */
    public Boolean getBuiltIn() {
        return this.builtIn;
    }

    /**
    *  <p>Roles the State can fulfill for <a href="ctp:api:type:Review">Reviews</a> and <a href="ctp:api:type:LineItem">Line Items</a>.</p>
    */
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    /**
    *  <ul>
    *  <li>list of States of the same <code>type</code> that the current State can be transitioned to. For example, when the current State is the <em>Initial</em> State of <a href="ctp:api:type:StateTypeEnum">StateType</a> <code>OrderState</code> and this list contains the reference to the <em>Shipped</em> <code>OrderState</code>, the transition <em>Initial</em> -&gt; <em>Shipped</em> is allowed.</li>
    *  <li>if empty, no transitions are allowed from the current State, defining the current State as final for this workflow.</li>
    *  <li>if not set, the validation is turned off and the current State can be transitioned to any other State of the same <code>type</code> as the current State.</li>
    *  </ul>
    */
    public java.util.List<com.commercetools.api.models.state.StateReference> getTransitions() {
        return this.transitions;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
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

    public void setBuiltIn(final Boolean builtIn) {
        this.builtIn = builtIn;
    }

    public void setRoles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    public void setRoles(final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
    }

    public void setTransitions(final com.commercetools.api.models.state.StateReference... transitions) {
        this.transitions = new ArrayList<>(Arrays.asList(transitions));
    }

    public void setTransitions(final java.util.List<com.commercetools.api.models.state.StateReference> transitions) {
        this.transitions = transitions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StateImpl that = (StateImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(type, that.type)
                .append(name, that.name)
                .append(description, that.description)
                .append(initial, that.initial)
                .append(builtIn, that.builtIn)
                .append(roles, that.roles)
                .append(transitions, that.transitions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(type)
                .append(name)
                .append(description)
                .append(initial)
                .append(builtIn)
                .append(roles)
                .append(transitions)
                .toHashCode();
    }

}
