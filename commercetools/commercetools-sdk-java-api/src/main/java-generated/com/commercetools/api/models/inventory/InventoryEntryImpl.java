
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
 * InventoryEntry
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryImpl implements InventoryEntry, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private String sku;

    private com.commercetools.api.models.channel.ChannelReference supplyChannel;

    private Long quantityOnStock;

    private Long availableQuantity;

    private Integer minCartQuantity;

    private Integer maxCartQuantity;

    private Long restockableInDays;

    private java.time.ZonedDateTime expectedDelivery;

    private com.commercetools.api.models.type.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key, @JsonProperty("sku") final String sku,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelReference supplyChannel,
            @JsonProperty("quantityOnStock") final Long quantityOnStock,
            @JsonProperty("availableQuantity") final Long availableQuantity,
            @JsonProperty("minCartQuantity") final Integer minCartQuantity,
            @JsonProperty("maxCartQuantity") final Integer maxCartQuantity,
            @JsonProperty("restockableInDays") final Long restockableInDays,
            @JsonProperty("expectedDelivery") final java.time.ZonedDateTime expectedDelivery,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.sku = sku;
        this.supplyChannel = supplyChannel;
        this.quantityOnStock = quantityOnStock;
        this.availableQuantity = availableQuantity;
        this.minCartQuantity = minCartQuantity;
        this.maxCartQuantity = maxCartQuantity;
        this.restockableInDays = restockableInDays;
        this.expectedDelivery = expectedDelivery;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public InventoryEntryImpl() {
    }

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the InventoryEntry.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the InventoryEntry was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the InventoryEntry was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the InventoryEntry.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the InventoryEntry.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the InventoryEntry.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>ProductVariant <code>sku</code> of the InventoryEntry.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     */

    public Long getQuantityOnStock() {
        return this.quantityOnStock;
    }

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     */

    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     *  <p>Minimum quantity that can be added to a Cart. See Quantity limits.</p>
     */

    public Integer getMinCartQuantity() {
        return this.minCartQuantity;
    }

    /**
     *  <p>Maximum quantity that can be added to a Cart. See Quantity limits.</p>
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

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelReference supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    public void setQuantityOnStock(final Long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }

    public void setAvailableQuantity(final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
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

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryImpl that = (InventoryEntryImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .append(quantityOnStock, that.quantityOnStock)
                .append(availableQuantity, that.availableQuantity)
                .append(minCartQuantity, that.minCartQuantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .append(restockableInDays, that.restockableInDays)
                .append(expectedDelivery, that.expectedDelivery)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .append(quantityOnStock, that.quantityOnStock)
                .append(availableQuantity, that.availableQuantity)
                .append(minCartQuantity, that.minCartQuantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .append(restockableInDays, that.restockableInDays)
                .append(expectedDelivery, that.expectedDelivery)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(sku)
                .append(supplyChannel)
                .append(quantityOnStock)
                .append(availableQuantity)
                .append(minCartQuantity)
                .append(maxCartQuantity)
                .append(restockableInDays)
                .append(expectedDelivery)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("key", key)
                .append("sku", sku)
                .append("supplyChannel", supplyChannel)
                .append("quantityOnStock", quantityOnStock)
                .append("availableQuantity", availableQuantity)
                .append("minCartQuantity", minCartQuantity)
                .append("maxCartQuantity", maxCartQuantity)
                .append("restockableInDays", restockableInDays)
                .append("expectedDelivery", expectedDelivery)
                .append("custom", custom)
                .build();
    }

    @Override
    public InventoryEntry copyDeep() {
        return InventoryEntry.deepCopy(this);
    }
}
