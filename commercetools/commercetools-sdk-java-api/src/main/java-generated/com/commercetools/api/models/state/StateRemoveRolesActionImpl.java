package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateRemoveRolesActionImpl implements StateRemoveRolesAction {

    private String action;
    
    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;

    @JsonCreator
    StateRemoveRolesActionImpl(@JsonProperty("roles") final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles) {
        this.roles = roles;
        this.action = "removeRoles";
    }
    public StateRemoveRolesActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles(){
        return this.roles;
    }

    public void setRoles(final com.commercetools.api.models.state.StateRoleEnum ...roles){
       this.roles = new ArrayList<>(Arrays.asList(roles));
    }
    
    public void setRoles(final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles){
       this.roles = roles;
    }

}
