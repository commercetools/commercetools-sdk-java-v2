package com.commercetools.api.models.state;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateTypeEnum;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateDraftImpl implements StateDraft {

    private String key;
    
    private com.commercetools.api.models.state.StateTypeEnum type;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private Boolean initial;
    
    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;
    
    private java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions;

    @JsonCreator
    StateDraftImpl(@JsonProperty("key") final String key, @JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("initial") final Boolean initial, @JsonProperty("roles") final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles, @JsonProperty("transitions") final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions) {
        this.key = key;
        this.type = type;
        this.name = name;
        this.description = description;
        this.initial = initial;
        this.roles = roles;
        this.transitions = transitions;
    }
    public StateDraftImpl() {
       
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.state.StateTypeEnum getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    
    public Boolean getInitial(){
        return this.initial;
    }
    
    
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles(){
        return this.roles;
    }
    
    
    public java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> getTransitions(){
        return this.transitions;
    }

    public void setKey(final String key){
        this.key = key;
    }
    
    public void setType(final com.commercetools.api.models.state.StateTypeEnum type){
        this.type = type;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }
    
    public void setInitial(final Boolean initial){
        this.initial = initial;
    }
    
    public void setRoles(final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles){
        this.roles = roles;
    }
    
    public void setTransitions(final java.util.List<com.commercetools.api.models.state.StateResourceIdentifier> transitions){
        this.transitions = transitions;
    }

}
