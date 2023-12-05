
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
 *  <p>Generated after a successful Add Supply Channel, Remove Supply Channel, or Set Supply Channels update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSupplyChannelsChangedMessagePayloadImpl
        implements StoreSupplyChannelsChangedMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSupplyChannelsChangedMessagePayloadImpl(
            @JsonProperty("addedSupplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels,
            @JsonProperty("removedSupplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels) {
        this.addedSupplyChannels = addedSupplyChannels;
        this.removedSupplyChannels = removedSupplyChannels;
        this.type = STORE_SUPPLY_CHANNELS_CHANGED;
    }

    /**
     * create empty instance
     */
    public StoreSupplyChannelsChangedMessagePayloadImpl() {
        this.type = STORE_SUPPLY_CHANNELS_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedSupplyChannels() {
        return this.addedSupplyChannels;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     */

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedSupplyChannels() {
        return this.removedSupplyChannels;
    }

    public void setAddedSupplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... addedSupplyChannels) {
        this.addedSupplyChannels = new ArrayList<>(Arrays.asList(addedSupplyChannels));
    }

    public void setAddedSupplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels) {
        this.addedSupplyChannels = addedSupplyChannels;
    }

    public void setRemovedSupplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... removedSupplyChannels) {
        this.removedSupplyChannels = new ArrayList<>(Arrays.asList(removedSupplyChannels));
    }

    public void setRemovedSupplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels) {
        this.removedSupplyChannels = removedSupplyChannels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSupplyChannelsChangedMessagePayloadImpl that = (StoreSupplyChannelsChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(addedSupplyChannels, that.addedSupplyChannels)
                .append(removedSupplyChannels, that.removedSupplyChannels)
                .append(type, that.type)
                .append(addedSupplyChannels, that.addedSupplyChannels)
                .append(removedSupplyChannels, that.removedSupplyChannels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(addedSupplyChannels)
                .append(removedSupplyChannels)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("addedSupplyChannels", addedSupplyChannels)
                .append("removedSupplyChannels", removedSupplyChannels)
                .build();
    }

}
