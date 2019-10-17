package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelRoleEnum;
import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.channel.ChannelRemoveRolesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelRemoveRolesActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles;
   
   public ChannelRemoveRolesActionBuilder roles( final java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> roles) {
      this.roles = roles;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.channel.ChannelRoleEnum> getRoles(){
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