
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StateRemoveRolesActionImpl.class)
public interface StateRemoveRolesAction extends StateUpdateAction {

    String REMOVE_ROLES = "removeRoles";

    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final StateRoleEnum... roles);

    public void setRoles(final List<StateRoleEnum> roles);

    public static StateRemoveRolesAction of() {
        return new StateRemoveRolesActionImpl();
    }

    public static StateRemoveRolesAction of(final StateRemoveRolesAction template) {
        StateRemoveRolesActionImpl instance = new StateRemoveRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    public static StateRemoveRolesActionBuilder builder() {
        return StateRemoveRolesActionBuilder.of();
    }

    public static StateRemoveRolesActionBuilder builder(final StateRemoveRolesAction template) {
        return StateRemoveRolesActionBuilder.of(template);
    }

    default <T> T withStateRemoveRolesAction(Function<StateRemoveRolesAction, T> helper) {
        return helper.apply(this);
    }
}
