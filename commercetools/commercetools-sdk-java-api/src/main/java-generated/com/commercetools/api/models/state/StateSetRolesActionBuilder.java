
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateSetRolesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateSetRolesAction stateSetRolesAction = StateSetRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateSetRolesActionBuilder implements Builder<StateSetRolesAction> {

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public StateSetRolesActionBuilder roles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public StateSetRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

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
