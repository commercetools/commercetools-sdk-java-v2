package com.commercetools.models.state;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.state.StateRoleEnum;
import com.commercetools.models.state.StateTypeEnum;
import java.lang.Boolean;
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
public final class StateImpl implements State {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private java.lang.Boolean initial;
   
   private java.util.List<com.commercetools.models.state.StateRoleEnum> roles;
   
   private java.lang.Boolean builtIn;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.models.state.StateReference> transitions;
   
   private com.commercetools.models.state.StateTypeEnum type;
   
   private java.lang.String key;

   @JsonCreator
   StateImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("initial") final java.lang.Boolean initial, @JsonProperty("roles") final java.util.List<com.commercetools.models.state.StateRoleEnum> roles, @JsonProperty("builtIn") final java.lang.Boolean builtIn, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("transitions") final java.util.List<com.commercetools.models.state.StateReference> transitions, @JsonProperty("type") final com.commercetools.models.state.StateTypeEnum type, @JsonProperty("key") final java.lang.String key) {
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
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.Boolean getInitial(){
      return this.initial;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public java.lang.Boolean getBuiltIn(){
      return this.builtIn;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.state.StateReference> getTransitions(){
      return this.transitions;
   }
   
   
   public com.commercetools.models.state.StateTypeEnum getType(){
      return this.type;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setInitial(final java.lang.Boolean initial){
      this.initial = initial;
   }
   
   public void setRoles(final java.util.List<com.commercetools.models.state.StateRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setBuiltIn(final java.lang.Boolean builtIn){
      this.builtIn = builtIn;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setTransitions(final java.util.List<com.commercetools.models.state.StateReference> transitions){
      this.transitions = transitions;
   }
   
   public void setType(final com.commercetools.models.state.StateTypeEnum type){
      this.type = type;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}