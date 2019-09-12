package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Channel.ChannelDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelDraftBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   @Nullable
   private java.lang.Object geoLocation;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   @Nullable
   private java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   
   private java.lang.String key;
   
   public ChannelDraftBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   public ChannelDraftBuilder geoLocation(@Nullable final java.lang.Object geoLocation) {
      this.geoLocation = geoLocation;
      return this;
   }
   
   public ChannelDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ChannelDraftBuilder roles(@Nullable final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   public ChannelDraftBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ChannelDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ChannelDraftBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
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
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
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
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public ChannelDraft build() {
       return new ChannelDraftImpl(address, geoLocation, custom, roles, name, description, key);
   }
   
   public static ChannelDraftBuilder of() {
      return new ChannelDraftBuilder();
   }
   
   public static ChannelDraftBuilder of(final ChannelDraft template) {
      ChannelDraftBuilder builder = new ChannelDraftBuilder();
      builder.address = template.getAddress();
      builder.geoLocation = template.getGeoLocation();
      builder.custom = template.getCustom();
      builder.roles = template.getRoles();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      return builder;
   }
   
}