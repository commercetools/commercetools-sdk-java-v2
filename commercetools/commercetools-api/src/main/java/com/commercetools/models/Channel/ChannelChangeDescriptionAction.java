package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelUpdateAction;
import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.channel.ChannelChangeDescriptionActionImpl;

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
@JsonDeserialize(as = ChannelChangeDescriptionActionImpl.class)
public interface ChannelChangeDescriptionAction extends ChannelUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static ChannelChangeDescriptionActionImpl of(){
      return new ChannelChangeDescriptionActionImpl();
   }
   

   public static ChannelChangeDescriptionActionImpl of(final ChannelChangeDescriptionAction template) {
      ChannelChangeDescriptionActionImpl instance = new ChannelChangeDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}