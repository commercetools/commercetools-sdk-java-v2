package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelRoleEnum;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.GeoJson;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.review.ReviewRatingStatistics;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
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
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private com.commercetools.api.generated.models.common.GeoJson geoLocation;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   private String key;

   @JsonCreator
   ChannelImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("address") final com.commercetools.api.generated.models.common.Address address, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("roles") final java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("geoLocation") final com.commercetools.api.generated.models.common.GeoJson geoLocation, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("reviewRatingStatistics") final com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics, @JsonProperty("key") final String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.address = address;
      this.custom = custom;
      this.roles = roles;
      this.description = description;
      this.geoLocation = geoLocation;
      this.name = name;
      this.reviewRatingStatistics = reviewRatingStatistics;
      this.key = key;
   }
   public ChannelImpl() {
      
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   /**
   	
   */
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   /**
   	<p>The unique ID of the channel.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   	
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   	<p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   	<p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   	<p>The address where this channel is located (e.g.
   	if the channel is a physical store).</p>
   */
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   	<p>The roles of this channel.
   	Each channel must have at least one role.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   /**
   	<p>A human-readable description of the channel.</p>
   */
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   	<p>A GeoJSON geometry object encoding the geo location of the channel.</p>
   */
   public com.commercetools.api.generated.models.common.GeoJson getGeoLocation(){
      return this.geoLocation;
   }
   
   /**
   	<p>A human-readable name of the channel.</p>
   */
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   	<p>Statistics about the review ratings taken into account for this channel.</p>
   */
   public com.commercetools.api.generated.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   /**
   	<p>Any arbitrary string key that uniquely identifies this channel within the project.</p>
   */
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
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setRoles(final java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles){
      this.roles = roles;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setGeoLocation(final com.commercetools.api.generated.models.common.GeoJson geoLocation){
      this.geoLocation = geoLocation;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setReviewRatingStatistics(final com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics){
      this.reviewRatingStatistics = reviewRatingStatistics;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}