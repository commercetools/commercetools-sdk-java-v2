
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateSetRolesActionImpl.class)
public interface StateSetRolesAction extends StateUpdateAction {

    String SET_ROLES = "setRoles";

    /**
    *  <p>Value to set.
    *  If empty, any existing value will be removed.</p>
    */
    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    public void setRoles(final List<StateRoleEnum> roles);

    public static StateSetRolesAction of() {
        return new StateSetRolesActionImpl();
    }

    public static StateSetRolesAction of(final StateSetRolesAction template) {
        StateSetRolesActionImpl instance = new StateSetRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    public static StateSetRolesActionBuilder builder() {
        return StateSetRolesActionBuilder.of();
    }

    public static StateSetRolesActionBuilder builder(final StateSetRolesAction template) {
        return StateSetRolesActionBuilder.of(template);
    }

    default <T> T withStateSetRolesAction(Function<StateSetRolesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StateSetRolesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StateSetRolesAction>() {
            @Override
            public String toString() {
                return "TypeReference<StateSetRolesAction>";
            }
        };
    }
}
