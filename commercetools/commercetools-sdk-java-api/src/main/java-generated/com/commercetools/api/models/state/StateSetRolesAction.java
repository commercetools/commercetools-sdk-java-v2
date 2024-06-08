
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * StateSetRolesAction
 *
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
@JsonDeserialize(as = StateSetRolesActionImpl.class)
public interface StateSetRolesAction extends StateUpdateAction {

    /**
     * discriminator value for StateSetRolesAction
     */
    String SET_ROLES = "setRoles";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<StateRoleEnum> roles);

    /**
     * factory method
     * @return instance of StateSetRolesAction
     */
    public static StateSetRolesAction of() {
        return new StateSetRolesActionImpl();
    }

    /**
     * factory method to create a shallow copy StateSetRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateSetRolesAction of(final StateSetRolesAction template) {
        StateSetRolesActionImpl instance = new StateSetRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    /**
     * factory method to create a deep copy of StateSetRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateSetRolesAction deepCopy(@Nullable final StateSetRolesAction template) {
        if (template == null) {
            return null;
        }
        StateSetRolesActionImpl instance = new StateSetRolesActionImpl();
        instance.setRoles(Optional.ofNullable(template.getRoles()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for StateSetRolesAction
     * @return builder
     */
    public static StateSetRolesActionBuilder builder() {
        return StateSetRolesActionBuilder.of();
    }

    /**
     * create builder for StateSetRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateSetRolesActionBuilder builder(final StateSetRolesAction template) {
        return StateSetRolesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateSetRolesAction(Function<StateSetRolesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateSetRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateSetRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateSetRolesAction>";
            }
        };
    }
}
