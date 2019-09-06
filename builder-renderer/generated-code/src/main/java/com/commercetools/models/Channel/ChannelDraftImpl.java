package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Object;
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
public final class ChannelDraftImpl implements ChannelDraft {

   private com.commercetools.models.Common.Address address;
   
   private java.lang.Object geoLocation;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private java.lang.String key;

   @JsonCreator
   ChannelDraftImpl(@JsonProperty("address") final com.commercetools.models.Common.Address address, @JsonProperty("geoLocation") final java.lang.Object geoLocation, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("roles") final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("key") final java.lang.String key) {
      this.address = address;
      this.geoLocation = geoLocation;
      this.custom = custom;
      this.roles = roles;
      this.name = name;
      this.description = description;
      this.key = key;
   }
   public ChannelDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.Object getGeoLocation(){
      return this.geoLocation;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setAddress(final com.commercetools.models.Common.Address address){
      this.address = address;
   }
   
   public void setGeoLocation(final java.lang.Object geoLocation){
      this.geoLocation = geoLocation;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setRoles(final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}