package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import java.lang.String;
import com.commercetools.models.Channel.ChannelChangeKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
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