package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Channel.ChannelChangeNameActionImpl;

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
@JsonDeserialize(as = ChannelChangeNameActionImpl.class)
public interface ChannelChangeNameAction extends ChannelUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static ChannelChangeNameActionImpl of(){
      return new ChannelChangeNameActionImpl();
   }
   

   public static ChannelChangeNameActionImpl of(final ChannelChangeNameAction template) {
      ChannelChangeNameActionImpl instance = new ChannelChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}