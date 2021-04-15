
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreSetSupplyChannelsActionImpl implements StoreSetSupplyChannelsAction {

    private String action;

    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    @JsonCreator
    StoreSetSupplyChannelsActionImpl(
            @JsonProperty("supplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        this.action = SET_SUPPLY_CHANNELS;
    }

    public StoreSetSupplyChannelsActionImpl() {
        this.action = SET_SUPPLY_CHANNELS;
    }

    public String getAction() {
        return this.action;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels() {
        return this.supplyChannels;
    }

    public void setSupplyChannels(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
    }

    public void setSupplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSetSupplyChannelsActionImpl that = (StoreSetSupplyChannelsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(supplyChannels, that.supplyChannels).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(supplyChannels).toHashCode();
    }

}
