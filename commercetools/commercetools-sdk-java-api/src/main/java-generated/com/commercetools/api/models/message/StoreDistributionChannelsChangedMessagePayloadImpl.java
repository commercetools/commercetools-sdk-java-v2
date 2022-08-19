
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Add Distribution Channel, Remove Distribution Channel, or Set Distribution Channels update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDistributionChannelsChangedMessagePayloadImpl
        implements StoreDistributionChannelsChangedMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels;

    @JsonCreator
    StoreDistributionChannelsChangedMessagePayloadImpl(
            @JsonProperty("addedDistributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels,
            @JsonProperty("removedDistributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels) {
        this.addedDistributionChannels = addedDistributionChannels;
        this.removedDistributionChannels = removedDistributionChannels;
        this.type = STORE_DISTRIBUTION_CHANNELS_CHANGED;
    }

    public StoreDistributionChannelsChangedMessagePayloadImpl() {
        this.type = STORE_DISTRIBUTION_CHANNELS_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Product distribution Channels that have been added to the Store.</p>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedDistributionChannels() {
        return this.addedDistributionChannels;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the Store.</p>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedDistributionChannels() {
        return this.removedDistributionChannels;
    }

    public void setAddedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... addedDistributionChannels) {
        this.addedDistributionChannels = new ArrayList<>(Arrays.asList(addedDistributionChannels));
    }

    public void setAddedDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels) {
        this.addedDistributionChannels = addedDistributionChannels;
    }

    public void setRemovedDistributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... removedDistributionChannels) {
        this.removedDistributionChannels = new ArrayList<>(Arrays.asList(removedDistributionChannels));
    }

    public void setRemovedDistributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels) {
        this.removedDistributionChannels = removedDistributionChannels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreDistributionChannelsChangedMessagePayloadImpl that = (StoreDistributionChannelsChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(addedDistributionChannels, that.addedDistributionChannels)
                .append(removedDistributionChannels, that.removedDistributionChannels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(addedDistributionChannels)
                .append(removedDistributionChannels)
                .toHashCode();
    }

}
