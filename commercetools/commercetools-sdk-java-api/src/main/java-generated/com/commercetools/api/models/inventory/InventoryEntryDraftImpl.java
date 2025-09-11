
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
 * InventoryEntryDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryDraftImpl implements InventoryEntryDraft, ModelBase {

    private String sku;

    private String key;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    private Long quantityOnStock;

    private Integer minCartQuantity;

    private Integer maxCartQuantity;

    private Long restockableInDays;

    private java.time.ZonedDateTime expectedDelivery;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryDraftImpl(@JsonProperty("sku") final String sku, @JsonProperty("key") final String key,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel,
            @JsonProperty("quantityOnStock") final Long quantityOnStock,
            @JsonProperty("minCartQuantity") final Integer minCartQuantity,
            @JsonProperty("maxCartQuantity") final Integer maxCartQuantity,
            @JsonProperty("restockableInDays") final Long restockableInDays,
            @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.sku = sku;
        this.key = key;
        this.supplyChannel = supplyChannel;
        this.quantityOnStock = quantityOnStock;
        this.minCartQuantity = minCartQuantity;
        this.maxCartQuantity = maxCartQuantity;
        this.restockableInDays = restockableInDays;
        this.expectedDelivery = expectedDelivery;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public InventoryEntryDraftImpl() {
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> <code>sku</code> of the InventoryEntry.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing InventoryEntries with the <span>Import API</span> and the <span>Merchant Center</span>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Overall amount of stock.</p>
     */

    public Long getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p>Minimum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     */

    public Integer getMinCartQuantity() {
        return this.minCartQuantity;
    }

    /**
     *  <p>Maximum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     */

    public Integer getMaxCartQuantity() {
        return this.maxCartQuantity;
    }

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     */

    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    /**
     *  <p>Date and time of the next restock.</p>
     */

    public java.time.ZonedDateTime getExpectedDelivery() {
        return this.expectedDelivery;
    }

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setQuantityOnStock(final Long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }

    public void setMinCartQuantity(final Integer minCartQuantity) {
        this.minCartQuantity = minCartQuantity;
    }

    public void setMaxCartQuantity(final Integer maxCartQuantity) {
        this.maxCartQuantity = maxCartQuantity;
    }

    public void setRestockableInDays(final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    public void setExpectedDelivery(final java.time.ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryDraftImpl that = (InventoryEntryDraftImpl) o;

        return new EqualsBuilder().append(sku, that.sku)
                .append(key, that.key)
                .append(supplyChannel, that.supplyChannel)
                .append(quantityOnStock, that.quantityOnStock)
                .append(minCartQuantity, that.minCartQuantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .append(restockableInDays, that.restockableInDays)
                .append(expectedDelivery, that.expectedDelivery)
                .append(custom, that.custom)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(supplyChannel, that.supplyChannel)
                .append(quantityOnStock, that.quantityOnStock)
                .append(minCartQuantity, that.minCartQuantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .append(restockableInDays, that.restockableInDays)
                .append(expectedDelivery, that.expectedDelivery)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(sku)
                .append(key)
                .append(supplyChannel)
                .append(quantityOnStock)
                .append(minCartQuantity)
                .append(maxCartQuantity)
                .append(restockableInDays)
                .append(expectedDelivery)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("sku", sku)
                .append("key", key)
                .append("supplyChannel", supplyChannel)
                .append("quantityOnStock", quantityOnStock)
                .append("minCartQuantity", minCartQuantity)
                .append("maxCartQuantity", maxCartQuantity)
                .append("restockableInDays", restockableInDays)
                .append("expectedDelivery", expectedDelivery)
                .append("custom", custom)
                .build();
    }

    @Override
    public InventoryEntryDraft copyDeep() {
        return InventoryEntryDraft.deepCopy(this);
    }
}
