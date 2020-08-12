package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelChangeKeyActionImpl;

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
@JsonDeserialize(as = ChannelChangeKeyActionImpl.class)
public interface ChannelChangeKeyAction extends ChannelUpdateAction {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ChannelChangeKeyActionImpl of(){
      return new ChannelChangeKeyActionImpl();
   }
   

   public static ChannelChangeKeyActionImpl of(final ChannelChangeKeyAction template) {
      ChannelChangeKeyActionImpl instance = new ChannelChangeKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}
