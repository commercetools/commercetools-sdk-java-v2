package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoresRemoveDistributionChannelsActionImpl;

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
@JsonDeserialize(as = StoresRemoveDistributionChannelsActionImpl.class)
public interface StoresRemoveDistributionChannelsAction extends StoreUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public static StoresRemoveDistributionChannelsAction of(){
        return new StoresRemoveDistributionChannelsActionImpl();
    }
    

    public static StoresRemoveDistributionChannelsAction of(final StoresRemoveDistributionChannelsAction template) {
        StoresRemoveDistributionChannelsActionImpl instance = new StoresRemoveDistributionChannelsActionImpl();
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static StoresRemoveDistributionChannelsActionBuilder builder(){
        return StoresRemoveDistributionChannelsActionBuilder.of();
    }
    
    public static StoresRemoveDistributionChannelsActionBuilder builder(final StoresRemoveDistributionChannelsAction template){
        return StoresRemoveDistributionChannelsActionBuilder.of(template);
    }
    

    default <T> T withStoresRemoveDistributionChannelsAction(Function<StoresRemoveDistributionChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
