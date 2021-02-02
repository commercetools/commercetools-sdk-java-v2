
package com.commercetools.importapi.models.inventories;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Import representation for a inventory.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryImportImpl implements InventoryImport {

    private String key;

    private String sku;

    private Double quantityOnStock;

    private Double restockableInDays;

    private java.time.ZonedDateTime expectedDelivery;

    private com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel;

    private com.commercetools.importapi.models.customfields.Custom custom;

    @JsonCreator
    InventoryImportImpl(@JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("quantityOnStock") final Double quantityOnStock,
            @JsonProperty("restockableInDays") final Double restockableInDays,
            @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery,
            @JsonProperty("supplyChannel") final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.key = key;
        this.sku = sku;
        this.quantityOnStock = quantityOnStock;
        this.restockableInDays = restockableInDays;
        this.expectedDelivery = expectedDelivery;
        this.supplyChannel = supplyChannel;
        this.custom = custom;
    }

    public InventoryImportImpl() {
    }

    public String getKey() {
        return this.key;
    }

    public String getSku() {
        return this.sku;
    }

    /**
    *  <p>Maps to <code>Inventory.quantityOnStock</code></p>
    */
    public Double getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
    *  <p>Maps to <code>Inventory.restockableInDays</code></p>
    */
    public Double getRestockableInDays() {
        return this.restockableInDays;
    }

    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    /**
    *  <p>References a channel by its key.</p>
    */
    public com.commercetools.importapi.models.common.ChannelKeyReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
    *  <p>Maps to <code>Inventory.custom</code>.</p>
    */
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setQuantityOnStock(final Double quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }

    public void setRestockableInDays(final Double restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public void setSupplyChannel(final com.commercetools.importapi.models.common.ChannelKeyReference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryImportImpl that = (InventoryImportImpl) o;

        return new EqualsBuilder().append(key, that.key).append(sku, that.sku).append(quantityOnStock,
            that.quantityOnStock).append(restockableInDays, that.restockableInDays).append(expectedDelivery,
                that.expectedDelivery).append(supplyChannel, that.supplyChannel).append(custom, that.custom).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(sku).append(quantityOnStock).append(
            restockableInDays).append(expectedDelivery).append(supplyChannel).append(custom).toHashCode();
    }

}
