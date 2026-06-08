
package com.commercetools.api.models.store;

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
 *  <p>Setting a supply channel produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreSupplyChannelsChangedMessage" rel="nofollow">StoreSupplyChannelsChanged</a> Message.</p>
 *  <p>Setting a <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> without the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a> returns a <a href="https://docs.commercetools.com/apis/ctp:api:type:MissingRoleOnChannelError" rel="nofollow">MissingRoleOnChannel</a> error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetSupplyChannelsActionImpl implements StoreSetSupplyChannelsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetSupplyChannelsActionImpl(
            @JsonProperty("supplyChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        this.action = SET_SUPPLY_CHANNELS;
    }

    /**
     * create empty instance
     */
    public StoreSetSupplyChannelsActionImpl() {
        this.action = SET_SUPPLY_CHANNELS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     */

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

        return new EqualsBuilder().append(action, that.action)
                .append(supplyChannels, that.supplyChannels)
                .append(action, that.action)
                .append(supplyChannels, that.supplyChannels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(supplyChannels).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("supplyChannels", supplyChannels)
                .build();
    }

    @Override
    public StoreSetSupplyChannelsAction copyDeep() {
        return StoreSetSupplyChannelsAction.deepCopy(this);
    }
}
