package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.state.StateRoleEnum;
import com.commercetools.api.generated.models.state.StateTypeEnum;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateDraftImpl implements StateDraft {

   private Boolean initial;
   
   private java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.api.generated.models.state.StateResourceIdentifier> transitions;
   
   private com.commercetools.api.generated.models.state.StateTypeEnum type;
   
   private String key;

   @JsonCreator
   StateDraftImpl(@JsonProperty("initial") final Boolean initial, @JsonProperty("roles") final java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("transitions") final java.util.List<com.commercetools.api.generated.models.state.StateResourceIdentifier> transitions, @JsonProperty("type") final com.commercetools.api.generated.models.state.StateTypeEnum type, @JsonProperty("key") final String key) {
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
   
   
   public Boolean getInitial(){
      return this.initial;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.state.StateResourceIdentifier> getTransitions(){
      return this.transitions;
   }
   
   
   public com.commercetools.api.generated.models.state.StateTypeEnum getType(){
      return this.type;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setInitial(final Boolean initial){
      this.initial = initial;
   }
   
   public void setRoles(final java.util.List<com.commercetools.api.generated.models.state.StateRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setTransitions(final java.util.List<com.commercetools.api.generated.models.state.StateResourceIdentifier> transitions){
      this.transitions = transitions;
   }
   
   public void setType(final com.commercetools.api.generated.models.state.StateTypeEnum type){
      this.type = type;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}