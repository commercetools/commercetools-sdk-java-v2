package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Channel.ChannelUpdateAction;
import java.lang.String;
import com.commercetools.models.Channel.ChannelRemoveRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelRemoveRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles;
   
   public ChannelRemoveRolesActionBuilder roles( final java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Channel.ChannelRoleEnum> getRoles(){
      return this.roles;
   }

   public ChannelRemoveRolesAction build() {
       return new ChannelRemoveRolesActionImpl(roles);
   }
   
   public static ChannelRemoveRolesActionBuilder of() {
      return new ChannelRemoveRolesActionBuilder();
   }
   
   public static ChannelRemoveRolesActionBuilder of(final ChannelRemoveRolesAction template) {
      ChannelRemoveRolesActionBuilder builder = new ChannelRemoveRolesActionBuilder();
      builder.roles = template.getRoles();
      return builder;
   }
   
}