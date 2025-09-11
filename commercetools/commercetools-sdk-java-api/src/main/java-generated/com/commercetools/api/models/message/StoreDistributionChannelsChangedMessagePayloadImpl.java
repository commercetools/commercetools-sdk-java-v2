
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreAddDistributionChannelAction" rel="nofollow">Add Distribution Channel</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreRemoveDistributionChannelAction" rel="nofollow">Remove Distribution Channel</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSetDistributionChannelsAction" rel="nofollow">Set Distribution Channels</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreDistributionChannelsChangedMessagePayloadImpl
        implements StoreDistributionChannelsChangedMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreDistributionChannelsChangedMessagePayloadImpl(
            @JsonProperty("addedDistributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedDistributionChannels,
            @JsonProperty("removedDistributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedDistributionChannels) {
        this.addedDistributionChannels = addedDistributionChannels;
        this.removedDistributionChannels = removedDistributionChannels;
        this.type = STORE_DISTRIBUTION_CHANNELS_CHANGED;
    }

    /**
     * create empty instance
     */
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
     *  <p>Product distribution Channels that have been added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedDistributionChannels() {
        return this.addedDistributionChannels;
    }

    /**
     *  <p>Product distribution Channels that have been removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
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
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("addedDistributionChannels", addedDistributionChannels)
                .append("removedDistributionChannels", removedDistributionChannels)
                .build();
    }

    @Override
    public StoreDistributionChannelsChangedMessagePayload copyDeep() {
        return StoreDistributionChannelsChangedMessagePayload.deepCopy(this);
    }
}
