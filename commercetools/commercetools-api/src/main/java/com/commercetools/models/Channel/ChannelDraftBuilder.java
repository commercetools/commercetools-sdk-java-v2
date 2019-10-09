package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelRoleEnum;
import com.commercetools.models.common.Address;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFieldsDraft;
import com.commercetools.models.channel.ChannelDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelDraftBuilder {
   
   @Nullable
   private com.commercetools.models.common.Address address;
   
   @Nullable
   private Object geoLocation;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private java.util.List<com.commercetools.models.channel.ChannelRoleEnum> roles;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   
   private String key;
   
   public ChannelDraftBuilder address(@Nullable final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public ChannelDraftBuilder geoLocation(@Nullable final Object geoLocation) {
      this.geoLocation = geoLocation;
      return this;
   }
   
   public ChannelDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ChannelDraftBuilder roles(@Nullable final java.util.List<com.commercetools.models.channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   public ChannelDraftBuilder name(@Nullable final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public ChannelDraftBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public ChannelDraftBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }
   
   @Nullable
   public Object getGeoLocation(){
      return this.geoLocation;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getKey(){
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