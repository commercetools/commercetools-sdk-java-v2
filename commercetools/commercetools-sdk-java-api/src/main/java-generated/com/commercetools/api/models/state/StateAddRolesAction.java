
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateAddRolesActionImpl.class)
public interface StateAddRolesAction extends StateUpdateAction {

    String ADD_ROLES = "addRoles";

    /**
    *  <p>Value to append to the array.</p>
    */
    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    public void setRoles(final List<StateRoleEnum> roles);

    public static StateAddRolesAction of() {
        return new StateAddRolesActionImpl();
    }

    public static StateAddRolesAction of(final StateAddRolesAction template) {
        StateAddRolesActionImpl instance = new StateAddRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    public static StateAddRolesActionBuilder builder() {
        return StateAddRolesActionBuilder.of();
    }

    public static StateAddRolesActionBuilder builder(final StateAddRolesAction template) {
        return StateAddRolesActionBuilder.of(template);
    }

    default <T> T withStateAddRolesAction(Function<StateAddRolesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StateAddRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateAddRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateAddRolesAction>";
            }
        };
    }
}
