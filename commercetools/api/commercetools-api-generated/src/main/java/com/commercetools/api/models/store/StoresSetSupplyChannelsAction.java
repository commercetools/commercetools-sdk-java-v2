package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresSetSupplyChannelsActionImpl;

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
@JsonDeserialize(as = StoresSetSupplyChannelsActionImpl.class)
public interface StoresSetSupplyChannelsAction extends StoreUpdateAction {

   
   @Valid
   @JsonProperty("supplyChannels")
   public List<ChannelResourceIdentifier> getSupplyChannels();

   public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);
   
   public static StoresSetSupplyChannelsActionImpl of(){
      return new StoresSetSupplyChannelsActionImpl();
   }
   

   public static StoresSetSupplyChannelsActionImpl of(final StoresSetSupplyChannelsAction template) {
      StoresSetSupplyChannelsActionImpl instance = new StoresSetSupplyChannelsActionImpl();
      instance.setSupplyChannels(template.getSupplyChannels());
      return instance;
   }

}
