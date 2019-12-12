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
import com.commercetools.api.generated.models.channel.Channel;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ChannelBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.Address address;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   
   private java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   @Nullable
   private com.commercetools.api.generated.models.common.GeoJson geoLocation;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics;
   
   
   private String key;
   
   public ChannelBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ChannelBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ChannelBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public ChannelBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public ChannelBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ChannelBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ChannelBuilder address(@Nullable final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public ChannelBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public ChannelBuilder roles( final java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   public ChannelBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ChannelBuilder geoLocation(@Nullable final com.commercetools.api.generated.models.common.GeoJson geoLocation) {
      this.geoLocation = geoLocation;
      return this;
   }
   
   public ChannelBuilder name(@Nullable final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ChannelBuilder reviewRatingStatistics(@Nullable final com.commercetools.api.generated.models.review.ReviewRatingStatistics reviewRatingStatistics) {
      this.reviewRatingStatistics = reviewRatingStatistics;
      return this;
   }
   
   public ChannelBuilder key( final String key) {
      this.key = key;
      return this;
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
   
   @Nullable
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.GeoJson getGeoLocation(){
      return this.geoLocation;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public Channel build() {
       return new ChannelImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, address, custom, roles, description, geoLocation, name, reviewRatingStatistics, key);
   }
   
   public static ChannelBuilder of() {
      return new ChannelBuilder();
   }
   
   public static ChannelBuilder of(final Channel template) {
      ChannelBuilder builder = new ChannelBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.address = template.getAddress();
      builder.custom = template.getCustom();
      builder.roles = template.getRoles();
      builder.description = template.getDescription();
      builder.geoLocation = template.getGeoLocation();
      builder.name = template.getName();
      builder.reviewRatingStatistics = template.getReviewRatingStatistics();
      builder.key = template.getKey();
      return builder;
   }
   
}