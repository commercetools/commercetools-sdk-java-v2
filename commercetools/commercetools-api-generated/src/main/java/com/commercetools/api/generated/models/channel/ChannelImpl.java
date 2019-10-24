package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelRoleEnum;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.review.ReviewRatingStatistics;
import com.commercetools.api.generated.models.type.CustomFields;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ChannelImpl implements Channel {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.generated.models.common.Address address;
   
   private Object geoLocation;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   private String key;

   @JsonCreator
   ChannelImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("address") final com.commercetools.api.generated.models.common.Address address, @JsonProperty("geoLocation") final Object geoLocation, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("roles") final java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("reviewRatingStatistics") final com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics, @JsonProperty("key") final String key) {
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
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public Object getGeoLocation(){
      return this.geoLocation;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public com.commercetools.api.generated.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
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
   
   public void setAddress(final com.commercetools.api.generated.models.common.Address address){
      this.address = address;
   }
   
   public void setGeoLocation(final Object geoLocation){
      this.geoLocation = geoLocation;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setRoles(final java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setReviewRatingStatistics(final com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics){
      this.reviewRatingStatistics = reviewRatingStatistics;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}