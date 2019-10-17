package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.state.StateRoleEnum;
import com.commercetools.api.generated.models.state.StateTypeEnum;
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
public final class StateImpl implements State {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private Boolean initial;
   
   private java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles;
   
   private Boolean builtIn;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.api.generated.models.state.StateReference> transitions;
   
   private com.commercetools.api.generated.models.state.StateTypeEnum type;
   
   private String key;

   @JsonCreator
   StateImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("initial") final Boolean initial, @JsonProperty("roles") final java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles, @JsonProperty("builtIn") final Boolean builtIn, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("transitions") final java.util.List<com.commercetools.api.generated.models.state.StateReference> transitions, @JsonProperty("type") final com.commercetools.api.generated.models.state.StateTypeEnum type, @JsonProperty("key") final String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.initial = initial;
      this.roles = roles;
      this.builtIn = builtIn;
      this.name = name;
      this.description = description;
      this.transitions = transitions;
      this.type = type;
      this.key = key;
   }
   public StateImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public Boolean getInitial(){
      return this.initial;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public Boolean getBuiltIn(){
      return this.builtIn;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.state.StateReference> getTransitions(){
      return this.transitions;
   }
   
   
   public com.commercetools.api.generated.models.state.StateTypeEnum getType(){
      return this.type;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setInitial(final Boolean initial){
      this.initial = initial;
   }
   
   public void setRoles(final java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setBuiltIn(final Boolean builtIn){
      this.builtIn = builtIn;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setTransitions(final java.util.List<com.commercetools.api.generated.models.state.StateReference> transitions){
      this.transitions = transitions;
   }
   
   public void setType(final com.commercetools.api.generated.models.state.StateTypeEnum type){
      this.type = type;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}