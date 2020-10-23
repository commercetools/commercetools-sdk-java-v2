package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateRemoveRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StateRemoveRolesActionImpl.class)
public interface StateRemoveRolesAction extends StateUpdateAction {

    
    @NotNull
    @JsonProperty("roles")
    public List<StateRoleEnum> getRoles();

    public void setRoles(final List<StateRoleEnum> roles);

    public static StateRemoveRolesActionImpl of(){
        return new StateRemoveRolesActionImpl();
    }
    

    public static StateRemoveRolesActionImpl of(final StateRemoveRolesAction template) {
        StateRemoveRolesActionImpl instance = new StateRemoveRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    default <T> T withStateRemoveRolesAction(Function<StateRemoveRolesAction, T> helper) {
        return helper.apply(this);
    }
}
