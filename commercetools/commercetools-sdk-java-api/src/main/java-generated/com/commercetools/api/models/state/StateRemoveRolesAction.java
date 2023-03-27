
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateRemoveRolesAction
 *
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
@JsonDeserialize(as = StateRemoveRolesActionImpl.class)
public interface StateRemoveRolesAction extends StateUpdateAction {

    /**
     * discriminator value for StateRemoveRolesAction
     */
    String REMOVE_ROLES = "removeRoles";

    /**
     *  <p>Roles to remove from the State.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
     *  <p>Roles to remove from the State.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    /**
     *  <p>Roles to remove from the State.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<StateRoleEnum> roles);

    /**
     * factory method
     * @return instance of StateRemoveRolesAction
     */
    public static StateRemoveRolesAction of() {
        return new StateRemoveRolesActionImpl();
    }

    /**
     * factory method to copy an instance of StateRemoveRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateRemoveRolesAction of(final StateRemoveRolesAction template) {
        StateRemoveRolesActionImpl instance = new StateRemoveRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    /**
     * builder factory method for StateRemoveRolesAction
     * @return builder
     */
    public static StateRemoveRolesActionBuilder builder() {
        return StateRemoveRolesActionBuilder.of();
    }

    /**
     * create builder for StateRemoveRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateRemoveRolesActionBuilder builder(final StateRemoveRolesAction template) {
        return StateRemoveRolesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateRemoveRolesAction(Function<StateRemoveRolesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateRemoveRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateRemoveRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateRemoveRolesAction>";
            }
        };
    }
}
