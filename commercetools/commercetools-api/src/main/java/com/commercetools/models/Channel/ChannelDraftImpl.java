package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelRoleEnum;
import com.commercetools.models.common.Address;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFieldsDraft;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelDraftImpl implements ChannelDraft {

   private com.commercetools.models.common.Address address;
   
   private java.lang.Object geoLocation;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private java.util.List<com.commercetools.models.channel.ChannelRoleEnum> roles;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.lang.String key;

   @JsonCreator
   ChannelDraftImpl(@JsonProperty("address") final com.commercetools.models.common.Address address, @JsonProperty("geoLocation") final java.lang.Object geoLocation, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("roles") final java.util.List<com.commercetools.models.channel.ChannelRoleEnum> roles, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("key") final java.lang.String key) {
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
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.Object getGeoLocation(){
      return this.geoLocation;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setAddress(final com.commercetools.models.common.Address address){
      this.address = address;
   }
   
   public void setGeoLocation(final java.lang.Object geoLocation){
      this.geoLocation = geoLocation;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setRoles(final java.util.List<com.commercetools.models.channel.ChannelRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}