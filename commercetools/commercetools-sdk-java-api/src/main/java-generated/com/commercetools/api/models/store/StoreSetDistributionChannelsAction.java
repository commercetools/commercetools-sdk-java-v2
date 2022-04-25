
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreSetDistributionChannelsActionImpl.class)
public interface StoreSetDistributionChannelsAction extends StoreUpdateAction {

    String SET_DISTRIBUTION_CHANNELS = "setDistributionChannels";

    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelResourceIdentifier> getDistributionChannels();

    @JsonIgnore
    public void setDistributionChannels(final ChannelResourceIdentifier... distributionChannels);

    public void setDistributionChannels(final List<ChannelResourceIdentifier> distributionChannels);

    public static StoreSetDistributionChannelsAction of() {
        return new StoreSetDistributionChannelsActionImpl();
    }

    public static StoreSetDistributionChannelsAction of(final StoreSetDistributionChannelsAction template) {
        StoreSetDistributionChannelsActionImpl instance = new StoreSetDistributionChannelsActionImpl();
        instance.setDistributionChannels(template.getDistributionChannels());
        return instance;
    }

    public static StoreSetDistributionChannelsActionBuilder builder() {
        return StoreSetDistributionChannelsActionBuilder.of();
    }

    public static StoreSetDistributionChannelsActionBuilder builder(final StoreSetDistributionChannelsAction template) {
        return StoreSetDistributionChannelsActionBuilder.of(template);
    }

    default <T> T withStoreSetDistributionChannelsAction(Function<StoreSetDistributionChannelsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetDistributionChannelsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetDistributionChannelsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetDistributionChannelsAction>";
            }
        };
    }
}
