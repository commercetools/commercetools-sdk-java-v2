
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateRemoveRolesActionImpl implements StateRemoveRolesAction {

    private String action;

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    @JsonCreator
    StateRemoveRolesActionImpl(
            @JsonProperty("roles") final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        this.action = REMOVE_ROLES;
    }

    public StateRemoveRolesActionImpl() {
        this.action = REMOVE_ROLES;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    public void setRoles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    public void setRoles(final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StateRemoveRolesActionImpl that = (StateRemoveRolesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(roles, that.roles).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(roles).toHashCode();
    }

}
