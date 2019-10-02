package com.commercetools.models.state;

import com.commercetools.models.state.StateRoleEnum;
import com.commercetools.models.state.StateUpdateAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateRemoveRolesActionImpl implements StateRemoveRolesAction {

   private String action;
   
   private java.util.List<com.commercetools.models.state.StateRoleEnum> roles;

   @JsonCreator
   StateRemoveRolesActionImpl(@JsonProperty("roles") final java.util.List<com.commercetools.models.state.StateRoleEnum> roles) {
      this.roles = roles;
      this.action = "removeRoles";
   }
   public StateRemoveRolesActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }

   public void setRoles(final java.util.List<com.commercetools.models.state.StateRoleEnum> roles){
      this.roles = roles;
   }

}