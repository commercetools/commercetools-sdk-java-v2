package com.commercetools.api.models.state;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.state.StateRoleEnum;
import com.commercetools.api.models.state.StateTypeEnum;
import java.time.ZonedDateTime;
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
public final class StateImpl implements State {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private String key;
    
    private com.commercetools.api.models.state.StateTypeEnum type;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private com.commercetools.api.models.common.LocalizedString description;
    
    private Boolean initial;
    
    private Boolean builtIn;
    
    private java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles;
    
    private java.util.List<com.commercetools.api.models.state.StateReference> transitions;

    @JsonCreator
    StateImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("key") final String key, @JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("initial") final Boolean initial, @JsonProperty("builtIn") final Boolean builtIn, @JsonProperty("roles") final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles, @JsonProperty("transitions") final java.util.List<com.commercetools.api.models.state.StateReference> transitions) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.type = type;
        this.name = name;
        this.description = description;
        this.initial = initial;
        this.builtIn = builtIn;
        this.roles = roles;
        this.transitions = transitions;
    }
    public StateImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
    *  <p>A unique identifier for the state.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.state.StateTypeEnum getType(){
        return this.type;
    }
    
    /**
    *  <p>A human-readable name of the state.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
    *  <p>A human-readable description of the state.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
    *  <p>A state can be declared as an initial state for any state machine.
    *  When a workflow starts, this first state must be an <code>initial</code> state.</p>
    */
    public Boolean getInitial(){
        return this.initial;
    }
    
    /**
    *  <p>Builtin states are integral parts of the project that cannot be deleted nor the key can be changed.</p>
    */
    public Boolean getBuiltIn(){
        return this.builtIn;
    }
    
    
    public java.util.List<com.commercetools.api.models.state.StateRoleEnum> getRoles(){
        return this.roles;
    }
    
    /**
    *  <p>Transitions are a way to describe possible transformations of the current state to other states of the same <code>type</code> (e.g.: <em>Initial</em> -&gt; <em>Shipped</em>).
    *  When performing a <code>transitionState</code> update action and <code>transitions</code> is set, the currently referenced state must have a transition to the new state.
    *  If <code>transitions</code> is an empty list, it means the current state is a final state and no further transitions are allowed.
    *  If <code>transitions</code> is not set, the validation is turned off.
    *  When performing a <code>transitionState</code> update action, any other state of the same <code>type</code> can be transitioned to.</p>
    */
    public java.util.List<com.commercetools.api.models.state.StateReference> getTransitions(){
        return this.transitions;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
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
    
    public void setBuiltIn(final Boolean builtIn){
        this.builtIn = builtIn;
    }
    
    public void setRoles(final java.util.List<com.commercetools.api.models.state.StateRoleEnum> roles){
        this.roles = roles;
    }
    
    public void setTransitions(final java.util.List<com.commercetools.api.models.state.StateReference> transitions){
        this.transitions = transitions;
    }

}
