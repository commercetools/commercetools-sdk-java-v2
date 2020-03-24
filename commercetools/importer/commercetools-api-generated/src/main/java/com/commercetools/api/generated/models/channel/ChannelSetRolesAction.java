package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelRoleEnum;
import com.commercetools.api.generated.models.channel.ChannelUpdateAction;
import com.commercetools.api.generated.models.channel.ChannelSetRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelSetRolesActionImpl.class)
public interface ChannelSetRolesAction extends ChannelUpdateAction {

   
   @NotNull
   @JsonProperty("roles")
   public List<ChannelRoleEnum> getRoles();

   public void setRoles(final List<ChannelRoleEnum> roles);
   
   public static ChannelSetRolesActionImpl of(){
      return new ChannelSetRolesActionImpl();
   }
   

   public static ChannelSetRolesActionImpl of(final ChannelSetRolesAction template) {
      ChannelSetRolesActionImpl instance = new ChannelSetRolesActionImpl();
      instance.setRoles(template.getRoles());
      return instance;
   }

}