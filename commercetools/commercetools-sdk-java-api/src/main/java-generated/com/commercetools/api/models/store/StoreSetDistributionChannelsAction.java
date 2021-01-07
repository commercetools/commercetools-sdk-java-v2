package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreSetDistributionChannelsActionImpl;

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
@JsonDeserialize(as = StoreSetDistributionChannelsActionImpl.class)
public interface StoreSetDistributionChannelsAction extends StoreUpdateAction {

    
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();

    @JsonIgnore
    public void setDistributionChannels(final ChannelResourceIdentifier ...distributionChannels);
    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);

    public static StoreSetDistributionChannelsAction of(){
        return new StoreSetDistributionChannelsActionImpl();
    }
    

    public static StoreSetDistributionChannelsAction of(final StoreSetDistributionChannelsAction template) {
        StoreSetDistributionChannelsActionImpl instance = new StoreSetDistributionChannelsActionImpl();
        instance.setDistributionChannels(template.getDistributionChannels());
        return instance;
    }

    public static StoreSetDistributionChannelsActionBuilder builder(){
        return StoreSetDistributionChannelsActionBuilder.of();
    }
    
    public static StoreSetDistributionChannelsActionBuilder builder(final StoreSetDistributionChannelsAction template){
        return StoreSetDistributionChannelsActionBuilder.of(template);
    }
    

    default <T> T withStoreSetDistributionChannelsAction(Function<StoreSetDistributionChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
