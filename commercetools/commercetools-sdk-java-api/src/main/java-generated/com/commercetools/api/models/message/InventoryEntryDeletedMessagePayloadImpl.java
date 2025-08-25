
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
 *  <p>Generated after a successful <span>Delete InventoryEntry</span> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryDeletedMessagePayloadImpl implements InventoryEntryDeletedMessagePayload, ModelBase {

    private String type;

    private String sku;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryDeletedMessagePayloadImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.sku = sku;
        this.supplyChannel = supplyChannel;
        this.type = INVENTORY_ENTRY_DELETED;
    }

    /**
     * create empty instance
     */
    public InventoryEntryDeletedMessagePayloadImpl() {
        this.type = INVENTORY_ENTRY_DELETED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> that was deleted.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> was deleted.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryDeletedMessagePayloadImpl that = (InventoryEntryDeletedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .append(type, that.type)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(sku).append(supplyChannel).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("sku", sku)
                .append("supplyChannel", supplyChannel)
                .build();
    }

    @Override
    public InventoryEntryDeletedMessagePayload copyDeep() {
        return InventoryEntryDeletedMessagePayload.deepCopy(this);
    }
}
