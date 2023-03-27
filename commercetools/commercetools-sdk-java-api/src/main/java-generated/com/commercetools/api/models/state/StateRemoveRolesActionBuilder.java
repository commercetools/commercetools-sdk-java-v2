
package com.commercetools.api.models.state;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateRemoveRolesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateRemoveRolesAction stateRemoveRolesAction = StateRemoveRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateRemoveRolesActionBuilder implements Builder<StateRemoveRolesAction> {

    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    /**
     *  <p>Roles to remove from the State.</p>
     * @param roles value to be set
     * @return Builder
     */

    public StateRemoveRolesActionBuilder roles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles to remove from the State.</p>
     * @param roles value to be set
     * @return Builder
     */

    public StateRemoveRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Roles to remove from the State.</p>
     * @param roles value to be set
     * @return Builder
     */

    public StateRemoveRolesActionBuilder plusRoles(final com.commercetools.api.models.state.StateRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles to remove from the State.</p>
     * @return roles
     */

    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles() {
        return this.roles;
    }

    /**
     * builds StateRemoveRolesAction with checking for non-null required values
     * @return StateRemoveRolesAction
     */
    public StateRemoveRolesAction build() {
        Objects.requireNonNull(roles, StateRemoveRolesAction.class + ": roles is missing");
        return new StateRemoveRolesActionImpl(roles);
    }

    /**
     * builds StateRemoveRolesAction without checking for non-null required values
     * @return StateRemoveRolesAction
     */
    public StateRemoveRolesAction buildUnchecked() {
        return new StateRemoveRolesActionImpl(roles);
    }

    /**
     * factory method for an instance of StateRemoveRolesActionBuilder
     * @return builder
     */
    public static StateRemoveRolesActionBuilder of() {
        return new StateRemoveRolesActionBuilder();
    }

    /**
     * create builder for StateRemoveRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateRemoveRolesActionBuilder of(final StateRemoveRolesAction template) {
        StateRemoveRolesActionBuilder builder = new StateRemoveRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
