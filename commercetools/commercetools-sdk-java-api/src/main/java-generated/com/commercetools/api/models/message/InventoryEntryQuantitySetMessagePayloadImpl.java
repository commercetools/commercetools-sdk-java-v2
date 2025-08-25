
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryAddQuantityAction" rel="nofollow">Add Quantity</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryRemoveQuantityAction" rel="nofollow">Remove Quantity</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryChangeQuantityAction" rel="nofollow">Change Quantity</a> update action. Inventory changes as a result of <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/orders:POST" rel="nofollow">Order creation</a> do not trigger this message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryQuantitySetMessagePayloadImpl implements InventoryEntryQuantitySetMessagePayload, ModelBase {

    private String type;

    private Long oldQuantityOnStock;

    private Long newQuantityOnStock;

    private Long oldAvailableQuantity;

    private Long newAvailableQuantity;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryQuantitySetMessagePayloadImpl(@JsonProperty("oldQuantityOnStock") final Long oldQuantityOnStock,
            @JsonProperty("newQuantityOnStock") final Long newQuantityOnStock,
            @JsonProperty("oldAvailableQuantity") final Long oldAvailableQuantity,
            @JsonProperty("newAvailableQuantity") final Long newAvailableQuantity,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.oldQuantityOnStock = oldQuantityOnStock;
        this.newQuantityOnStock = newQuantityOnStock;
        this.oldAvailableQuantity = oldAvailableQuantity;
        this.newAvailableQuantity = newAvailableQuantity;
        this.supplyChannel = supplyChannel;
        this.type = INVENTORY_ENTRY_QUANTITY_SET;
    }

    /**
     * create empty instance
     */
    public InventoryEntryQuantitySetMessagePayloadImpl() {
        this.type = INVENTORY_ENTRY_QUANTITY_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Quantity on stock for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> before the quantity was updated.</p>
     */

    public Long getOldQuantityOnStock() {
        return this.oldQuantityOnStock;
    }

    /**
     *  <p>Quantity on stock for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> after the quantity was updated.</p>
     */

    public Long getNewQuantityOnStock() {
        return this.newQuantityOnStock;
    }

    /**
     *  <p>Available quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> before the quantity was updated.</p>
     */

    public Long getOldAvailableQuantity() {
        return this.oldAvailableQuantity;
    }

    /**
     *  <p>Available quantity for the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> after the quantity was updated.</p>
     */

    public Long getNewAvailableQuantity() {
        return this.newAvailableQuantity;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity was set.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    public void setOldQuantityOnStock(final Long oldQuantityOnStock) {
        this.oldQuantityOnStock = oldQuantityOnStock;
    }

    public void setNewQuantityOnStock(final Long newQuantityOnStock) {
        this.newQuantityOnStock = newQuantityOnStock;
    }

    public void setOldAvailableQuantity(final Long oldAvailableQuantity) {
        this.oldAvailableQuantity = oldAvailableQuantity;
    }

    public void setNewAvailableQuantity(final Long newAvailableQuantity) {
        this.newAvailableQuantity = newAvailableQuantity;
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

        InventoryEntryQuantitySetMessagePayloadImpl that = (InventoryEntryQuantitySetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(oldQuantityOnStock, that.oldQuantityOnStock)
                .append(newQuantityOnStock, that.newQuantityOnStock)
                .append(oldAvailableQuantity, that.oldAvailableQuantity)
                .append(newAvailableQuantity, that.newAvailableQuantity)
                .append(supplyChannel, that.supplyChannel)
                .append(type, that.type)
                .append(oldQuantityOnStock, that.oldQuantityOnStock)
                .append(newQuantityOnStock, that.newQuantityOnStock)
                .append(oldAvailableQuantity, that.oldAvailableQuantity)
                .append(newAvailableQuantity, that.newAvailableQuantity)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(oldQuantityOnStock)
                .append(newQuantityOnStock)
                .append(oldAvailableQuantity)
                .append(newAvailableQuantity)
                .append(supplyChannel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("oldQuantityOnStock", oldQuantityOnStock)
                .append("newQuantityOnStock", newQuantityOnStock)
                .append("oldAvailableQuantity", oldAvailableQuantity)
                .append("newAvailableQuantity", newAvailableQuantity)
                .append("supplyChannel", supplyChannel)
                .build();
    }

    @Override
    public InventoryEntryQuantitySetMessagePayload copyDeep() {
        return InventoryEntryQuantitySetMessagePayload.deepCopy(this);
    }
}
