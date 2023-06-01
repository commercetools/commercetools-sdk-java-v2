package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateAddRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * StateAddRolesAction
 *
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
@JsonDeserialize(as = StateAddRolesActionImpl.class)
public interface StateAddRolesAction extends StateUpdateAction {

    /**
     * discriminator value for StateAddRolesAction
     */
    String ADD_ROLES = "addRoles";

    /**
     *  <p>Value to append to the array.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    /**
     *  <p>Value to append to the array.</p>
     * @param roles values to be set
     */
    
    @JsonIgnore
    public void setRoles(final StateRoleEnum ...roles);
    /**
     *  <p>Value to append to the array.</p>
     * @param roles values to be set
     */
    
    public void setRoles(final List<StateRoleEnum> roles);

    /**
     * factory method
     * @return instance of StateAddRolesAction
     */
    public static StateAddRolesAction of(){
        return new StateAddRolesActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StateAddRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StateAddRolesAction of(final StateAddRolesAction template) {
        StateAddRolesActionImpl instance = new StateAddRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    /**
     * factory method to create a deep copy of StateAddRolesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StateAddRolesAction deepCopy(@Nullable final StateAddRolesAction template) {
        if (template == null) {
            return null;
        }
        StateAddRolesActionImpl instance = new StateAddRolesActionImpl();
        instance.setRoles(Optional.ofNullable(template.getRoles())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StateAddRolesAction
     * @return builder
     */
    public static StateAddRolesActionBuilder builder() {
        return StateAddRolesActionBuilder.of();
    }
    
    /**
     * create builder for StateAddRolesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateAddRolesActionBuilder builder(final StateAddRolesAction template) {
        return StateAddRolesActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStateAddRolesAction(Function<StateAddRolesAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StateAddRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateAddRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateAddRolesAction>";
            }
        };
    }
}
