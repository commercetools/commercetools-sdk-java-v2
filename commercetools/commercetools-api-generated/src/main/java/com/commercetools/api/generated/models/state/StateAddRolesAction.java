package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateRoleEnum;
import com.commercetools.api.generated.models.state.StateUpdateAction;
import com.commercetools.api.generated.models.state.StateAddRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StateAddRolesActionImpl.class)
public interface StateAddRolesAction extends StateUpdateAction {

   
   @NotNull
   @JsonProperty("roles")
   public List<StateRoleEnum> getRoles();

   public void setRoles(final List<StateRoleEnum> roles);
   
   public static StateAddRolesActionImpl of(){
      return new StateAddRolesActionImpl();
   }
   

   public static StateAddRolesActionImpl of(final StateAddRolesAction template) {
      StateAddRolesActionImpl instance = new StateAddRolesActionImpl();
      instance.setRoles(template.getRoles());
      return instance;
   }

}