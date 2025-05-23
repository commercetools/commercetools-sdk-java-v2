
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
 *  <p>This update action produces the StoreSupplyChannelsChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveSupplyChannelActionImpl implements StoreRemoveSupplyChannelAction, ModelBase {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreRemoveSupplyChannelActionImpl(
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        this.action = REMOVE_SUPPLY_CHANNEL;
    }

    /**
     * create empty instance
     */
    public StoreRemoveSupplyChannelActionImpl() {
        this.action = REMOVE_SUPPLY_CHANNEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
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

        StoreRemoveSupplyChannelActionImpl that = (StoreRemoveSupplyChannelActionImpl) o;

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

    @Override
    public StoreRemoveSupplyChannelAction copyDeep() {
        return StoreRemoveSupplyChannelAction.deepCopy(this);
    }
}
