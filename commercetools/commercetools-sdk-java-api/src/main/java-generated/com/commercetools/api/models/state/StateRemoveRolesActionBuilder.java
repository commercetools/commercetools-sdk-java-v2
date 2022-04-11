
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StateRemoveRolesActionBuilder implements Builder<StateRemoveRolesAction> {

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    public StateRemoveRolesActionBuilder roles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    public StateRemoveRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public StateRemoveRolesActionBuilder plusRoles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    public StateRemoveRolesAction build() {
        Objects.requireNonNull(roles, StateRemoveRolesAction.class + ": roles is missing");
        return new StateRemoveRolesActionImpl(roles);
    }

    /**
     * builds StateRemoveRolesAction without checking for non null required values
     */
    public StateRemoveRolesAction buildUnchecked() {
        return new StateRemoveRolesActionImpl(roles);
    }

    public static StateRemoveRolesActionBuilder of() {
        return new StateRemoveRolesActionBuilder();
    }

    public static StateRemoveRolesActionBuilder of(final StateRemoveRolesAction template) {
        StateRemoveRolesActionBuilder builder = new StateRemoveRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
