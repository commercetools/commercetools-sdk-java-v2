package com.commercetools.models.State;

import com.commercetools.models.State.StateRoleEnum;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
import com.commercetools.models.State.StateAddRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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