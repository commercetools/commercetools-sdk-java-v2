
package com.commercetools.api.models.inventory;

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
 *  <p>If an entry with the same <code>sku</code> and <code>supplyChannel</code> already exists, an DuplicateField error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetSupplyChannelActionImpl implements InventoryEntrySetSupplyChannelAction, ModelBase {

    private String action;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntrySetSupplyChannelActionImpl(
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        this.action = SET_SUPPLY_CHANNEL;
    }

    /**
     * create empty instance
     */
    public InventoryEntrySetSupplyChannelActionImpl() {
        this.action = SET_SUPPLY_CHANNEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
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

        InventoryEntrySetSupplyChannelActionImpl that = (InventoryEntrySetSupplyChannelActionImpl) o;

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
    public InventoryEntrySetSupplyChannelAction copyDeep() {
        return InventoryEntrySetSupplyChannelAction.deepCopy(this);
    }
}
