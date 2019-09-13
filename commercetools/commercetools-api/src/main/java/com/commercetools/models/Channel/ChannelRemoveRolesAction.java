package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelRoleEnum;
import com.commercetools.models.channel.ChannelUpdateAction;
import java.lang.String;
import com.commercetools.models.channel.ChannelRemoveRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ChannelRemoveRolesActionImpl.class)
public interface ChannelRemoveRolesAction extends ChannelUpdateAction {

   
   @NotNull
   @JsonProperty("roles")
   public List<ChannelRoleEnum> getRoles();

   public void setRoles(final List<ChannelRoleEnum> roles);
   
   public static ChannelRemoveRolesActionImpl of(){
      return new ChannelRemoveRolesActionImpl();
   }
   

   public static ChannelRemoveRolesActionImpl of(final ChannelRemoveRolesAction template) {
      ChannelRemoveRolesActionImpl instance = new ChannelRemoveRolesActionImpl();
      instance.setRoles(template.getRoles());
      return instance;
   }

}