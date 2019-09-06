package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Channel.ChannelUpdateAction;
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
public final class ChannelRemoveRolesActionImpl implements ChannelRemoveRolesAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles;

   @JsonCreator
   ChannelRemoveRolesActionImpl(@JsonProperty("roles") final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      this.action = "removeRoles";
   }
   public ChannelRemoveRolesActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }

   public void setRoles(final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles){
      this.roles = roles;
   }

}