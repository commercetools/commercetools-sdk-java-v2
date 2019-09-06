package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Review.ReviewRatingStatistics;
import com.commercetools.models.Type.CustomFields;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Channel.Channel;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   @Nullable
   private java.lang.Object geoLocation;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   
   private java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private com.commercetools.models.Review.ReviewRatingStatistics reviewRatingStatistics;
   
   
   private java.lang.String key;
   
   public ChannelBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ChannelBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ChannelBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ChannelBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ChannelBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ChannelBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ChannelBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   public ChannelBuilder geoLocation(@Nullable final java.lang.Object geoLocation) {
      this.geoLocation = geoLocation;
      return this;
   }
   
   public ChannelBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public ChannelBuilder roles( final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   public ChannelBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ChannelBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ChannelBuilder reviewRatingStatistics(@Nullable final com.commercetools.models.Review.ReviewRatingStatistics reviewRatingStatistics) {
      this.reviewRatingStatistics = reviewRatingStatistics;
      return this;
   }
   
   public ChannelBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
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
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   @Nullable
   public java.lang.Object getGeoLocation(){
      return this.geoLocation;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public com.commercetools.models.Review.ReviewRatingStatistics getReviewRatingStatistics(){
      return this.reviewRatingStatistics;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public Channel build() {
       return new ChannelImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, address, geoLocation, custom, roles, name, description, reviewRatingStatistics, key);
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
      builder.geoLocation = template.getGeoLocation();
      builder.custom = template.getCustom();
      builder.roles = template.getRoles();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.reviewRatingStatistics = template.getReviewRatingStatistics();
      builder.key = template.getKey();
      return builder;
   }
   
}