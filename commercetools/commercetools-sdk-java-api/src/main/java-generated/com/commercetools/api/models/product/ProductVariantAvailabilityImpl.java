
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>The InventoryEntry information of the Product Variant. If there is a supply Channel for the InventoryEntry, then <code>channels</code> is returned. If not, then <code>isOnStock</code>, <code>restockableInDays</code>, and <code>quantityOnStock</code> are returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantAvailabilityImpl implements ProductVariantAvailability, ModelBase {

    private com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap channels;

    private Boolean isOnStock;

    private Long restockableInDays;

    private Long availableQuantity;

    @JsonCreator
    ProductVariantAvailabilityImpl(
            @JsonProperty("channels") final com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap channels,
            @JsonProperty("isOnStock") final Boolean isOnStock,
            @JsonProperty("restockableInDays") final Long restockableInDays,
            @JsonProperty("availableQuantity") final Long availableQuantity) {
        this.channels = channels;
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
    }

    public ProductVariantAvailabilityImpl() {
    }

    /**
     *  <p>For each InventoryEntry with a supply Channel, an entry is added to <code>channels</code>.</p>
     */

    public com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap getChannels() {
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

    public void setChannels(final com.commercetools.api.models.product.ProductVariantChannelAvailabilityMap channels) {
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(channels)
                .append(isOnStock)
                .append(restockableInDays)
                .append(availableQuantity)
                .toHashCode();
    }

}
