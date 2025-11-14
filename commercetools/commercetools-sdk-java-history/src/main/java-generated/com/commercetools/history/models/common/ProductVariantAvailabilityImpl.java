
package com.commercetools.history.models.common;

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
 *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> information of the Product Variant. If there is a supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> for the InventoryEntry, then <code>channels</code> is returned. If not, then <code>isOnStock</code>, <code>restockableInDays</code>, and <code>availableQuantity</code> are returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantAvailabilityImpl implements ProductVariantAvailability, ModelBase {

    private com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels;

    private Boolean isOnStock;

    private Long restockableInDays;

    private Long availableQuantity;

    private String id;

    private Long version;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantAvailabilityImpl(
            @JsonProperty("channels") final com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels,
            @JsonProperty("isOnStock") final Boolean isOnStock,
            @JsonProperty("restockableInDays") final Long restockableInDays,
            @JsonProperty("availableQuantity") final Long availableQuantity, @JsonProperty("id") final String id,
            @JsonProperty("version") final Long version) {
        this.channels = channels;
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
        this.id = id;
        this.version = version;
    }

    /**
     * create empty instance
     */
    public ProductVariantAvailabilityImpl() {
    }

    /**
     *  <p>For each <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> with a supply Channel, an entry is added to <code>channels</code>.</p>
     */

    public com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap getChannels() {
        return this.channels;
    }

    /**
     *  <p>Indicates whether a Product Variant is in stock.</p>
     */

    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    /**
     *  <p>Number of days to restock a Product Variant once it is out of stock.</p>
     */

    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    /**
     *  <p>Number of items of the Product Variant that are in stock.</p>
     */

    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a>.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a>.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    public void setChannels(
            final com.commercetools.history.models.common.ProductVariantChannelAvailabilityMap channels) {
        this.channels = channels;
    }

    public void setIsOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
    }

    public void setRestockableInDays(final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    public void setAvailableQuantity(final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantAvailabilityImpl that = (ProductVariantAvailabilityImpl) o;

        return new EqualsBuilder().append(channels, that.channels)
                .append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .append(id, that.id)
                .append(version, that.version)
                .append(channels, that.channels)
                .append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .append(id, that.id)
                .append(version, that.version)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(channels)
                .append(isOnStock)
                .append(restockableInDays)
                .append(availableQuantity)
                .append(id)
                .append(version)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("channels", channels)
                .append("isOnStock", isOnStock)
                .append("restockableInDays", restockableInDays)
                .append("availableQuantity", availableQuantity)
                .append("id", id)
                .append("version", version)
                .build();
    }

    @Override
    public ProductVariantAvailability copyDeep() {
        return ProductVariantAvailability.deepCopy(this);
    }
}
