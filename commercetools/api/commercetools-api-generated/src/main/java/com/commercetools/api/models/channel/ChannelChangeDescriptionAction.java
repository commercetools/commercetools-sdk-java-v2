package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.channel.ChannelChangeDescriptionActionImpl;

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
