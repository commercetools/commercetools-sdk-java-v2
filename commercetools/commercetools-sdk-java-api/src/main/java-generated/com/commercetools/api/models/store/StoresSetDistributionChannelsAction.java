package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresSetDistributionChannelsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoresSetDistributionChannelsActionImpl.class)
public interface StoresSetDistributionChannelsAction extends StoreUpdateAction {

    
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();

    @JsonIgnore
    public void setDistributionChannels(final ChannelResourceIdentifier ...distributionChannels);
    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);

    public static StoresSetDistributionChannelsAction of(){
        return new StoresSetDistributionChannelsActionImpl();
    }
    

    public static StoresSetDistributionChannelsAction of(final StoresSetDistributionChannelsAction template) {
        StoresSetDistributionChannelsActionImpl instance = new StoresSetDistributionChannelsActionImpl();
        instance.setDistributionChannels(template.getDistributionChannels());
        return instance;
    }

    public static StoresSetDistributionChannelsActionBuilder builder(){
        return StoresSetDistributionChannelsActionBuilder.of();
    }
    
    public static StoresSetDistributionChannelsActionBuilder builder(final StoresSetDistributionChannelsAction template){
        return StoresSetDistributionChannelsActionBuilder.of(template);
    }
    

    default <T> T withStoresSetDistributionChannelsAction(Function<StoresSetDistributionChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
