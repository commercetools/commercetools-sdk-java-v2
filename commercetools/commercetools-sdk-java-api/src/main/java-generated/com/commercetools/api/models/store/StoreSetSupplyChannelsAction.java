
package com.commercetools.api.models.store;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreSetSupplyChannelsActionImpl;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreSetSupplyChannelsActionImpl.class)
public interface StoreSetSupplyChannelsAction extends StoreUpdateAction {

    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelResourceIdentifier> getSupplyChannels();

    @JsonIgnore
    public void setSupplyChannels(final ChannelResourceIdentifier... supplyChannels);

    public void setSupplyChannels(final List<ChannelResourceIdentifier> supplyChannels);

    public static StoreSetSupplyChannelsAction of() {
        return new StoreSetSupplyChannelsActionImpl();
    }

    public static StoreSetSupplyChannelsAction of(final StoreSetSupplyChannelsAction template) {
        StoreSetSupplyChannelsActionImpl instance = new StoreSetSupplyChannelsActionImpl();
        instance.setSupplyChannels(template.getSupplyChannels());
        return instance;
    }

    public static StoreSetSupplyChannelsActionBuilder builder() {
        return StoreSetSupplyChannelsActionBuilder.of();
    }

    public static StoreSetSupplyChannelsActionBuilder builder(final StoreSetSupplyChannelsAction template) {
        return StoreSetSupplyChannelsActionBuilder.of(template);
    }

    default <T> T withStoreSetSupplyChannelsAction(Function<StoreSetSupplyChannelsAction, T> helper) {
        return helper.apply(this);
    }
}
