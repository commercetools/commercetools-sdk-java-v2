package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresRemoveDistributionChannelsActionImpl;

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
@JsonDeserialize(as = StoresRemoveDistributionChannelsActionImpl.class)
public interface StoresRemoveDistributionChannelsAction extends StoreUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("distributionChannel")
   public ChannelResourceIdentifier getDistributionChannel();

   public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);
   
   public static StoresRemoveDistributionChannelsActionImpl of(){
      return new StoresRemoveDistributionChannelsActionImpl();
   }
   

   public static StoresRemoveDistributionChannelsActionImpl of(final StoresRemoveDistributionChannelsAction template) {
      StoresRemoveDistributionChannelsActionImpl instance = new StoresRemoveDistributionChannelsActionImpl();
      instance.setDistributionChannel(template.getDistributionChannel());
      return instance;
   }

}
