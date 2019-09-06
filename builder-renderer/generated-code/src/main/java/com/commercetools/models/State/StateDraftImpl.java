package com.commercetools.models.State;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.State.StateResourceIdentifier;
import com.commercetools.models.State.StateRoleEnum;
import com.commercetools.models.State.StateTypeEnum;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateDraftImpl implements StateDraft {

   private java.lang.Boolean initial;
   
   private java.util.List<com.commercetools.models.State.StateRoleEnum> roles;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.util.List<com.commercetools.models.State.StateResourceIdentifier> transitions;
   
   private com.commercetools.models.State.StateTypeEnum type;
   
   private java.lang.String key;

   @JsonCreator
   StateDraftImpl(@JsonProperty("initial") final java.lang.Boolean initial, @JsonProperty("roles") final java.util.List<com.commercetools.models.State.StateRoleEnum> roles, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("transitions") final java.util.List<com.commercetools.models.State.StateResourceIdentifier> transitions, @JsonProperty("type") final com.commercetools.models.State.StateTypeEnum type, @JsonProperty("key") final java.lang.String key) {
      this.initial = initial;
      this.roles = roles;
      this.name = name;
      this.description = description;
      this.transitions = transitions;
      this.type = type;
      this.key = key;
   }
   public StateDraftImpl() {
      
   }
   
   
   public java.lang.Boolean getInitial(){
      return this.initial;
   }
   
   
   public java.util.List<com.commercetools.models.State.StateRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.State.StateResourceIdentifier> getTransitions(){
      return this.transitions;
   }
   
   
   public com.commercetools.models.State.StateTypeEnum getType(){
      return this.type;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setInitial(final java.lang.Boolean initial){
      this.initial = initial;
   }
   
   public void setRoles(final java.util.List<com.commercetools.models.State.StateRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setTransitions(final java.util.List<com.commercetools.models.State.StateResourceIdentifier> transitions){
      this.transitions = transitions;
   }
   
   public void setType(final com.commercetools.models.State.StateTypeEnum type){
      this.type = type;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}