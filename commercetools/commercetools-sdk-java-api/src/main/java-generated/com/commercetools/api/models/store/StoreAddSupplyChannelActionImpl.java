
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
 *  <p>This action has no effect if a given supply channel is already present in a Store.</p>
 *  <p>Adding a supply channel produces the StoreSupplyChannelsChanged Message.</p>
 *  <p>Adding a Channel without the <code>InventorySupply</code> ChannelRoleEnum returns a MissingRoleOnChannel error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddSupplyChannelActionImpl implements StoreAddSupplyChannelAction, ModelBase {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreAddSupplyChannelActionImpl(
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        this.action = ADD_SUPPLY_CHANNEL;
    }

    /**
     * create empty instance
     */
    public StoreAddSupplyChannelActionImpl() {
        this.action = ADD_SUPPLY_CHANNEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to append.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreAddSupplyChannelActionImpl that = (StoreAddSupplyChannelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(supplyChannel, that.supplyChannel)
                .append(action, that.action)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(supplyChannel).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("supplyChannel", supplyChannel)
                .build();
    }

}
