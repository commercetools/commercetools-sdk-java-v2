
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reaches the configured safety stock level. For more information, see <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryStockLevels" rel="nofollow">InventoryEntryStockLevels</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySafetyStockMessagePayloadImpl implements InventoryEntrySafetyStockMessagePayload, ModelBase {

    private String type;

    private String sku;

    private Integer quantityOnStock;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntrySafetyStockMessagePayloadImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("quantityOnStock") final Integer quantityOnStock,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.sku = sku;
        this.quantityOnStock = quantityOnStock;
        this.supplyChannel = supplyChannel;
        this.type = INVENTORY_ENTRY_SAFETY_STOCK;
    }

    /**
     * create empty instance
     */
    public InventoryEntrySafetyStockMessagePayloadImpl() {
        this.type = INVENTORY_ENTRY_SAFETY_STOCK;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured safety stock level.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the safety stock level was reached.</p>
     */

    public Integer getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured safety stock level.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setQuantityOnStock(final Integer quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
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

        InventoryEntrySafetyStockMessagePayloadImpl that = (InventoryEntrySafetyStockMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(sku, that.sku)
                .append(quantityOnStock, that.quantityOnStock)
                .append(supplyChannel, that.supplyChannel)
                .append(type, that.type)
                .append(sku, that.sku)
                .append(quantityOnStock, that.quantityOnStock)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(sku)
                .append(quantityOnStock)
                .append(supplyChannel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("sku", sku)
                .append("quantityOnStock", quantityOnStock)
                .append("supplyChannel", supplyChannel)
                .build();
    }

    @Override
    public InventoryEntrySafetyStockMessagePayload copyDeep() {
        return InventoryEntrySafetyStockMessagePayload.deepCopy(this);
    }
}
