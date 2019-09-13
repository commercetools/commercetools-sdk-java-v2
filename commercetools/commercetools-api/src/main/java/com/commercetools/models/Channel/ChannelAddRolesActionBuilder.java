package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelRoleEnum;
import com.commercetools.models.channel.ChannelUpdateAction;
import java.lang.String;
import com.commercetools.models.channel.ChannelAddRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelAddRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.channel.ChannelRoleEnum> roles;
   
   public ChannelAddRolesActionBuilder roles( final java.util.List<com.commercetools.models.channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }

   public ChannelAddRolesAction build() {
       return new ChannelAddRolesActionImpl(roles);
   }
   
   public static ChannelAddRolesActionBuilder of() {
      return new ChannelAddRolesActionBuilder();
   }
   
   public static ChannelAddRolesActionBuilder of(final ChannelAddRolesAction template) {
      ChannelAddRolesActionBuilder builder = new ChannelAddRolesActionBuilder();
      builder.roles = template.getRoles();
      return builder;
   }
   
}