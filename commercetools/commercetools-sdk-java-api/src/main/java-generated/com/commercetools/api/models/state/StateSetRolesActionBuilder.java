
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StateSetRolesActionBuilder implements Builder<StateSetRolesAction> {

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    public StateSetRolesActionBuilder roles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    public StateSetRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public StateSetRolesActionBuilder plusRoles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    public StateSetRolesAction build() {
        Objects.requireNonNull(roles, StateSetRolesAction.class + ": roles is missing");
        return new StateSetRolesActionImpl(roles);
    }

    /**
     * builds StateSetRolesAction without checking for non null required values
     */
    public StateSetRolesAction buildUnchecked() {
        return new StateSetRolesActionImpl(roles);
    }

    public static StateSetRolesActionBuilder of() {
        return new StateSetRolesActionBuilder();
    }

    public static StateSetRolesActionBuilder of(final StateSetRolesAction template) {
        StateSetRolesActionBuilder builder = new StateSetRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
