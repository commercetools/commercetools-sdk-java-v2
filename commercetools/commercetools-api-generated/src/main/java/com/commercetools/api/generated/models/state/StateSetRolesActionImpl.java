package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateRoleEnum;
import com.commercetools.api.generated.models.state.StateUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class StateSetRolesActionImpl implements StateSetRolesAction {

   private String action;
   
   private java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles;

   @JsonCreator
   StateSetRolesActionImpl(@JsonProperty("roles") final java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles) {
      this.roles = roles;
      this.action = "setRoles";
   }
   public StateSetRolesActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }

   public void setRoles(final java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles){
      this.roles = roles;
   }

}