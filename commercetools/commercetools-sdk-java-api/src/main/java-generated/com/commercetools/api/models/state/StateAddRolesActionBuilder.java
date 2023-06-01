package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateAddRolesAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateAddRolesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateAddRolesAction stateAddRolesAction = StateAddRolesAction.builder()
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateAddRolesActionBuilder implements Builder<StateAddRolesAction> {

    
    
    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    /**
     *  <p>Value to append to the array.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public StateAddRolesActionBuilder roles( final com.commercetools.api.models.state.StateRoleEnum ...roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }
    
    /**
     *  <p>Value to append to the array.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public StateAddRolesActionBuilder roles( final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        return this;
    }
    
    /**
     *  <p>Value to append to the array.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public StateAddRolesActionBuilder plusRoles( final com.commercetools.api.models.state.StateRoleEnum ...roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }
    
    
    

    /**
     *  <p>Value to append to the array.</p>
     * @return roles
     */
    
    
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles(){
        return this.roles;
    }

    /**
     * builds StateAddRolesAction with checking for non-null required values
     * @return StateAddRolesAction
     */
    public StateAddRolesAction build() {
        Objects.requireNonNull(roles, StateAddRolesAction.class + ": roles is missing");
        return new StateAddRolesActionImpl(roles);
    }
    
    /**
     * builds StateAddRolesAction without checking for non-null required values
     * @return StateAddRolesAction
     */
    public StateAddRolesAction buildUnchecked() {
        return new StateAddRolesActionImpl(roles);
    }

    /**
     * factory method for an instance of StateAddRolesActionBuilder
     * @return builder 
     */
    public static StateAddRolesActionBuilder of() {
        return new StateAddRolesActionBuilder();
    }

    /**
     * create builder for StateAddRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateAddRolesActionBuilder of(final StateAddRolesAction template) {
        StateAddRolesActionBuilder builder = new StateAddRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
