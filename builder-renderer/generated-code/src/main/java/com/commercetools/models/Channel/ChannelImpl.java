package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Review.ReviewRatingStatistics;
import com.commercetools.models.Type.CustomFields;
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
public final class ChannelImpl implements Channel {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.Common.Address address;
   
   private java.lang.Object geoLocation;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private com.commercetools.models.Review.ReviewRatingStatistics reviewRatingStatistics;
   
   private java.lang.String key;

   @JsonCreator
   ChannelImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("address") final com.commercetools.models.Common.Address address, @JsonProperty("geoLocation") final java.lang.Object geoLocation, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("roles") final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("reviewRatingStatistics") final com.commercetools.models.Review.ReviewRatingStatistics reviewRatingStatistics, @JsonProperty("key") final java.lang.String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.address = address;
      this.geoLocation = geoLocation;
      this.custom = custom;
      this.roles = roles;
      this.name = name;
      this.description = description;
      this.reviewRatingStatistics = reviewRatingStatistics;
      this.key = key;
   }
   public ChannelImpl() {
      
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
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.Object getGeoLocation(){
      return this.geoLocation;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
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
   
   
   public com.commercetools.models.Review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
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
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setAddress(final com.commercetools.models.Common.Address address){
      this.address = address;
   }
   
   public void setGeoLocation(final java.lang.Object geoLocation){
      this.geoLocation = geoLocation;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
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
   
   public void setReviewRatingStatistics(final com.commercetools.models.Review.ReviewRatingStatistics reviewRatingStatistics){
      this.reviewRatingStatistics = reviewRatingStatistics;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}