package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import java.lang.Long;
import com.commercetools.models.Channel.ChannelUpdateImpl;

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
@JsonDeserialize(as = ChannelUpdateImpl.class)
public interface ChannelUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<ChannelUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<ChannelUpdateAction> actions);
   
   public static ChannelUpdateImpl of(){
      return new ChannelUpdateImpl();
   }
   

   public static ChannelUpdateImpl of(final ChannelUpdate template) {
      ChannelUpdateImpl instance = new ChannelUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}