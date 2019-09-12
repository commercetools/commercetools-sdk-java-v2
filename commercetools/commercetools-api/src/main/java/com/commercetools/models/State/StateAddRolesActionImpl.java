package com.commercetools.models.State;

import com.commercetools.models.State.StateRoleEnum;
import com.commercetools.models.State.StateUpdateAction;
import java.lang.String;
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
public final class StateAddRolesActionImpl implements StateAddRolesAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.State.StateRoleEnum> roles;

   @JsonCreator
   StateAddRolesActionImpl(@JsonProperty("roles") final java.util.List<com.commercetools.models.State.StateRoleEnum> roles) {
      this.roles = roles;
      this.action = "addRoles";
   }
   public StateAddRolesActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.State.StateRoleEnum> getRoles(){
      return this.roles;
   }

   public void setRoles(final java.util.List<com.commercetools.models.State.StateRoleEnum> roles){
      this.roles = roles;
   }

}