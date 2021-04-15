
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateSetRolesActionBuilder {

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

    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    public StateSetRolesAction build() {
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
